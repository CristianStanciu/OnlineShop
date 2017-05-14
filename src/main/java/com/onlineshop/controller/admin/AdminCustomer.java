package com.onlineshop.controller.admin;

import com.onlineshop.model.entity.Customer;
import com.onlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by smc on 5/13/2017.
 */

@Controller
@RequestMapping("/admin/customerManagement")
public class AdminCustomer {

    @Autowired
    private CustomerService customerService;


    @RequestMapping(value = "/editCustomer/{customerId}")
    public String editCustomer(@PathVariable("customerId") int customerId, Model model){

        System.out.println("**************************invoking editCustomer  get  method");

        Customer customer = customerService.getCustomerById(customerId);
        model.addAttribute(customer);
        return "editCustomer";
    }


    @RequestMapping(value = "/editCustomer", method = RequestMethod.POST)
    public String editCustomerPost(@Valid @ModelAttribute("customer") Customer customer, BindingResult result){

        System.out.println("**************************invoking editCustomer post method");

        if (result.hasErrors()){
            return "editCustomer";
        }
        customerService.editCustomer(customer);
        return "redirect:/admin/customerManagement";
    }


    @RequestMapping("/deleteCustomer/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") int customerId, Model model, HttpServletRequest request) {

        System.out.println("**************************invoking deleteCustomer method");

        Customer customer = customerService.getCustomerById(customerId);

        customerService.deleteCustomer(customer);

        return "redirect:/admin/customerManagement";
    }



}

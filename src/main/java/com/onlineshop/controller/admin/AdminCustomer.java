package com.onlineshop.controller.admin;

import com.onlineshop.model.vo.CustomerVO;
import com.onlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

        CustomerVO customerVO = customerService.getCustomerById(customerId);
        model.addAttribute(customerVO);
        return "editCustomer";
    }


    @RequestMapping(value = "/editCustomer", method = RequestMethod.POST)
    public String editCustomerPost(@Valid @ModelAttribute("customer") CustomerVO customerVO, BindingResult result){

        if (result.hasErrors()){
            return "editCustomer";
        }
        customerService.editCustomer(customerVO);
        return "redirect:/admin/customerManagement";
    }


    @RequestMapping("/deleteCustomer/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") int customerId) {

        CustomerVO customer = customerService.getCustomerById(customerId);

        customerService.deleteCustomer(customer);

        return "redirect:/admin/customerManagement";
    }

}

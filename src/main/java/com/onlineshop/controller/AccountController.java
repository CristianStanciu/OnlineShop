package com.onlineshop.controller;

import com.onlineshop.model.entity.Customer;
import com.onlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

/**
 * Created by smc on 5/14/2017.
 */

@Controller
@RequestMapping("customer/account")
public class AccountController {

    @Autowired
    CustomerService customerService;


    @RequestMapping()
    public String getUserAccount(@AuthenticationPrincipal User activeUser, Model model){
        String username = activeUser.getUsername();
        Customer customer = customerService.getCustomerByUsername(username);
        model.addAttribute("customer", customer);
        return"account";
    }


    @RequestMapping("/edit")
    public  String editCustomerInfo(@Valid @ModelAttribute(value = "customer") Customer customer, BindingResult result){

        System.out.println("**************************invoking edit account post method");

        if (result.hasErrors()){
            return "account";
        }
        customerService.editCustomer(customer);
        return "redirect:/product/productList";
    }


    @RequestMapping("/delete")
    public String delete(@AuthenticationPrincipal User activeUser) {

        System.out.println("**************************invoking delete account get method");

        String username = activeUser.getUsername();
        Customer customer = customerService.getCustomerByUsername(username);
        customerService.deleteCustomer(customer);
        return "redirect:/j_spring_security_logout";
    }

}

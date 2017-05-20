package com.onlineshop.controller;

import com.onlineshop.model.vo.CustomerVO;
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
    public String getUserAccount(@AuthenticationPrincipal org.springframework.security.core.userdetails.User activeUser, Model model){

        CustomerVO customerVO = customerService.getCustomerByUsername(activeUser.getUsername());
        model.addAttribute("customerVO", customerVO);
        return"account";
    }

    @RequestMapping("/edit")
    public String editCustomerInfo(@Valid @ModelAttribute(value = "customerVO") CustomerVO customerVO, BindingResult result){

        if (result.hasErrors()){
            return "account";
        }
        customerService.editCustomer(customerVO);
        return "redirect:/product/productList";
    }

    @RequestMapping("/delete")
    public String delete(@AuthenticationPrincipal User activeUser) {

        String username = activeUser.getUsername();
        CustomerVO customer = customerService.getCustomerByUsername(username);
        customerService.deleteCustomer(customer);
        return "redirect:/j_spring_security_logout";
    }

}

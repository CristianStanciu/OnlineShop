package com.onlineshop.controller;
import com.onlineshop.model.entity.BillingAddress;
import com.onlineshop.model.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by smc on 5/9/2017.
 */

@Controller
public class RegistryController {

    @RequestMapping("/register")
    public String registerCustomer(Model model){
        Customer customer = new Customer();
        BillingAddress billingAddress = new BillingAddress();
        customer.setBillingAddress(billingAddress);
        model.addAttribute("customer", customer);
        return "registerCustomer";
    }

    @RequestMapping("/register")
    public String registerCustomerPost(@ModelAttribute("customer") Customer customer ,Model model){

        customerService.addCustomer(customer);
        return "registerCustomerSuccess";
    }

}

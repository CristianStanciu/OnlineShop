package com.onlineshop.controller;

import com.onlineshop.model.vo.BillingAddressVO;
import com.onlineshop.model.vo.CustomerVO;
import com.onlineshop.service.CustomerService;
import com.onlineshop.util.MyCustomNumberEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

@Controller
public class RegisterController {

    @Autowired
    CustomerService customerService;

    @InitBinder
    public void registerCustomerBinder(WebDataBinder binder) {
        binder.registerCustomEditor(double.class, new MyCustomNumberEditor(Double.class));
        binder.registerCustomEditor(float.class, new MyCustomNumberEditor(Float.class));
        binder.registerCustomEditor(long.class, new MyCustomNumberEditor(Long.class));
        binder.registerCustomEditor(int.class, new MyCustomNumberEditor(Integer.class));
    }

    @RequestMapping("/register")
    public String registerCustomer(Model model){
        CustomerVO customerVO = new CustomerVO();
        BillingAddressVO billingAddress = new BillingAddressVO();
        customerVO.setBillingAddressId(billingAddress);
        model.addAttribute("customerVO", customerVO);
        return "registerCustomer";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerCustomerPost(@ModelAttribute("customerVO") CustomerVO customerVO, BindingResult result, Model model){

        if (result.hasErrors()){
            return "registerCustomer";
        }

        List<CustomerVO> allCustomers = customerService.getAllCustomers();

        for (int i=0; i<allCustomers.size(); i++ ){
            if (customerVO.getEmail().equals(allCustomers.get(i).getEmail())){
                model.addAttribute("alreadyExistingEmail", "Email address already exists!");

                return "registerCustomer";
            }

            if (customerVO.getUsername().equals(allCustomers.get(i).getUsername())){
                model.addAttribute("alreadyExistingUsername", "Username already exists!");

                return "registerCustomer";
            }
        }
        customerService.addCustomer(customerVO);
        return "registerCustomerSuccess";
    }
}

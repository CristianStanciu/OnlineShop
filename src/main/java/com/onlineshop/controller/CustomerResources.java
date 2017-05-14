package com.onlineshop.controller;

import com.onlineshop.model.entity.Customer;
import com.onlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by smc on 5/12/2017.
 */

@Controller
@RequestMapping("/rest/customer")
public class CustomerResources {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public @ResponseBody Customer getCustomerById(@PathVariable(value = "customerId") int customerId) {
        return customerService.getCustomerById(customerId);
    }





    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, problem with payload")
    public void handleClientErrors(Exception e) {
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error")
    public void handleServerErrors(Exception e) {
    }


}

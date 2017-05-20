package com.onlineshop.controller;

import com.onlineshop.model.vo.CustomerVO;
import com.onlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by smc on 5/12/2017.
 */

@RestController
@RequestMapping("/rest/customer")
public class CustomerResources {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public @ResponseBody
    CustomerVO getCustomerById(@PathVariable(value = "customerId") int customerId) {
        return customerService.getCustomerById(customerId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addCustomer(@RequestBody(required = true) CustomerVO customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(value = "/{customerId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void editCustomer(@PathVariable(value = "customerId") int customerId, @RequestBody(required = true) CustomerVO customer) {
        CustomerVO oldCustomer = customerService.getCustomerById(customerId);
        oldCustomer.setAddress(customer.getAddress());
        oldCustomer.setFirstName(customer.getFirstName());
        oldCustomer.setLastName(customer.getLastName());
        oldCustomer.setEmail(customer.getEmail());
        oldCustomer.setPassword(customer.getPassword());
        oldCustomer.setUsername(customer.getUsername());
        oldCustomer.setPhoneNo(customer.getPhoneNo());
        oldCustomer.setBillingAddressId(customer.getBillingAddressId());
        customerService.editCustomer(oldCustomer);
    }

    @RequestMapping()
    public @ResponseBody List<CustomerVO> getCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/{customerId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable(value = "customerId") int customerId){
        CustomerVO customer = customerService.getCustomerById(customerId);
        customerService.deleteCustomer(customer);
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

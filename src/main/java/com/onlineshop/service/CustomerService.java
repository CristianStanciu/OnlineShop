package com.onlineshop.service;

import com.onlineshop.model.entity.Customer;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

public interface CustomerService {

    void addCustomer(Customer product);

    void editCustomer(Customer product);

    void deleteCustomer(Customer product);

    Customer getCustomerById(int customerId);

    Customer getCustomerByUsername(String customerUsername);

    List<Customer> getAllCustomers();

}

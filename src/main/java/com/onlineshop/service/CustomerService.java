package com.onlineshop.service;

import com.onlineshop.model.entity.Customer;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

public interface CustomerService {

    void addCustomer(Customer customer);

    void editCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    Customer getCustomerByUsername(String customerUsername);

    List<Customer> getAllCustomers();

}

package com.onlineshop.controller.dao;

import com.onlineshop.model.entity.Customer;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

public interface CustomerDao {

    void addCustomer(Customer customer);

    void editCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    Customer getCustomerByUsername(String customerUsername);

    List<Customer> getAllCustomers();



}

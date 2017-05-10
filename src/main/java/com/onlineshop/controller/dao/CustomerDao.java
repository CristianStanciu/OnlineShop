package com.onlineshop.controller.dao;

import com.onlineshop.model.entity.Customer;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

public interface CustomerDao {

    void addCustomer(Customer product);

    void editCustomer(Customer product);

    void deleteCustomer(Customer product);

    Customer getCustomerById(int customerId);

    Customer getCustomerByUsername(String customerUsername);

    List<Customer> getAllCustomers();



}

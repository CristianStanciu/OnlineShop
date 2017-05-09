package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.CustomerDao;
import com.onlineshop.model.entity.Customer;
import com.onlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    public List<Customer> getCustomers() {
        return null;
    }

    public Customer getCustomerById(int customerId) {
        return null;
    }

    public void addCustomer(Customer product) {

    }

    public void editCustomer(Customer product) {

    }

    public void deleteCustomer(Customer product) {

    }
}

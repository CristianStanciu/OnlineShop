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
    private CustomerDao customerDao;

    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public void editCustomer(Customer customer) {
        customerDao.editCustomer(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerDao.deleteCustomer(customer);

    }

    public Customer getCustomerById(int customerId) {
        return  customerDao.getCustomerById(customerId);

    }

    public Customer getCustomerByUsername(String customerUsername) {
        return  customerDao.getCustomerByUsername(customerUsername);
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

}

package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.CustomerDao;
import com.onlineshop.model.entity.Customer;
import com.onlineshop.model.vo.CustomerVO;
import com.onlineshop.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer(CustomerVO customerVO) {
        ModelMapper mapperFromCustomerVO = new ModelMapper();
        Customer customer = mapperFromCustomerVO.map(customerVO, Customer.class);
        customerDao.addCustomer(customer);
    }

    public void editCustomer(CustomerVO customerVO) {
        ModelMapper mapperFromCustomerVO = new ModelMapper();
        Customer customer = mapperFromCustomerVO.map(customerVO, Customer.class);
        customerDao.editCustomer(customer);
    }

    public void deleteCustomer(CustomerVO customerVO) {
        ModelMapper mapperFromCustomerVO = new ModelMapper();
        Customer customer = mapperFromCustomerVO.map(customerVO, Customer.class);
        customerDao.deleteCustomer(customer);

    }

    public CustomerVO getCustomerById(int customerId) {
        Customer customer = customerDao.getCustomerById(customerId);
        ModelMapper mapperFromCustomer = new ModelMapper();
        CustomerVO customerVO = mapperFromCustomer.map(customer, CustomerVO.class);
        return customerVO;
    }

    public CustomerVO getCustomerByUsername(String customerUsername) {
        Customer customer = customerDao.getCustomerByUsername(customerUsername);
        ModelMapper mapperFromCustomer = new ModelMapper();
        CustomerVO customerVO = mapperFromCustomer.map(customer, CustomerVO.class);
        return customerVO;
    }

    public List<CustomerVO> getAllCustomers() {
        List<Customer> customerList = customerDao.getAllCustomers();
        ModelMapper mapperFromCustomer = new ModelMapper();
        CustomerVO[] customerVOList = mapperFromCustomer.map(customerList, CustomerVO[].class);
        return Arrays.asList(customerVOList);
    }

}

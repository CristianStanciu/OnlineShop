package com.onlineshop.service;

import com.onlineshop.model.entity.Customer;
import com.onlineshop.model.vo.CustomerVO;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

public interface CustomerService {

    void addCustomer(CustomerVO customerVO);

    void editCustomer(CustomerVO customerVO);

    void deleteCustomer(CustomerVO customerVO);

    CustomerVO getCustomerById(int customerId);

    CustomerVO getCustomerByUsername(String username);

    List<CustomerVO> getAllCustomers();

}

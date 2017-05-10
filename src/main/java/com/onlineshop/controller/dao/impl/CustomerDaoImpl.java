package com.onlineshop.controller.dao.impl;

import com.onlineshop.controller.dao.CustomerDao;
import com.onlineshop.model.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    SessionFactory sessionFactory;


    public void addCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        BillingAddress billingAddress = customer.getBillingAddress();
        billingAddress.setCustomerId(customer);
        session.saveOrUpdate(customer);
        session.saveOrUpdate(billingAddress);
        User newUser = newUser(customer, session);
        newAuthority(session, newUser);
        newCart(customer, session);
        session.flush();
    }

    private void newCart(Customer customer, Session session) {
        Cart newCart = new Cart();
        newCart.setCustomerId(customer);
        session.saveOrUpdate(newCart);
    }


    private User newUser(Customer customer, Session session) {
        User newUser = new User();
        newUser.setCustomerId(customer);
        newUser.setUserName(customer.getUsername().getUserName());
        newUser.setPassword(customer.getPassword());
        newUser.setEnabled(true);
        session.saveOrUpdate(newUser);
        return newUser;
    }

    private void newAuthority(Session session, User newUser) {
        Authority newAuthority = new Authority();
        newAuthority.setUsername(newUser);
        newAuthority.setAuthority("ROLE_USER");
        session.saveOrUpdate(newAuthority);
    }

    public void editCustomer(Customer customer) {
        addCustomer(customer);
    }

    public void deleteCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(customer);
    }

    public Customer getCustomerById(int customerId) {
        Session session = sessionFactory.getCurrentSession();
        return (Customer) session.get(Customer.class, customerId);

    }

    public Customer getCustomerByUsername(String customerUsername) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer where username = ?");
        query.setParameter(0, customerUsername);
        return (Customer) query.uniqueResult();
    }

    public List<Customer> getAllCustomers() {

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer");
        List<Customer> customers = query.list();
        return customers;

    }
}

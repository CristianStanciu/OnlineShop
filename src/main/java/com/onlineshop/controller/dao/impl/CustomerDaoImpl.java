package com.onlineshop.controller.dao.impl;

import com.onlineshop.controller.dao.CustomerDao;
import com.onlineshop.model.entity.Authority;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.entity.Customer;
import com.onlineshop.model.entity.User;
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
//        customer.getBillingAddressId().set;
        customer.setActive(true);
        session.saveOrUpdate(customer);
        session.saveOrUpdate(customer.getBillingAddressId());
        User newUser = newUser(customer, session);
        newAuthority(session, newUser);
        newCart(customer, session);
        session.flush();
    }

    private User newUser(Customer customer, Session session) {
        User newUser = new User();
        newUser.setUserName(customer.getUsername());
        newUser.setPassword(customer.getPassword());
        newUser.setActive(true);
        newUser.setCustomerId(customer.getCustomerId());
        session.saveOrUpdate(newUser);
        return newUser;

    }

    private void newAuthority(Session session, User newUser) {
        Authority newAuthority = new Authority();
        newAuthority.setUsername(newUser.getUserName());
        newAuthority.setAuthority("ROLE_USER");
        session.saveOrUpdate(newAuthority);
    }

    private void newCart(Customer customer, Session session) {
        Cart newCart = new Cart();
//        newCart.setCustomerId(customer);
        customer.setCartId(newCart);
        session.saveOrUpdate(newCart);
        session.saveOrUpdate(customer);
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
        return query.list();


    }
}

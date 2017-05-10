package com.onlineshop.controller.dao.impl;
import com.onlineshop.controller.dao.CartDao;
import com.onlineshop.model.entity.Cart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smc on 5/8/2017.
 */

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    @Autowired
    private SessionFactory sessionFactory;


    public Cart getCartById(String cartId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Cart.class, cartId) ;
    }

    public void updateCart(Cart cart) {
        int cartId = cart.getCartId();

    }

}

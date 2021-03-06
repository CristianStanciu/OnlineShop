package com.onlineshop.controller.dao.impl;

import com.onlineshop.controller.dao.CartDao;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.service.OrderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Created by smc on 5/8/2017.
 */

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private OrderService orderService;


    public Cart getCartById(int cartId) {
        Session session = sessionFactory.getCurrentSession();
        return (Cart) session.get(Cart.class, cartId);
    }

    public Cart validate(int cartId) throws IOException {
        Cart cart = this.getCartById(cartId);
        if (cart == null || cart.getCartItems().size() == 0) {
            throw new IOException("Something's wrong with the cart" + cartId);
        } else {
            update(cart);
            return cart;
        }

    }

    public void update(Cart cart) {
        int cartId = cart.getCartId();
        double totalPrice = orderService.getOrderTotalPrice(cartId);
        cart.setTotalPrice(totalPrice);
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cart);

    }

}

package com.onlineshop.controller.dao.impl;

import com.onlineshop.controller.dao.CartItemDao;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.entity.CartItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by smc on 5/10/2017.
 */

@Repository
@Transactional
public class CartItemDaoImpl implements CartItemDao {

    @Autowired
    SessionFactory sessionFactory;

    public void addCartItem(CartItem cartItem) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cartItem);
        session.flush();
    }

    public CartItem getCartItemByProductId(int productId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from CartItem where productId = ?");
        query.setParameter(0, productId);
        session.flush();
        return (CartItem) query.uniqueResult();
    }


    public void removeCartItem(CartItem cartItem) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(cartItem);
        session.flush();
    }

    public void removeAllCartItems(Cart cart) {
        Session session = sessionFactory.getCurrentSession();
        List<CartItem> cartItems = cart.getCartItems();
        for (CartItem cartItem :cartItems){
            session.delete(cartItem);
        }
        session.flush();
    }
}

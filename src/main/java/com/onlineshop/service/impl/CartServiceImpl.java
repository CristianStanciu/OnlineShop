package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.CartDao;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by smc on 5/10/2017.
 */

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    CartDao cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);

    }

    public void updateCart(Cart cart) {
        cartDao.update(cart);
    }
}

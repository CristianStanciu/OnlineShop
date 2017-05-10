package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.CartItemDao;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.entity.CartItem;
import com.onlineshop.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by smc on 5/10/2017.
 */

@Service
class CartItemServiceImpl implements CartItemService {

    @Autowired
    CartItemDao cartItemDao;


    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);

    }

    public CartItem getCartItemByProductId(int productId){
        return  cartItemDao.getCartItemByProductId(productId);
    }

    public void removeCartItem(CartItem cartItem) {
        cartItemDao.removeCartItem(cartItem);

    }

    public void removeAllCartItems(Cart cart) {
        cartItemDao.removeAllCartItems(cart);

    }
}

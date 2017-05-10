package com.onlineshop.service;

import com.onlineshop.model.entity.Cart;

/**
 * Created by smc on 5/10/2017.
 */

public interface CartService {

    Cart getCartById(int cartId);

    void updateCart(Cart cart);
}

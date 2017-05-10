package com.onlineshop.controller.dao;
import com.onlineshop.model.entity.Cart;

/**
 * Created by smc on 5/8/2017.
 */

public interface CartDao {

    Cart getCartById(String cartId);

    void updateCart(Cart cart);
}

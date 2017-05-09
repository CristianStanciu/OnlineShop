package com.onlineshop.controller.dao;
import com.onlineshop.model.entity.Cart;

/**
 * Created by smc on 5/8/2017.
 */

public interface CartDao {

    Cart create(Cart cart);

    Cart get(String cartId);

    void updateCart(String cartId , Cart cart);

    void delete(String cartId);
}

package com.onlineshop.controller.dao;
import com.onlineshop.model.entity.Cart;

import java.io.IOException;

/**
 * Created by smc on 5/8/2017.
 */

public interface CartDao {

    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}

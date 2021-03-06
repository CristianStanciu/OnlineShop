package com.onlineshop.service;

import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.vo.CartVO;

import java.io.IOException;

/**
 * Created by smc on 5/10/2017.
 */

public interface CartService {

    CartVO getCartById(int cartId);

    void updateCart(CartVO cartVO);

    CartVO validate(int cartId) throws IOException;
}

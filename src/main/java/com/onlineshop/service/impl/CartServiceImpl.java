package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.CartDao;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.vo.CartVO;
import com.onlineshop.service.CartService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by smc on 5/10/2017.
 */

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    CartDao cartDao;

    public CartVO getCartById(int cartId) {
        Cart cart = cartDao.getCartById(cartId);
        ModelMapper mapperFromCart = new ModelMapper();
        return mapperFromCart.map(cart, CartVO.class);
    }

    public void updateCart(CartVO cartVO) {
        ModelMapper mapperFromCart = new ModelMapper();
        Cart cart = mapperFromCart.map(cartVO, Cart.class);
        cartDao.update(cart);
    }

    public CartVO validate(int cartId) throws IOException {
        CartVO cart = this.getCartById(cartId);
        if (cart == null || cart.getCartItems().size() == 0) {
            throw new IOException("Something's wrong with the cart" + cartId);
        } else {
            this.updateCart(cart);
            return cart;
        }

    }
}

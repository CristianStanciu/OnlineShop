package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.CartItemDao;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.entity.CartItem;
import com.onlineshop.model.vo.CartItemVO;
import com.onlineshop.model.vo.CartVO;
import com.onlineshop.service.CartItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by smc on 5/10/2017.
 */

@Service
class CartItemServiceImpl implements CartItemService {

    @Autowired
    CartItemDao cartItemDao;

    public void addCartItem(CartItemVO cartItemVO) {
        ModelMapper mapperFromProductVO = new ModelMapper();
        CartItem cartItem = mapperFromProductVO.map(cartItemVO, CartItem.class);
        cartItemDao.addCartItem(cartItem);
    }

    public CartItemVO getCartItemByProductId(int productId) {
        CartItem cartItem = cartItemDao.getCartItemByProductId(productId);
        ModelMapper mapperFromCartItem = new ModelMapper();
        return mapperFromCartItem.map(cartItem, CartItemVO.class);
    }

    public void removeCartItem(CartItemVO cartItemVO) {
        ModelMapper mapperFromCartItemVO = new ModelMapper();
        CartItem cartItem = mapperFromCartItemVO.map(cartItemVO, CartItem.class);
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(CartVO cartVO) {
        ModelMapper mapperFromCartVO = new ModelMapper();
        Cart cart = mapperFromCartVO.map(cartVO, Cart.class);
        cartItemDao.removeAllCartItems(cart);
    }
}

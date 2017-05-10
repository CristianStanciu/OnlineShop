package com.onlineshop.service;

import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.entity.CartItem;

/**
 * Created by smc on 5/10/2017.
 */

public interface CartItemService {

    void addCartItem(CartItem cartItem);

    CartItem getCartItemByProductId(int productId);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);


}

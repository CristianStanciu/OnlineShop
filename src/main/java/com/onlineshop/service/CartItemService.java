package com.onlineshop.service;

import com.onlineshop.model.vo.CartItemVO;
import com.onlineshop.model.vo.CartVO;

/**
 * Created by smc on 5/10/2017.
 */

public interface CartItemService {

    void addCartItem(CartItemVO cartItemVO);

    CartItemVO getCartItemByProductId(int productId);

    void removeCartItem(CartItemVO cartItemVO);

    void removeAllCartItems(CartVO cartVO);

}

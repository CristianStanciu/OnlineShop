package com.onlineshop.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by smc on 5/8/2017.
 */

public class CartVO implements Serializable{

    private static final long serialVersionUID = 2075391099015550394L;

    private int cartId;

    private List<CartItemVO> cartItems;

//    private OrderVO orderId;

    private double totalPrice;

    public CartVO() {
        totalPrice = 0;
        cartItems = new ArrayList<CartItemVO>();
    }

    public CartVO(int cartId) {
        this();
        this.cartId = cartId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<CartItemVO> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemVO> cartItems) {
        this.cartItems = cartItems;
    }

//    public OrderVO getOrderId() {
//        return orderId;
//    }

//    public void setOrderId(OrderVO orderId) {
//        this.orderId = orderId;
//    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}


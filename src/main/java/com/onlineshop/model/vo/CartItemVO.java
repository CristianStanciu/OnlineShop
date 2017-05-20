package com.onlineshop.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by smc on 5/8/2017.
 */

public class CartItemVO{

    private int cartItemId;

    @JsonIgnore
    private CartVO cartId;

    private ProductVO productId;

    private int quantity;

    private double totalPrice;



    public CartItemVO() {
    }

    public CartItemVO(int cartItemId, CartVO cartId, ProductVO productId, int quantity, double totalPrice) {
        this.cartItemId = cartItemId;
        this.cartId = cartId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public CartVO getCartId() {
        return cartId;
    }

    public void setCartId(CartVO cartId) {
        this.cartId = cartId;
    }

    public ProductVO getProductId() {
        return productId;
    }

    public void setProductId(ProductVO productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

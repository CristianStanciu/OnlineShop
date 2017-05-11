package com.onlineshop.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by smc on 5/8/2017.
 */

@Entity
@Table(name = "CART_ITEM")
public class CartItem implements Serializable{


    private static final long serialVersionUID = -4041226056889847498L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CART_ITEM_ID")
    private int cartItemId;

    @ManyToOne
    @JoinColumn(name = "CART_ID")
    @JsonIgnore
    private Cart cartId;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product productId;

    @Column(name = "QUANTITY")
    private int quantity;

    @Column(name = "TOTAL_PRICE")
    private double totalPrice;



    public CartItem() {
    }

    public CartItem(Cart cartId, Product productId, double totalPrice, int quantity) {
        this.cartId = cartId;
        this.productId = productId;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Cart getCartId() {
        return cartId;
    }

    public void setCartId(Cart cartId) {
        this.cartId = cartId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemId=" + cartItemId +
                ", cartId=" + cartId +
                ", productId=" + productId +
                ", totalPrice=" + totalPrice +
                ", quantity=" + quantity +
                '}';
    }

    //    @Override
//    public boolean equals(Object obj){
//        if (obj == null) return false;
//        if (!(obj instanceof CartItem))return false;
//        if (!((CartItem) obj).getProduct().equals(this.getProduct())) return false;
//        if (((CartItem) obj).getTotalPrice() != this.getTotalPrice()) return false;
//        if (((CartItem) obj).quantity != this.getQuantity()) return false;
//        return true;
//    }
}

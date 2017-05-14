package com.onlineshop.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by smc on 5/8/2017.
 */

@Entity
@Table(name = "CART")
public class Cart implements Serializable {

    private static final long serialVersionUID = 2246077714946138329L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CART_ID")
    private int cartId;

    @OneToMany(mappedBy = "cartId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItem> cartItems;

    @OneToOne(mappedBy ="cartId")
    @JsonIgnore
    private Customer customerId;

    @OneToOne(mappedBy ="cartId")
    private Order orderId;

    @Column(name = "TOTAL_PRICE")
    private double totalPrice;

    public Cart() {
        totalPrice = 0;
        cartItems = new ArrayList<CartItem>();
    }

    public Cart(int cartId) {
        this();
        this.cartId = cartId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", cartItems=" + cartItems +
                ", customerId=" + customerId +
                ", orderId=" + orderId +
                ", totalPrice=" + totalPrice +
                '}';
    }
}


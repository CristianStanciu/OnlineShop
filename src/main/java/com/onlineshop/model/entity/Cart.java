package com.onlineshop.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by smc on 5/8/2017.
 */

@Entity
@Table(name = "CART")
public class Cart implements Serializable {

    private static final long serialVersionUID = 2246077714946138329L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cartId;

    @OneToMany(mappedBy = "cartId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Map<Integer, CartItem> cartItems;

    @OneToOne
    @JoinColumn(name = "CUSTOMER_ID")
    @JsonIgnore
    private Customer customerId;

    @Column(name = "TOTAL_PRICE")
    private double totalPrice;

    public Cart() {
        totalPrice = 0;
        cartItems = new HashMap<Integer, CartItem>();
    }

    public Cart(String cartId) {
        this();
        this.cartId = cartId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Map<Integer, CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Map<Integer, CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public void addItem(CartItem item){
        int productId = item.getProductId().getProductId();
        if (this.cartItems.containsKey(productId)){
            CartItem existingCartItem = this.cartItems.get(productId);
            existingCartItem.setQuantity(existingCartItem.getQuantity()+item.getQuantity());
            this.cartItems.put(productId ,existingCartItem);
        } else{
            this.cartItems.put(productId, item);
        }
        updateGrandTotal();
    }


    public void deleteItem(CartItem item){
        int productId = item.getProductId().getProductId();
        this.cartItems.remove(productId);
        updateGrandTotal();
    }

    private void updateGrandTotal() {
        this.totalPrice=0;
        for (CartItem item : this.cartItems.values()){
            this.totalPrice = totalPrice + item.getTotalPrice();
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId='" + cartId + '\'' +
                ", cartItems=" + cartItems +
                ", customerId=" + customerId +
                ", totalPrice=" + totalPrice +
                '}';
    }
}


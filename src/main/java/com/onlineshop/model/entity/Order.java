package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order implements Serializable{

    private static final long serialVersionUID = 2719020807725727240L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private int orderId;

    @OneToOne
    @JoinColumn(name = "CART_ID")
    private Cart cartId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customerId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_STATUS_CODE")
    private OrderStatusCode orderStatusCode;

    @Column(name = "DETAILS")
    private String orderDetails;

    @Column(name = "DATE")
    private Date orderDate;

    public Order() {
    }

    public Order(Cart cartId, Customer customerId, OrderStatusCode orderStatusCode, String orderDetails, Date orderDate) {
        this.cartId = cartId;
        this.customerId = customerId;
        this.orderStatusCode = orderStatusCode;
        this.orderDetails = orderDetails;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public OrderStatusCode getOrderStatusCode() {
        return orderStatusCode;
    }

    public void setOrderStatusCode(OrderStatusCode orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Cart getCartId() {
        return cartId;
    }

    public void setCartId(Cart cartId) {
        this.cartId = cartId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", cartId=" + cartId +
                ", customerId=" + customerId +
                ", orderStatusCode=" + orderStatusCode +
                ", orderDetails='" + orderDetails + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}

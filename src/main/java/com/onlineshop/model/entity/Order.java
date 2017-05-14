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
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customerId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_STATUS_CODE")
    private OrderStatusCode orderStatusCode;

    @Column(name = "DETAILS")
    private String orderDetails;

    @Column(name = "DATE")
    private Date orderDate;

    @OneToOne
    @JoinColumn(name = "CART_ID")
    private Cart cartId;

    @OneToOne
    @JoinColumn(name = "BILLING_ADDRESS_ID")
    private BillingAddress billingAddress;

    public Order() {
    }

    public Order(Customer customerId, OrderStatusCode orderStatusCode, String orderDetails, Date orderDate, Cart cartId, BillingAddress billingAddress) {
        this.customerId = customerId;
        this.orderStatusCode = orderStatusCode;
        this.orderDetails = orderDetails;
        this.orderDate = orderDate;
        this.cartId = cartId;
        this.billingAddress = billingAddress;
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

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", orderStatusCode=" + orderStatusCode +
                ", orderDetails='" + orderDetails + '\'' +
                ", orderDate=" + orderDate +
                ", cartId=" + cartId +
                ", billingAddress=" + billingAddress +
                '}';
    }
}

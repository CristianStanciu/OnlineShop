package com.onlineshop.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */
@Entity
@Table(name = "CUST_ORDER")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private int orderId;
    @ManyToOne(cascade = CascadeType.ALL)
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

    public Order(int orderId, Customer customerId, OrderStatusCode orderStatusCode, String orderDetails, Date orderDate) {
        this.orderId = orderId;
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

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", orderStatusCode='" + orderStatusCode + '\'' +
                ", orderDetails='" + orderDetails + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}

package com.onlineshop.model;

import javax.persistence.*;

/**
 * Created by smc on 4/29/2017.
 */
@Entity
@Table(name = "ORDER_STATUS_CODE")
public class OrderStatusCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_STATUS_CODE", nullable = false)
    private int orderStatus; //
    @Column(name = "DESCRIPTION")
    private String orderDescription; // ( cancelled, completed )

    public static final String CANCELLED = "cancelled";
    public static final String COMPLETED = "completed";

    public OrderStatusCode() {
    }

    public OrderStatusCode(int orderStatus, String orderDetails) {
        this.orderStatus = orderStatus;
        this.orderDescription = orderDetails;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDetails) {
        this.orderDescription = orderDetails;
    }

    @Override
    public String toString() {
        return "OrderStatusCode{" +
                "orderStatus='" + orderStatus + '\'' +
                ", orderDetails='" + orderDescription + '\'' +
                '}';
    }
}

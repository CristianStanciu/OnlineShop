package com.onlineshop.model.vo;

/**
 * Created by smc on 4/29/2017.
 */

public class OrderStatusCodeVO {

    private int orderStatus;

    private String orderDescription;

    public static final String CANCELLED = "cancelled";
    public static final String COMPLETED = "completed";

    public OrderStatusCodeVO() {
    }

    public OrderStatusCodeVO(int orderStatus, String orderDetails) {
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

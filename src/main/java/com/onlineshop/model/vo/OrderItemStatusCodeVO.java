package com.onlineshop.model.vo;

/**
 * Created by smc on 4/29/2017.
 */

public class OrderItemStatusCodeVO {

    private int orderItemStatus;

    private String itemStatusDescription; // ( Delivered, out of stock )

    public static final String ON_STOCK = "on stock";
    public static final String OUT_OF_STOCK = "out of stock";


    public OrderItemStatusCodeVO() {
    }

    public OrderItemStatusCodeVO(int orderItemStatus, String itemStatusDescription) {
        this.orderItemStatus = orderItemStatus;
        this.itemStatusDescription = itemStatusDescription;
    }

    public int getOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(int orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }

    public String getItemStatusDescription() {
        return itemStatusDescription;
    }

    public void setItemStatusDescription(String itemStatusDescription) {
        this.itemStatusDescription = itemStatusDescription;
    }

    @Override
    public String toString() {
        return "OrderItemStatusCode{" +
                "orderItemStatus='" + orderItemStatus + '\'' +
                ", itemStatusDescription='" + itemStatusDescription + '\'' +
                '}';
    }
}

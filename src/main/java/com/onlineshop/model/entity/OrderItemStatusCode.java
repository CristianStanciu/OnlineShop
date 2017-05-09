package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "ORDER_ITEM_STATUS_CODE")
public class OrderItemStatusCode implements Serializable{

    private static final long serialVersionUID = 8008913006037552303L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_STATUS_CODE", nullable = false)
    private int orderItemStatus;
    @Column(name = "DESCRIPTION")
    private String itemStatusDescription; // ( Delivered, out of stock )

    public static final String ON_STOCK = "on stock";
    public static final String OUT_OF_STOCK = "out of stock";


    public OrderItemStatusCode() {
    }

    public OrderItemStatusCode(int orderItemStatus, String itemStatusDescription) {
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

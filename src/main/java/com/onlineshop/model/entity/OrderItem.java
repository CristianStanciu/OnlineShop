package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem implements Serializable{

    private static final long serialVersionUID = 8348142268896313440L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID", nullable = false)
    private int itemId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "PRODUCT_ID", nullable = false)
    private Product productId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "ORDER_ID", nullable = false)
    private Order order_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "ORDER_ITEM_STATUS_CODE")
    private OrderItemStatusCode itemStatus;

    @Column(name = "QUANTITY")
    private int itemQuantity;

    @Column(name = "PRICE")
    private double itemPrice;

    public OrderItem() {
    }

    public OrderItem(int itemId, Product productId, Order order_id, OrderItemStatusCode itemStatus, int itemQuantity, int itemPrice) {
        this.itemId = itemId;
        this.productId = productId;
        this.order_id = order_id;
        this.itemStatus = itemStatus;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Order getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }

    public OrderItemStatusCode getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(OrderItemStatusCode itemStatus) {
        this.itemStatus = itemStatus;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "itemId=" + itemId +
                ", productId=" + productId +
                ", order_id=" + order_id +
                ", itemStatus='" + itemStatus + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", itemPrice=" + itemPrice +
                '}';
    }
}

package com.onlineshop.model.vo;

/**
 * Created by smc on 4/29/2017.
 */

public class OrderItemVO{

    private int itemId;

    private ProductVO productId;

    private OrderVO orderId;

    private OrderItemStatusCodeVO itemStatus;

    private int itemQuantity;

    private double itemPrice;

    public OrderItemVO() {
    }

    public OrderItemVO(int itemId, ProductVO productId, OrderVO orderId, OrderItemStatusCodeVO itemStatus, int itemQuantity, int itemPrice) {
        this.itemId = itemId;
        this.productId = productId;
        this.orderId = orderId;
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

    public ProductVO getProductId() {
        return productId;
    }

    public void setProductId(ProductVO productId) {
        this.productId = productId;
    }

    public OrderVO getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderVO orderId) {
        this.orderId = orderId;
    }

    public OrderItemStatusCodeVO getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(OrderItemStatusCodeVO itemStatus) {
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
                ", orderId=" + orderId +
                ", itemStatus='" + itemStatus + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", itemPrice=" + itemPrice +
                '}';
    }
}

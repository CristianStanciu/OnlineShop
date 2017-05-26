package com.onlineshop.model.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */

public class OrderVO implements Serializable{

    private static final long serialVersionUID = 4928940496450898774L;

    private int orderId;

    private CustomerVO customerId;

    private OrderStatusCodeVO orderStatusCode;

    private String orderDetails;

    private Date orderDate;

    private CartVO cartId;

    private BillingAddressVO billingAddress;

    private ShipmentVO shipmentAddress;


    public OrderVO() {
    }

    public OrderVO(int orderId, CustomerVO customerId, OrderStatusCodeVO orderStatusCode, String orderDetails, Date orderDate, CartVO cartId, BillingAddressVO billingAddress, ShipmentVO shipmentAddress) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderStatusCode = orderStatusCode;
        this.orderDetails = orderDetails;
        this.orderDate = orderDate;
        this.cartId = cartId;
        this.billingAddress = billingAddress;
        this.shipmentAddress = shipmentAddress;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public CustomerVO getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerVO customerId) {
        this.customerId = customerId;
    }

    public OrderStatusCodeVO getOrderStatusCode() {
        return orderStatusCode;
    }

    public void setOrderStatusCode(OrderStatusCodeVO orderStatusCode) {
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

    public CartVO getCartId() {
        return cartId;
    }

    public void setCartId(CartVO cartId) {
        this.cartId = cartId;
    }

    public BillingAddressVO getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddressVO billingAddress) {
        this.billingAddress = billingAddress;
    }

    public ShipmentVO getShipmentAddress() {
        return shipmentAddress;
    }

    public void setShipmentAddress(ShipmentVO shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }
}

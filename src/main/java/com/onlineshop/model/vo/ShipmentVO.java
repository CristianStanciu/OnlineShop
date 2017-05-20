package com.onlineshop.model.vo;

import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */

public class ShipmentVO {

    private int shipmentId;

    private OrderVO OrderId;

    private InvoiceVO invoiceNumber;

    private int shipmentTrackingNumber;

    private Date shipmentDate;

    private String shipmentDetails;

    private BillingAddressVO billingAddress;

    public ShipmentVO() {
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public OrderVO getOrderId() {
        return OrderId;
    }

    public void setOrderId(OrderVO orderId) {
        OrderId = orderId;
    }

    public InvoiceVO getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(InvoiceVO invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getShipmentTrackingNumber() {
        return shipmentTrackingNumber;
    }

    public void setShipmentTrackingNumber(int shipmentTrackingNumber) {
        this.shipmentTrackingNumber = shipmentTrackingNumber;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(String shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public BillingAddressVO getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddressVO billingAddress) {
        this.billingAddress = billingAddress;
    }

    public ShipmentVO(int shipmentId, OrderVO orderId, InvoiceVO invoiceNumber, int shipmentTrackingNumber, Date shipmentDate, String shipmentDetails, BillingAddressVO billingAddress) {

        this.shipmentId = shipmentId;
        OrderId = orderId;
        this.invoiceNumber = invoiceNumber;
        this.shipmentTrackingNumber = shipmentTrackingNumber;
        this.shipmentDate = shipmentDate;
        this.shipmentDetails = shipmentDetails;
        this.billingAddress = billingAddress;
    }
}

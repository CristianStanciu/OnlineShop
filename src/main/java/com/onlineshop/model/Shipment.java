package com.onlineshop.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */
@Entity
@Table(name = "SHIPMENT")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHIPMENT_ID", nullable = false)
    private int shipmentId;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "ORDER_ID")
    private Order OrderId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "INVOICE_NO")
    private Invoice invoiceNumber;
    @Column(name = "TRACKING_NO")
    private int shipmentTrackingNumber;
    @Column(name = "SHIPMENT_DATE")
    private Date shipmentDate;
    @Column(name = "DETAILS")
    private String shipmentDetails;

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Order getOrderId() {
        return OrderId;
    }

    public void setOrderId(Order orderId) {
        OrderId = orderId;
    }

    public Invoice getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Invoice invoiceNumber) {
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

    public Shipment() {
    }

    public Shipment(int shipmentId, Order orderId, Invoice invoiceNumber, int shipmentTrackingNumber, Date shipmentDate, String shipmentDetails) {
        this.shipmentId = shipmentId;
        OrderId = orderId;
        this.invoiceNumber = invoiceNumber;
        this.shipmentTrackingNumber = shipmentTrackingNumber;
        this.shipmentDate = shipmentDate;
        this.shipmentDetails = shipmentDetails;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId=" + shipmentId +
                ", OrderId=" + OrderId +
                ", invoiceNumber=" + invoiceNumber +
                ", shipmentTrackingNumber=" + shipmentTrackingNumber +
                ", shipmentDate=" + shipmentDate +
                ", shipmentDetails='" + shipmentDetails + '\'' +
                '}';
    }
}

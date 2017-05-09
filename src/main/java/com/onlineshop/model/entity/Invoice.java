package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "INVOICE")
public class Invoice implements Serializable{

    private static final long serialVersionUID = -2536404525970384710L;

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "INVOICE_NO", nullable = false)
    private int invoiceNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "ORDER_ID")
    private Order order_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "INVOICE_STATUS_CODE")
    private InvoiceStatusCode invoiceStatusCode;
    @Column(name = "DATE")
    private Date invoiceDate;
    @Column(name = "DETAILS")
    private String invoiceDetails;

    public Invoice() {
    }

    public Invoice(int invoiceNumber, Order order_id, InvoiceStatusCode invoiceStatusCode, Date invoiceDate, String invoiceDetails) {
        this.invoiceNumber = invoiceNumber;
        this.order_id = order_id;
        this.invoiceStatusCode = invoiceStatusCode;
        this.invoiceDate = invoiceDate;
        this.invoiceDetails = invoiceDetails;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Order getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }

    public InvoiceStatusCode getInvoiceStatusCode() {
        return invoiceStatusCode;
    }

    public void setInvoiceStatusCode(InvoiceStatusCode invoiceStatusCode) {
        this.invoiceStatusCode = invoiceStatusCode;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setInvoiceDetails(String invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber=" + invoiceNumber +
                ", order_id=" + order_id +
                ", invoiceStatusCode='" + invoiceStatusCode + '\'' +
                ", invoiceDate=" + invoiceDate +
                ", invoiceDetails='" + invoiceDetails + '\'' +
                '}';
    }
}

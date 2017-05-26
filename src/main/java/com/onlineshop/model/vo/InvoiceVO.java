package com.onlineshop.model.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */

public class InvoiceVO implements Serializable {

    private static final long serialVersionUID = -5259529821647334605L;

    private int invoiceNumber;

    private OrderVO orderId;

    private InvoiceStatusCodeVO invoiceStatusCode;

    private Date invoiceDate;

    private String invoiceDetails;


    public InvoiceVO() {
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public OrderVO getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderVO orderId) {
        this.orderId = orderId;
    }

    public InvoiceStatusCodeVO getInvoiceStatusCode() {
        return invoiceStatusCode;
    }

    public void setInvoiceStatusCode(InvoiceStatusCodeVO invoiceStatusCode) {
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

    public InvoiceVO(int invoiceNumber, OrderVO orderId, InvoiceStatusCodeVO invoiceStatusCode, Date invoiceDate, String invoiceDetails) {

        this.invoiceNumber = invoiceNumber;
        this.orderId = orderId;
        this.invoiceStatusCode = invoiceStatusCode;
        this.invoiceDate = invoiceDate;
        this.invoiceDetails = invoiceDetails;
    }
}

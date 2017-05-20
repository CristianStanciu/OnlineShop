package com.onlineshop.model.vo;

/**
 * Created by smc on 4/29/2017.
 */

public class InvoiceStatusCodeVO {

    private int invoiceStatus;

    private String invoiceDescription;

    public static final String PAID = "paid";
    public static final String ISSUED = "issued";

    public InvoiceStatusCodeVO() {
    }

    public InvoiceStatusCodeVO(int invoiceStatus, String invoiceDescription) {
        this.invoiceStatus = invoiceStatus;
        this.invoiceDescription = invoiceDescription;
    }

    public int getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(int invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getInvoiceDescription() {
        return invoiceDescription;
    }

    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }

    @Override
    public String toString() {
        return "InvoiceStatusCode{" +
                "invoiceStatus='" + invoiceStatus + '\'' +
                ", invoiceDescription='" + invoiceDescription + '\'' +
                '}';
    }
}

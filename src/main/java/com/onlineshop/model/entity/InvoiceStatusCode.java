package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "INVOICE_STATUS_CODE")
public class InvoiceStatusCode implements Serializable{

    private static final long serialVersionUID = -4901374158314105329L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVOICE_STATUS_CODE", nullable = false)
    private int invoiceStatus;
    @Column(name = "DESCRIPTION")
    private String invoiceDescription;  // ( Issued, Paid )

    public static final String PAID = "paid";
    public static final String ISSUED = "issued";

    public InvoiceStatusCode() {
    }

    public InvoiceStatusCode(int invoiceStatus, String invoiceDescription) {
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

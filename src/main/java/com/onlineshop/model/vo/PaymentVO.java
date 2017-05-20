package com.onlineshop.model.vo;

import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */

public class PaymentVO {

    private int paymentId;

    private InvoiceVO invoiceNumber;

    private double paymentAmount;

    private Date paymentDate;


    public PaymentVO() {
    }

    public PaymentVO(int paymentId, InvoiceVO invoiceNumber, Date paymentDate, double paymentAmount) {
        this.paymentId = paymentId;
        this.invoiceNumber = invoiceNumber;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public InvoiceVO getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(InvoiceVO invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


}

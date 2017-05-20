package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "PAYMENT")
public class Payment implements Serializable {

    private static final long serialVersionUID = -7216017074610537777L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAYMENT_ID", nullable = false)
    private int paymentId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "INVOICE_NO")
    private Invoice invoiceNumber;

    @Column(name = "AMOUNT")
    private double paymentAmount;

    @Column(name = "DATE")
    private Date paymentDate;


    public Payment() {
    }

    public Payment(Invoice invoiceNumber, double paymentAmount, Date paymentDate) {
        this.invoiceNumber = invoiceNumber;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Invoice getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Invoice invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}

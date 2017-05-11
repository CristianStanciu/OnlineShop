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
    private int payment_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "INVOICE_NO")
    private Invoice invoice_number;

    @Column(name = "AMOUNT")
    private double paymentAmount;

    @Column(name = "DATE")
    private Date payment_date;


    public Payment() {
    }

    public Payment(int payment_id, Invoice invoice_number, Date payment_date, double paymentAmount) {
        this.payment_id = payment_id;
        this.invoice_number = invoice_number;
        this.payment_date = payment_date;
        this.paymentAmount = paymentAmount;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public Invoice getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(Invoice invoice_number) {
        this.invoice_number = invoice_number;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payment_id=" + payment_id +
                ", invoice_number=" + invoice_number +
                ", payment_date=" + payment_date +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}

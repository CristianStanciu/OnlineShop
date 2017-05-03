package com.onlineshop.model;

import javax.persistence.*;

/**
 * Created by smc on 4/29/2017.
 */
@Entity
@Table(name = "CUST_PAYMENT_METHOD")
public class CustomerPaymentMethod {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PAYMENT_ID", nullable = false)
    private int paymentId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customerId;
    @Column(name = "CREDIT_CARD_NO")
    private String creditCardNumber;
    @Column(name = "CASH_ON_DELIVERY")
    private boolean cashOnDelivery;

    public CustomerPaymentMethod() {
    }

    public CustomerPaymentMethod(Customer customerId, String creditCardNumber, boolean cashOnDelivery) {
        this.customerId = customerId;
        this.creditCardNumber = creditCardNumber;
        this.cashOnDelivery = cashOnDelivery;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public boolean isCashOnDelivery() {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(boolean cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

    @Override
    public String toString() {
        return "CustomerPaymentMethod{" +
                "paymentId=" + paymentId +
                ", customerId=" + customerId +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", cashOnDelivery=" + cashOnDelivery +
                '}';
    }
}

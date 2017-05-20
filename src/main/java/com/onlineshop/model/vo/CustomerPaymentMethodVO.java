package com.onlineshop.model.vo;

/**
 * Created by smc on 4/29/2017.
 */

public class CustomerPaymentMethodVO {

    private int paymentId;

    private CustomerVO customerId;

    private String creditCardNumber;

    private boolean cashOnDelivery;


    public CustomerPaymentMethodVO() {
    }

    public CustomerPaymentMethodVO(int paymentId, CustomerVO customerId, String creditCardNumber, boolean cashOnDelivery) {
        this.paymentId = paymentId;
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

    public CustomerVO getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerVO customerId) {
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
}

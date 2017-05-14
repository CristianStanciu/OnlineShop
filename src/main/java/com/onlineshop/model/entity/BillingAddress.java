package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by smc on 5/9/2017.
 */

@Entity
@Table(name = "BILLING_ADDRESS")
public class BillingAddress implements Serializable{

    private static final long serialVersionUID = 3506892915365389862L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BILLING_ADDRESS_ID")
    private int billingAddressId;

    @Column(name = "STREET_NAME")
    private String streetName;

    @Column(name = "HOUSE_NUMBER")
    private int houseNo;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ZIP_CODE")
    private int zipCode;

    @OneToOne(mappedBy = "billingAddressId")
    private Customer customerId;


    public BillingAddress() {
    }

    public BillingAddress(String streetName, int houseNo, String city, String state, String country, int zipCode, Customer customerId) {
        this.streetName = streetName;
        this.houseNo = houseNo;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.customerId = customerId;
    }

    public int getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(int billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "BillingAddress{" +
                "billingAddressId=" + billingAddressId +
                ", streetName='" + streetName + '\'' +
                ", houseNo=" + houseNo +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode=" + zipCode +
                ", customerId=" + customerId +
                '}';
    }
}

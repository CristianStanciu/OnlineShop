package com.onlineshop.model.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
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

    @Pattern(regexp = "[a-zA-Z\\s]{2,45}", message = "Please enter a valid name, only letters")
    @Column(name = "STREET_NAME")
    private String streetName;

    @Column(name = "HOUSE_NUMBER", nullable = false)
    @Size(min = 1, max = 9, message = "Please enter house number")
    private String houseNo;

    @Column(name = "CITY")
    @Pattern(regexp = "[a-zA-Z]{2,45}", message = "Please enter a valid city, only letters")
    private String city;

    @Column(name = "STATE")
    @Pattern(regexp = "[a-zA-Z\\s]{2,45}", message = "Please enter a valid name, only letters")
    private String state;

    @Column(name = "COUNTRY")
    @Pattern(regexp = "[a-zA-Z]{2,45}", message = "Please enter a valid name, only letters")
    private String country;

    @Column(name = "ZIP_CODE")
    @Digits(integer = 10, fraction = 0, message ="Only integers are allowed")
    @Min(value=0, message = "Only positive digits" )
    private int zipCode;

    public BillingAddress() {
    }

    public BillingAddress(String streetName, String houseNo, String city, String state, String country, int zipCode) {
        this.streetName = streetName;
        this.houseNo = houseNo;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
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

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
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


}

package com.onlineshop.model.vo;

import javax.validation.constraints.*;

/**
 * Created by smc on 5/9/2017.
 */

public class BillingAddressVO{


    private int billingAddressId;

    @Pattern(regexp = "[a-zA-Z\\s]{2,45}", message = "Please enter a valid name, only letters")
    private String streetName;

    @Size(min = 1, max = 9, message = "Please enter house number")
    private String houseNo;

    @Pattern(regexp = "[a-zA-Z]{2,45}", message = "Please enter a valid city, only letters")
    private String city;

    @Pattern(regexp = "[a-zA-Z\\s]{2,45}", message = "Please enter a valid name, only letters")
    private String state;

    @Pattern(regexp = "[a-zA-Z]{2,45}", message = "Please enter a valid name, only letters")
    private String country;

    @Digits(integer = 10, fraction = 0, message ="Only integers are allowed")
    @Min(value=0, message = "Only positive digits" )
    private int zipCode;



    public BillingAddressVO() {
    }

    public BillingAddressVO(int billingAddressId, String streetName, String houseNo, String city, String state, String country, int zipCode) {
        this.billingAddressId = billingAddressId;
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

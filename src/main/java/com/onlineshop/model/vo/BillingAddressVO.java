package com.onlineshop.model.vo;

/**
 * Created by smc on 5/9/2017.
 */

public class BillingAddressVO{


    private int billingAddressId;

    private String streetName;

    private String houseNo;

    private String city;

    private String state;

    private String country;

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

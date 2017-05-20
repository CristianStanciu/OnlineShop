package com.onlineshop.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerVO {

    private int customerId;

    @Pattern(regexp = "[a-zA-Z]{2,45}", message = "Please enter a valid name")
    private String firstName;

    @Pattern(regexp = "[a-zA-Z]{2,45}", message = "Please enter a valid name")
    private String lastName;

    @Pattern(regexp = "[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]", message = "Please enter a valid email address")
    private String email;

    @Pattern(regexp = "^[A-Za-z_][A-Za-z0-9_]{7,29}", message = "Username should be at least 8 characters long, starting with a letter")
    //^[A-Za-z_] ensures input starts with an alphabet or underscore and
    // then [A-Za-z0-9_]{7,29}$ makes sure there are 7 to 29 of word characters in the end making total length 8 to 30.
    private String username;

    @Size(min = 8, max = 45, message = "Password should be at least 8 characters long ")
    private  String password;

    @Pattern(regexp = "[a-zA-Z\\s]{2,45}", message = "Please enter a valid street name, only letters")
    private  String address;

    @Size(min = 1, max = 45, message = " Not a valid house number ")
    private String houseNo;

    @Digits(integer = 10, fraction = 0, message ="Enter a valid number please")
    @Min(value=0, message = "Only positive digits" )
    private int phoneNo;

    @JsonIgnore
    private CartVO cartId;

    @Valid
    private BillingAddressVO billingAddressId;

    private boolean active;

        public CustomerVO() {
        }

    public CustomerVO(int customerId, String firstName, String lastName, String email, String username, String password, String address, String houseNo, int phoneNo, CartVO cartId, BillingAddressVO billingAddressId, boolean active) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
        this.houseNo = houseNo;
        this.phoneNo = phoneNo;
        this.cartId = cartId;
        this.billingAddressId = billingAddressId;
        this.active = active;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public CartVO getCartId() {
        return cartId;
    }

    public void setCartId(CartVO cartId) {
        this.cartId = cartId;
    }

    public BillingAddressVO getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(BillingAddressVO billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

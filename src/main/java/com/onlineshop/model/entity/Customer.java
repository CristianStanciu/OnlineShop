package com.onlineshop.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable{

    private static final long serialVersionUID = -2246725435602977530L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID", nullable = false)
    private int customerId;

    @Pattern(regexp = "[a-zA-Z]{2,45}", message = "Please enter a valid name")
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Pattern(regexp = "[a-zA-Z]{2,45}", message = "Please enter a valid name")
    @Column(name = "LAST_NAME")
    private String lastName;

    @Pattern(regexp = "[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]", message = "Please enter a valid email address")
    @Column(name = "EMAIL")
    private String email;

    @Pattern(regexp = "^[A-Za-z_][A-Za-z0-9_]{7,29}", message = "Username should be at least 8 characters long, starting with a letter")
    //^[A-Za-z_] ensures input starts with an alphabet or underscore and
    // then [A-Za-z0-9_]{7,29}$ makes sure there are 7 to 29 of word characters in the end making total length 8 to 30.
    @Column(name = "USERNAME")
    private String username;

    @Size(min = 8, max = 45, message = "Password should be at least 8 characters long ")
    @Column(name = "PASSWORD")
    private  String password;

    @Pattern(regexp = "[a-zA-Z\\s]{2,45}", message = "Please enter a valid street name(only letters are allowed)")
    @Column(name = "ADDRESS")
    private  String address;

    @Size(min = 1, max = 45, message = " Not a valid house number ")
    @Column(name = "HOUSE_NO")
    private String houseNo;

    @Column(name = "PHONE_NO")
    private int phoneNo;

    @OneToOne
    @JoinColumn(name = "CART_ID")
    @JsonIgnore
    private Cart cartId;

    @OneToOne
    @JoinColumn(name = "BILLING_ADDRESS_ID")
    @Valid
    private BillingAddress billingAddressId;

    @Column(name = "ACTIVE")
    private boolean active;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, String username, String password, String address, String houseNo, int phoneNo, Cart cartId, BillingAddress billingAddressId, boolean active) {
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

    public Cart getCartId() {
        return cartId;
    }

    public void setCartId(Cart cartId) {
        this.cartId = cartId;
    }

    public BillingAddress getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(BillingAddress billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}

package com.onlineshop.model.vo;

public class CustomerVO {

        private int customerId;

        private String firstName;

        private String lastName;

        private String email;

        private String username;

        private  String password;

        private  String address;

        private String houseNo;

        private int phoneNo;

        private CartVO cartId;

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

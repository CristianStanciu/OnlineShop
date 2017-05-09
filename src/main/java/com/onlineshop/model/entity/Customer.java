package com.onlineshop.model.entity;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
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

    @NotEmpty(message = "Please enter customer's first name")
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotEmpty(message = "Please enter customer's last name")
    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USERNAME_ID")
    private  User username;

    @Column(name = "PASSWORD")
    private  String password;

    @Column(name = "ADDRESS")
    private  String address;

    @Column(name = "PHONE_NO")
    private int phoneNo;

    @OneToOne
    @JoinColumn(name = "BILLING_ADDRESS_ID")
    private BillingAddress billingAddress;




    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    List<Order> orderList = new ArrayList<Order>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID" , nullable = false)
    List<CustomerPaymentMethod> paymentMethods = new ArrayList<CustomerPaymentMethod>();*/


    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, User username, String password, String address, int phoneNo, BillingAddress billingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phoneNo = phoneNo;
        this.billingAddress = billingAddress;
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

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
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

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username=" + username +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                ", billingAddress=" + billingAddress +
                '}';
    }
}

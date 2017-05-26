package com.onlineshop.model.entity;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "SHIPMENT")
public class Shipment implements Serializable{

    private static final long serialVersionUID = -6077304134526605557L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHIPMENT_ID", nullable = false)
    private int shipmentId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "INVOICE_NO")
    private Invoice invoiceNumber;

    @Column(name = "TRACKING_NO")
    private int shipmentTrackingNumber;

    @Column(name = "SHIPMENT_DATE")
    private Date shipmentDate;

    @Column(name = "DETAILS")
    private String shipmentDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BILLING_ADDRESS_ID")
    private BillingAddress billingAddress;

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

    public Shipment() {
    }

    public Shipment(Invoice invoiceNumber, int shipmentTrackingNumber, Date shipmentDate, String shipmentDetails, BillingAddress billingAddress, String streetName, String houseNo, String city, String state, String country, int zipCode) {
        this.invoiceNumber = invoiceNumber;
        this.shipmentTrackingNumber = shipmentTrackingNumber;
        this.shipmentDate = shipmentDate;
        this.shipmentDetails = shipmentDetails;
        this.billingAddress = billingAddress;
        this.streetName = streetName;
        this.houseNo = houseNo;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Invoice getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Invoice invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getShipmentTrackingNumber() {
        return shipmentTrackingNumber;
    }

    public void setShipmentTrackingNumber(int shipmentTrackingNumber) {
        this.shipmentTrackingNumber = shipmentTrackingNumber;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getShipmentDetails() {
        return shipmentDetails;
    }

    public void setShipmentDetails(String shipmentDetails) {
        this.shipmentDetails = shipmentDetails;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
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

package com.onlineshop.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

/**
 * Created by smc on 4/29/2017.
 */
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID", nullable = false)
    private int productId;
    @Column (name = "TYPE")
    private String productType;
    @Column(name = "MAKER", nullable = false)
    private String productMaker;
    @Column(name = "NAME", nullable = false)
    private String productName;
    @Column(name = "COLOR")
    private String productColor;
    @Column(name = "SIZE")
    private int productSize;
    @Column(name = "PRICE", nullable = false)
    private double productPrice;
    @Column(name = "DESCRIPTION")
    private String productDscr;
    @Transient
    private MultipartFile productImage;

    public Product() {
    }

    public Product(String productType, String productMaker, String productName, String productColor, int productSize, double productPrice, String productDscr) {
        this.productType = productType;
        this.productMaker = productMaker;
        this.productName = productName;
        this.productColor = productColor;
        this.productSize = productSize;
        this.productPrice = productPrice;
        this.productDscr = productDscr;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductMaker() {
        return productMaker;
    }

    public void setProductMaker(String productMaker) {
        this.productMaker = productMaker;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public int getProductSize() {
        return productSize;
    }

    public void setProductSize(int productSize) {
        this.productSize = productSize;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDscr() {
        return productDscr;
    }

    public void setProductDscr(String productDscr) {
        this.productDscr = productDscr;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productType='" + productType + '\'' +
                ", productMaker='" + productMaker + '\'' +
                ", productName='" + productName + '\'' +
                ", productColor='" + productColor + '\'' +
                ", productSize=" + productSize +
                ", productPrice=" + productPrice +
                ", productDscr='" + productDscr + '\'' +
                ", productImage=" + productImage +
                '}';
    }
}

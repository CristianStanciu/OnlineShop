package com.onlineshop.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable{

    private static final long serialVersionUID = -3700508571423129640L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID", nullable = false)
    private int productId;

    @Column (name = "TYPE", nullable = false)
    private String productType;

    @Size(min = 2, max = 45, message = "Please enter the maker of the product")
    @Column(name = "MAKER", nullable = false)
    private String productMaker;

    @Size(min = 1, max = 45, message = "Please enter the name")
    @Column(name = "NAME", nullable = false)
    private String productName;

    @Pattern(regexp = "[a-zA-Z]{3,45}", message = "Please enter a valid color")
    @Column(name = "COLOR")
    private String productColor;

    @Min(value = 1, message = "Please enter a valid size")
    @NumberFormat(style = NumberFormat.Style.DEFAULT)
    @Column(name = "SIZE", nullable = false)
    private int productSize;

    @Min(value = 1 , message = "Please enter a valid weight")
    @Column(name = "WEIGHT", nullable = false)
    private int productWeight;

    @Min(value = 1 , message = "Please enter a valid price")
    @Column(name = "PRICE", nullable = false)
    private double productPrice;

    @Size(max = 255, message = "Description can't have more than 255 characters")
    @Column(name = "DESCRIPTION")
    private String productDscr;

    @Transient
    private MultipartFile productImage;

    @OneToMany(mappedBy = "productId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<CartItem> cartItemList;

    public Product() {
    }

    public Product(String productType, String productMaker, String productName, String productColor, int productSize, int productWeight, double productPrice, String productDscr, MultipartFile productImage, List<CartItem> cartItemList) {
        this.productType = productType;
        this.productMaker = productMaker;
        this.productName = productName;
        this.productColor = productColor;
        this.productSize = productSize;
        this.productWeight = productWeight;
        this.productPrice = productPrice;
        this.productDscr = productDscr;
        this.productImage = productImage;
        this.cartItemList = cartItemList;
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

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
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

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
}

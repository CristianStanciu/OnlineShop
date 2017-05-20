package com.onlineshop.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;


public class ProductVO {

    private int productId;

    private String productType;

    @Size(min = 2, max = 45, message = "Please enter the maker of the product")
    private String productMaker;

    @Size(min = 1, max = 45, message = "Please enter the name")
    private String productName;

    @Pattern(regexp = "[a-zA-Z]{3,45}", message = "Please enter a valid color")
    private String productColor;

    @Min(value = 1, message = "Please enter a valid size")// !!! MAI TREBUIE SA FAC VALIDARE PENTRU ALT TIP NUMERIC, DE EX DACA E DOUBLE ARUNCA EXCEPTIE ACUM
    private int productSize;

    @Min(value = 1 , message = "Please enter a valid weight")
    private int productWeight;

    @Min(value = 1 , message = "Please enter a valid price")
    private double productPrice;

    @Size(max = 255, message = "Description can't have more than 255 characters")
    private String productDscr;

    private MultipartFile productImage;

    @JsonIgnore
    private List<CartItemVO> cartItemList;

    public ProductVO() {
    }

    public ProductVO(int productId, String productType, String productMaker, String productName, String productColor, int productSize, int productWeight, double productPrice, String productDscr, MultipartFile productImage, List<CartItemVO> cartItemList) {
        this.productId = productId;
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

    public List<CartItemVO> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItemVO> cartItemList) {
        this.cartItemList = cartItemList;
    }

    @Override
    public String toString() {
        return "ProductVO{" +
                "productId=" + productId +
                ", productType='" + productType + '\'' +
                ", productMaker='" + productMaker + '\'' +
                ", productName='" + productName + '\'' +
                ", productColor='" + productColor + '\'' +
                ", productSize=" + productSize +
                ", productWeight=" + productWeight +
                ", productPrice=" + productPrice +
                ", productDscr='" + productDscr + '\'' +
                ", cartItemList=" + cartItemList +
                '}';
    }
}

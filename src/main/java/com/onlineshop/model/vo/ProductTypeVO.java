package com.onlineshop.model.vo;

/**
 * Created by smc on 4/29/2017.
 */

public class ProductTypeVO {

    private String productType;

    public ProductTypeVO() {
    }

    public ProductTypeVO(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "productType='" + productType + '\'' +
                '}';
    }
}

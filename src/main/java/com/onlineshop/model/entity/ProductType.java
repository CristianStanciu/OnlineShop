package com.onlineshop.model.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by smc on 4/29/2017.
 */

@Entity
@Table(name = "PRODUCT_TYPE")
public class ProductType implements Serializable{

    private static final long serialVersionUID = -7219441780913132491L;

    @Id
    @Column(name = "PRODUCT_TYPE", nullable = false)
    private String productType;

    public ProductType() {
    }

    public ProductType(String productType) {
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

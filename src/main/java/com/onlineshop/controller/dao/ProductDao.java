package com.onlineshop.controller.dao;

import com.onlineshop.model.entity.Product;
import com.onlineshop.model.entity.ProductType;

import java.util.List;

/**
 * Created by smc on 5/1/2017.
 */

public interface ProductDao {

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product productID);

    Product getProductById(int productId);

    List<Product> getProductList();

    List<ProductType> getAllProductTypes();

    List<Product> getProductsByType(String productType);

    List<Product> getLatestProducts();

    Product getLastProduct();

}

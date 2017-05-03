package com.onlineshop.Dao;

import com.onlineshop.model.Product;
import com.onlineshop.model.ProductType;

import java.util.List;

/**
 * Created by smc on 5/1/2017.
 */
public interface ProductDao {

    void addProduct(Product product);

    Product getProductById(int productId);

    List<Product> getAllProducts();

    List<ProductType> getAllProductTypes();

    void deleteProduct(int productID);

}

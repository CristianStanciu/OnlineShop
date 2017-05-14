package com.onlineshop.service;

import com.onlineshop.model.entity.Product;
import com.onlineshop.model.entity.ProductType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

public interface ProductService {

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

    Product getProductById(int productId);

    List<Product> getProductList();

    List<ProductType> getAllProductTypes();

    List<Product> getProductsByType(String productType);

}

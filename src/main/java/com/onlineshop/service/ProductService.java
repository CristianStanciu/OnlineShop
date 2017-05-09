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


    List<Product> getProductList();

    Product getProductById(int productId);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

    List<ProductType> getAllProductTypes();

}

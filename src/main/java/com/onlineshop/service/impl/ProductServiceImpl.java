package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.ProductDao;
import com.onlineshop.model.entity.Product;
import com.onlineshop.model.entity.ProductType;
import com.onlineshop.service.ProductService;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    public List<Product> getProductList() {
        return productDao.getProductList();
    }

    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    public void editProduct(Product product) {
         productDao.editProduct(product);
    }

    public void deleteProduct(Product product) {
        productDao.deleteProduct(product);
    }

    public List<ProductType> getAllProductTypes() {
        return productDao.getAllProductTypes();
    }
}

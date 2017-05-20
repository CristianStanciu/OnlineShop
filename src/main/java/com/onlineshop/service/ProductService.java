package com.onlineshop.service;

import com.onlineshop.model.vo.ProductTypeVO;
import com.onlineshop.model.vo.ProductVO;

import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

public interface ProductService {

    void addProduct(ProductVO productVO);

    void editProduct(ProductVO productVO);

    void deleteProduct(ProductVO productVO);

    ProductVO getProductById(int productId);

    List<ProductVO> getProductList();

    List<ProductTypeVO> getAllProductTypes();

    List<ProductVO> getProductsByType(String productType);

    List<ProductVO> getLatestProducts();

    ProductVO getLastProduct();

}

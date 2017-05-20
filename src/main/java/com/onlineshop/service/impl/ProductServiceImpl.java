package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.ProductDao;
import com.onlineshop.model.entity.Product;
import com.onlineshop.model.entity.ProductType;
import com.onlineshop.model.vo.ProductTypeVO;
import com.onlineshop.model.vo.ProductVO;
import com.onlineshop.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public void addProduct(ProductVO productVO){
        ModelMapper mapperFromProductVO = new ModelMapper();
        Product product = mapperFromProductVO.map(productVO, Product.class);
        productDao.addProduct(product);
    }

    public void editProduct(ProductVO productVO){
        ModelMapper mapperFromProductVO = new ModelMapper();
        Product product = mapperFromProductVO.map(productVO, Product.class);
        productDao.editProduct(product);
    }

    public void deleteProduct(ProductVO productVO){
        ModelMapper mapperFromProductVO = new ModelMapper();
        Product product = mapperFromProductVO.map(productVO, Product.class);
        productDao.deleteProduct(product);
    }

    public ProductVO getProductById(int productId){
        Product product = productDao.getProductById(productId);
        ModelMapper mapperFromProduct = new ModelMapper();
        return mapperFromProduct.map(product, ProductVO.class);
    }

    public List<ProductVO> getProductList(){
        List<Product> productList = productDao.getProductList();
        ModelMapper mapperFromProduct = new ModelMapper();
        ProductVO[] productVOList = mapperFromProduct.map(productList, ProductVO[].class);
        return Arrays.asList(productVOList);
    }

    public List<ProductTypeVO> getAllProductTypes(){
        List<ProductType> productList = productDao.getAllProductTypes();
        ModelMapper mapperFromProduct = new ModelMapper();
        ProductTypeVO[] productTypeVOList = mapperFromProduct.map(productList, ProductTypeVO[].class);
        return Arrays.asList(productTypeVOList);
    }

    public List<ProductVO> getProductsByType(String productType){
        List<Product> productList = productDao.getProductsByType(productType);
        ModelMapper mapperFromProduct = new ModelMapper();
        ProductVO[] productVOList = mapperFromProduct.map(productList, ProductVO[].class);
        return Arrays.asList(productVOList);
    }

    public List<ProductVO> getLatestProducts(){
        List<Product> productList = productDao.getLatestProducts();
        ModelMapper mapperFromProduct = new ModelMapper();
        ProductVO[] productVOList = mapperFromProduct.map(productList, ProductVO[].class);
        return Arrays.asList(productVOList);
    }

    public ProductVO getLastProduct(){
        Product product = productDao.getLastProduct();
        ModelMapper mapperFromProduct = new ModelMapper();
        return mapperFromProduct.map(product, ProductVO.class);
    }
}

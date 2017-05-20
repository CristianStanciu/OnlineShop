//package com.onlineshop.controller;
//
//import com.onlineshop.model.entity.Product;
//import com.onlineshop.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
///**
// * Created by smc on 5/12/2017.
// */
//
//@RestController
//@RequestMapping("/rest/product")
//public class ProductResources {
//
//
//    @Autowired
//    ProductService productService;
//
//
//    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
//    public @ResponseBody
//    Product getProductById(@PathVariable(value = "productId") int productId) {
//        return productService.getProductById(productId);
//    }
//
//
//    @CrossOrigin
//    @RequestMapping(value = "/{productId}", method = RequestMethod.DELETE)
//    @ResponseStatus(value = HttpStatus.NO_CONTENT)
//    public void deleteProductById(@PathVariable(value = "productId") int productId ){
//        productService.deleteProduct(productService.getProductById(productId));
//    }
//
//    @CrossOrigin
//    @RequestMapping(value = "/edit/{productId}", method = RequestMethod.PUT)
//    @ResponseStatus(value = HttpStatus.NO_CONTENT)
//    public void editProduct(@PathVariable(value = "productId") int productId, @RequestBody(required = true) Product product){
//        Product oldProduct = productService.getProductById(productId);
//        oldProduct.setProductMaker(product.getProductMaker());
//        oldProduct.setCartItemList(product.getCartItemList());
//        oldProduct.setProductColor(product.getProductColor());
//        oldProduct.setProductName(product.getProductName());
//        oldProduct.setProductPrice(product.getProductPrice());
//        oldProduct.setProductSize(product.getProductSize());
//        oldProduct.setProductType(product.getProductType());
//        oldProduct.setProductWeight(product.getProductWeight());
//        productService.editProduct(oldProduct);
//    }
//
//
//    @ExceptionHandler(IllegalArgumentException.class)
//    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, problem with payload")
//    public void handleClientErrors(Exception e) {
//    }
//
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error")
//    public void handleServerErrors(Exception e) {
//    }
//
//
//}

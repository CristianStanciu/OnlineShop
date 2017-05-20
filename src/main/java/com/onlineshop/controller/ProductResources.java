package com.onlineshop.controller;

import com.onlineshop.model.vo.ProductVO;
import com.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by smc on 5/12/2017.
 */

@RestController
@RequestMapping("/rest/product")
public class ProductResources {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public @ResponseBody
    ProductVO getProductById(@PathVariable(value = "productId") int productId) {
        return productService.getProductById(productId);
    }


    @RequestMapping()
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public @ResponseBody
    List<ProductVO> getProductList() {
        return productService.getProductList();
    }


    @RequestMapping(value = "/{productId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteProductById(@PathVariable(value = "productId") int productId ){
        productService.deleteProduct(productService.getProductById(productId));
    }

    @RequestMapping(value = "/edit/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void editProduct(@PathVariable(value = "productId") int productId, @RequestBody(required = true) ProductVO product){
        ProductVO oldProduct = productService.getProductById(productId);
        oldProduct.setProductMaker(product.getProductMaker());
        oldProduct.setCartItemList(product.getCartItemList());
        oldProduct.setProductColor(product.getProductColor());
        oldProduct.setProductName(product.getProductName());
        oldProduct.setProductPrice(product.getProductPrice());
        oldProduct.setProductSize(product.getProductSize());
        oldProduct.setProductType(product.getProductType());
        oldProduct.setProductWeight(product.getProductWeight());
        productService.editProduct(oldProduct);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addProduct(@RequestBody(required = true) ProductVO product){
        productService.addProduct(product);
    }


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, problem with payload")
    public void handleClientErrors(Exception e) {
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error")
    public void handleServerErrors(Exception e) {
    }

}

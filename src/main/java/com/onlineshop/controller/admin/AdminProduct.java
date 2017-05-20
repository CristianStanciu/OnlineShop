package com.onlineshop.controller.admin;

import com.onlineshop.model.vo.ProductTypeVO;
import com.onlineshop.model.vo.ProductVO;
import com.onlineshop.service.ProductService;
import com.onlineshop.util.MyCustomNumberEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by smc on 5/9/2017.
 */

@Controller
@RequestMapping("/admin")
public class AdminProduct {

    @Autowired
    private ProductService productService;

    Path path;


    @InitBinder
    public void registerCustomerBinder(WebDataBinder binder) {
        binder.registerCustomEditor(double.class, new MyCustomNumberEditor(Double.class));
        binder.registerCustomEditor(float.class, new MyCustomNumberEditor(Float.class));
        binder.registerCustomEditor(long.class, new MyCustomNumberEditor(Long.class));
        binder.registerCustomEditor(int.class, new MyCustomNumberEditor(Integer.class));
    }




    @RequestMapping(value = "/productInventory/addProduct", method = RequestMethod.GET)
    public String addProduct(Model model){
        ProductVO product = new ProductVO();
        List<ProductTypeVO> allProductTypes = productService.getAllProductTypes();
        model.addAttribute("productTypes", allProductTypes);
        model.addAttribute("product", product);
        return "addProduct";
    }

    @RequestMapping(value = "/productInventory/addProduct", method = RequestMethod.POST)
    public String addProductPost(@Valid @ModelAttribute("product") ProductVO product, BindingResult result, HttpServletRequest request, Model model){
        if (result.hasErrors()){

            List<ProductTypeVO> allProductTypes = productService.getAllProductTypes();
            model.addAttribute("productTypes", allProductTypes);

            return "addProduct";
        }

        productService.addProduct(product);

        String rootDir = request.getSession().getServletContext().getRealPath("/");

        MultipartFile productImage = product.getProductImage();

        path = Paths.get(rootDir + "\\WEB-INF\\resources\\images\\" + productService.getLastProduct().getProductId() + ".png");

        if (productImage != null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (IOException e) {
                throw new RuntimeException("Saving image file error!");
            }
        }
        return "redirect:/admin/productInventory";
    }


    @RequestMapping(value = "/productInventory/editProduct", method = RequestMethod.POST)
    public String editProductPost(@ModelAttribute("product") ProductVO product, BindingResult result, HttpServletRequest request, Model model){

        if (result.hasErrors()){

            List<ProductTypeVO> allProductTypes = productService.getAllProductTypes();
            model.addAttribute("productTypes", allProductTypes);
            return "editProduct";
        }

        MultipartFile productImage = product.getProductImage();

        String rootDir = request.getSession().getServletContext().getRealPath("/");

        path = Paths.get(rootDir + "\\WEB-INF\\resources\\images\\" +product.getProductId()+ ".png");

        if (productImage != null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (IOException e) {
                throw new RuntimeException("Saving image file error!");
            }
        }
        productService.editProduct(product);

        return "redirect:/admin/productInventory";
    }


    @RequestMapping("/productInventory/editProduct/{productId}")
    public String editProduct(@PathVariable("productId") int productId, Model model) {

        List<ProductTypeVO> allProductTypes = productService.getAllProductTypes();
        model.addAttribute("productTypes", allProductTypes);

        ProductVO productVO = productService.getProductById(productId);
        model.addAttribute("productVO", productVO);
        return "editProduct";
    }




    @RequestMapping("/productInventory/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable("productId") int productId, Model model, HttpServletRequest request) {

        ProductVO product = productService.getProductById(productId);

        productService.deleteProduct(product);

        String rootDir = request.getSession().getServletContext().getRealPath("/");

        path = Paths.get(rootDir + "\\WEB-INF\\resources\\images\\" + product.getProductId() + ".png");

        if (Files.exists(path)){
            try {
                Files.delete(path);
            } catch (IOException e) {
                throw new RuntimeException("Deleting product image file error!");
            }
        }
        return "redirect:/admin/productInventory";
    }

}

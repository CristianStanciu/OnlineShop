package com.onlineshop.controller.admin;
import com.onlineshop.model.entity.Product;
import com.onlineshop.model.entity.ProductType;
import com.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/product/addProduct", method = RequestMethod.GET)
    public String addProduct(Model model){

        System.out.println("**************************invoking add product get method");

        Product product = new Product();
        List<ProductType> allProductTypes = productService.getAllProductTypes();
        model.addAttribute("productTypes", allProductTypes);
        model.addAttribute(product);
        return "addProduct";
    }

    @RequestMapping(value = "/product/addProduct", method = RequestMethod.POST)
    public String addProductPost(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request, Model model){

        System.out.println("******************************invoking add product post method");

        if (result.hasErrors()){

            List<ProductType> allProductTypes = productService.getAllProductTypes();
            model.addAttribute("productTypes", allProductTypes);

            return "addProduct";
        }


        productService.addProduct(product);

        String rootDir = request.getSession().getServletContext().getRealPath("/");

        MultipartFile productImage = product.getProductImage();

        path = Paths.get(rootDir + "\\WEB-INF\\resources\\images\\" +product.getProductId()+ ".png");

        if (productImage != null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (IOException e) {
                throw new RuntimeException("Saving image file error!");
            }
        }
        return "redirect:/admin/productInventory";
    }


    @RequestMapping(value = "/product/editProduct", method = RequestMethod.POST)
    public String editProductPost(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request, Model model){

        System.out.println("**************************invoking editProduct post method");

        if (result.hasErrors()){

            List<ProductType> allProductTypes = productService.getAllProductTypes();
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
        productService.addProduct(product);

        return "redirect:/admin/productInventory";
    }


    @RequestMapping("/product/editProduct/{productId}")
    public String editProduct(@PathVariable("productId") int productId, Model model) {

        System.out.println("**************************invoking editProduct get  method");


        List<ProductType> allProductTypes = productService.getAllProductTypes();
        model.addAttribute("productTypes", allProductTypes);

        Product product = productService.getProductById(productId);
        model.addAttribute(product);
        return "editProduct";
    }




    @RequestMapping("/productInventory/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable("productId") int productId, Model model, HttpServletRequest request) {

        System.out.println("**************************invoking del product method");

        Product product = productService.getProductById(productId);

        productService.deleteProduct(product);

        String rootDir = request.getSession().getServletContext().getRealPath("/");

        path = Paths.get(rootDir + "\\WEB-INF\\resources\\images\\" +productId+ ".png");

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

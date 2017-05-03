package com.onlineshop.controller;
import com.onlineshop.Dao.ProductDao;
import com.onlineshop.model.Product;
import com.onlineshop.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by smc on 5/1/2017.
 */
@Controller
public class MainController {

    @Autowired
    private ProductDao productDao;

    Path path;


    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<Product> products = productDao.getAllProducts();
        model.addAttribute("products", products);
        return "productList";
    }

    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable("productId") int productId, Model model) throws IOException {
        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "viewProduct";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/admin/productInventory")
    public String prodcutInventory(Model model){
        List<Product> productList = productDao.getAllProducts();
        model.addAttribute("productList", productList);
        return "productInventory";
    }


    @RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.GET)
    public String addProduct(Model model){

        System.out.println("**************************invoking add product get method");

        Product product = new Product();
        List<ProductType> allProductTypes = productDao.getAllProductTypes();
        model.addAttribute("productTypes", allProductTypes);
        model.addAttribute(product);
        return "addProduct";
    }

    @RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.POST)
    public String addNewProduct(@ModelAttribute("product") Product product, HttpServletRequest request ){

        System.out.println("******************************invoking add product post method");

        productDao.addProduct(product);

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

     @RequestMapping("/admin/productInventory/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable("productId") int productId, Model model, HttpServletRequest request) {

        System.out.println("**************************invoking del product method");

        productDao.deleteProduct(productId);

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

    @RequestMapping("/admin/productInventory/editProduct/{productId}")
    public String editProduct(@PathVariable("productId") int productId, Model model) {

        System.out.println("**************************invoking editProduct get  method");


        List<ProductType> allProductTypes = productDao.getAllProductTypes();
        model.addAttribute("productTypes", allProductTypes);

        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "editProduct";
    }

    @RequestMapping(value = "/admin/productInventory/editProduct", method = RequestMethod.POST)
    public String editProduct(@ModelAttribute("product") Product product, HttpServletRequest request){

        System.out.println("**************************invoking editProduct post method");


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
        productDao.addProduct(product);

        return "redirect:/admin/productInventory";
    }

}





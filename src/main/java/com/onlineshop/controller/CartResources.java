package com.onlineshop.controller;

import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.entity.CartItem;
import com.onlineshop.model.entity.Customer;
import com.onlineshop.model.entity.Product;
import com.onlineshop.service.CartService;
import com.onlineshop.service.CustomerService;
import com.onlineshop.service.ProductService;
import com.onlineshop.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by smc on 5/10/2017.
 */

@Controller
@RequestMapping("/rest/cart")
public class CartResources {

    @Autowired
    CartService cartService;

    @Autowired
    CustomerService customerService;

    @Autowired
    ProductService productService;

    @Autowired
    CartItemService cartItemService;


    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public @ResponseBody
    Cart getCartById(@PathVariable(value = "cartId") int cartId) {
        return cartService.getCartById(cartId);
    }


    @RequestMapping(value = "/add/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@PathVariable(value = "productId") int productId, @AuthenticationPrincipal User activeUser) {

        Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());

        Product product = productService.getProductById(productId);

        Cart cart = new Cart();
        cart.setCustomerId(customer);

        List<CartItem> cartItems = cart.getCartItems();
        for (int i = 0; i < cartItems.size(); i++) {
            if (product.getProductId() == cartItems.get(i).getProduct().getProductId()) {
                CartItem cartItem = cartItems.get(i);
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                cartItem.setTotalPrice(product.getProductPrice() * cartItem.getQuantity());
                cartItemService.addCartItem(cartItem);
            }

            CartItem cartItem = new CartItem();
            cartItem.setProduct(product);
            cartItem.setQuantity(1);
            cartItem.setTotalPrice(product.getProductPrice() * cartItem.getQuantity());
            cartItem.setCartId(cart);
            cartItemService.addCartItem(cartItem);

            return;
        }
    }


    @RequestMapping(value = "/remove/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable(value = "productId") int productId) {
        CartItem cartItem = cartItemService.getCartItemByProductId(productId);
        cartItemService.removeCartItem(cartItem);
    }


    @RequestMapping(value = "/{cartId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void clearCart(@PathVariable(value = "cartId") int cartId){
        Cart cart = cartService.getCartById(cartId);
        cartItemService.removeAllCartItems(cart);

    }


//    @RequestMapping(value = "/{cartId}", method = RequestMethod.PUT)
//    @ResponseStatus(value = HttpStatus.NO_CONTENT)
//    public void update(@PathVariable(value = "cartId") String cartId, @RequestBody Cart cart) {
//        cartDao.updateCart(cartId, cart);
//    }


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, problem with payload")
    public void handleClientErrors(Exception e) {
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error")
    public void handleServerErrors(Exception e) {
    }


}
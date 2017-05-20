package com.onlineshop.controller;

import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.entity.CartItem;
import com.onlineshop.model.entity.Customer;
import com.onlineshop.model.entity.Product;
import com.onlineshop.model.vo.CartItemVO;
import com.onlineshop.model.vo.CartVO;
import com.onlineshop.model.vo.CustomerVO;
import com.onlineshop.model.vo.ProductVO;
import com.onlineshop.service.CartItemService;
import com.onlineshop.service.CartService;
import com.onlineshop.service.CustomerService;
import com.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by smc on 5/10/2017.
 */

@RestController
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
    CartVO getCartById(@PathVariable(value = "cartId") int cartId) {
        return cartService.getCartById(cartId);
    }


    @RequestMapping(value = "/add/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@PathVariable(value = "productId") int productId, @AuthenticationPrincipal User activeUser) {
        CustomerVO customer = customerService.getCustomerByUsername(activeUser.getUsername());
        ProductVO product = productService.getProductById(productId);
        CartVO cart = customer.getCartId();
        List<CartItemVO> cartItems = cart.getCartItems();
        if (cartItems.size()!=0) {
            for (int i = 0; i < cartItems.size(); i++) {
                if (product.getProductId() == cartItems.get(i).getProductId().getProductId()) {
                    CartItemVO cartItem = cartItems.get(i);
                    cartItem.setQuantity(cartItem.getQuantity() + 1);
                    cartItem.setTotalPrice(product.getProductPrice() * cartItem.getQuantity());
                    cartItemService.addCartItem(cartItem);
                    return;
                }
            }
        }
            CartItemVO cartItem = new CartItemVO();
            cartItem.setQuantity(1);
            cartItem.setTotalPrice(product.getProductPrice() * cartItem.getQuantity());
            cartItem.setCartId(cart);
            cartItemService.addCartItem(cartItem);
    }


    @RequestMapping(value = "/remove/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeCartItem(@PathVariable(value = "productId") int productId, @AuthenticationPrincipal User activeUser) {
        CustomerVO customer = customerService.getCustomerByUsername(activeUser.getUsername());
        List<CartItemVO> cartItems = customer.getCartId().getCartItems();
        for (CartItemVO cartItem : cartItems){
            if (cartItem.getProductId().getProductId() == productId){
                cartItemService.removeCartItem(cartItem);
            }
        }
    }


// THE ORIGINAL VERSION BUT IT DOSEN'T WORK CUZ OF HIBERNATE 5 BUG!!!!
//    @RequestMapping(value = "/remove/{productId}", method = RequestMethod.PUT)
//    @ResponseStatus(value = HttpStatus.NO_CONTENT)
//    public void removeCartItem(@PathVariable(value = "productId") int productId) {
//        CartItem cartItem = cartItemService.getCartItemByProductId(productId);
//        cartItemService.removeCartItem(cartItem);
//
//    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void clearCart(@PathVariable(value = "cartId") int cartId){
        CartVO cart = cartService.getCartById(cartId);
        cartItemService.removeAllCartItems(cart);
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

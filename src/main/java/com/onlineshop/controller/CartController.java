package com.onlineshop.controller;
import com.onlineshop.controller.dao.CartDao;
import com.onlineshop.controller.dao.ProductDao;
import com.onlineshop.model.entity.Cart;
import com.onlineshop.model.entity.CartItem;
import com.onlineshop.model.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by smc on 5/8/2017.
 */

@Controller
@RequestMapping("/rest/cart")
public class CartController {

    @Autowired
    CartDao cartDao;

    @Autowired
    ProductDao productDao;

    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public @ResponseBody Cart read(@PathVariable( value = "cartId") String cartId){
        return cartDao.get(cartId);
    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void update(@PathVariable(value = "cartId") String cartId, @RequestBody Cart cart){
        cartDao.updateCart(cartId, cart);
    }

    @RequestMapping(value = "/{cartId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value = "cartId") String cartId){
        cartDao.delete(cartId);
    }

    @RequestMapping(value = "/add/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem(@PathVariable(value = "productId") Product productId, HttpServletRequest request){
        String sessionId = request.getSession(true).getId();
        Cart cart = cartDao.get(sessionId);
        if (cart==null){
            cart = cartDao.create(new Cart(sessionId));
        }
        Product product = productDao.getProductById(productId);
        if (product==null){
            throw new IllegalArgumentException("Can't add item in the cart, product obj is null");
        }
        cart.addItem(new CartItem(product));

        cartDao.updateCart(sessionId, cart);
    }

    @RequestMapping(value = "/remove/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable(value = "productId") Product productId, HttpServletRequest request ){
        String sessionId = request.getSession(true).getId();
        Cart cart = cartDao.get(sessionId);
        if (cart==null){
            cart = cartDao.create(new Cart(sessionId));
        }
        Product product = productDao.getProductById(productId);
        if (product==null){
            throw new IllegalArgumentException("Can't remove item from the cart, item obj is null");
        }
        cart.deleteItem(new CartItem(product));

        cartDao.updateCart(sessionId, cart);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, verify payload")
    public void exceptionHandler(Exception e){}

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal server error")
    public void errorHandler(Exception e){}
}

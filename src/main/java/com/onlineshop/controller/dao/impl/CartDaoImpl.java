package com.onlineshop.controller.dao.impl;
import com.onlineshop.controller.dao.CartDao;
import com.onlineshop.model.entity.Cart;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by smc on 5/8/2017.
 */

@Repository
public class CartDaoImpl implements CartDao {

    private Map<String, Cart> listOfCarts;

    public CartDaoImpl() {
        listOfCarts = new HashMap<String, Cart>();
    }

    public Cart create(Cart cart) {
        if (this.listOfCarts.containsKey(cart.getCartId())){
            throw new IllegalArgumentException(String.format( "The cart with the id(%) already exists", cart.getCartId() ) );
        }
        this.listOfCarts.put(cart.getCartId(), cart);
        return cart;
    }

    public Cart get(String cartId) {
        return this.listOfCarts.get(cartId);
    }

    public void updateCart(String cartId, Cart cart) {
        if (!this.listOfCarts.containsKey(cartId)){
            throw new IllegalArgumentException(String.format( "The cart with the id(%) dosen't exist", cart.getCartId() ) );
        } else {
            this.listOfCarts.put(cartId, cart);
        }
    }

    public void delete(String cartId) {
        if (!this.listOfCarts.containsKey(cartId)) {
            throw new IllegalArgumentException(String.format("Can't delete the cart with the id(%), it dosen't exist", cartId));
        }
        else {
                this.listOfCarts.remove(cartId);
            }
    }
}

package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.OrderDao;
import com.onlineshop.model.entity.Order;
import com.onlineshop.model.vo.CartItemVO;
import com.onlineshop.model.vo.CartVO;
import com.onlineshop.model.vo.OrderVO;
import com.onlineshop.service.CartService;
import com.onlineshop.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by smc on 5/10/2017.
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CartService cartService;


    public void addOrder(OrderVO orderVO) {
        ModelMapper mapperFromOrderVO = new ModelMapper();
        Order order = mapperFromOrderVO.map(orderVO, Order.class);
        orderDao.addOrder(order);
    }

    public double getOrderTotalPrice(int cartId) {
        double totalPrice = 0;
        CartVO cart = cartService.getCartById(cartId);
        List<CartItemVO> cartItems = cart.getCartItems();
        for (CartItemVO cartItem : cartItems) {
            totalPrice += cartItem.getTotalPrice();
        }
        return totalPrice;
    }
}

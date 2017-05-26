package com.onlineshop.controller;

import com.onlineshop.model.vo.*;
import com.onlineshop.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by smc on 5/10/2017.
 */

@Controller
@RequestMapping("/customer/order")
public class OrderController {

    @Autowired
    CartService cartService;

    @Autowired
    CustomerService customerService;

    @Autowired
    OrderService orderService;

    @Autowired
    InvoiceService invoiceService;

    @Autowired
    ShipmentService shipmentService;


    @RequestMapping("/{cartId}")
    public  String createOrder(@PathVariable(value = "cartId") int cartId, @AuthenticationPrincipal org.springframework.security.core.userdetails.User activeUser){
        CustomerVO customer = customerService.getCustomerByUsername(activeUser.getUsername());
        CartVO cart = customer.getCartId();
        OrderVO order = new OrderVO();
        order.setCartId(cart);
        order.setCustomerId(customer);
        order.setBillingAddress(customer.getBillingAddressId());
//        orderService.addOrder(order);
        InvoiceVO invoice = new InvoiceVO();
        invoice.setOrderId(order);
//        invoiceService.addInvoice(invoice);
        ShipmentVO shipment = new ShipmentVO();
        shipment.setBillingAddress(customer.getBillingAddressId());
        shipment.setInvoiceNumber(invoice);
        order.setShipmentAddress(shipment);
        shipmentService.addShipment(shipment);
//        orderService.addOrder(order);
        return "redirect:/checkout?cartId="+cartId;
    }
}

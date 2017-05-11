package com.onlineshop;


import com.onlineshop.model.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by smc on 4/29/2017.
 */
public class Application {

    @Autowired
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        Session currentSession = sessionFactory.getCurrentSession();


        Customer customer = new Customer();

        customer.setPhoneNo(542658578);
        customer.setFirstName("Rodi");
        customer.setLastName("Dumi");
        customer.setEmail("rman@gmail.com");
        customer.setPassword("passghjg mea");
        customer.setAddress("strada bucu  nr 50 bloc b3 ap 14");


        CustomerPaymentMethod paymentMethod = new CustomerPaymentMethod();
        paymentMethod.setCreditCardNumber("1111-5665-2888-STF");
        paymentMethod.setCashOnDelivery(false);
        paymentMethod.setCustomerId(customer);

        OrderStatusCode status = new OrderStatusCode();
        status.setOrderDescription(OrderStatusCode.COMPLETED);

        InvoiceStatusCode invoiceStatusCode = new InvoiceStatusCode();
        invoiceStatusCode.setInvoiceDescription(InvoiceStatusCode.PAID);


        Product product = new Product();
        product.setProductColor("WHITE");
        product.setProductDscr("FOLOSIT");
        product.setProductPrice(100.55);

        product.setProductName("LG");
        product.setProductSize(250);
        ProductType type = new ProductType();
        //type.setProductType("TV");
        //product.setProductType(type);

        Order order = new Order();
        order.setCustomerId(customer);
        order.setOrderDate(new Date(System.currentTimeMillis()));
        order.setOrderDetails("OK");
        order.setOrderStatusCode(status);

        OrderItemStatusCode orderItemStatusCode = new OrderItemStatusCode();
        orderItemStatusCode.setItemStatusDescription(OrderItemStatusCode.ON_STOCK);

        OrderItem orderItem = new OrderItem();
        orderItem.setOrder_id(order);
        orderItem.setProductId(product);
        orderItem.setItemPrice(product.getProductPrice());
        orderItem.setItemQuantity(1);
        orderItem.setItemStatus(orderItemStatusCode);

        Invoice invoice = new Invoice();

        invoice.setOrderId(order);
        invoice.setInvoiceDate(new Date(System.currentTimeMillis()));
        invoice.setInvoiceStatusCode(invoiceStatusCode);

        Shipment shipment = new Shipment();
        shipment.setInvoiceNumber(invoice);
        shipment.setOrderId(order);
        shipment.setShipmentTrackingNumber(21212);
        shipment.setShipmentDetails("WOOOHOOOOOOO");

        Payment payment = new Payment();
        payment.setInvoice_number(invoice);
        payment.setPaymentAmount(500);
        payment.setPayment_date(new Date(System.currentTimeMillis()));

        currentSession.saveOrUpdate(payment);
        currentSession.saveOrUpdate(orderItem);
        currentSession.saveOrUpdate(paymentMethod);
        currentSession.saveOrUpdate(shipment);
        currentSession.flush();
        /*session.save(payment);
        session.save(orderItem);
        session.save(paymentMethod);
        session.save(shipment);

        session.getTransaction().commit();
        session.close();*/
    }
}

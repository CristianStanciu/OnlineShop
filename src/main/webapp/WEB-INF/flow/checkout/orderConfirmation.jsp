<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/11/2017
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="fragments/header.jsp"/>
<jsp:useBean id="now" class="java.util.date" />


<div class="container">
    <div class="page-header">
        <h3>Order:</h3>
    </div>


    <p>Order confirmation:</p>

    <div>


        <div class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 col-md-offset-3">

            <div class="text-center">
                <h1>Receipt</h1>
            </div>
            <div class="row">
                <div class="col-xs-6 col-sm-6 col-md-6">
                    <address>
                        <strong>Shipping address:</strong>
                        <br>
                        ${order.cart.customer.shippingAddress.streetName}
                        <br>
                        ${order.cart.customer.shippingAddress.houseNo}
                        <br>
                        ${order.cart.customer.shippingAddress.city}, ${order.cart.customer.shippingAddress.state}
                        <br>
                        ${order.cart.customer.shippingAddress.country}, ${order.cart.customer.shippingAddress.zipCode}
                        <br>
                    </address>
                </div>
                <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                    <p>Shipping date: <fmt:formatDate type="date" value="${now}"/></p>
                </div>

            </div>

            <div class="col-xs-6 col-sm-6 col-md-6">
                <address>
                    <strong>Billing address:</strong>
                    <br>
                    ${order.cart.customer.billingAddress.streetName}
                    <br>
                    ${order.cart.customer.billingAddress.houseNo}
                    <br>
                    ${order.cart.customer.billingAddress.city}, ${order.cart.customer.billingAddress.state}
                    <br>
                    ${order.cart.customer.billingAddress.country}, ${order.cart.customer.billingAddress.zipCode}
                    <br>
                </address>
            </div>
        </div>

        <div class="row">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>Product</th>
                    <th>#</th>
                    <th class="text-center">Price</th>
                    <th class="text-center">Total</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="cartItem" items="${order.cart.cartItem}">
                    <tr>
                        <td class="col-md-9"><em>${cartItem.product.productName}</em></td>
                        <td class="col-md-1" style="text-align: center">${cartItem.quantity}</td>
                        <td class="col-md-9"><em>${cartItem.product.productPrice}</em></td>
                        <td class="col-md-9"><em>${cartItem.totalPrice}</em></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td></td>
                    <td></td>
                    <td class="text-right">
                        <h4><strong>Total Price:</strong></h4>
                    </td>
                    <td class="text-center text-danger"></td>
                    <h4><strong>$ ${order.cart.totalPrice} </strong></h4>
                </tr>

                </tbody>
            </table>

        </div>

        <br><br><br><br>
        <button class="btn btn-default" name="_eventId_backToCollectShipmentDetail">Back</button>
        <input type="submit" value="Submit order" class="btn btn-default" name="_eventId_orderConfirmed">
        <button class="btn btn-default" name="_eventId_cancel">Cancel</button>
    </div>
</div>
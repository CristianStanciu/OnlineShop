<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/8/2017
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="fragments/header.jsp"/>


<br><br>

<div id="cart-container" class="container">
    <section id="first-section">
        <div>
            <br>
            <h4 class="text-center">Cart</h4>
            <h6 class="text-center"> All your cart items:</h6>
        </div>
    </section>

    <section id="second-section" class="container" ng-app="cartApp">
        <div ng-controller="cartCtrl" ng-init="initCartId('${cartId}')">
            <br>
            <br>
            <table id="cart-items-table" class="table">
                <tr>
                    <th>Product</th>
                    <th>Unit price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                    <th>Action</th>
                </tr>
                <tr ng-repeat="item in cart.cartItems">
                    <td>{{item.productId.productMaker}} {{item.productId.productName}}</td>
                    <td>{{item.productId.productPrice}}</td>
                    <td>{{item.quantity}}</td>
                    <td>{{item.totalPrice}}</td>
                    <td><a href="#" ng-click="removeFromCart(item.productId.productId)">
                        <span class="glyphicon glyphicon-remove"></span> remove</a></td>
                </tr>
                <tr>
                    <th></th>
                    <th></th>
                    <th>Grand Total</th>
                    <th>{{calculateTotalPrice()}}</th>
                    <th><a class="glyphicon glyphicon-remove" ng-click="clearCart()"> Remove all</a></th>
                </tr>

            </table>
            <div id="cart-page-buttons-div">
            <a href="<spring:url value="/product/productList" />" class="btn btn-default">Continue shopping</a>
            <a href="<spring:url value="/customer/order/${cartId}"/>" class="btn btn-default"><span
                    class="glyphicon-shopping-cart glyphicon"></span>Checkout</a>
            </div>
        </div>
    </section>
</div>

<script src="<spring:url value="/resources/js/controller.js" />"></script>


<jsp:include page="fragments/footer.jsp"/>
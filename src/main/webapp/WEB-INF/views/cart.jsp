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

<script src="<c:url value="/resources/js/controller.js" />"></script>

<div id="cart-container" class="container">
    <section id="first-section">
        <div>
            <h3>Cart</h3>
            <p> All the selected products</p>
        </div>
    </section>

    <section id="second-section" class="container" ng-app="cartApp">
        <div ng-controller="cartCtrl" ng-init="initCartId('${cartId}')">
        <div>
            <a class="btn btn-default pull-left" ng-click="clearCart()">Clear cart</a>
        </div>
        <table class="table table-hover">
            <tr>
                <th>Product</th>
                <th>Unit price</th>
                <th>Qunatity</th>
                <th>Total</th>
                <th>Action</th>
            </tr>
            <tr ng-repeat = "item in cart.cartItems">
                <td>{{item.product.productName}}</td>
                <td>{{item.product.productPrice}}</td>
                <td>{{item.quantity}}</td>
                <td>{{item.totalPrice}}</td>
                <td><a href="#" class="btn btn-default" ng-click="removeFromCart(item.product.product)">
                    <span class="glyphicon glyphicon-remove"></span>remove</a></td>
            </tr>
            <tr>
                <th></th>
                <th></th>
                <th>Grand Total</th>
                <th>{{calculateTotalPrice(}}</th>
                <th></th>
            </tr>

        </table>

        <a href="<spring:url value="/productList" />" class="btn btn-default">Continue shopping</a>
        </div>
    </section>
</div>




<jsp:include page="fragments/footer.jsp"/>
<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="fragments/header.jsp"/>

<div class="container wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Inventory page</h1>
            <p class="lead">This is the product inventory page</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Photo</th>
                <th>Type</th>
                <th>Maker</th>
                <th>Name</th>
                <th>Color</th>
                <th>Size</th>
                <th>Price</th>
                <th>Description</th>
                <th></th>
            </tr>
            </thead>
            <c:forEach items="${productList}" var="product">
                <tr>
                    <td><img src="<c:url value="/resources/images/${product.productId}.png"/>" alt="Product Photo" style="width:100%"></td>
                    <td>${product.productType}</td>
                    <td>${product.productMaker}</td>
                    <td>${product.productName}</td>
                    <td>${product.productColor}</td>
                    <td>${product.productSize}</td>
                    <td>${product.productPrice} lei</td>
                    <td>${product.productDscr}</td>
                    <td>
                        <div title="Product details">
                        <a href="<c:url value="/productList/viewProduct/${product.productId}"/>">
                            <span class="glyphicon glyphicon-zoom-in"></span>
                        </a>
                        </div>
                    </td>
                    <td>
                        <div title="Remove product">
                        <a href="<c:url value="/admin/productInventory/deleteProduct/${product.productId}" /> ">
                        <span class="glyphicon glyphicon-remove-circle"></span>
                        </div>
                    </a>
                    </td>
                    <td>
                        <div title="Edit product">
                        <a href="<c:url value="/admin/productInventory/editProduct/${product.productId}" /> ">
                            <span class="glyphicon glyphicon-pencil"></span>
                        </a>
                        </div>
                    </td>
                </tr>
            </c:forEach>

        </table>


        <a href="<spring:url value="/admin/productInventory/addProduct"/>" class="btn btn-primary"> ADD PRODUCT <a/>

            <jsp:include page="fragments/footer.jsp"/>


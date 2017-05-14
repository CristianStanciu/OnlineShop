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



<div id="product-list-container" class="container">
    <br>
    <br>
    <h4 class="text-center">Inventory page</h4>
    <br>
    <h5>You may manage the products:</h5>
    <table class="table">
        <thead>
        <tr>
            <th>Photo</th>
            <th>Type</th>
            <th>Maker</th>
            <th>Name</th>
            <th>Color</th>
            <th>Size</th>
            <th>Weight</th>
            <th>Price</th>
            <th>Description</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="product">
            <tr id="table-row">
                <td id="table-data"><img src="<c:url value="/resources/images/${product.productId}.png"/>" alt="Product Photo" id="product-image"></td>
                <td>${product.productType}</td>
                <td>${product.productMaker}</td>
                <td>${product.productName}</td>
                <td>${product.productColor}</td>
                <td>${product.productSize} cm</td>
                <td>${product.productWeight} g</td>
                <td>${product.productPrice} $</td>
                <td>${product.productDscr}</td>
                <td>
                    <div title="Product details">
                        <a href="<c:url value="/product/viewProduct/${product.productId}"/>">
                            <span class="glyphicon glyphicon-zoom-in"></span>
                        </a>
                    </div>
                </td>
                <td>
                    <div title="Remove product">
                        <a href="<c:url value="/admin/productInventory/deleteProduct/${product.productId}" /> ">
                            <span class="glyphicon glyphicon-remove-circle"></span></a>
                    </div>

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
        <br>
            <a href="<spring:url value="/admin/productInventory/addProduct"/>" class="btn btn-default text-center"> ADD PRODUCT </a>
        <br>
        </tbody>
        <br>
    </table>
    <br>
    <br>
</div>

<jsp:include page="fragments/footer.jsp"/>








<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 9:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="fragments/header.jsp"/>


<div id="product-list-container" class="container">
    <br>
    <h3 class="text-center">All products:</h3>
    <h5 class="text-center">Click the zoom icon for product details or to add it to your cart</h5>
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
                <td>${product.productImage}</td>
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
                            <span class="glyphicon glyphicon-zoom-in"></span></a>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
        <br>
    </table>
    <br>
    <br>
</div>


            
<jsp:include page="fragments/footer.jsp"/>



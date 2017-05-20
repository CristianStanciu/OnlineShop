<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 9:00 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="fragments/header.jsp"/>

<div class="container">
    <div class="card">
        <div id="view-product-container" class="container-fliud" ng-app="cartApp">
            <div class="wrapper row">
                <div class="preview col-md-6">
                    <div class="preview-pic tab-content">
                        <div class="tab-pane active" id="pic-1"><img
                                src="<c:url value="/resources/images/${product.productId}.png"/> " alt="Product Photo"
                                id="product-details-image"></div>
                    </div>
                </div>
                <div id="product-description" class="details col-md-6">
                    <div id="info-container">
                        <h3 class="product-title">Product details:</h3>
                        <p>
                        <h3><strong>Name</strong> : ${product.productName}</h3>
                        <p><strong>Type</strong> : ${product.productType}</p>
                        <p><strong>Color</strong> : ${product.productColor}</p>
                        <p><strong>Price</strong> : ${product.productPrice} $</p>
                        <p><strong>Size</strong> : ${product.productSize} cm</p>
                        <p><strong>Size</strong> : ${product.productWeight} g</p>
                        <p><strong>Description</strong> : ${product.productDscr}</p>
                        </p>
                        <c:set var="url" scope="page" value='/product/productList'/>

                        <c:if test="${pageContext.request.userPrincipal.name =='admin'}">
                            <c:set var="url" scope="page" value="/admin/productInventory"/>
                        </c:if>
                        <p ng-controller="cartCtrl">
                            <a href="<c:url value="${url}"/>" class="btn btn-default">Back</a>

                            <a href="#" class="btn btn-default" ng-click="addToCart('${product.productId}')"><span
                                    class="glyphicon glyphicon-shopping-cart"></span>Add to cart</a>

                            <a href="<spring:url value="/customer/cart"/>" class="btn btn-default">Cart</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="<spring:url value="/resources/js/controller.js"/>"></script>
<jsp:include page="fragments/footer.jsp"/>




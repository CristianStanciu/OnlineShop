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
        <div class="page-header">
            <h1>Product detail</h1>

            <p class="lead"> Here is the detail info of the product </p>

        </div>

            <div class="container" ng-app="cartApp">
                <div class="row">
                    <div class="col-md-5">
                        <img src="<c:url value="/resources/images/${product.product}.png"/> " alt="Product Photo" style="width:500px">
                    </div>
                    <div class="col-md-5">
                        <h3><strong>Name</strong> : ${product.productName}</h3>
                        <p> <strong>Type</strong> : ${product.productType}</p>
                        <p> <strong>Color</strong> : ${product.productColor}</p>
                        <p> <strong>Price</strong> : ${product.productPrice}$</p>
                        <p> <strong>Size</strong> : ${product.productSize}</p>
                        <p> <strong>Description</strong> : ${product.productDscr}</p>

                        <br>

                        <%--<c:set var="role" scope="page" value="${param.role}"/>--%>
                        <c:set var="url" scope="page" value='product/productList'/>
                        <c:if test="${pageContext.request.isUserInRole('adminPage')}">
                        <c:set var="url" scope="page" value="/admin/productInventory"/>
                        </c:if>

                        <%--<c:if test="${role='adminPage'}">--%>
                            <%--<c:set var="url" scope="page" value="/adminPage/productInventory"/>--%>
                        <%--</c:if>--%>

                        <p ng-controller="cartCtrl">
                            <a href="<c:url value="${url}"/>" class="btn btn-default">Back</a>
                            <a href="#" class="btn btn-default" ng-click="addToCart('${product.product}')" ><span class="glyphicon glyphicon-shopping-cart"></span>  Add to cart</a>
                            <a href="<spring:url value="/cart"/>" class="btn btn-default">Cart</a>
                        </p>

                    </div>
                </div>
            </div>
    </div>

<script src="<c:url value="/resources/js/controller.js" />"></script>
<jsp:include page="fragments/footer.jsp"/>


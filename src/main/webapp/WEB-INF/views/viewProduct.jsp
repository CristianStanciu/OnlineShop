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

<div class="container wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product detail</h1>
            <p class="lead"> Here is the detail info of the product </p>
        </div>
            <div class="container">
                <div class="row">
                    <div class="col-md-5">
                        <img src="<c:url value="/resources/images/${product.productId}.png"/> " alt="Product Photo" style="width:100%">
                    </div>
                    <div class="col-md-5">
                        <h3><strong>Name</strong> : ${product.productName}</h3>
                        <p> <strong>Type</strong> : ${product.productType}</p>
                        <p> <strong>Color</strong> : ${product.productColor}</p>
                        <p> <strong>Price</strong> : ${product.productPrice}</p>
                        <p> <strong>Size</strong> : ${product.productSize}</p>
                        <p> <strong>Description</strong> : ${product.productDscr}</p>
                    </div>
                </div>
            </div>




<jsp:include page="fragments/footer.jsp"/>


<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/11/2017
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="fragments/header.jsp"/>


<div id="cart-container" class="container">
    <section >
        <div>
            <h3 class="alert-danger">Checkout cancelled</h3>
        </div>
    </section>

    <section class="container">



        <a href="<spring:url value="product/productList" />" class="btn btn-default">Back to shopping</a>
    </section>
</div>



<jsp:include page="fragments/footer.jsp"/>

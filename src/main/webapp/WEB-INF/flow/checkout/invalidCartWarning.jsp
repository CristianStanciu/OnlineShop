<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/11/2017
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="fragments/header.jsp"/>


<div id="cart-container" class="container">
    <section id="first-section">
        <div>
            <h3>Invalid cart</h3>
        </div>
    </section>

    <section class="container">



        <a href="<spring:url value="product/productList" />" class="btn btn-default">Products </a>
    </section>
</div>



<jsp:include page="fragments/footer.jsp"/>

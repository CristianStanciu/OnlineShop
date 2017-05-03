
<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="fragments/header.jsp"/>

<div class="container wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Admin page</h1>
            <p class="lead">This is the admin page</p>
        </div>

        <h3>
            <a href="<c:url value="/admin/productInventory"/>">Product Inventory</a>
        </h3>

        <p> Here you can manage the inventory</p>


            <jsp:include page="fragments/footer.jsp"/>

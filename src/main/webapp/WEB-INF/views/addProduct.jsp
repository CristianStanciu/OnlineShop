<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="fragments/header.jsp"/>

<div class="container wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Product</h1>
            <p class="lead">Fill the details to add a product</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/productInventory/addProduct" method="post" modelAttribute="product" enctype="multipart/form-data">
        <div class="form-group">
            <label for="name"> Product type: </label>
            <form:select path="productType" items="${productTypes}" itemLabel="productType" itemValue="productType" cssClass="form-Control"/>
        </div>
        <div class="form-group">
            <label for="name"> Maker: </label>
            <form:input path="productMaker" id="maker" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="name"> Name: </label>
            <form:input path="productName" id="name" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="color"> Color: </label>
            <form:input path="productColor" id="color" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="size"> Size: </label>
            <form:input path="productSize" id="size" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="price"> Price: </label>
            <form:input path="productPrice" id="price" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="description"> Description: </label>
            <form:textarea path="productDscr" id="description" class="form-Control"/>
        </div>
        <div class="form-group">
            <label class="control-label" for="image"> Upload image: </label>
            <form:input  path="productImage" id="image" type="file" class="form:input-large"/>
        </div>



        <br><br><br><br>

        <input type="submit" value="Add" class="btn btn-default">
        <a href="<c:url value="/admin/productInventory"/> " class="btn btn-default">Cancel</a>
        </form:form>


<jsp:include page="fragments/footer.jsp"/>


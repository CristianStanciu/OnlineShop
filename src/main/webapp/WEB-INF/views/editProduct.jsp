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

<div id="register-container" class="container wrapper">
    <div class="container">
        <div class="page-header">
            <h4 class="text-center">Edit Product</h4>
            <h5 class="lead">Fill the details to update product:</h5>
        </div>

        <form:form id="register-form" action="${pageContext.request.contextPath}/admin/productInventory/editProduct"
                   method="post"
                   modelAttribute="product" enctype="multipart/form-data">
            <form:hidden path="productId" id="productId" value="${product.productId}"/>
            <div class="form-group">
                <label for="name"> Product type: </label> <form:errors path="productType" cssStyle="color:#ec2f2f;"/>
                <form:select path="productType" items="${productTypes}" itemLabel="productType" itemValue="productType"
                             cssClass="form-Control"/>
            </div>
            <div class="form-group">
                <label for="name"> Maker: </label> <form:errors path="productMaker" cssStyle="color:#ec2f2f;"/>
                <form:input path="productMaker" id="maker" class="form-Control"/>
            </div>
            <div class="form-group">
                <label for="name"> Name: </label> <form:errors path="productName" cssStyle="color:#ec2f2f;"/>
                <form:input path="productName" id="name" class="form-Control"/>
            </div>
            <div class="form-group">
                <label for="color"> Color: </label> <form:errors path="productColor" cssStyle="color:#ec2f2f;"/>
                <form:input path="productColor" id="color" class="form-Control"/>
            </div>
            <div class="form-group">
                <label for="size"> Size: </label> <form:errors path="productSize" cssStyle="color:#ec2f2f;"/>
                <form:input path="productSize" id="size" class="form-Control"/>
            </div>
            <div class="form-group">
                <label for="weight"> Weight: </label> <form:errors path="productWeight" cssStyle="color:#ec2f2f;"/>
                <form:input path="productWeight" id="weight" class="form-Control"/>
            </div>

            <div class="form-group">
                <label for="price"> Price: </label> <form:errors path="productPrice" cssStyle="color:#ec2f2f;"/>
                <form:input path="productPrice" id="price" class="form-Control"/>
            </div>
            <div class="form-group">
                <label for="description"> Description: </label>
                <form:textarea path="productDscr" id="description" class="form-Control"/>
            </div>
            <div class="form-group">
                <label class="control-label" for="image"> Upload image: </label>
                <form:input path="productImage" id="image" type="file" class="form:input-large"/>
            </div>
            <br>
            <div class="text-center">
                <input type="submit" value="Edit" class="btn btn-default">
                <a href="<c:url value="/admin/productInventory"/> " class="btn btn-default">Cancel</a>
            </div>
            <br>
            <br>
        </form:form>

    </div>

</div>


<jsp:include page="fragments/footer.jsp"/>


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

<div id="admin-page">
    <div id="admin-page-title">
    </div>
    <div id="adminContainer" class="container wrapper">
        <div>
            <div id="greeting-admin">
                <br>
                <br>
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <h4>Welcome <strong>${pageContext.request.userPrincipal.name}</strong>!</h4>
                </c:if>
                <br>
                <br>
            </div>
            <div id="admin-buttons" class="row">
                <div id="left-button" class="col-sm-4"><a href="<c:url value="/admin/productInventory"/>" class="btn btn-default">EDIT
                    PRODUCTS</a></div>
                <div id="right-button" class="col-sm-4"><a href="<c:url value="/admin/customerManagement"/>" class="btn btn-default">EDIT
                    CUSTOMERS</a></div>
            </div>
            <br>
            <br>
        </div>
    </div>
</div>
<br>
<br>
<br>
<br>


<jsp:include page="fragments/footer.jsp"/>

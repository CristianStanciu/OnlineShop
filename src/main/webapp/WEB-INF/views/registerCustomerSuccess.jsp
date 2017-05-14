<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/10/2017
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="fragments/header.jsp"/>

<%--<script src="<c:url value="/resources/js/controller.js" />"></script>--%>

<div id="register-succes-container" class="container">
        <div id="container-content" class="text-center">
            <br>
            <h5>Account successfully registered</h5>
            <br>
            <br>
            <br>
            <br>
            <a href="<spring:url value="/login" />" class="btn btn-default text-center">Login</a>
        </div>
</div>

<jsp:include page="fragments/footer.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/7/2017
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="fragments/header.jsp"/>


<div class="container login-form" >

    <h6>Enter your username and password:</h6>

    <c:if test="${not empty logout}">
    <div>${logout}</div>
    </c:if>


    <div class="bootstrap-iso">
        <div id="login-container" class="container-fluid">
                <div id="colomns" class="col-md-6 col-sm-6 col-xs-12">
                    <form name="loginForm" id="loginForm" role="form" action="<c:url value="/j_spring_security_check"/>" method="post" >
                            <c:if test="${not empty error}">
                                <div class="error" style="color:#ff0000;">${error}</div>
                            </c:if>
                        <div class="form-group">
                            <input class="form-control" placeholder="Username" name="username" type="username">
                        </div>
                        <div class="form-group">
                            <input class="form-control" placeholder="Password" name="password" type="password">
                        </div>
                        <div class="checkbox">
                            <label>
                                <input name="remember" type="checkbox" value="Remember Me">Remember Me
                            </label>
                        </div>
                        <div class="form-group">
                            <div>
                                <button class="btn btn-default" name="submit" type="submit">
                                    Submit
                                </button>
                            </div>
                        </div>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csfr.token}" />
                    </form>
                </div>
        </div>
    </div>



<jsp:include page="fragments/footer.jsp"/>








<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/11/2017
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="fragments/header.jsp"/>

<div class="container wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Customer management</h1>
            <p class="lead"> Manage customers:</p>

            <table class="table table-striped table-hover">
                <thead>
                <tr class="bg-success">
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Email address</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Address</th>
                    <th>Phone number</th>
                    <th>Billing address</th>
                </tr>
                </thead>
                <c:forEach items="${customerList}" var="customer">
                    <tr>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.email}</td>
                        <td>${customer.username}</td>
                        <td>${customer.password}</td>
                        <td>${customer.address}</td>
                        <td>${customer.phoneNo}</td>
                        <td>${customer.billingAddress}</td>
                        <td>
                            <div title="Product details">
                                <a href="<c:url value="/product/viewProduct/${product.product}"/>">
                                    <span class="glyphicon glyphicon-zoom-in"></span></a>
                            </div>
                        </td>
                    </tr>
                </c:forEach>

            </table>

        </div>

    </div>

</div>

<jsp:include page="fragments/footer.jsp"/>
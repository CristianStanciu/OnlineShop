<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/9/2017
  Time: 11:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="fragments/header.jsp"/>


<div class="container">
    <div class="page-header">
        <h1>Register a new account</h1>
        <p class="lead">Fill in the details</p>
    </div>

    <form:form action="${pageContext.request.contextPath}/register" method="post" modelAttribute="customer">
        <div class="form-group">
            <label for="name"> Name: </label> <form:errors path="firstName" cssStyle="color:#ec2f2f;"/>
            <form:input path="firstName" id="name" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="lastName"> Last name: </label> <form:errors path="lastName" cssStyle="color:#ec2f2f;"/>
            <form:input path="lastName" id="lastName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="email"> Email: </label> <form:errors path="email" cssStyle="color:#ec2f2f;"/>
            <form:input path="email" id="email" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="username"> Username: </label> <form:errors path="username" cssStyle="color:#ec2f2f;"/>
            <form:input path="username" id="username" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="password"> Password: </label> <form:errors path="password" cssStyle="color:#ec2f2f;"/>
            <form:password path="password" id="password" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="address"> Address: </label> <form:errors path="address" cssStyle="color:#ec2f2f;"/>
            <form:input path="address" id="address" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="phoneNo"> Phone number: </label> <form:errors path="phoneNo" cssStyle="color:#ec2f2f;"/>
            <form:textarea path="phoneNo" id="phoneNo" class="form-Control"/>
        </div>

        <p>Billing address:</p>


        <div class="form-group">
            <label for="billingAddress.streetName"> Street name: </label> <form:errors path="billingAddress.streetName"
                                                                                       cssStyle="color:#ec2f2f;"/>
            <form:input path="billingAddress.streetName" id="billingAddress.streetName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.houseNo"> House number: </label> <form:errors path="billingAddress.houseNo"
                                                                                     cssStyle="color:#ec2f2f;"/>
            <form:input path="billingAddress.houseNo" id="billingAddress.houseNo" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.city"> City: </label> <form:errors path="billingAddress.city"
                                                                          cssStyle="color:#ec2f2f;"/>
            <form:input path="billingAddress.city" id="billingAddress.city" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.state"> State: </label> <form:errors path="billingAddress.state"
                                                                            cssStyle="color:#ec2f2f;"/>
            <form:password path="billingAddress.state" id="billingAddress.state" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.country"> country: </label> <form:errors path="billingAddress.country"
                                                                                cssStyle="color:#ec2f2f;"/>
            <form:input path="billingAddress.country" id="billingAddress.country" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.zipCode"> Zip code: </label> <form:errors path="billingAddress.zipCode"
                                                                                 cssStyle="color:#ec2f2f;"/>
            <form:textarea path="billingAddress.zipCode" id="billingAddress.zipCode" class="form-Control"/>
        </div>


        <br><br><br><br>

        <input type="submit" value="OK" class="btn btn-default">
        <a href="<c:url value="/"/> " class="btn btn-default">Cancel</a>
    </form:form>

</div>


<jsp:include page="fragments/footer.jsp"/>
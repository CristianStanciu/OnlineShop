<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/11/2017
  Time: 9:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="fragments/header.jsp"/>


<div class="container">
    <div class="page-header">
        <h1>Customer</h1>
        <p class="lead">Customer details</p>
    </div>

    <form:form modelAttribute="order" class="form-horizontal">
        <div class="form-group">
            <label for="name"> Name: </label> <form:errors path="firstName" cssStyle="color:#ec2f2f;"/>
            <form:input path="cart.customer.customerName" id="name" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="email"> Email: </label> <form:errors path="email" cssStyle="color:#ec2f2f;"/>
            <form:input path="cart.customer.customerEmail" id="email" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="phoneNo"> Phone number: </label> <form:errors path="phoneNo" cssStyle="color:#ec2f2f;"/>
            <form:textarea path="cart.customer.customerPhoneNo" id="phoneNo" class="form-Control"/>
        </div>

        <p>Billing address:</p>


        <div class="form-group">
            <label for="billingAddress.streetName"> Street name: </label> <form:errors path="billingAddress.streetName"
                                                                                       cssStyle="color:#ec2f2f;"/>
            <form:input path="cart.customer.billingAddress.streetName" id="billingAddress.streetName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.houseNo"> House number: </label> <form:errors path="billingAddress.houseNo"
                                                                                     cssStyle="color:#ec2f2f;"/>
            <form:input path="cart.customer.billingAddress.houseNo" id="billingAddress.houseNo" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.city"> City: </label> <form:errors path="billingAddress.city"
                                                                          cssStyle="color:#ec2f2f;"/>
            <form:input path="cart.customer.billingAddress.city" id="billingAddress.city" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.state"> State: </label> <form:errors path="billingAddress.state"
                                                                            cssStyle="color:#ec2f2f;"/>
            <form:password path="cart.customer.billingAddress.state" id="billingAddress.state" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.country"> country: </label> <form:errors path="billingAddress.country"
                                                                                cssStyle="color:#ec2f2f;"/>
            <form:input path="cart.customer.billingAddress.country" id="billingAddress.country" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.zipCode"> Zip code: </label> <form:errors path="billingAddress.zipCode"
                                                                                 cssStyle="color:#ec2f2f;"/>
            <form:textarea path="cart.customer.billingAddress.zipCode" id="billingAddress.zipCode" class="form-Control"/>
        </div>

        <input type="hidden" name="_flowExecutionKey"/>




        <br><br><br><br>

        <input type="submit" value="Next" class="btn btn-default" name="_eventId_customerInfoCollected" >
        <button class="btn btn-default" name="_eventId_cancel">Cancel</button>
    </form:form>

</div>


<jsp:include page="fragments/footer.jsp"/>

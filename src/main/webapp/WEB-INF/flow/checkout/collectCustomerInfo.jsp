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
<jsp:include page="../../views/fragments/header.jsp"/>


<div class="container">
    <div class="page-header">
        <h1>Customer</h1>
        <p class="lead">Customer details</p>
    </div>

    <form:form modelAttribute="orderVO" class="form-horizontal" >
        <div class="form-group">
            <label for="firstName"> First name: </label> <form:errors path="${orderVO.customerId.firstName}" cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.firstName}" id="firstName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="lastName"> Last name: </label> <form:errors path="${orderVO.customerId.lastName}" cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.lastName}" id="lastName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="email"> Email: </label> <form:errors path="${orderVO.customerId.email}" cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.email}" id="email" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="phoneNo"> Phone number: </label> <form:errors path="${orderVO.customerId.phoneNo}" cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.phoneNo}" id="phoneNo" class="form-Control"/>
        </div>

        <p>Billing address:</p>


        <div class="form-group">
            <label for="billingAddress.streetName"> Street name: </label> <form:errors path="${orderVO.customerId.billingAddressId.streetName}"
                                                                                       cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.billingAddressId.streetName}" id="billingAddress.streetName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.houseNo"> House number: </label> <form:errors path="${orderVO.customerId.billingAddressId.houseNo}"
                                                                                     cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.billingAddressId.houseNo}" id="billingAddress.houseNo" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.city"> City: </label> <form:errors path="${orderVO.customerId.billingAddressId.city}"
                                                                          cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.billingAddressId.city}" id="billingAddress.city" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.state"> State: </label> <form:errors path="${orderVO.customerId.billingAddressId.state}"
                                                                            cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.billingAddressId.state}" id="billingAddress.state" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.country"> country: </label> <form:errors path="${orderVO.customerId.billingAddressId.country}"
                                                                                cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.billingAddressId.country}" id="billingAddress.country" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddressId.zipCode"> Zip code: </label> <form:errors path="${orderVO.customerId.billingAddressId.zipCode}"
                                                                                 cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.customerId.billingAddressId.zipCode}" id="billingAddressId.zipCode" class="form-Control"/>
        </div>

        <input type="hidden" name="_flowExecutionKey"/>

        <br><br><br><br>

        <input type="submit" value="Next" class="btn btn-default" name="_eventId_customerInfoCollected" >
        <button class="btn btn-default" name="_eventId_cancel">Cancel</button>
    </form:form>

</div>


<jsp:include page="../../views/fragments/footer.jsp"/>

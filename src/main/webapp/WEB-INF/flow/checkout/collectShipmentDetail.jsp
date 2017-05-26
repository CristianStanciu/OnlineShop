<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/11/2017
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../../views/fragments/header.jsp"/>


<div class="container">
    <div class="page-header">
    </div>

        <p>Shipping address:</p>

        <form:form modelAttribute="orderVO" class="form-horizontal">
        <div class="form-group">
            <label for="shipmentAddress.streetName"> Street name: </label> <form:errors path="${orderVO.shipmentAddress.streetName}"
                                                                                       cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.shipmentAddress.streetName}" id="shipmentAddress.streetName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="shipmentAddress.houseNo"> House number: </label> <form:errors path="${orderVO.shipmentAddress.houseNo}"
                                                                                     cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.shipmentAddress.houseNo}" id="shipmentAddress.houseNo" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="shipmentAddress.city"> City: </label> <form:errors path="${orderVO.shipmentAddress.city}"
                                                                          cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.shipmentAddress.city}" id="shipmentAddress.city" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="shipmentAddress.state"> State: </label> <form:errors path="${orderVO.shipmentAddress.state}"
                                                                            cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.shipmentAddress.state}" id="shipmentAddress.state" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="shipmentAddress.country"> country: </label> <form:errors path="${orderVO.shipmentAddress.country}"
                                                                                cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.shipmentAddress.country}" id="shipmentAddress.country" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="shipmentAddress.zipCode"> Zip code: </label> <form:errors path="${orderVO.shipmentAddress.zipCode}"
                                                                                 cssStyle="color:#ec2f2f;"/>
            <form:input path="${orderVO.shipmentAddress.zipCode}" id="shipmentAddress.zipCode" class="form-Control"/>
        </div>

            <%--<input type="hidden" name="_flowExecutionKey"/>--%>

        <br><br><br><br>
        <button class="btn btn-default" name="_eventId_backToCollectCustomerInfo">Back</button>
        <input type="submit" value="Next" class="btn btn-default" name="_eventId_shippingDetailCollected" >
        <button class="btn btn-default" name="_eventId_cancel">Cancel</button>
        </form:form>
</div>


<jsp:include page="../../views/fragments/footer.jsp"/>
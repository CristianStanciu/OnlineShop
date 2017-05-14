
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<jsp:include page="fragments/header.jsp"/>--%>


<%--<div class="container-fluid">--%>
    <%--<br>--%>
    <%--<br>--%>
    <%--<br>--%>
    <%--<br>--%>
    <%--<h4 class="text-center">Account information</h4>--%>
    <%--<h6 class="text-center">Edit your account details:</h6>--%>
    <%--<br>--%>
    <%--<table id="customer-table" class="table">--%>
        <%--<thead>--%>
        <%--<tr class="table-rows">--%>
            <%--<th>First name</th>--%>
            <%--<th>Last name</th>--%>
            <%--<th>Email address</th>--%>
            <%--<th>Username</th>--%>
            <%--<th>Password</th>--%>
            <%--<th>Address</th>--%>
            <%--<th>Phone number</th>--%>
            <%--<td>Billing address</td>--%>
            <%--<td>House number</td>--%>
            <%--<td>City</td>--%>
            <%--<td>State</td>--%>
            <%--<td>Country</td>--%>
            <%--<td>Zip code</td>--%>
        <%--</tr>--%>
        <%--</thead>--%>
        <%--<tbody>--%>


            <%--<tr class="table-rows">--%>
                <%--<td>${customer.firstName}</td>--%>
                <%--<td>${customer.lastName}</td>--%>
                <%--<td>${customer.email}</td>--%>
                <%--<td>${customer.username}</td>--%>
                <%--<td>${customer.password}</td>--%>
                <%--<td>${customer.address}</td>--%>
                <%--<td>${customer.phoneNo}</td>--%>
                <%--<td>${customer.billingAddressId.streetName}</td>--%>
                <%--<td>${customer.billingAddressId.houseNo}</td>--%>
                <%--<td>${customer.billingAddressId.city}</td>--%>
                <%--<td>${customer.billingAddressId.state}</td>--%>
                <%--<td>${customer.billingAddressId.country}</td>--%>
                <%--<td>${customer.billingAddressId.zipCode}</td>--%>
                <%--<td>--%>
                    <%--<div title="Remove customer">--%>
                        <%--<a href="<c:url value="/admin/customerManagement/deleteCustomer/${customer.customerId}" /> ">--%>
                            <%--<span class="glyphicon glyphicon-remove-circle"></span></a>--%>
                    <%--</div>--%>

                <%--</td>--%>
                <%--<td>--%>
                    <%--<div title="Edit customer">--%>
                        <%--<a href="<c:url value="/admin/customerManagement/editCustomer/${customer.customerId}" /> ">--%>
                            <%--<span class="glyphicon glyphicon-pencil"></span>--%>
                        <%--</a>--%>
                    <%--</div>--%>
                <%--</td>--%>
            <%--</tr>--%>


        <%--</tbody>--%>
        <%--<br>--%>
        <%--<br>--%>
    <%--</table>--%>
    <%--<br>--%>
    <%--<br>--%>
    <%--<br>--%>
    <%--<br>--%>
<%--</div>--%>



<%--<jsp:include page="fragments/footer.jsp"/>--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="fragments/header.jsp"/>


<div id="register-container" class="container">
    <div class="page-header">
        <h4 class="text-center">Update account information</h4>
    </div>

    <form:form id="register-form" action="${pageContext.request.contextPath}/customer/account/edit" method="post" modelAttribute="customer">
        <div class="form-group">
            <label for="name"> First name: </label> <form:errors path="firstName" cssStyle="color:#ec2f2f;"/>
            <form:input path="firstName" id="name" class="form-Control"/>
            <form:hidden path="customerId" id="customerId" value="${customer.customerId}"/>
        </div>
        <div class="form-group">
            <label for="lastName"> Last name: </label> <form:errors path="lastName" cssStyle="color:#ec2f2f;"/>
            <form:input path="lastName" id="lastName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="email"> Email: </label> <form:errors path="email" cssStyle="color:#ec2f2f;"/> <span style="color:#ec2f2f">${alreadyExistingEmail}</span>
            <form:input path="email" id="email" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="username"> Username: </label> <form:errors path="username" cssStyle="color:#ec2f2f;"/> <span style="color:#ec2f2f">${alreadyExistinggetUsername}</span>
            <form:input path="username" id="username" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="password"> Password: </label> <form:errors path="password" cssStyle="color:#ec2f2f;"/>
            <form:password path="password" id="password" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="address"> Street: </label> <form:errors path="address" cssStyle="color:#ec2f2f;"/>
            <form:input path="address" id="address" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="houseNo"> House number: </label> <form:errors path="houseNo" cssStyle="color:#ec2f2f;"/>
            <form:input path="houseNo" id="houseNo" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="phoneNo"> Phone number: </label> <form:errors path="phoneNo" cssStyle="color:#ec2f2f;"/>
            <form:textarea path="phoneNo" id="phoneNo" class="form-Control"/>
        </div>

        <br>
        <br>


        <h6>Billing address:</h6>
        <br>

        <div class="form-group">

            <label for="billingAddressId.streetName"> Street name: </label> <form:errors path="billingAddressId.streetName"
                                                                                         cssStyle="color:#ec2f2f;"/>
            <form:input path="billingAddressId.streetName" id="billingAddress.streetName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.houseNo"> House number: </label> <form:errors path="billingAddressId.houseNo"
                                                                                     cssStyle="color:#ec2f2f;"/>
            <form:input path="billingAddressId.houseNo" id="billingAddress.houseNo" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.city"> City: </label> <form:errors path="billingAddressId.city"
                                                                          cssStyle="color:#ec2f2f;"/>
            <form:input path="billingAddressId.city" id="billingAddress.city" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.state"> State: </label> <form:errors path="billingAddressId.state"
                                                                            cssStyle="color:#ec2f2f;"/>
            <form:input path="billingAddressId.state" id="billingAddress.state" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.country"> country: </label> <form:errors path="billingAddressId.country"
                                                                                cssStyle="color:#ec2f2f;"/>
            <form:input path="billingAddressId.country" id="billingAddress.country" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingAddress.zipCode"> Zip code: </label> <form:errors path="billingAddressId.zipCode"
                                                                                 cssStyle="color:#ec2f2f;"/>
            <form:textarea path="billingAddressId.zipCode" id="billingAddress.zipCode" class="form-Control"/>
        </div>
        <br>

        <div class="text-center">
            <input type="submit" class="btn btn-default text-center" value="Update">
            <a href="<c:url value="/product/productList"/> " class="btn btn-default text-center">Cancel</a>
            <a href="<c:url value="/customer/account/delete"/> " class="btn btn-default text-center">Delete account</a>
        </div>
        <br>
        <br>

    </form:form>

</div>

<jsp:include page="fragments/footer.jsp"/>
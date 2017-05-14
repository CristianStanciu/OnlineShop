
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="fragments/header.jsp"/>


<div class="container-fluid">
    <br>
    <br>
    <br>
    <br>
    <h4 class="text-center">Registred customers:</h4>
    <h6 class="text-center">Search, edit, delete:</h6>
    <br>
    <table id="customer-table" class="table">
        <thead>
        <tr class="table-rows">
            <th id="1st-row">Customer</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Email address</th>
            <th>Username</th>
            <th>Password</th>
            <th>Address</th>
            <th>Phone number</th>
            <th>Active</th>
            <td>Billing address</td>
            <td>House number</td>
            <td>City</td>
            <td>State</td>
            <td>Country</td>
            <td>Zip code</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerList}" var="customer">
            <tr class="table-rows">
                <td>${customer.customerId}</td>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.email}</td>
                <td>${customer.username}</td>
                <td>${customer.password}</td>
                <td>${customer.address}</td>
                <td>${customer.phoneNo}</td>
                <td>${customer.active}</td>
                <td>${customer.billingAddressId.streetName}</td>
                <td>${customer.billingAddressId.houseNo}</td>
                <td>${customer.billingAddressId.city}</td>
                <td>${customer.billingAddressId.state}</td>
                <td>${customer.billingAddressId.country}</td>
                <td>${customer.billingAddressId.zipCode}</td>
                <td>
                    <div title="Remove customer">
                        <a href="<c:url value="/admin/customerManagement/deleteCustomer/${customer.customerId}" /> ">
                            <span class="glyphicon glyphicon-remove-circle"></span></a>
                    </div>

                </td>
                <td>
                    <div title="Edit customer">
                        <a href="<c:url value="/admin/customerManagement/editCustomer/${customer.customerId}" /> ">
                            <span class="glyphicon glyphicon-pencil"></span>
                        </a>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
        <br>
        <br>
    </table>
    <br>
    <br>
    <br>
    <br>
</div>



<jsp:include page="fragments/footer.jsp"/>



<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/11/2017
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="../../views/fragments/header.jsp"/>
<jsp:useBean id="now" class="java.util.Date" />


<div class="container">
    <div class="page-header">
        <h3>Order:</h3>
    </div>

    <p>Order confirmation:</p>

    <div>

        <div class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 col-md-offset-3">

            <div class="text-center">
                <h1>Receipt</h1>
            </div>
            <div class="row">
                <div class="col-xs-6 col-sm-6 col-md-6">
                    <address>
                        <strong>Shipping address:</strong>
                        <br>
                        ${orderVO.shipmentAddress.streetName}
                        <br>
                        ${orderVO.shipmentAddress.houseNo}
                        <br>
                        ${orderVO.shipmentAddress.city}, ${orderVO.shipmentAddress.state}
                        <br>
                        ${orderVO.shipmentAddress.country}, ${orderVO.shipmentAddress.zipCode}
                        <br>
                    </address>
                </div>
                <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                    <p>Shipping date: <fmt:formatDate type="date" value="${now}"/></p>
                </div>

            </div>

            <div class="col-xs-6 col-sm-6 col-md-6">
                <address>
                    <strong>Billing address:</strong>
                    <br>
                    ${orderVO.billingAddress.streetName}
                    <br>
                    ${orderVO.billingAddress.houseNo}
                    <br>
                    ${orderVO.billingAddress.city}, ${orderVO.billingAddress.state}
                    <br>
                    ${orderVO.billingAddress.country}, ${orderVO.billingAddress.zipCode}
                    <br>
                </address>
            </div>
        </div>

        <div class="row">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>Product</th>
                    <th>#</th>
                    <th class="text-center">Price</th>
                    <th class="text-center">Total</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="cartItem" items="${orderVO.cartId.cartItems}">
                    <tr>
                        <td class="col-md-9"><em>${cartItem.productId.productName}</em></td>
                        <td class="col-md-1" style="text-align: center">${cartItem.quantity}</td>
                        <td class="col-md-9"><em>${cartItem.productId.productPrice}</em></td>
                        <td class="col-md-9"><em>${cartItem.totalPrice}</em></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td></td>
                    <td></td>
                    <td class="text-right">
                        <h4><strong>Total Price:</strong></h4>
                    </td>
                    <td class="text-center text-danger"></td>
                    <h4><strong>$ ${orderVO.cartId.totalPrice} </strong></h4>
                </tr>

                </tbody>
            </table>

        </div>

        <%--<input type="hidden" name="_flowExecutionKey"/>--%>

        <br><br><br><br>
        <button class="btn btn-default" name="_eventId_backToCollectShipmentDetail">Back</button>
        <input type="submit" value="Submit order" class="btn btn-default" name="_eventId_orderConfirmed">
        <button class="btn btn-default" name="_eventId_cancel">Cancel</button>
    </div>
</div>

<jsp:include page="../../views/fragments/footer.jsp"/>
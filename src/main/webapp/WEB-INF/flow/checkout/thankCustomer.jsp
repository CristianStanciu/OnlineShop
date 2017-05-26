<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/11/2017
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="../../views/fragments/header.jsp"/>


<div id="cart-container" class="container">
    <section id="first-section">
        <div>
            <h3>Thank you for your purchase</h3>
            <p>You can track your shipment with {this.shipmentNo} </p>
        </div>
    </section>

    <section class="container">
        <a href="<spring:url value="/" />" class="btn btn-default">oK </a>
    </section>
    <%--<input type="hidden" name="_flowExecutionKey"/>--%>

</div>



<jsp:include page="../../views/fragments/footer.jsp"/>

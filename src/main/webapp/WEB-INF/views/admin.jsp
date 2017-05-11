
<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="fragments/header.jsp"/>

<div id="admin-page-title">
    <h6>Administrator page</h6>
</div>
<div id="adminContainer"  class="container wrapper">
    <div class="container">
        <div class="page-header">
                <div id="greeting-admin">
                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                        <h4>Welcome <strong>${pageContext.request.userPrincipal.name}</strong>!</h4>
                     </c:if>
                </div>

                <div id="logout">
                    <a href="<c:url value="/j_spring_security_logout"/> "><h5>Logout</h5></a>
                </div>
        </div>
        <div>
            <h3>
                <a href="<c:url value="/admin/productInventory"/>" class="btn btn-default">PRODUCT INVENTORY</a>
            </h3>
        </div>

        <div>
            <h3>
                <a href="<c:url value="/admin/customer"/>" class="btn btn-default">CUSTOMER INVENTORY</a>
            </h3>
        </div>
    </div>
</div>



<jsp:include page="fragments/footer.jsp"/>

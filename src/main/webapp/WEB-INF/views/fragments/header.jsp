<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="utf-8">

    <title>L-ectro.com</title>

    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
    <script src="<spring:url value="/resources/js/controller.js" />"></script>

    <!-- Reset CSS -->
    <link rel="stylesheet" href="<spring:url value="/resources/css/reset.css"/>" type="text/css">

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap.min.css"/>" type="text/css">

    <!-- Main CSS -->
    <link rel="stylesheet" href="<spring:url value="/resources/css/main.css"/>" type="text/css">

    <!-- Carousel CSS -->
    <link rel="stylesheet" href="<spring:url value="/resources/css/carousel.css"/>" type="text/css">

    <!-- CSS Files -->
    <link rel="stylesheet" href="<spring:url value="/resources/css/owl.carousel.css"/>" type="text/css">
    <link rel="stylesheet" href="<spring:url value="/resources/css/responsive.css"/>" type="text/css">


</head>
<body>


<!-- Top Bar Starts -->
<div class="free-shiping">
    <!-- Nested Container Starts -->
    <div class="container">
        <!-- Free shipping image -->
        <img src="<spring:url value="/resources/images/freeShipping2.png"/>"/>
        <span>Free Shipping</span> on order over $100. This offer is valid on all our store items.
    </div>
    <!-- Nested Container Ends -->
</div>
<!-- Top Bar Ends -->


<!-- Header Section Starts -->
<header class="header-area">
    <!-- Header Top Starts -->
    <div id="dropshadow" class="header-top">
        <!-- Nested Container Starts -->
        <div class="container">
            <!-- Nested Row Starts -->
            <div class="row">
                <!-- Languages Starts -->
                <div id="language-div" class="col-sm-3 col-xs-12">
                    <div class="pull-left">
                        <div class="btn-group">
                            <button class="btn btn-link dropdown-toggle text-uppercase" data-toggle="dropdown">
                                <span class="glyphicon glyphicon-globe"></span><span id="language">  Language</span>
                            </button>
                            <ul class="pull-left dropdown-menu">
                                <li>
                                    <a tabindex="-1" href="#">English</a>
                                </li>
                                <li>
                                    <a tabindex="-1" href="#">French</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- Languages End -->


                <!-- Header Links Starts -->
                <div class="col-sm-6 col-xs-12">
                    <ul class="list-unstyled list-inline header-links text-center">
                            <li><a href="<c:url value="/"/>">Home</a></li>
                            <li><a href="<c:url value="/product/productList"/>">Products</a></li>
                        <c:if test="${pageContext.request.userPrincipal.name!='admin'}">
                            <li><a href="<c:url value="/customer/account" />">My Account</a></li>
                        </c:if>
                        <c:if test="${pageContext.request.userPrincipal.name!=null}">
                            <li><strong style="color: #ec2f2f;">Welcome ${pageContext.request.userPrincipal.name}</strong></li>
                            <c:if test="${pageContext.request.userPrincipal.name =='admin'}">
                                <li><a href="<c:url value="/admin"/>"><strong style="color: #ec2f2f;">Admin Panel</strong></a></li>
                            </c:if>
                            <li><a href="<spring:url value="/checkout" />">Checkout</a></li>
                            <li><a href="<spring:url value="customer/wishList"/>">Wish List</a></li>
                            <li><a href="<spring:url value="/j_spring_security_logout" />">Logout</a></li>
                        </c:if>


                        <c:if test="${pageContext.request.userPrincipal.name == null}">
                            <li><a href="<c:url value="/login" />">Login</a></li>
                            <li><a href="<c:url value="/register"/>">Register</a></li>
                        </c:if>


                    </ul>
                </div>
                <!-- Header Links Ends -->


                <!-- Cart Starts -->
                <div class="col-sm-3 col-xs-12">
                    <div id="cart" class="btn-group btn-block">
                        <button type="button" class="btn btn-link text-uppercase">
                            <img src="<spring:url value="/resources/images/shoppingCart0.png"/>"/>
                            <a href="<spring:url value="/customer/cart"/>"><strong>Shopping Cart</strong></a>
                        </button>
                    </div>
                </div>
                <!-- Cart Ends -->
            </div>
            <!-- Nested Row Ends -->
        </div>
        <!-- Nested Container Ends -->
    </div>
    <!-- Header Top Ends -->


    <%--MENIU CU NUMELE MAGAZINULUI ETC--%>


    <!-- Main Header Starts -->
    <div id="dropshadow" class="main-header" class="row around-xs">
        <!-- Nested Row Starts -->
        <%--<!-- Logo Start -->--%>
        <div class="col-xs-2">
            <div class="box">
                <a href="<c:url value="/"/>"><img id="logo-img" src="<spring:url value="/resources/images/l-ectro.png"/>"
                                                  title="L-ectro" alt="L-ectro" class="img-responsive img-center"></a>
            </div>
        </div>
        <!-- Logo end -->

        <!-- Motoo start -->
        <div class="col-xs-2">
            <div id="motto" class="box">
                <h4><strong>L-ectro, best thing in town!</strong></h4>
            </div>
        </div>
        <!-- End -->

        <!-- Search Starts -->
        <div class="col-xs-2">
            <div id="search" class="box">
                <div class="input-group">
                    <form id="searchicon" action="" class="search-form">
                        <div class="form-group has-feedback">
                            <label for="search" class="sr-only">Search</label>
                            <input type="text" class="form-control" name="search"
                                   placeholder="search">
                            <span class="glyphicon glyphicon-search form-control-feedback"></span>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Search Ends -->

    </div>
    <!-- Main Header Ends -->


    <!-- Main Menu Starts -->

    <nav id="main-menu" class="navbar" role="navigation">

        <!-- Nested Container Starts -->
        <div class="container">

            <div class="collapse navbar-collapse navbar-cat-collapse">
                <!-- starts the list -->

                <ul class="nav navbar-nav">

                    <li><a href="<c:url value="/product/category/audio" />">Audio</a></li>
                    <li><a href="<c:url value="/product/category/laptop" />">Laptops</a></li>
                    <li><a href="<c:url value="/product/category/photo camera"/>">Photo Cameras</a></li>
                    <li><a href="<c:url value="/product/category/smart phone"/>">Smart Phones</a></li>
                    <li><a href="<c:url value="/product/category/tv" />">TVs</a></li>

                </ul>

            </div>
            <!-- Navbar Cat collapse Ends -->
        </div>
        <!-- Nested Container Starts -->
    </nav>
    <!-- Main Menu Ends -->
</header>
<!-- Header Section Ends -->
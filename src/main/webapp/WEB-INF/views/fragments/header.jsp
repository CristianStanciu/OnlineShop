<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>L-ectro.com</title>

    <!-- Reset CSS -->
    <link rel="stylesheet" href="<c:url value="/resources/css/reset.css"/>" type="text/css">

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css">

    <!-- Carousel CSS -->
    <link rel="stylesheet" href="<c:url value="/resources/css/carousel.css"/>" type="text/css">

    <!-- Main CSS -->
    <link rel="stylesheet" href="<c:url value="/resources/css/main.css"/>" type="text/css">

    <!-- Google Web Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i" rel="stylesheet">

</head>

<body id="dropshadow">


<!-- Top Bar Starts -->
<div id="dropshadow" class="free-shiping">
    <!-- Nested Container Starts -->
    <div class="container">
        <img src="<c:url value="/resources/images/freeShipping2.png"/>"/>
        <span>Free Shipping</span> on order over $199. This offer is valid on all our store items.
    </div>
    <!-- Nested Container Ends -->
</div>
<!-- Top Bar Ends -->


<!-- NAVBAR
================================================== -->


<%--<div class="navbar-wrapper">--%>
<%--<div class="container">--%>

<%--<nav class="navbar navbar-inverse navbar-static-top">--%>
<%--<div class="container">--%>
<%--<div class="navbar-header">--%>
<%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"--%>
<%--aria-expanded="false" aria-controls="navbar">--%>
<%--<span class="sr-only">Toggle navigation</span>--%>
<%--<span class="icon-bar"></span>--%>
<%--<span class="icon-bar"></span>--%>
<%--<span class="icon-bar"></span>--%>
<%--</button>--%>
<%--<a class="navbar-brand" href="#">E-lectron</a>--%>
<%--</div>--%>
<%--<div id="navbar" class="navbar-collapse collapse">--%>
<%--<ul class="nav navbar-nav">--%>
<%--<li class="active"><a href="<c:url value="/"/>">Home</a></li>--%>
<%--<li><a href="<c:url value="/productList"/>">Products</a></li>--%>
<%--<li><a href="<c:url value="/"/>">Contact</a></li>--%>
<%--</ul>--%>
<%--<ul class="nav navbar-nav pull-right">--%>
<%--<li><a href="<c:url value="/admin"/>">Admin</a></li>--%>
<%--</ul>--%>
<%--</div>--%>
<%--</div>--%>
<%--</nav>--%>

<%--</div>--%>
<%--</div>--%>


<!-- Header Section Starts -->
<header class="header-area">
    <!-- Header Top Starts -->
    <div id="dropshadow" class="header-top">
        <!-- Nested Container Starts -->
        <div class="container">
            <!-- Nested Row Starts -->
            <div class="row">
                <!-- Languages Starts -->
                <div class="col-sm-3 col-xs-12">
                    <div class="pull-left">
                        <div class="btn-group">
                            <button class="btn btn-link dropdown-toggle" data-toggle="dropdown">
                                <span class="glyphicon glyphicon-globe"></span>  Language
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
                        <li><a href="<c:url value="/productList"/>">Products</a></li>
                        <li><a href="<c:url value="/admin"/>">Admin</a></li>
                        <li><a href="#">Wish List(0)</a></li>
                        <li><a href="#">My Account</a></li>
                        <li><a href="#">Checkout</a></li>
                        <li><a href="#">Login</a></li>
                    </ul>
                </div>
                <!-- Header Links Ends -->


                <!-- Cart Starts -->
                <div class="col-sm-3 col-xs-12">
                    <div id="cart" class="btn-group btn-block">
                        <button type="button" data-toggle="dropdown"
                                class="btn btn-link dropdown-toggle">
                            <img src="<c:url value="/resources/images/shoppingCart0.png"/>"/>
                            <strong>Shopping Cart</strong>
                        </button>
                        <ul class="dropdown-menu pull-right">
                            <li>
                                <table class="table hcart">
                                    <tr>
                                        <td class="text-center">
                                            <a href="product.html">
                                                <img src="images/product-images/hcart-thumb1.jpg" alt="image"
                                                     title="image" class="img-thumbnail img-responsive"/>
                                            </a>
                                        </td>
                                        <td class="text-left">
                                            <a href="product-full.html">
                                                Seeds
                                            </a>
                                        </td>
                                        <td class="text-right">x 1</td>
                                        <td class="text-right">$120.68</td>
                                        <td class="text-center">
                                            <a href="#">
                                                <i class="fa fa-times"></i>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center">
                                            <a href="product.html">
                                                <img src="images/product-images/hcart-thumb2.jpg" alt="image"
                                                     title="image" class="img-thumbnail img-responsive"/>
                                            </a>
                                        </td>
                                        <td class="text-left">
                                            <a href="product-full.html">
                                                Organic
                                            </a>
                                        </td>
                                        <td class="text-right">x 2</td>
                                        <td class="text-right">$240.00</td>
                                        <td class="text-center">
                                            <a href="#">
                                                <i class="fa fa-times"></i>
                                            </a>
                                        </td>
                                    </tr>
                                </table>
                            </li>
                            <li>
                                <table class="table table-bordered total">
                                    <tbody>
                                    <tr>
                                        <td class="text-right"><strong>Sub-Total</strong></td>
                                        <td class="text-left">$1,101.00</td>
                                    </tr>
                                    <tr>
                                        <td class="text-right"><strong>Eco Tax (-2.00)</strong></td>
                                        <td class="text-left">$4.00</td>
                                    </tr>
                                    <tr>
                                        <td class="text-right"><strong>VAT (17.5%)</strong></td>
                                        <td class="text-left">$192.68</td>
                                    </tr>
                                    <tr>
                                        <td class="text-right"><strong>Total</strong></td>
                                        <td class="text-left">$1,297.68</td>
                                    </tr>
                                    </tbody>
                                </table>
                                <p class="text-right btn-block1">
                                    <a href="cart.html">
                                        View Cart
                                    </a>
                                    <a href="#">
                                        Checkout
                                    </a>
                                </p>
                            </li>
                        </ul>
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
    <div id="dropshadow" class="main-header">
        <!-- Nested Container Starts -->
        <div class="container">
            <!-- Nested Row Starts -->
            <div class="row">
                <!-- Logo Starts -->
                <div id="divullogoului" class="col-md-6 col-sm-4 col-xs-12">
                    <div id="logo">
                        <a href="<c:url value="/"/>"><img src="<c:url value="/resources/images/l-ectro.png"/>"
                                                          title="L-ectro" alt="L-ectro" width="180px" height="130px"
                                                          class="img-responsive img-center"></a>
                    </div>
                </div>
                <!-- Logo Ends -->


                <!-- Search Starts -->
                <div id="containerulsearchului" class="col-md-3 col-sm-4 col-xs-12" > <!-- class="container" -->
                    <div id="rowulsearchului" > <!-- class="row" -->
                        <div id="searchuldesus" class="col-md-3 col-md-offset-3">
                            <form id="searchicon" action="" class="search-form">
                                <div class="form-group has-feedback">
                                    <label for="search" class="sr-only">Search</label>
                                    <input type="text" class="form-control" name="search"
                                           id="search" placeholder="search">
                                    <span class="glyphicon glyphicon-search form-control-feedback"></span>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

                <!-- Search Ends -->
            </div>
            <!-- Nested Row Ends -->
        </div>
        <!-- Nested Container Ends -->
    </div>
    <!-- Main Header Ends -->


    <!-- Main Menu Starts -->
    <nav class="navbar" id="dropshadow" role="navigation">
        <!-- Nested Container Starts -->
        <div class="container">

            <div class="collapse navbar-collapse navbar-cat-collapse">
                <!-- starts the list -->
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                           data-hover="dropdown" data-delay="10">Audio</a>
                        <div class="dropdown-menu">
                            <div class="dropdown-inner">
                                <ul class="list-unstyled">
                                    <li class="dropdown-header">Sub Category</li>
                                    <li><a tabindex="-1" href="#">item 1</a></li>
                                    <li><a tabindex="-1" href="#">item 2</a></li>
                                    <li><a tabindex="-1" href="#">item 3</a></li>
                                </ul>
                                <ul class="list-unstyled">
                                    <li class="dropdown-header">Sub Category</li>
                                    <li><a tabindex="-1" href="#">item 1</a></li>
                                    <li><a tabindex="-1" href="#">item 2</a></li>
                                    <li><a tabindex="-1" href="#">item 3</a></li>
                                </ul>
                                <ul class="list-unstyled">
                                    <li class="dropdown-header">Sub Category</li>
                                    <li><a tabindex="-1" href="#">item 1</a></li>
                                    <li><a tabindex="-1" href="#">item 2</a></li>
                                    <li><a tabindex="-1" href="#">item 3</a></li>
                                </ul>
                            </div>
                        </div>
                    <li>

                    <li><a href="#">Laptops</a></li>
                    <li><a href="#">DSLR Cameras</a></li>
                    <li><a href="#">Smart Phones</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"
                           data-hover="dropdown" data-delay="10">
                            TVs
                        </a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a tabindex="-1" href="index.html">Home</a></li>
                            <li><a tabindex="-1" href="about.html">About</a></li>
                            <li><a tabindex="-1" href="category-list.html">Category List</a></li>
                            <li><a tabindex="-1" href="category-grid.html">Category Grid</a></li>
                            <li><a tabindex="-1" href="product.html">Product</a></li>
                            <li><a tabindex="-1" href="product-full.html">Product Full Width</a></li>
                            <li><a tabindex="-1" href="cart.html">Cart</a></li>
                            <li><a tabindex="-1" href="login.html">Login</a></li>
                            <li><a tabindex="-1" href="compare.html">Compare Products</a></li>
                            <li><a tabindex="-1" href="typography.html">Typography</a></li>
                            <li><a tabindex="-1" href="register.html">Register</a></li>
                            <li><a tabindex="-1" href="contact.html">Contact</a></li>
                            <li><a tabindex="-1" href="404.html">404</a></li>
                        </ul>
                    </li>
                </ul>

            </div>
            <!-- Navbar Cat collapse Ends -->
        </div>
        <!-- Nested Container Starts -->
    </nav>
    <!-- Main Menu Ends -->
</header>
<!-- Header Section Ends -->
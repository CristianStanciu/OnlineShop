<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 09:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="fragments/header.jsp"/>

<!-- Carousel
================================================== -->

<div id="dropshadow" id="Carousel" class="carousel slide" data-ride="carousel">

    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner home-image" role="listbox">
        <div class="item active">
            <img class="first-slide" src="<c:url value="/resources/images/carousel/slide1-img.jpg"/> " alt="First slide">
            <div class="container">
                <div class="carousel-caption">
                    <%--<h1>Discover the power of  </h1>--%>
                    <%--<p>Grab it now!!!</p>--%>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="second-slide home-image" src="<c:url value="/resources/images/carousel/slide2-img.jpg"/> " alt="Second slide">
            <div class="container">
                <div class="carousel-caption">
                    <%--<h1>Amazing sound system!!!</h1>--%>
                    <%--<p>You just wanna...</p>--%>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="third-slide home-image" src="<c:url value="/resources/images/carousel/slide3-img.jpg"/> " alt="Third slide">
            <div class="container">
                <div class="carousel-caption">
                    <%--<h1>Product desrp...</h1>--%>
                    <%--<p> </p>--%>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="<c:url value="/resources/images/carousel/slide1-img.jpg"/>" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href=""<c:url value="/resources/images/carousel/slide2-img.jpg"/>"" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<!-- /.carousel -->




<!-- Main Container Starts -->
<div id="main-container" class="container">

    <!-- Category Starts -->
    <div id="categorybanner" class="row">
        <div class="col-sm-4 col-xs-12">
            <div class="category-banner-box">
                <img src="<c:url value="/resources/images/banner/category-banner-img-1.jpg" />" alt="Banner" class="img-responsive img-center">
            </div>
        </div>
        <div class="col-sm-4 col-xs-12">
            <div class="category-banner-box">
                <img src="<c:url value="/resources/images/banner/category-banner-img-2.jpg" />" alt="Banner" class="img-responsive img-center">
            </div>
            <div class="category-banner-box">
                <img src="<c:url value="/resources/images/banner/category-banner-img-3.jpg" />" alt="Banner" class="img-responsive img-center">
            </div>
        </div>
        <div class="col-sm-4 col-xs-12">
            <div class="category-banner-box">
                <img src="<c:url value="/resources/images/banner/category-banner-img-4.jpg" />" alt="Banner" class="img-responsive img-center">
            </div>
        </div>
    </div>
    <!-- Category Ends -->




    <!-- Latest Products Starts -->
    <section id="latest-products" class="product-carousel">
        <!-- Heading -->
        <h4 class="product-head">Latest Products</h4>


        <div id="latest-6-products" class="container">
            <%--<div class="well well-sm">--%>
                <%--<strong>Category Title</strong>--%>
            <%--</div>--%>
            <div id="products" class="row list-group">
                <c:forEach items="${lastFourProducts}" var="product">
                <div class="item  col-xs-4 col-lg-4">
                    <div class="thumbnail">
                        <img class="group list-group-image" src="<c:url value="/resources/images/${product.productId}.png"/>" alt="Product Photo"/>
                        <div class="caption">
                            <h4 class="group inner list-group-item-heading">${product.productMaker}</h4>
                            <h4 class="group inner list-group-item-heading">${product.productName}</h4>
                            <p class="group inner list-group-item-text">${product.productDscr}</p>
                            <div class="row">
                                <div class="col-xs-12 col-md-6">
                                    <p class="lead">${product.productPrice} $</p>
                                </div>
                                <div class="col-xs-12 col-md-6">
                                    <a class="btn btn-custom" href="<c:url value="/addToCart/${product.productId}"/>">Add to cart</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>

    </section>

    <!-- Latest Products Ends -->

    <!-- Top Brands Starts -->

    <section id="top-brands" class="products-list">

        <!-- Heading Starts -->

        <h4 class="product-head">Our Top Brands</h4>

        <!-- Heading Ends -->

        <!-- Nested Row Starts -->

        <div class="row">

            <div class="col-xs-2">
                <img src="<c:url value="/resources/images/brands/brand-img6.jpg"/>" alt="Image" class="img-responsive img-center">
            </div>

            <div class="col-xs-2">
                <img src="<c:url value="/resources/images/brands/brand-img1.jpg"/>" alt="Image" class="img-responsive img-center">
            </div>

            <div class="col-xs-2">
                <img src="<c:url value="/resources/images/brands/brand-img5.jpg"/>" alt="Image" class="img-responsive img-center">
            </div>

            <div class="col-xs-2">
                <img src="<c:url value="/resources/images/brands/brand-img2.jpg"/>" alt="Image" class="img-responsive img-center">
            </div>

            <div class="col-xs-2">
                <img src="<c:url value="/resources/images/brands/brand-img4.jpg"/>" alt="Image" class="img-responsive img-center">
            </div>

            <div class="col-xs-2">
                <img src="<c:url value="/resources/images/brands/brand-img3.jpg"/>" alt="Image" class="img-responsive img-center">
            </div>
        </div>
        <!-- Nested Row Ends -->
    </section>
    <!-- Top Brands Ends -->
</div>
<!-- Main Container Ends -->




<jsp:include page="fragments/footer.jsp"/>






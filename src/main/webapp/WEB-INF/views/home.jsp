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
                    <h1>The new Samsung Galaxy s8 sau ce produs e asta :) </h1>
                    <p>Grab it now!!!</p>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="second-slide home-image" src="<c:url value="/resources/images/carousel/slide2-img.jpg"/> " alt="Second slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Amaiying sound system!!!</h1>
                    <p>You just wanna boom-boom-boom all day long ;o)</p>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="third-slide home-image" src="<c:url value="/resources/images/carousel/slide3-img.jpg"/> " alt="Third slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>I have no idea what product this is, sorry :)</h1>
                    <p>Pa ram pa ram pa pa ra rammm, E-lectro :))))))) </p>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<!-- /.carousel -->




<!-- Main Container Starts -->
<div id="dropshadow" id="main-container" class="container">



    <!-- Category Starts -->
    <div id="categorybanner" id="dropshadow" class="row">
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
    <section id="latest-products" id="dropshadow" class="product-carousel">

        <!-- Heading -->
        <div class="left-right-buttons">
            <button id="left button " type="button" class="glyphicon glyphicon-chevron-left"></button>
            <button id="right button " type="button" class="glyphicon glyphicon-chevron-right"></button>
        </div>
        <h2 class="product-head">Latest <strong>Products</strong></h2>




        <!-- Products Row Starts -->

        <div class="row">
            <div class="col-xs-12">

                <!-- Product Carousel Starts -->

                <div id="owl-latest-product" class="owl-product-carousel owl-carousel">

                    <!-- Prod #1 -->

                    <div class="item">
                        <div class="product-col">
                            <div class="image">
                                <img src="<c:url value="/resources/images/latest/1.jpg" />" alt="latest product added" class="img-responsive" />
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Prod #1 Ends -->

                    <!-- Prod #2 Starts -->

                    <div class="item">
                        <div class="product-col">
                            <div class="image">
                                <img src="<c:url value="/resources/images/latest/2.jpg" />" alt="latest product added" class="img-responsive" />
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Prod #2 Ends -->

                    <!-- Prod #3 Starts -->

                    <div class="item">
                        <div class="product-col">
                            <div class="image">
                                <img src="<c:url value="/resources/images/latest/3.jpg" />" alt="latest product added" class="img-responsive" />
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Prod #3 Ends -->

                    <!-- Prod #4 Starts -->

                    <div class="item">
                        <div class="product-col">
                            <div class="image">
                                <img src="<c:url value="/resources/images/latest/4.jpg" />" alt="latest product added" class="img-responsive" />
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Prod #4 Ends -->

                    <!-- Prod #5 Starts -->

                    <div class="item">
                        <div class="product-col">
                            <div class="image">
                                <img src="<c:url value="/resources/images/latest/1.jpg" />" alt="latest product added" class="img-responsive" />
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Product #5 Ends -->



                    <!-- Prod #5 Starts -->

                    <div class="item">
                        <div class="product-col">
                            <div class="image">
                                <img src="<c:url value="/resources/images/latest/2.jpg" />" alt="latest product added" class="img-responsive" />
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Product #5 Ends -->


                    <!-- Product #7 Starts -->
                    <div class="item">
                        <div class="product-col">
                            <div class="image">
                                <img src="<c:url value="/resources/images/latest/3.jpg" />" alt="latest product added" class="img-responsive" />
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Prod #7 Ends -->

                    <!-- Prod #8 Starts -->

                    <div class="item">
                        <div class="product-col">
                            <div class="image">
                                <img src="<c:url value="/resources/images/latest/4.jpg" />" alt="latest product added" class="img-responsive" />
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Product #8 Ends -->
                </div>
                <!-- Product Carousel Ends -->
            </div>
        </div>
        <!-- Products Row Ends -->
    </section>

    <!-- Latest Products Ends -->










    <!-- Two Column Banner Starts -->

    <div id="2-col-banner-section" id="dropshadow" class="row">

        <!-- Banner #1  -->

        <div class="col-sm-6 col-xs-12">
            <img src="<c:url value="/resources/images/banner/banner1.jpg"/>" alt="banner" class="img-responsive img-center col2-banners">
        </div>
        <!-- Banner #1 End -->

        <!-- Banner #2  -->

        <div class="col-sm-6 col-xs-12">
            <img src="<c:url value="/resources/images/banner/banner2.jpg"/>" alt="banners" class="img-responsive img-center col2-banners">
        </div>
        <!-- Banner #2 End -->

    </div>

    <!-- Two Column Banner Ends -->



    <!-- Features & Popular Products Starts -->

    <div id="featured-products" id="dropshadow" class="row">

        <!-- Featured Products Starts -->

        <div class="col-md-6 col-xs-12">

            <!-- Featured Products Starts -->

            <section class="product-carousel">

                <!-- Heading Starts -->

                <h2 class="product-head text-uppercase">Featured <strong>Products</strong></h2>
                <!-- Heading Ends -->

                <!-- Products Row Starts -->

                <div class="row">
                    <div class="col-xs-12">

                        <!-- Product Carousel Starts -->
                        <div id="owl-featured-product" class="owl-product-carousel owl-carousel">

                            <!-- Product #1 Starts -->

                            <div class="item">
                                <div class="product-col">
                                    <div class="image">
                                        <img src="<c:url value="resources/images/featured/featured1.jpg"/>" alt="product" class="img-responsive">
                                    </div>
                                    <div class="caption">
                                        <div class="price">
                                            <span class="price-new">$199.50</span>
                                            <span class="price-old">$249.50</span>
                                        </div>
                                        <p class="price-tax">ex tax: $570.00</p>
                                        <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                        <div class="ratings">
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <span><a href="#">1 review(s)</a></span>
                                        </div>
                                        <div class="cart-button button-group">
                                            <button type="button" class="btn btn-cart">
                                                <i class="fa fa-shopping-cart"></i>
                                            </button>
                                            <button type="button" title="Wishlist" class="btn btn-wishlist">
                                                <i class="fa fa-heart"></i>
                                            </button>
                                            <button type="button" title="Compare" class="btn btn-compare">
                                                <i class="fa fa-bar-chart-o"></i>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Product #1 Ends -->

                            <!-- Product #2 Starts -->

                            <div class="item">
                                <div class="product-col">
                                    <div class="image">
                                        <img src="<c:url value="resources/images/featured/featured2.jpg"/>" alt="product" class="img-responsive">
                                    </div>
                                    <div class="caption">
                                        <div class="price">
                                            <span class="price-new">$199.50</span>
                                            <span class="price-old">$249.50</span>
                                        </div>
                                        <p class="price-tax">ex tax: $570.00</p>
                                        <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                        <div class="ratings">
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <span><a href="#">1 review(s)</a></span>
                                        </div>
                                        <div class="cart-button button-group">
                                            <button type="button" class="btn btn-cart">
                                                <i class="fa fa-shopping-cart"></i>
                                            </button>
                                            <button type="button" title="Wishlist" class="btn btn-wishlist">
                                                <i class="fa fa-heart"></i>
                                            </button>
                                            <button type="button" title="Compare" class="btn btn-compare">
                                                <i class="fa fa-bar-chart-o"></i>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Product #2 Ends -->

                            <!-- Product #3 Starts -->
                            <div class="item">
                                <div class="product-col">
                                    <div class="image">
                                        <img src="<c:url value="resources/images/featured/featured3.jpg"/>" alt="product" class="img-responsive">
                                    </div>
                                    <div class="caption">
                                        <div class="price">
                                            <span class="price-new">$199.50</span>
                                            <span class="price-old">$249.50</span>
                                        </div>
                                        <p class="price-tax">ex tax: $570.00</p>
                                        <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                        <div class="ratings">
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <span><a href="#">1 review(s)</a></span>
                                        </div>
                                        <div class="cart-button button-group">
                                            <button type="button" class="btn btn-cart">
                                                <i class="fa fa-shopping-cart"></i>
                                            </button>
                                            <button type="button" title="Wishlist" class="btn btn-wishlist">
                                                <i class="fa fa-heart"></i>
                                            </button>
                                            <button type="button" title="Compare" class="btn btn-compare">
                                                <i class="fa fa-bar-chart-o"></i>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Product #3 Ends -->

                            <!-- Product #4 Starts -->
                            <div class="item">
                                <div class="product-col">
                                    <div class="image">
                                        <img src="<c:url value="resources/images/featured/featured4.jpg"/>" alt="product" class="img-responsive">
                                    </div>
                                    <div class="caption">
                                        <div class="price">
                                            <span class="price-new">$199.50</span>
                                            <span class="price-old">$249.50</span>
                                        </div>
                                        <p class="price-tax">ex tax: $570.00</p>
                                        <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                        <div class="ratings">
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <span><a href="#">1 review(s)</a></span>
                                        </div>
                                        <div class="cart-button button-group">
                                            <button type="button" class="btn btn-cart">
                                                <i class="fa fa-shopping-cart"></i>
                                            </button>
                                            <button type="button" title="Wishlist" class="btn btn-wishlist">
                                                <i class="fa fa-heart"></i>
                                            </button>
                                            <button type="button" title="Compare" class="btn btn-compare">
                                                <i class="fa fa-bar-chart-o"></i>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <!-- Product #4 Ends -->

                        </div>

                        <!-- Product Carousel Ends -->
                    </div>
                </div>

                <!-- Products Row Ends -->
            </section>

            <!-- Featured Products Ends -->

        </div>
        <!-- Featured Products Ends -->


        <!-- Popular Products Starts -->



        <div class="col-md-6 col-xs-12">
            <section class="products-list">

                <!-- Heading Starts -->

                <h2 class="product-head text-uppercase">Popular <strong>Products</strong></h2>

                <!-- Heading Ends -->

                <!-- Products Row Starts -->

                <div class="row">

                    <!-- Product #1 Starts -->

                    <div class="col-sm-6 col-xs-12">
                        <div class="product-col alt">
                            <div class="image">
                                <img src="<c:url value="resources/images/popular/1.jpg"/>" alt="product" class="img-responsive">
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Product #1 Ends -->

                    <!-- Product #2 Starts -->

                    <div class="col-sm-6 col-xs-12">
                        <div class="product-col alt">
                            <div class="image">
                                <img src="<c:url value="resources/images/popular/2.jpg"/>" alt="product" class="img-responsive">
                            </div>
                            <div class="caption">
                                <div class="price">
                                    <span class="price-new">$199.50</span>
                                    <span class="price-old">$249.50</span>
                                </div>
                                <p class="price-tax">ex tax: $570.00</p>
                                <h4><a href="product.html">Quis Nostrud Exercitation </a></h4>
                                <div class="ratings">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <span><a href="#">1 review(s)</a></span>
                                </div>
                                <div class="cart-button button-group">
                                    <button type="button" class="btn btn-cart">
                                        <i class="fa fa-shopping-cart"></i>
                                    </button>
                                    <button type="button" title="Wishlist" class="btn btn-wishlist">
                                        <i class="fa fa-heart"></i>
                                    </button>
                                    <button type="button" title="Compare" class="btn btn-compare">
                                        <i class="fa fa-bar-chart-o"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Product #2 Ends -->

                </div>
                <!-- Products Row Ends -->

            </section>

        </div>
        <!-- Popular Products Ends -->

    </div>
    <!-- Features & Popular Products Ends -->











    <!-- Top Brands Starts -->

    <section id="top-brands" class="products-list">

        <!-- Heading Starts -->

        <h2 class="product-head">Our Top <strong>Brands</strong></h2>

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






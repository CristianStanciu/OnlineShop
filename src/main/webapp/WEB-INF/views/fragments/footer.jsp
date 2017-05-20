<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: smc
  Date: 5/1/2017
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>

<footer id="footer-area">
    <br>
    <br>
    <!-- Footer Links Starts -->
    <div class="footer-links">
        <!-- Container Starts -->
        <div class="container">
            <!-- Nested Row Starts -->
            <div class="row">
                <!-- Foot Col#1 Starts -->
                <div class="col-md-4 col-xs-12">
                    <h5>Subscription</h5>
                    <div class="foot-subscription-form">
                        <div class="input-group">
                            <input type="text" class="form-control text-uppercase" placeholder="Your Email Address">
                            <span class="input-group-btn">
								<button class="btn text-uppercase" type="button">
									Subscribe
								</button>
							  </span>
                        </div>
                    </div>
                    <h5>Stay Connected</h5>
                    <ul class="list-unstyled list-inline foot-sm-links">
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                    </ul>
                </div>
                <!-- Foot Col#1 Ends -->
                <!-- My Account Starts -->
                <div class="col-md-2 col-sm-4 col-xs-12">
                    <h5>My Account</h5>
                    <ul>
                        <li><a href="#">My orders</a></li>
                        <li><a href="#">My addresses</a></li>
                        <li><a href="#">My personal info</a></li>
                    </ul>
                </div>
                <!-- My Account Ends -->
                <!-- Customer Service Starts -->
                <div class="col-md-2 col-sm-4 col-xs-12">
                    <h5>Customer Service</h5>
                    <ul>
                        <li><a href="contact.html">Contact Us</a></li>
                        <li><a href="#">Returns</a></li>
                        <li><a href="#">Specials</a></li>
                    </ul>
                </div>
                <!-- Customer Service Ends -->
                <!-- Contact Us Starts -->
                <div class="col-md-4 col-sm-4 col-xs-12 last">
                    <h5>Contact Us</h5>
                    <ul>
                        <li>
                            Strada Florilor Orasul Viselor Tara Basmelor no. 888
                        </li>
                        <li>
                            Email: <a href="#">info@l-ectro.com</a>
                        </li>
                    </ul>
                    <h4 class="lead">
                        Tel: <span>0747443375</span>
                    </h4>
                </div>
                <!-- Contact Us Ends -->
            </div>
            <!-- Nested Row Ends -->
        </div>
        <!-- Container Ends -->
    </div>
    <!-- Footer Links Ends -->
    <!-- Copyright Area Starts -->
    <div class="copyright">
        <!-- Container Starts -->
        <div class="container">
            <!-- Starts -->
            <p class="pull-left">
                &copy; 2017 L-ectr.com Designed By Christan</a>
            </p>
            <!-- Ends -->

            <!-- Payment Gateway Links Starts -->
            <ul class="pull-right list-inline">
                <li>
                    <img src="<spring:url value="/resources/images/card/paypal.png"/>" alt="Card Image" />
                </li>
                <li>
                    <img src="<spring:url value="/resources/images/card/visa.png"/>" alt="Card Image" />
                </li>
                <li>
                    <img src="<spring:url value="/resources/images/card/mastercard.png"/>" alt="Card Image" />
                </li>
            </ul>
            <!-- Payment Gateway Links Ends -->

        </div>
        <!-- Container Ends -->
    </div>
    <!-- Copyright Area Ends -->
    <br>
</footer>
<!-- Footer Section Ends -->

<!-- JavaScript Files
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>--%>
<script>window.jQuery || document.write('<script src="WEB-INF/resources/js/jquery-3.2.1.min.js"><\/script>')</script>
<!-- JavaScript Files -->
<script src="<spring:url value="/resources/js/jquery-1.11.1.min.js"/>"></script>
<script src="<spring:url value="/resources/js/jquery-migrate-1.2.1.min.js"/>"></script>
<script src="<spring:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<spring:url value="/resources/js/bootstrap-hover-dropdown.min.js"/>"></script>
<script src="<spring:url value="/resources/js/jquery.magnific-popup.min.js"/>"></script>
<script src="<spring:url value="/resources/js/owl.carousel.min.js"/>"></script>
<script src="<spring:url value="/resources/js/custom.js"/>"></script>
</body>
</html>
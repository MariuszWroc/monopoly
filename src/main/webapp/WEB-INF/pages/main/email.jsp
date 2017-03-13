<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html lang="en">
    <head>
        <c:set var="contextPath" value="${pageContext.request.contextPath}" />
        <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/common.css">
    </head>
    <body ng-cloak class="ng-cloak">
        <div ng-controller="emailController" flex id="content" ng-cloak
             class="ng-cloak">
            <section id="contact-info">
                <div class="gmap-area">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-5 text-center">
                                <div class="gmap">
                                    <iframe frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://www.google.pl/maps/place/Krucza+8,+Wroc?aw/data=!4m2!3m1!1s0x470fc2158207cefb:0x122db5b95ee02da?sa=X&ved=0ahUKEwiCuZvNj9nQAhUoJpoKHWPvAxYQ8gEIGzAA"></iframe>
                                </div>
                            </div>

                            <div class="col-sm-7 map-content">
                                <ul class="row">
                                    <li class="col-sm-6" display: inline-block>
                                        <address>
                                            <h5>My Office</h5>
                                            <p>Krucza 8 <br>
                                                Wrocław 53-411</p>
                                            <p>Phone: 515-603-319 <br>
                                                Email Address: mariusz.czarny88@gmail.com</p>
                                        </address>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </section>  <!--/gmap_area -->

            <section id="contact-page">
                <div class="container">
                    <div class="center">        
                        <h2>Drop Your Message</h2>
                    </div> 
                    <div class="row contact-wrap"> 
                        <div class="status alert alert-success" style="display: none"></div>
                        <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">
                            <div class="col-sm-5 col-sm-offset-1">
                                <div class="form-group">
                                    <label>Name *</label>
                                    <input type="text" name="name" class="form-control" required="required">
                                </div>
                                <div class="form-group">
                                    <label>Email *</label>
                                    <input type="email" name="email" class="form-control" required="required">
                                </div>
                                <div class="form-group">
                                    <label>Phone</label>
                                    <input type="number" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>Company Name</label>
                                    <input type="text" class="form-control">
                                </div>                        
                            </div>
                            <div class="col-sm-5">
                                <div class="form-group">
                                    <label>Subject *</label>
                                    <input type="text" name="subject" class="form-control" required="required">
                                </div>
                                <div class="form-group">
                                    <label>Message *</label>
                                    <textarea name="message" id="message" required="required" class="form-control" rows="8"></textarea>
                                </div>                        
                                <div class="form-group">
                                    <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required">Submit Message</button>
                                </div>
                            </div>
                        </form> 
                    </div><!--/.row-->
                </div><!--/.container-->
            </section><!--/#contact-page-->
        </div>
    </body>
</html>

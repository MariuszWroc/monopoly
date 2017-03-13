<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <c:set var="contextPath" value="${pageContext.request.contextPath}" />
        <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/common.css">
    </head>
    <body ng-cloak class="ng-cloak">
        <div ng-controller="menuController" flex id="content" ng-cloak >
                    <section id="about-us">
                        <div class="container">


                            <!-- Our Skill -->
                            <div class="skill-wrap clearfix">

                                <div class="center wow fadeInDown">
                                    <h2>My skills</h2>
                                </div>

                                <div class="row">

                                    <div class="col-sm-3">
                                        <div class="sinlge-skill wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="300ms">
                                            <div class="java-skill">                                   
                                                <p><em>95%</em></p>
                                                <p>Java</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-3">
                                        <div class="sinlge-skill wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
                                            <div class="spring-skill">                                  
                                                <p><em>85%</em></p>
                                                <p>Spring</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-3">
                                        <div class="sinlge-skill wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="900ms">
                                            <div class="hibernate-skill">                                    
                                                <p><em>80%</em></p>
                                                <p>Hibernate</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-3">
                                        <div class="sinlge-skill wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="1200ms">
                                            <div class="angular-skill">
                                                <p><em>65%</em></p>
                                                <p>Angular</p>                                     
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div><!--/.our-skill-->
                        </div><!--/.container-->
                    </section><!--/about-us-->
                </div>
            </md-content>
        </div>
    </body>
</html>


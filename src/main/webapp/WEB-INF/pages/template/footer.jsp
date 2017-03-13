<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <c:set var="contextPath" value="${pageContext.request.contextPath}" />
        <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/common.css">
    </head>
    <body ng-cloak class="ng-cloak">
        <section id="bottom">
            <div class="container wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
            </div>
        </section><!--/#bottom-->
        <footer id="footer" class="midnight-blue">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        &copy; 2016 <a target="_blank" href="#" title="">Czarny Enterprises</a>. All Rights Reserved.
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
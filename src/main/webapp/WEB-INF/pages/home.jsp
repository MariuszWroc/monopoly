<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html lang="en" ng-app="StarterApp">
	<head>
                <meta charset="utf-8">
                <meta name="description" content="">
                <meta name="author" content="">
		<meta name="viewport" content="initial-scale=1" />
		<title>Hack and slash MMO game</title>
		<c:set var="contextPath" value="${pageContext.request.contextPath}" />
			<!-- core CSS -->
		    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
		    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/font-awesome.min.css" rel="stylesheet">
		    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/animate.min.css" rel="stylesheet">
		    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/prettyPhoto.css" rel="stylesheet">
		    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/main.css" rel="stylesheet">
		    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/responsive.css" rel="stylesheet">
		    <!--[if lt IE 9]>
		    <script src="${contextPath}/resources/js/html5shiv.js"></script>
		    <script src="${contextPath}/resources/js/respond.min.js"></script>
		    <![endif]-->       
		    <link rel="shortcut icon" href="${contextPath}/resources/img/ico/favicon.ico">
		    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${contextPath}/resources/img/ico/apple-touch-icon-144-precomposed.png">
		    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${contextPath}/resources/img/ico/apple-touch-icon-114-precomposed.png">
		    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${contextPath}/resources/img/ico/apple-touch-icon-72-precomposed.png">
		    <link rel="apple-touch-icon-precomposed" href="${contextPath}/resources/img/ico/apple-touch-icon-57-precomposed.png">
	</head>
	<body layout="column" ng-app="StarterApp"  class="homepage">
		<div id="wrapper">
			<div id="headerwrap">
				<div id="header">
					<div ng-include = "'${contextPath}/header'"></div>
				</div>
			</div>
			<div id="contentwrap">
				<div id="content">
					<md-content layout="column" flex class="md-padding">
						<div ng-view align="center"></div>
					</md-content>
				</div>
			</div>
				<div ng-include = "'${contextPath}/footer'"></div>
		</div>
                <!-- Javascripts are always put last in body that way the page will render even if the scripts wont load-->
                <script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
		<script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.min.js"></script>
		<!--     Angular Material Dependencies -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.min.js"></script>
		<script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-aria.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.js"></script>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
                <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

               	    <script src="${contextPath}/resources/js/jquery.js"></script>
		    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
		    <script src="${contextPath}/resources/js/jquery.prettyPhoto.js"></script>
		    <script src="${contextPath}/resources/js/jquery.isotope.min.js"></script>
		    <script src="${contextPath}/resources/js/main.js"></script>
		    <script src="${contextPath}/resources/js/wow.min.js"></script>

		<script src="${contextPath}/resources/js/app.js"></script>
		<script src="${contextPath}/resources/js/menuController.js"></script>
		<script src="${contextPath}/resources/js/emailController.js"></script>
	</body>
</html>
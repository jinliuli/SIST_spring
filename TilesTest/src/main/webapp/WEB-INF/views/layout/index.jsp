<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
	<tiles:insertAttribute name="asset" />
	<style>
		
	</style>
</head>
<body>
	<!-- layout > index.jsp : index 템플릿페이지는 따로 만들어야되서 -->
	<header>
		<tiles:insertAttribute name="main_menu" />
	</header>
	
	
	<tiles:insertAttribute name="content" />
	
	
	<script>
		
	</script>
</body>
</html>

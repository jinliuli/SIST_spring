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
	<!-- layout > layout.jsp : member & admin 모두 같이 사용하는 중립적인 템플릿 페이지 -->
	<header>
		<tiles:insertAttribute name="main_menu" />
		<tiles:insertAttribute name="sub_menu" />
	</header>
	
	
	<tiles:insertAttribute name="content" />
	
	
	<script>
		
	</script>
</body>
</html>

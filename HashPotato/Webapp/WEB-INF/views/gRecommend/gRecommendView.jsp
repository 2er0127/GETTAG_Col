<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게임 추천 | #POTATO</title>
	
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/gRecommendStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/allStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/headerStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/naviStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/footerStyle.css">
</head>

<body>
<header><%@ include file="/WEB-INF/views/include/header.jsp" %></header>
<nav><%@ include file="/WEB-INF/views/include/navi.jsp" %></nav>
<article>
<hr class="bold-line">
<!-- 추천 탑3 대문짝만하게 나올 부분 -->

<!-- 정렬 기준(겹치는 해시 순, 별점 순,  -->
<hr>
<!-- 나머지 출력 4*4(탑3도 포함할 것) -->
</article>
<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
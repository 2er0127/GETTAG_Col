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
<%@ include file="/WEB-INF/views/include/noticeBox.jsp" %>
<!-- 추천 탑3 대문짝만하게 나올 부분 -->
<div class="top3-container">
	<div class="mySlides">
		<div class="ranking"><img src="${pageContext.request.contextPath}/resources/images/first.png" alt="추천 게임 1위"></div>
		<img src="#크롤링해온 게임 중 추천 순위 1위">
	</div>
	<div class="mySlides">
		<div class="ranking"><img src="${pageContext.request.contextPath}/resources/images/second.png" alt="추천 게임 2위"></div>
		<img src="#크롤링해온 게임 중 추천 순위 2위">
	</div>
	<div class="mySlides">
		<div class="ranking"><img src="${pageContext.request.contextPath}/resources/images/third.png" alt="추천 게임 3위"></div>
		<img src="#크롤링해온 게임 중 추천 순위 3위">
	</div>
	
	<a class="prev" onClick="" ><img src="${pageContext.request.contextPath}/resources/images/next_button.png"></a>
	<a class="next" onClick="" ><img src="${pageContext.request.contextPath}/resources/images/next_button.png"></a>
</div>

<!-- 정렬 기준(겹치는 해시 순, 별점 순,  -->
<hr>
<!-- 나머지 출력 4*4(탑3도 포함할 것) -->
</article>
<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
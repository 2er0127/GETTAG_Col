<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>#POTATO</title>

	<script src="${pageContext.request.contextPath}/resources/js/popSearch.js"></script>
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/mainStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/headerStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/naviStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/footerStyle.css">
</head>

<body>

<%@ include file="/WEB-INF/views/include/navi.jsp" %>

<article class="main-search-wrap">

	<div class="main-logo"><a href="/HashPotato/mainView.com" class="mainLogo"><img src="${pageContext.request.contextPath}/resources/images/hashpotato_Logo.png" alt="Hash Potato"></a></div>

	<div class="main-box">
	<p>
	재미있게 즐겼던 게임과 유사한 게임을 찾고 싶으신가요?<br>
	게임 제목을 입력하시면 #POTATO가 태그를 분석해서 비슷한 게임을 추천해드립니다!
	</p>
	
	<!-- submit 시, 게임 선택을 위한 창 생성 -->
	<form class="game-search" name="game-search" action="http://localhost:8080/HashPotato/" method="get">
		<input id="main-search" type="search" name="search-box" placeholder="게임 제목을 입력하세요!"><br>
		<input id="main-submit" type="submit" value="검색" onClick="open_select()">
	</form>
	</div>
	
</article>

<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
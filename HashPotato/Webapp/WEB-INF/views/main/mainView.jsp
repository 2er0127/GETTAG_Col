<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>#메인 페이지</title>

<script src="${pageContext.request.contextPath}/resources/js/popSearch.js"></script>
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/mainStyle.css">
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/headerStyle.css">
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/naviStyle.css">
</head>

<body>

<%@ include file="/WEB-INF/views/include/navi.jsp" %>

<article class="main-search-wrap">

	<div class="main-logo"><a href="mainVeiw.jsp">#TODO 로고 삽입</a></div>

	<div class="main-box">
	<p>
	재미있게 즐겼던 게임과 유사한 게임을 찾고 싶으신가요?<br>
	어쩌구저쩌구 해시포테토 웹페이지 설명
	</p>
	
	<!-- submit 시, 게임 선택을 위한 창 생성 -->
	<form class="game-search" name="game-search" action="#" method="get">
		<input id="main-search" type="search" name="search-box" placeholder="게임 이름을 입력하세요!"><br>
		<input id="main-submit" type="submit" value="검색" onClick="open_select()">
	</form>
	</div>
	
</article>

<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
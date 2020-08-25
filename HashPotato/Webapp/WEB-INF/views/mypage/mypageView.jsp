<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="google-signin-client_id" content="46039581913-flus44ena0f5ofrtpa81tnao4vsr5tbr.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>

<title>마이페이지 | #POTATO</title>
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/mypageStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/allStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/headerStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/naviStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/footerStyle.css">
</head>
<body>
<!-- 로그인했는지 검사, 만약 로그인되어있지 않다면 로그인하시오 팝업띄우고 로그인 페이지로 이동 -->
<header><%@ include file="/WEB-INF/views/include/header.jsp" %></header>
<nav><%@ include file="/WEB-INF/views/include/navi.jsp" %></nav>
<article>
	<hr>
	<div class="page-wrap">
	<div class="mypage-wrap">
	
	<h2>마이페이지</h2>
	
	<div class="member-info-box">
	<!-- 회원이름이나 이메일 이부분만 색 다르게, 밑줄 -->님, 환영합니다!
	</div>

	<div class="remember-list">
	찜 목록(<!-- 찜목록 갯수 -->)
	<div class="remember-list-box">
	<!-- 찜목록 리스트 4*4 -->
	<!-- 리스트가 없는 경우 '찜한 게임이 없습니다. (아이콘)을 눌러 마음에 든 게임을 찜해보세요!' 회색 글자로 출력 -->
	</div>
	</div>
	
	</div>
	</div>
</article>
<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
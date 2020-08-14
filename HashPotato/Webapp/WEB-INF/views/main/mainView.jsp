<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
<!-- 로고 클릭 시 mainView 자기 호출 -->
<a href="#메인뷰" class="headLogo">#TODO 로고 삽입</a>
</header>
<article class="mainSearch_wrap">
<p>재미있게 즐겼던 게임과 유사한 게임을 찾고 싶으신가요? 어쩌구저쩌구 해시포테토 웹페이지 설명</p>
<!-- submit 시, 게임 선택을 위한 창 생성 -->
<form name="gameSearch" action="#" method="get">
	<input id="mainSearch" type="search" name="searchBox" placeholder="게임 이름을 입력하세요!"><br>
	<input id="mainSubmit" type="submit" value="검색">
</form>
</article>
<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
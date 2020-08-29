<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>#검색한 게임 찾기</title>
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/searchWindowStyle.css">
</head>
<body>
<div class="gSelect-wrap">
<h2>찾는 게임을 선택해주세요.</h2>
<div class="gSelect-wrap2">
<form class="gameSelect" name="gameSelect" action="#" method="get">
<%-- <c:forEach var=gList items="${ gSelectList }">
	<div class="gSelect-list">
		<label for="${ gList.index }">
			<img src="${ gList.img }"><br>
			${ gList.name }
		</label>	
			<input type="radio" name="select ${ gList.index }" id="${ gList.index }">
		
	</div>
</c:forEach> --%>
<a href="/HashPotato/gRecommendView.com">확인</a>
</form>
</div>
</div>
</body>
</html>
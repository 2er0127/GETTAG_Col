<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>#검색한 게임 찾기</title>
</head>
<body>
<h2>찾는 게임을 선택해주세요</h2>
<div class="gSelect-wrap">
<form class="gameSelect" name="gameSelect" action="#" method="get">
<c:forEach var=gList items="${ gSelectList }">
	<div class="gSelect-list">
		<label for="">
			<img src="">
			${ gList. }
			<input type="radio" name="">
		</label>
	</div>
</c:forEach>
<input type="submit" name="" value="검색">
</form>
</div>
</body>
</html>
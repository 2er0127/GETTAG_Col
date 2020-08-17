<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>#공지사항</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="/WEB-INF/assets/css/noticeStyle.css">
	<script type="text/javascript">
	</script>
</head>
<body>
	<header><%@ include file="/WEB-INF/views/include/header.jsp" %></header>
        
	<nav><%@ include file="/WEB-INF/views/include/navi.jsp" %></nav>
        
	<article>
		<h2 id="notice">공지사항</h2>
		<table class="notice-tbl">
			<caption>글번호, 제목, 작성자, 등록일로 이루어진 공지사항 테이블입니다.</caption>
                
			<thead>
				<tr class="noticeHead">
					<th class="listNo">글 번호</th>
					<th class="listTitle">제목</th>
					<th class="listWriter">작성자</th>
					<th class="listDate">등록일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var=gBoard items="${ noticeList }">
				<tr class="noticeBody">
					<td class="listNo">${ gBoard.no }</td>
					<td class="listTitle"><a href='"#주소값" + gBoard.no'>${ gBoard.title }</a></td>
					<td class="listWriter">${ gBoard.writer }</td>
					<td class="listDate">${ gBoard.reg_date }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<div class="superWrite-wrap">
			<c:if test="${ user.type eq 'S' }">
				<input type="button" value="관리자 글쓰기" onclick="함수명()" class="superWrite_wrap"/>
			</c:if>
		</div>
	</article>
	<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
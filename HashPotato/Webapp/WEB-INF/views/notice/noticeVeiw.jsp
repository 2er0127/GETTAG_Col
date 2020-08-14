<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>#공지사항</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="/WEB-INF/veiws/assets/css/noticeStyle.css">
</head>
<body>
	<header><!--jsp:include page=헤더 링크--></header>
        
	<nav><!--jsp 네비게이션 링크--></nav>
        
	<article>
		<h2 id="notice">공지사항</h2>
		<table class="notice_tbl">
			<caption>글번호, 제목, 작성자, 등록일로 이루어진 공지사항 테이블입니다.</caption>
                
			<thead>
				<tr>
					<th id="listNo">글 번호</th>
					<th id="listName">제목</th>
					<th id="listWriter">작성자</th>
					<th id="listDate">등록일</th>
				</tr>
			</thead>
			<tbody>
				
			</tbody>
		</table>
	</article>
	<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
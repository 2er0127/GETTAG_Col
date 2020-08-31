<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 글쓰기 | #POTATO</title>

	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/noticeWriteStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/allStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/headerStyle.css">
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/naviStyle.css">    
   	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/footerStyle.css">

	<script type="text/javascript">
		function goTolist() {
			location.href='#noticeView';
		}
		function writeOk(){
			alert('공지사항 게시글 등록이 완료되었습니다.');
			goTolist();
		}
	</script>
</head>
<body>
<header><%@ include file="/WEB-INF/views/include/header.jsp" %></header>
<nav><%@ include file="/WEB-INF/views/include/navi.jsp" %></nav>

<article>
<%@ include file="/WEB-INF/views/include/noticeBox.jsp" %>

<form class="write-form">
<input type="text" id="noticeTitle" name="noticeTitle" placeholder="제목을 입력하세요."><br>
<textarea id="noticeContent" name="noticeContent" cols="80" rows="20" placeholder="내용을 입력하세요."></textarea><br>
<input type="button" onClick="goTolist()" value="글 목록">
<input type="submit" onClick="writeOk()" value="글 등록">
</form>
</article>
<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
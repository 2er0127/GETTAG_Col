<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 글쓰기 | #POTATO</title>

	<%-- <link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/loginStyle.css"> --%>
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

<form>
<input type="text" name="noticeTitle" placeholder="제목을 입력하세요.">
<textarea name="noticeContent" cols="50" rows="30" placeholder="내용을 입력하세요."></textarea>
<input type="button" onClick="goTolist()" value="글목록">
<input type="submit" onClick="writeOk()" value="등록">
</form>
</article>
<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
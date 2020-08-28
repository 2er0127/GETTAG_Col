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
</head>
<body>
<header><%@ include file="/WEB-INF/views/include/header.jsp" %></header>
<nav><%@ include file="/WEB-INF/views/include/navi.jsp" %></nav>

<article>
<%@ include file="/WEB-INF/views/include/noticeBox.jsp" %>

</article>
<footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
</body>
</html>
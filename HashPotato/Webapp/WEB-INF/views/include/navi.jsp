<!-- 우측 상단에 보일 네비게이션 바(내정보/찜목록, 로그인/로그아웃) -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/naviStyle.css">

<!-- 네비게이션 바 메뉴 구성
	 로그인 전: 내정보/찜목록(들어가려면 로그인 해야함) | 로그인
	 로그인 후: 내정보/찜목록 | 로그아웃
	 관리자(슈퍼유저): 내정보/찜목록 | 글쓰기 | 로그아웃
-->


<div class="nav-wrap">
	<nav class="site-nav">
		<ul class="nav-li">
			<li class="nav-myinfo"><a href="#내정보/찜목록 페이지">내정보/찜목록</a></li>
			<!-- 현재 세션 영역에 존재하는 user 타입이 'S'(슈퍼유저) 라면 -->
			<c:if test="${ user.type eq 'S' }"> 
				<li class="nav-notice-write"><a href="#글쓰기사이트">글쓰기</a></li>
			</c:if>
			
			<c:choose>
				<c:when test="${empty user}">	<!-- 로그인 전 -->
					<li class="nav-login"><a href="/WEB-INF/views/login/loginView.jsp">로그인</a></li>
				</c:when>
				
				<c:otherwise>	<!-- 로그인 후 -->
					<li class="nav-logout"><a href="#로그아웃처리" onclick="signOut();">로그아웃</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</nav>
</div>

<script>
  			function signOut() {
    			var auth2 = gapi.auth2.getAuthInstance();
    			auth2.signOut().then(function () {
      			console.log('User signed out.');
    			});
  			}
</script>
<!-- (mainVeiw제외 모든 페이지에 들어가는 header 헤더. 로고, 검색창 들어감 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="header-wrap">
<!-- 해시포테토 로고. 누르면 mainVeiw로 돌아간다. -->
<a href="#메인뷰" class="headLogo">#TODO 로고 삽입</a>
<!-- 게임 검색창 mainView의 action 주소와 동일-->
<!-- submit 시, 게임 선택을 위한 창 생성 -->
<form name="game-search"action="#" method="get" >
	<input type="search" name="search-box" placeholder="찾고 싶은 게임 이름을 입력하세요.">
	<input type="submit" value="검색">
</form>
</div>
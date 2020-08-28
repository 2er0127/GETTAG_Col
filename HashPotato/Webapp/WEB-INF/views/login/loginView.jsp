<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <title>Google Login Demo Version</title>
        <meta charset="utf-8">
        <meta name="google-signin-client_id" content="46039581913-flus44ena0f5ofrtpa81tnao4vsr5tbr.apps.googleusercontent.com">
        <script src="https://apis.google.com/js/platform.js" async defer></script>
		
		<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/resources/css/loginStyle.css">
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
    <div class="page-wrap">
    <div class="sign-box">  
    <form action="/HashPotato/login.com" method="post">
        <h2>다음 계정으로 로그인</h2>
    </form>
        <div class="sign-button-box">
        <div class="signin-button">
        <div id="my-signin2" data-onsuccess="onSignIn"></div>
        </div>
        </div>
    </div>
    </div>
    </article>	
    
    <footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
    
    <script>
        //onSignIn 함수는 데이터 받는것 확인을 위해 넣어둔 것일 뿐 이거 콘솔에 보이면 안됨!!
    		function onSignIn(googleUser) { 
    			var profile = googleUser.getBasicProfile();
    		    console.log("ID: " + profile.getId()); // Don't send this directly to your server!
    		    console.log('Full Name: ' + profile.getName());
   		        console.log("Image URL: " + profile.getImageUrl());
  		        console.log("Email: " + profile.getEmail());
    		}
    		function onFailure(error) {
      			console.log(error);
    		}
    		function renderButton() {
      			gapi.signin2.render('my-signin2', {
        			'scope': 'profile email',
        			'width': 240,
        			'height': 50,
        			'longtitle': true,
        			'theme': 'Dark',
        			'onsuccess': onSignIn,
        			'onfailure': onFailure
      			});
    		}

  		</script>

		
  		<script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>
    
    </body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <title>Google Login Demo Version</title>
        <meta charset="utf-8">
        <meta name="google-signin-client_id" content="46039581913-flus44ena0f5ofrtpa81tnao4vsr5tbr.apps.googleusercontent.com">
        <script src="https://apis.google.com/js/platform.js" async defer></script>
    	<style type="text/css">
    		.loginCss {font-family}
    	</style>
    </head>
    
    <body>
    <header><%@ include file="/WEB-INF/views/include/header.jsp" %></header>
    
    <article>   
        <h2>다음 계정으로 로그인</h2>
        <div id="my-signin2" data-onsuccess="onSignIn"></div>
        
        <script>
        //onSignIn 함수는 데이터 받는것 확인을 위해 넣어둔 것일 뿐 이거 콘솔에 보이면 안됨!!
    		function onSignIn(googleUser) { 
    			var profile = googleUser.getBasicProfile();
    		    console.log("ID: " + profile.getId()); // Don't send this directly to your server!
    		    console.log('Full Name: ' + profile.getName());
    		    console.log('Given Name: ' + profile.getGivenName());
   		        console.log('Family Name: ' + profile.getFamilyName());
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
    </article>	
    
    <footer><%@ include file="/WEB-INF/views/include/footer.jsp" %></footer>
    </body>
</html>
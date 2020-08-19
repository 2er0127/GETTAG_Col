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
        <h2>다음 계정으로 로그인</h2>
        <div id="my-signin2"></div>
        
        <script>
    		function onSuccess(googleUser) {
      			console.log('Logged in as: ' + googleUser.getBasicProfile().getName());
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
        			'theme': 'light',
        			'onsuccess': onSuccess,
        			'onfailure': onFailure
      			});
    		}

  		</script>

		
  		<script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>
    </body>
</html>
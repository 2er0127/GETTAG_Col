package com.gettag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String main() {
		return "main/mainView";
	}
	
	@RequestMapping("/loginView")
	public String login() {
		return "login/loginView"; // WEB-INF/views/login/loginView.jsp를 찾는다.
	}


}


// 로그인 페이지로 이동
// 구글 연동 컨트롤러는  LoginGoogleController
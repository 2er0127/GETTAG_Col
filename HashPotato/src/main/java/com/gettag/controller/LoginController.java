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

package com.gettag.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements Controller{
	public String handleRequest(HttpServletRequest request
							  , HttpServletResponse response
							  ) throws Exception {
		return "/WEB-INF/views/login/loginView.jsp";
	}


}


// 로그인 페이지로 이동
// 구글 연동 컨트롤러는  LoginGoogleController
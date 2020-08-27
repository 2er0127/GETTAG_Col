package com.gettag.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


public class MainController implements Controller{
	
	public String handleRequest(HttpServletRequest request
			  , HttpServletResponse response
			  ) throws Exception {
return "/WEB-INF/views/main/mainView.jsp";
}

}

// 메인 홈페이지 컨트롤러 
// 로고 -> 자기자신 소환   


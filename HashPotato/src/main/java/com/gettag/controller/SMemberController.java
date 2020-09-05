package com.gettag.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SMemberController implements Controller{
	
	public String handleRequest(HttpServletRequest request
			  , HttpServletResponse response
			  ) throws Exception {
return "/WEB-INF/views/notice/noticeWriteView.jsp";
}

}

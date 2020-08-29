package com.gettag.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchController implements Controller {
	public String handleRequest(HttpServletRequest request
			  , HttpServletResponse response
			  ) throws Exception {
return "/WEB-INF/views/include/searchWindow.jsp";
}


}

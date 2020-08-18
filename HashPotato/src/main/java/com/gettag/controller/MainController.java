package com.gettag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	
	@RequestMapping("/main")
	public String main() {
		return "/WEB-INF/views/main/mainView.jsp";
	}

}

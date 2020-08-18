package com.gettag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Main")
public class mainController {
	
	@RequestMapping("mainView")
	public String main() {
		return "mainView";
	}

}

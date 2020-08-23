package com.gettag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {
	@RequestMapping(value="/", method=RequestMethod.GET) // value값 다시 지정 
	public String main() {
		
		return ""; // return값 지정
	}
}
// main 메소드 안에 들어갈 것
// 1.
// 2.

	

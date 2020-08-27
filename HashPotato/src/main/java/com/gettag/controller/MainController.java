package com.gettag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView main(ModelAndView mv) {
		
		mv.setViewName("main/mainView");
		return mv;
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView main2(ModelAndView mv) {
		
		mv.setViewName("main/mainView");
		return mv;
	}

}

// 메인 홈페이지 컨트롤러 
// 로고 -> 자기자신 소


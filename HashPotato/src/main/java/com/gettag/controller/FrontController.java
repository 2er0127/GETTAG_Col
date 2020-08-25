package com.gettag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
	@RequestMapping(value="/", method=RequestMethod.GET) // value값 다시 지정 
	public ModelAndView main(ModelAndView mv) {
		
		mv.setViewName("main/mainView");
		return mv; // GET mainView
	}
	@RequestMapping(value="/gSearch", method=RequestMethod.POST) // gSearch에 action값으로 설정해주기!
	public ModelAndView gSearch(ModelAndView mv) {
		
		mv.setViewName("gSearch/gSearchView");
		return mv; // POST gSearch   
	}
}
// mainView -> gSearch
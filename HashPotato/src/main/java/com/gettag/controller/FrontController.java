package com.gettag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping(value="/gSearch/{gSearchView}", method=RequestMethod.POST) // gSearch에 action값으로 설정해주기!
	public ModelAndView gSearch(ModelAndView mv, @PathVariable int gSearchView) {
		
		// 여기에 검색 버튼을 눌렀을 때? 가 들어가야함 (여기 아니면 위에)
		mv.setViewName("gSearch/gSearchView");
		return mv; // POST gSearch   
	}
}

// mainView -> gSearch


package com.gettag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MypageController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView member(ModelAndView mv) {
		mv.setViewName("/");
		return mv;
	}
	@RequestMapping(value="mypage/mypageView", method=RequestMethod.POST)
	public ModelAndView mypage(ModelAndView mv) {
		mv.setViewName("mypage/mypageView");
		return mv;
	}
// 마이페이지 연결 컨트롤러
	

	// 찜목록 컨트롤러 설정 
}

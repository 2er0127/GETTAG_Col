package com.gettag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/") // 루트 경로 /에 HTTP GET 요청 수신되면 이 메소드가 해당 요청을 처리.
	public String main() {
		return "/WEB-INF/views/main/mainView.jsp"; // view 이름을 반환해야한다. 아직 미완성 
	}

}
<<<<<<< HEAD
// 메인 홈페이지 컨트롤러 
=======
// 메인 홈페이지 컨트롤러
>>>>>>> a0ec811c01167b693de6ab4febc85b92843b8b62

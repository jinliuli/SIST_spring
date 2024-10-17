package com.test.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//스프링 컨트롤러 구현
//1. Controller 인터페이스 구현
//2. @Controller 어노테이션 사용

@Controller
@RequestMapping(value="/ex03.do")
public class Ex03Controller {
	
	//요청 메서드?? > 정해진 형식 없음 > 마음대로~
	//public void aaa() {}
	//public void bbb() {//페이지 작업 > JSP호출}
	//public void ccc() {}
	
	@RequestMapping //호출 자격을 얻는 대표 어노테이션
	//public String test(HttpServletRequest req) {
	public String test(Model model) {
		
		//업무 코드
		
		//1. req?
		//2. mv?
		//req.setAttribute("num", 100);
		model.addAttribute("num", 100);
		
		//뷰 호출 > ModelAndView
		return "ex03";
		
	}
	
}

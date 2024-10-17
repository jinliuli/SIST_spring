package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value="/ex04_1.do")
@RequestMapping(value="/member") //http://localhost:8090/web/member/ex04_1.do
public class Ex04Controller {
	
	//@RequestMapping("/ex04_1.do")class 
	//	>> @RequestMapping메소드가 두개일때
	//	>> error: Ambiguous mapping (맵핑이 애매하다고 오류발생)
	
	@RequestMapping(value="/ex04_1.do")
	public String ex04_1() {
		
		return "ex04_1";
	}
	
	@RequestMapping(value="/ex04_2.do")
	public String ex04_2() {
		
		return "ex04_2";
	}
	
}

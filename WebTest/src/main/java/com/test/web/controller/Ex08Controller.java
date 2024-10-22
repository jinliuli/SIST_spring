package com.test.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.web.service.TestService;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//스프링 어노테이션
@Controller
//Lombok 어노테이션
//@NoArgsConstructor		//> 매개변수가 없는 기본 생성자
//@NoArgsConstructor		//> 모든 멤버변수를 매개변수로 가지는 생성자
@RequiredArgsConstructor	//> final 멤버변수만 매개변수로 가지는 생성자
public class Ex08Controller {
	
	/*
	
		*** 스프링을 통해서 관리되는 객체는 반드시 @Component로 선언되어 있어야 한다.(or XML) + <component-scan>에 패키지가 포함되어야 한다.
		
		
		의존 주입
		- XML 사용 방식
		- 어노테이션 방식
		
		1. 필드 주입, Field Injection
			- @Autowired 사용
			- 코드가 간결해진다.
			
		2. Setter 주입
			- Spring 3.X
			- @Autowired 사용
			
		3. 생성자 주입	
			- @Autowired 사용		
			- 생성자가 1개일때만 @Autowired 생략 가능
			- 의존 객체에 final 적용이 가능하다.(*****)
	*/

	
	@RequestMapping(value = "/ex08_1.do")
	public String ex08_1(Model model) {
		
		//Controller > (의존객체) > TestService
		TestService service = new TestService();
		
		service.work();
		String result = service.get();
		
		model.addAttribute("result", result);
		
		return "ex08";
	}
	
	
	/*
	//1. 필드 주입, Field Injection
	@Autowired
	//private final TestService service; //final 불가능
	private TestService service;
	
	@RequestMapping(value = "/ex08_2.do")
	public String ex08_2(Model model) {
		
		//Controller > (의존객체) > TestService
		//TestService service = new TestService();
		
		service.work();
		String result = service.get();
		
		model.addAttribute("result", result);
		
		return "ex08";
	}
	*/
	
	/*
	//2. Setter 주입
	//Sertter 주입에서의 의존 객체는 (final) 불가능
	//private final TestService service;
	private TestService service;
	
	@Autowired
	public void setService(TestService service) {
		this.service = service;
	}
	
	@RequestMapping(value = "/ex08_3.do")
	public String ex08_3(Model model) {
		
		TestService service = new TestService();
		
		service.work();
		String result = service.get();
		
		model.addAttribute("result", result);
		
		return "ex08";
	}
	*/
	
	
	/*
	//3. 생성자 주입
	//생성자주입에서의 의존 객체는 (final)로 정해 놓는 경우가 가능
	private final TestService service;
	
	//@Autowired //생성자가 1개일때만 생략가능
	public Ex08Controller(TestService service) {
		this.service = service;
	}
	
//	public Ex08Controller() {
//		
//	}
	
	@RequestMapping(value = "/ex08_4.do")
	public String ex08_4(Model model) {
		
		TestService service = new TestService();
		
		service.work();
		String result = service.get();
		
		//service = new TestService();
		
		model.addAttribute("result", result);
		
		return "ex08";
	}
	*/
	
	
	private String data;
	private final TestService service;
	
//	@Autowired
//	public Ex08Controller(TestService service) {
//		this.service = service;
//	}
	
	@RequestMapping(value = "/ex08_5.do")
	public String ex08_5(Model model) {
		
		TestService service = new TestService();
		
		service.work();
		String result = service.get();
		
		//service = new TestService();
		
		model.addAttribute("result", result);
		
		return "ex08";
	}
}
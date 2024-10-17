package com.test.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//JSP Model 2 > (발전) > Spring MVC

//서블릿 역할
public class Ex01Controller implements Controller {
	
	
	//요청 메소드
	//doGet/doPost == handleRequset
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//업무 처리
		
		//JSP 호춯
		//RequsetDipatcher > forward(req, resp)
		//System.out.println("111");
		
		
		int count = 100;
		String id = "hong";
		
		//int 를 넘겨줄때
		request.setAttribute("count", count);
		
		
		//Model > 계층간 데이터 전송
		//View > 페이지(JSP)
		ModelAndView mv = new ModelAndView();
		
		//String 을 넘겨줄때
		mv.addObject("id", id);
		
		
		
		//Spring > view Resolver 동작 (servlet-context.xml)
		//mv.setViewName("/WEB-INFO/views/ex01");
		mv.setViewName("ex01");
		
		return mv;
	}

}

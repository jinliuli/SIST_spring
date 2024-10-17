package com.test.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class Ex05Controller {
	
	@RequestMapping(value="/ex05.do")
	public String ex05() {
		
		
		return "ex05";
	}
	
	//doGet or doPost 둘다 받을 수 있는 메서드 > method = { RequestMethod.GET, RequestMethod.POST }
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	public String ex05ok(HttpServletRequest req) {
//		
//		String data = req.getParameter("data");
//		
//		System.out.println(data);
//		
//		req.setAttribute("data", data);
//		
//		return "ex05ok";
//	}
	
	/*
		파라미터 자동 수집
		
	*/	
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	public String ex05ok(@RequestParam("data") String data, Model model) {
//		
//		//(@RequestParam("data")
//		// ==
//		//String data = req.getParameter("data");
//		
//		System.out.println(data);
//		
//		//req.setAttribute("data", data);
//		
//		model.addAttribute("data", data);
//		
//		return "ex05ok";
//	}
	
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	public String ex05ok(@RequestParam(name="data", defaultValue = "기본값") String data, Model model) {
//		
//		//list.do?page=1
//		//list.do
//		
//		//String data = req.getParameter("data");
//		
//		System.out.println(data);
//		
//		//req.setAttribute("data", data);
//		
//		model.addAttribute("data", data);
//		
//		return "ex05ok";
//	}
	
	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
	//public String ex05ok(@RequestParam(name="num")String data, Model model) {
	public String ex05ok(String num, Model model) { //jsp에서의 보내는 name="num"과 이름이 같아야된다
				
		System.out.println(num);
		
		model.addAttribute("data", num);
		
		return "ex05ok";
	}
}

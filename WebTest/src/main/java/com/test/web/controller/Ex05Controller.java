package com.test.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.web.model.AddressDTO;

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
	
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	//public String ex05ok(@RequestParam(name="num")String data, Model model) {
//	public String ex05ok(String num, Model model) { //jsp에서의 보내는 name="num"과 이름이 같아야된다
//				
//		System.out.println(num);
//		
//		model.addAttribute("data", num);
//		
//		return "ex05ok";
//	}
	
	
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	public String ex05ok(
//					Model model,
//					@RequestParam(name="name") String name,
//					@RequestParam(name="age") String age,
//					@RequestParam(name="address") String address) { 
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	public String ex05ok(
//					Model model,
//					String name,
//					String age,
//					String address) { 
//		
//		//req.setCharacterEncoding("UTF-8");
//		
//		AddressDTO dto = new AddressDTO();
//		
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setAdress(address);
//		
//		model.addAttribute("dto", dto);
//		
//		return "ex05ok";
//	}
	
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	public String ex05ok(Model model, AddressDTO dto, int seq) { 
//		
//		model.addAttribute("dto", dto);
//		
//		System.out.println(seq + 10);
//		
//		return "ex05ok";
//	}
	
	
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	public String ex05ok(Model model,
//						//@RequestParam("cb") String[] cb,
//						//String[] cb,
//						@RequestParam("cb") ArrayList<String> list
//						//ArrayList<String> list(동작X)
//						) { 
//		
//		
//		//System.out.println((cb);//java,python,basic
//		//System.out.println(Arrays.toString(cb));//[Ljava.lang.String;@3a2cdf14
//		//System.out.println(Arrays.toString(cb));//[java, python, basic]
//		System.out.println(list);//[java, python, basic]
//		
//		return "ex05ok";
//	}
	
	
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	public String ex05ok(@RequestParam("data") String data, Model model) { 
	
//	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
//	public String ex05ok(@ModelAttribute("data") String data) { 
		
	@RequestMapping(value="/ex05ok.do", method = { RequestMethod.POST })
	public String ex05ok(@ModelAttribute("dto") AddressDTO dto) { 	
		
		return "ex05ok";
	}
	
}

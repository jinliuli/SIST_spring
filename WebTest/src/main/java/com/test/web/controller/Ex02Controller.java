package com.test.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.test.web.repository.SpringDAO;

public class Ex02Controller implements Controller {
	
	//의존 객체 주입 도구 생성
	//1.
	private SpringDAO dao;
	
	//2.
	public Ex02Controller(SpringDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		//Controller > DAO
		
		//의존 객체 > 직접 생성
		//SpringDAO dao = new SpringDAO();
		
		int count = dao.getCount();
		
		
		
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("count", count);
		
		return mv;
	}

}

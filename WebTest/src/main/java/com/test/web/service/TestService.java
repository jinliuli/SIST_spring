package com.test.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//TestService를 빈으로 만들어야 @Autowired를 실행할 수 있음
//@Component //빈으로 만들기 가능
@Service	//빈으로 만들기 가능
public class TestService {
	
	public void work() {
		
		System.out.println("주 업무를 진행합니다.");
	
	}
	
	public String get() {
		
		//DB or 조작
		
		return "스프링";
	}
	
}

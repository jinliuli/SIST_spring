package com.test.begin.di2;

public class Service {
	
	private Hong hong;
	
	//의존 주입 도구
	//1. 생성자 > public Service(Hong hong) > 더 많이 사용함
	//2. Setter > public void setHong(Hong hong)
	
	public Service(Hong hong) {
		this.hong = hong;
	}
	
	public void setHong(Hong hong) {
		this.hong = hong;
	}
	
	public void work() {
		
		//기존 방식
		//Hong hong = new Hong();
		//hong.coding();
		
		//DI
		hong.coding();
		
	}
	
}

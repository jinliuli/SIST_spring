package com.test.begin.di1;

public class Main {
	
	public static void main(String[] args) {
		
		//목적] Hong에게 일을 시키자!
		//Main > Hong (X) 사장이 직원에게 바로 일을 시키지(X)
		//Main > Service > Hong (O) 사장 > 팀장 > 직원(O)
		
		//Main > (위임) > Service > (위임) > Hong
		//Main > (의존) > Service > (위존) > Hong
		//Service는 Main의 의존 객체이다.
		//*** 여태까지 방식 > 필요할 때마다 직접 의존 객체를 생성해서 사용하는 방식을 사용했다.
		
		Service service = new Service(); //필요 > 의존객체 생성
		service.work();
		
	}

}

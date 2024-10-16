package com.test.begin.aop;

import java.util.Calendar;

//인터페이스 <- 클래스 이름짓는 2가지 경우
//1. IMemo <- Memo
//2. Memo <- MemoImpl

public class MemoImpl implements Memo {

	@Override
	public void add(String memo) {
		
		//주업무
		System.out.println("메모 쓰기: " + memo);
		
//		//보조업무
//		Calendar now = Calendar.getInstance();
//		System.out.printf("%tF %tT\n", now, now);
		
//		Logger logger = new Logger();
//		logger.log("메모쓰기");
		
	}

	@Override
	public String read(int seq) throws Exception {
		
		if (seq == 10) {
			System.out.println("메모 읽기: " + seq);
			return "테스트;;";
		} else {
			throw new Exception("존재하지 않는 메모입니다.");
		}
		
		//return "메모입니다.";
		
	}

	@Override
	public boolean edit(int seq, String memo) {
		
		System.out.println("수정 하기: " + memo);

		return true;
	}

	@Override
	public boolean del(int seq) {
		
		System.out.println("삭제 하기: " + seq);
		
		return true;
	}
	
	@Override
	public void addSecret(String memo) {
		
		//주업무
		System.out.println("비밀 메모: " + memo);
	
		
	}
	
}

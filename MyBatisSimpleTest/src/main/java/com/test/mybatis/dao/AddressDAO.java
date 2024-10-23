package com.test.mybatis.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.test.mybatis.dto.AddressDTO;
import com.test.mybatis.mapper.AddressMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AddressDAO {
	
	//1. 기존 > SqlSesseionTemplate 사용안함
	//2. 현재 > AddressMapper 을 새로 만든다.
	//private final SqlSessionTemplate template;
	
	private final AddressMapper mapper;
	
	public AddressDTO get(String seq) {
		
		return mapper.get(seq);
	}

	public List<AddressDTO> list() {
		
		return mapper.list();
	}
	
	
}

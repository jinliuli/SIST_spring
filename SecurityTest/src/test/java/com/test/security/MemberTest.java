package com.test.security;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/security-context.xml"
	})	
public class MemberTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Test
	@Ignore
	public void testNotNull() {
		
		//$2a$10$shz/yU2/XJG3vCrRC5gQmOp8AmfOavsHMPPnzJuIeBLMabOgSj1bK
		assertNotNull(dataSource);
		assertNotNull(passwordEncoder);
	}
	
	@Test
	@Ignore
	public void testEncrypt() {
	
		String pw = "1111";
		System.out.println(passwordEncoder.encode(pw));
		
		String pw2 = "1111";		
		System.out.println(passwordEncoder.encode(pw2));
	}
	
	@Test
	@Ignore
	public void insertMember() {
	
		String sql = "insert into member (memberid, memberpw, membername, enabled, email, age, gender) values (?, ?, ?, default, ?, ?, ?)";
		
		try {
			
			Connection conn = dataSource.getConnection();
			PreparedStatement stat = conn.prepareStatement(sql);
			
			stat.setString(1, "dog");
			stat.setString(2, passwordEncoder.encode("1111"));
			stat.setString(3, "강아지");
			stat.setString(4, "dog@gmail.com");
			stat.setString(5, "2");
			stat.setString(6, "f");
			stat.execute();

			stat.setString(1, "cat");
			stat.setString(2, passwordEncoder.encode("1111"));
			stat.setString(3, "고양이");
			stat.setString(4, "cat@gmail.com");
			stat.setString(5, "2");
			stat.setString(6, "m");
			stat.execute();
			
			stat.setString(1, "tiger");
			stat.setString(2, passwordEncoder.encode("1111"));
			stat.setString(3, "호랑이");
			stat.setString(4, "tiger@gmail.com");
			stat.setString(5, "1");
			stat.setString(6, "m");
			stat.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void insertAuth() {
	
		String sql = "insert into member_auth (memberid, auth) values (?, ?)";
		
		try {
			
			Connection conn = dataSource.getConnection();
			PreparedStatement stat = conn.prepareStatement(sql);
			
			stat.setString(1, "dog");
			stat.setString(2, "ROLE_MEMBER");
			stat.executeUpdate();
			
			stat.setString(1, "cat");
			stat.setString(2, "ROLE_MEMBER");
			stat.executeUpdate();
			
			stat.setString(1, "tiger");
			stat.setString(2, "ROLE_MEMBER");
			stat.executeUpdate();
						
			stat.setString(1, "tiger");
			stat.setString(2, "ROLE_ADMIN");
			stat.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

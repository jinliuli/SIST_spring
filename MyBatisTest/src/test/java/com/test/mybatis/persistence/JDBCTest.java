package com.test.mybatis.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

//@Log4j
public class JDBCTest {
	
	@Test
	public void testConnection() {
		
		try {
			
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@loclahost:1521:xe", "hr", "java1234");
			
			assertNotNull(conn);
			assertEquals(false, conn.isClosed());
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.member.lib.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector1 {

	private static final String URL ="jdbc:oracle:thin:@localhost:1521/xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	
	
	static {
	try {
		Class.forName(DRIVER_NAME);
	} catch (ClassNotFoundException e) {
	
		e.printStackTrace();
	}
	
	
	}
	
	
	public static Connection open() {
		
		
		try {
			return DriverManager.getConnection(URL, ID, PWD);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	

	
	
}

package com.member.lib.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector2 {
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String ID = "c##test";
	private static final String PWD = "test";
	private static final String DRIVER_NAME = "orcle.jdbc.driver.OracleDriver";	





	static {
	
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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

	public static void main(String[] args) {
		
		Connection con = open();
		
		
		try {
			Statement stmt = con.createStatement();
			String sql = "";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
						
				
				
			}
		
	}catch(SQLException e) {
		
		e.printStackTrace();
		
		
		
	}
	
			
	
		
	}


}



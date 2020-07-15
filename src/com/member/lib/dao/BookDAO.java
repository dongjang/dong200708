package com.member.lib.dao;

import java.util.List;
import java.util.Map;

import com.member.lib.common.Connector;

public interface BookDAO {

	
	
	int insertBook(Map<String,Object> book);
	int updateBook(Map<String,Object> book);
	int deleteBook(int bNum);
	List<Map<String,Object>> selectBookList(Map<String,Object> book);
	Map<String,Object> selectBook(int bNum);
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	Connection con = null();
	PreParedSTatement ps = null;
	try {
		
		con = Connector.open();
		String sql="insert into book(b_num,b_title,b_author,b_credat,b_desc)";
		sql += " valuese(seq_book_b_num.nextval, ?,?,sysdate,?)";
	}catch(Exception e) {
		
		e.printStatckTrace();
		
	}finally {
		
		
		
	}
	return 0;
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
}

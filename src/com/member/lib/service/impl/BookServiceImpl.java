package com.member.lib.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.BookDAO;
import com.member.lib.dao.impl.BookDAOImpl;
import com.member.lib.service.BookService;

public class BookServiceImpl implements BookService {
	
	private BookDAO bookDAO= new BookDAOImpl();
	
	public Map<String, Object> insertBook(Map<String, Object> book) {
		Map<String,Object> rMap = new HashMap<>();
		int result = bookDAO.insertBook(book);
		rMap.put("msg",(result==1)?"도서 입력 성공":"도서 입력 실패");
	
		rMap.put("cnt", result);
				return rMap;
	}

	@Override
	public Map<String, Object> updateBook(Map<String, Object> book) {
		
		Map<String,Object> rMap = new HashMap<>();
		int result = bookDAO.updateBook(book);
		rMap.put("msg",(result==1)?"도서 수정 성공":"도서 수정  성공");
	
		rMap.put("cnt", result);
				return rMap;
	}

	@Override
	public Map<String, Object> deleteBook(int bNum) {
		Map<String,Object> rMap = new HashMap<>();
		int result = bookDAO.deleteBook(bNum);
		rMap.put("msg",(result==1)?"도서 삭제 성공":"도서 삭제 성공 ");
		
		rMap.put("cnt", result);
			
		return rMap;
		
	}

	@Override
	public List<Map<String, Object>> selectBookList(Map<String, Object> book) {
		return bookDAO.selectBookList(book);
		
	}

	@Override
	public Map<String, Object> selectBook(int bNum) {
		
		return bookDAO.selectBook(bNum);
	}

	
	
	
	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		
		
		Map<String,Object> map = new HashMap();

		System.out.println(bookService.deleteBook(61));
		
	}
}

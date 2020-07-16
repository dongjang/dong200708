package com.member.lib.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.LentDAO;
import com.member.lib.dao.MemberDAO;
import com.member.lib.dao.impl.LentDAOImpl;
import com.member.lib.dao.impl.MemberDAOImpl;
import com.member.lib.service.BookService;
import com.member.lib.service.LentService;

public class LentServiceImpl implements LentService {
	private LentDAO lentDAO = new LentDAOImpl();
	
	public Map<String, Object> insertLent(Map<String, Object> lent) {
		int result = lentDAO.insertLent(lent);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg"," 등록 완료!");
		
		if(result!=1) {
			rMap.put("msg","등록 오류!");
			
		}
		rMap.put("cnt",result);
		return rMap;
	}
	

	@Override
	public Map<String, Object> updateLent(Map<String, Object> lent) {
		Map<String,Object> rMap = new HashMap<>();
		int result =lentDAO.updateLent(lent);
		rMap.put("msg",(result==1)?"수정 성공":"수정  성공");
	
		rMap.put("cnt", result);
				return rMap;
	}

	@Override
	public Map<String, Object> deleteLent(int lNum) {
		int result = lentDAO.deleteLent(lNum);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg","삭제 완료!");
		
		if(result!=1) {
			rMap.put("msg","삭제 오류!");
			
		}
		rMap.put("cnt",result);
		return rMap;
	}

	

	@Override
	public List<Map<String, Object>> selectLentList(Map<String, Object> lent) {
		return lentDAO.selectLentList(lent);
	}

	@Override
	public Map<String, Object> selectLent(int lNum) {
		return lentDAO.selectLent(lNum);
	}
public static void main(String[] args) {
	LentService lentService = new LentServiceImpl();
	
	
	Map<String,Object> map = new HashMap();

	System.out.println(lentService.selectLent(2));
}
}

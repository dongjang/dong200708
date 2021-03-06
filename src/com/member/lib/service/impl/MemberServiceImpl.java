package com.member.lib.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.MemberDAO;
import com.member.lib.dao.impl.MemberDAOImpl;
import com.member.lib.service.MemberService;

public class MemberServiceImpl implements MemberService {

	private MemberDAO memberDAO = new MemberDAOImpl(); 
	
	public Map<String,Object>insertMember(Map<String, Object> member) {
		int result = memberDAO.insertMember(member);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg","멤버 등록 완료!");
		
		if(result!=1) {
			rMap.put("msg","맴버 등록 오류!");
			
		}
		rMap.put("cnt",result);
		return rMap;
	}

	@Override
	public Map<String, Object> updateMember(Map<String, Object> member) {
		int result = memberDAO.updateMember(member);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg","멤버 수정 완료!");
		
		if(result!=1) {
			rMap.put("msg","맴버 수정 오류!");
			
		}
		rMap.put("cnt",result);
		return rMap;
	
	}

	@Override
	public Map<String, Object> deleteMember(int mNum) {
		int result = memberDAO.deleteMember(mNum);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg","맴버 삭제 완료!");
		
		if(result!=1) {
			rMap.put("msg","맴버 삭제 오류!");
			
		}
		rMap.put("cnt",result);
		return rMap;
	}

	@Override
	public List<Map<String, Object>> selectMemberList(Map<String, Object> member) {
		return memberDAO.selectMemberList(member);
	}

	@Override
	public Map<String, Object> selectMember(int mNum) {

		return memberDAO.selectMember(mNum);
	}
	
	public static void main(String[] args) {
		
		MemberService memberService = new MemberServiceImpl();
	//	Map<String,Object> rMap = memberService.deleteMember(2);
	//	System.out.println(rMap);
		
		Map<String,Object> member = new HashMap<>();
		member.put("m_name", "dj");
		member.put("m_id", "jd");
		member.put("m_pwd", "1234");
	//	rMap = memberService.insertMember(member);
	//	System.out.println(rMap);
		
		List<Map<String,Object>> memberList = memberService.selectMemberList(member);
		
		
		
		for(Map<String,Object> m :memberList) {
			
			
			System.out.println(m);
			
			
		}
		System.out.println(memberService.selectMember(12));
	}

}

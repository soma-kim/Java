package com.kh.controller;

import java.util.ArrayList;
import com.kh.model.vo.Member;

public class MemberController {
	
	ArrayList<Member> list = new ArrayList<>();
	
	public int insertMember(String userId, String userPwd, String userName, int age, char gender, String email, String phone) {
		
		int before = list.size();
		
		list.add(new Member(userId, userPwd, userName, age, gender, email, phone));
		
		return list.size() - before;
	}
	
	public ArrayList<Member> selectMemberList() {
		return list;
	}
	
	public void searchMemberById() {
		
	}
	
	public void searchMemberByName() {
		
	}
	
	public void initMemberPwd() {
		
	}
	
	public void deleteMember() {
		
	}

}

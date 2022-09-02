package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

public class MemberView {
	
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		System.out.print("아이디: ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		
		if(id.equals("admin") && pwd.equals("P@S$W0rd!")) {
			
			while(true) {
			System.out.println("========= 메뉴 ========");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체조회");
			System.out.println("3. 회원 아이디 검색");
			System.out.println("4. 회원 이름 키워드 검색");
			System.out.println("5. 회원 비밀번호 초기화");
			System.out.println("6. 회원 삭제");
			System.out.println("0. 프로그램 로그아웃");
			
			System.out.println("=====================");
			System.out.print("메뉴 입력: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertMember();
					 break;
			
			case 2 : selectMemberList();
			 		 break;
			 
			case 3 : searchMemberById();
			 		 break;
			 
			case 4 : searchMemberByName();
					 break;
			 
			case 5 : initMemberPwd();
					 break;
			 
			case 6 : deleteMember();
			 		 break;
			 
			case 0 : System.out.println("프로그램을 종료합니다.");
					 return; 
			}
			
			}
			
		} else {
			System.out.println("로그인 정보가 맞지 않습니다. 다시 입력해 주세요.");
			mainMenu();
			return;
		}
	}
	
	public void insertMember() {
		System.out.println("== 새로운 멤버 추가 ==");
		System.out.print("아이디: ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호: ");
		String userPwd = sc.nextLine();
		
		System.out.print("이름: ");
		String userName = sc.nextLine();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F): ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
		
		System.out.print("이메일: ");
		String email = sc.nextLine();
		
		System.out.print("휴대폰번호: ");
		String phone = sc.nextLine();
		
		int result = mc.insertMember(userId, userPwd, userName, age, gender, email, phone);
		
		if(result > 0) {
			System.out.println("성공적으로 추가되었습니다.");
		} else {
			System.out.println("곡 추가에 실패했습니다.");
		}

	}
	
	public void selectMemberList() {
		System.out.println("=== 멤버 목록 ===");
		
		ArrayList<Member> list = mc.selectMemberList();
		
		if(list.isEmpty()) {
			System.out.println("등록된 멤버가 없습니다.");
		} else {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}

	}
	
	public void searchMemberById() {
		
	}
	
	public void searchMemberByName() {
		
	}
	
	public void initMemberPwd() {
		
	}
	
	public void deleteMember() {
		
	}

} // MemberView
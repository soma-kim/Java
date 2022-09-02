package com.kh.view;

import java.util.Scanner;
import com.kh.controller.MemberController;

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
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체조회");
			System.out.println("3. 회원 아이디 검색");
			System.out.println("4. 회원 이름 키워드 검색");
			System.out.println("5. 회원 비밀번호 초기화");
			System.out.println("6. 회원 삭제");
			System.out.println("0. 프로그램 로그아웃");
			
			System.out.println("====================");
			System.out.print("메뉴 입력: ");
			int menu = sc.nextInt();
			
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
			// 5번 초과 틀렸을 때 프로그램 종료하려면 여기 for문 걸기 
			System.out.println("로그인 정보가 맞지 않습니다. 다시 입력해 주세요.");
			mainMenu();
			return;
		}
	} // mainMenu()
	
	public void insertMember() {
		
	}
	
	public void selectMemberList() {
		
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
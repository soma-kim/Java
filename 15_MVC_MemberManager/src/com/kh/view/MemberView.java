package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

public class MemberView {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		
//		for(int i = 0; i < 5; i++) {
//		
//		System.out.print("아이디: ");
//		String id = sc.nextLine();
//		
//		System.out.print("비밀번호: ");
//		String pwd = sc.nextLine();
//		
//			if(id.equals("admin") && pwd.equals("P@s$W0rd!")) {
//				
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
				default : System.out.println("잘못된 메뉴를 입력하셨습니다. 다시 입력하세요.");
				}
				
				}
				
//			} else {
//				if(i != 4) {
//				System.out.println(i+2 + "번째 시도입니다. 로그인 정보가 맞지 않으므로 다시 입력해 주세요.");
//				continue;
//				} else {
//					System.out.println("다섯 번 이상 틀린 정보를 입력하셨으므로 프로그램을 종료합니다.");
//					return;
//				}
//			}
//		}
		
	}
	
	// 회원 추가 화면
	public void insertMember() {
		System.out.println("--- 회원 추가 ---");
		System.out.print("아이디: ");
		String userId = sc.nextLine();
		
		int idCheck = mc.idCheck(userId);
		
		if(idCheck == 1) {
			System.out.println("이미 존재하는 아이디이므로 사용하실 수 없습니다. 다시 입력하세요.");
			insertMember();
			return;
		}

		System.out.print("비밀번호: ");
		String userPwd = sc.nextLine();
		System.out.print("이름: ");
		String userName = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별: ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("이메일: ");
		String email = sc.nextLine();
		System.out.print("휴대폰 번호: ");
		String phone = sc.nextLine();		
		
		int result = mc.insertMember(userId, userPwd, userName, age, gender, email, phone);
		
		if(result == 0) {
			System.out.println("회원가입에 실패했습니다.");
		} else {
			System.out.println("회원가입에 성공했습니다.");
		}
		
	}
	
	// 전체 조회
	public void selectMemberList() {
		
		ArrayList<Member> list = mc.selectMemberList();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	// 아이디로 회원 조회
	public void searchMemberById() {
		
		Member m = new Member();
		
		System.out.println("아이디를 통해 회원을 조회합니다");
		System.out.print("검색할 아이디: ");
		String userId = sc.nextLine();
		
		m = mc.searchMemberById(userId);
		
		if(m != null) {
			System.out.println("조회된 회원은 아래와 같습니다.");
			System.out.println(m);
		} else {
			System.out.println("일치하는 검색 결과가 없습니다.");
		}
		
	}
	
	// 이름으로 회원 조회
	public void searchMemberByName() {
		
		ArrayList<Member> searchList = new ArrayList();
		
		System.out.println("이름을 통해 회원을 조회합니다.");
		System.out.print("검색할 이름: ");
		String userName = sc.nextLine();
		
		searchList = mc.searchMemberByName(userName);
		
		if(searchList.isEmpty()) {
			System.out.println("조회된 회원이 없습니다.");
		} else {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList);
			}
		}
		
	}
	
	// 비밀번호 초기화
	public void initMemberPwd() {
		
	}
	
	// 회원 삭제
	public void deleteMember() {
		
	}
	
	
	
	
//	// 회원 추가 화면
//	public void insertMember() {
//		System.out.println("== 새로운 멤버 추가 ==");
//		System.out.print("아이디: ");
//		String userId = sc.nextLine();
//		
//		int idCheck = mc.idCheck(userId);
//		
//		if(idCheck != 0) {
//			System.out.println("이미 존재하는 아이디입니다. 다른 아이디를 입력하세요.");
//			insertMember();
//			return;
//		}
//		
//		System.out.print("비밀번호: ");
//		String userPwd = sc.nextLine();
//		
//		System.out.print("이름: ");
//		String userName = sc.nextLine();
//		
//		System.out.print("나이: ");
//		int age = sc.nextInt();
//		sc.nextLine();
//		
//		// 성별 확인받고, M/F가 아닐 경우 다시 입력받기 위해 변수만 따로 빼고 판별식은 while로 묶음
//				char gender = 0;
//				
//				while (true) {
//				
//				System.out.print("성별(M/F): ");
//				gender = sc.nextLine().toUpperCase().charAt(0);
//				
//				if(gender != 'M' && gender != 'F') {
//					System.out.println("성별 재확인 후 알파벳 M(m) 또는 F(f)으로 입력하세요.");
//					continue;
//				}
//					break;
//				}
//		
//		System.out.print("이메일: ");
//		String email = sc.nextLine();
//		
//		System.out.print("휴대폰번호: ");
//		String phone = sc.nextLine();
//		
//		int result = mc.insertMember(userId, userPwd, userName, age, gender, email, phone);
//		
//		if(result > 0) {
//			System.out.println("성공적으로 추가되었습니다.");
//		} else {
//			System.out.println("회원 추가에 실패하였습니다.");
//		}
//
//	}
//	
//	// 회원 전체 조회 화면
//	public void selectMemberList() {
//		
//		ArrayList<Member> list = mc.selectMemberList();
//		
//		System.out.println("전체 회원을 조회합니다.");
//		System.out.println("현재 등록된 회원은 " + list.size() + "명입니다.");
//		System.out.println("=== 멤버 목록 ===");
//
//		
//		if(list.isEmpty()) {
//			
//			System.out.println("등록된 회원이 없습니다.");
//			
//		} else {
//			
//			for(int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}
//		}
//
//	}
//	
//	// 회원 아이디 검색 화면
//	public void searchMemberById() {
//		
//		System.out.println("검색어와 회원의 아이디를 검색합니다.");
//		System.out.print("검색할 아이디: ");
//		String searchedId = sc.nextLine();
//		
//		ArrayList<Member> searchedList = mc.searchMemberById(searchedId);
//		
//		if(searchedList.isEmpty()) {
//			
//			System.out.println("일치하는 아이디가 없습니다. 다시 입력해 주세요.");
//			searchMemberById();
//			return;
//			
//		} else {
//			
//			for(int i = 0; i < searchedList.size(); i++) {
//				System.out.println(searchedList.get(i));
//			}
//			
//		}
//
//	}
//	
//	// 회원 이름 키워드 검색 화면
//	public void searchMemberByName() {
//		
//		System.out.println("검색한 키워드를 포함하는 이름이 있는 경우 해당 회원 정보를 나타냅니다.");
//		System.out.print("검색할 이름: ");
//		String searchedName = sc.nextLine();
//		
//		ArrayList<Member> searchedNameList = mc.searchMemberByName(searchedName);
//		
//		for(int i = 0; i < searchedNameList.size(); i++) {
//			System.out.println(searchedNameList.get(i));
//		}
//		
//	}
//	
//	// 회원 비밀번호 초기화 화면
//	public void initMemberPwd() {
//		
//		System.out.println("비밀번호를 'passwordKH@123' 으로 초기화합니다.");
//		System.out.print("비밀번호를 초기화할 아이디: ");
//		String userId = sc.nextLine();
//		
//		int result = mc.initMemberPwd(userId);
//		
//		if (result > 0) {
//			 System.out.println("성공적으로 초기화되었습니다.");
//		} else {
//			System.out.println("일치하는 아이디가 없으므로 초기화할 수 없습니다. 다시 시도하세요.");
//			initMemberPwd();
//			return;
//		}
//		
//	}
//	
//	// 회원 삭제 화면
//	public void deleteMember() {
//		System.out.println("회원을 삭제합니다.");
//		System.out.print("삭제할 회원의 아이디: ");
//		String userId = sc.nextLine();
//		
//		char answer = ' ';
//		
//		while (true) {
//		
//			System.out.print("삭제 후 복구할 수 없습니다. 정말 삭제하시겠습니까? (Y/N): ");
//			answer = sc.nextLine().toUpperCase().charAt(0);
//			
//			if(answer == 'Y') {
//				int result = mc.deleteMember(userId);
//				
//					if(result > 0) {
//						System.out.println("성공적으로 삭제되었습니다.");
//						break;
//					} else {
//						System.out.println("일치하는 아이디가 없으므로 삭제할 수 없습니다.");
//						return;
//					}
//			}
//			else if (answer == 'N') {
//				System.out.println("회원 삭제를 취소하셨습니다. 메뉴 화면으로 돌아갑니다.");
//				break;
//				
//			} else {
//				System.out.println("Y 또는 N만 입력하실 수 있습니다. 다시 입력해 주세요.");
//			}
//		}
//		
//	}

}
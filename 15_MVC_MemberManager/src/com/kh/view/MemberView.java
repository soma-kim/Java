package com.kh.view;

import java.util.Scanner;
import com.kh.controller.MemberController;

public class MemberView {
	
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		System.out.print("���̵�: ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ: ");
		String pwd = sc.nextLine();
		
		if(id.equals("admin") && pwd.equals("P@S$W0rd!")) {
			
			while(true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ȸ�� �߰�");
			System.out.println("2. ȸ�� ��ü��ȸ");
			System.out.println("3. ȸ�� ���̵� �˻�");
			System.out.println("4. ȸ�� �̸� Ű���� �˻�");
			System.out.println("5. ȸ�� ��й�ȣ �ʱ�ȭ");
			System.out.println("6. ȸ�� ����");
			System.out.println("0. ���α׷� �α׾ƿ�");
			
			System.out.println("====================");
			System.out.print("�޴� �Է�: ");
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
			 
			case 0 : System.out.println("���α׷��� �����մϴ�.");
					 return; 
			}
			
			}
			
		} else {
			// 5�� �ʰ� Ʋ���� �� ���α׷� �����Ϸ��� ���� for�� �ɱ� 
			System.out.println("�α��� ������ ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
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
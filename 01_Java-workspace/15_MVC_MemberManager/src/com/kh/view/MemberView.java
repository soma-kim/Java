package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

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
			System.out.println("========= �޴� ========");
			System.out.println("1. ȸ�� �߰�");
			System.out.println("2. ȸ�� ��ü��ȸ");
			System.out.println("3. ȸ�� ���̵� �˻�");
			System.out.println("4. ȸ�� �̸� Ű���� �˻�");
			System.out.println("5. ȸ�� ��й�ȣ �ʱ�ȭ");
			System.out.println("6. ȸ�� ����");
			System.out.println("0. ���α׷� �α׾ƿ�");
			
			System.out.println("=====================");
			System.out.print("�޴� �Է�: ");
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
			 
			case 0 : System.out.println("���α׷��� �����մϴ�.");
					 return; 
			}
			
			}
			
		} else {
			System.out.println("�α��� ������ ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
			mainMenu();
			return;
		}
	}
	
	public void insertMember() {
		System.out.println("== ���ο� ��� �߰� ==");
		System.out.print("���̵�: ");
		String userId = sc.nextLine();
		
		System.out.print("��й�ȣ: ");
		String userPwd = sc.nextLine();
		
		System.out.print("�̸�: ");
		String userName = sc.nextLine();
		
		System.out.print("����: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F): ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
		
		System.out.print("�̸���: ");
		String email = sc.nextLine();
		
		System.out.print("�޴�����ȣ: ");
		String phone = sc.nextLine();
		
		int result = mc.insertMember(userId, userPwd, userName, age, gender, email, phone);
		
		if(result > 0) {
			System.out.println("���������� �߰��Ǿ����ϴ�.");
		} else {
			System.out.println("�� �߰��� �����߽��ϴ�.");
		}

	}
	
	public void selectMemberList() {
		System.out.println("=== ��� ��� ===");
		
		ArrayList<Member> list = mc.selectMemberList();
		
		if(list.isEmpty()) {
			System.out.println("��ϵ� ����� �����ϴ�.");
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
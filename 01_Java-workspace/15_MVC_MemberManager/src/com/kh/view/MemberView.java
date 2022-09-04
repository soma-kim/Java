package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.model.vo.Member;

public class MemberView {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		for(int i = 0; i < 5; i++) {
		
		System.out.print("���̵�: ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ: ");
		String pwd = sc.nextLine();
		
			if(id.equals("admin") && pwd.equals("P@s$W0rd!")) {
				
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
				if(i != 4) {
				System.out.println(i+2 + "��° �õ��Դϴ�. �α��� ������ ���� �����Ƿ� �ٽ� �Է��� �ּ���.");
				continue;
				} else {
					System.out.println("�ټ� �� �̻� Ʋ�� ������ �Է��ϼ����Ƿ� ���α׷��� �����մϴ�.");
					return;
				}
			}
		}
		
	}
	
	// ȸ�� �߰� ȭ��
	public void insertMember() {
		System.out.println("== ���ο� ��� �߰� ==");
		System.out.print("���̵�: ");
		String userId = sc.nextLine();
		
		int idCheck = mc.idCheck(userId);
		
		if(idCheck != 0) {
			System.out.println("�̹� �����ϴ� ���̵��Դϴ�. �ٸ� ���̵� �Է��ϼ���.");
			insertMember();
			return;
		}
		
		System.out.print("��й�ȣ: ");
		String userPwd = sc.nextLine();
		
		System.out.print("�̸�: ");
		String userName = sc.nextLine();
		
		System.out.print("����: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		// ���� Ȯ�ιް�, M/F�� �ƴ� ��� �ٽ� �Է¹ޱ� ���� ������ ���� ���� �Ǻ����� while�� ����
				char gender = 0;
				
				while (true) {
				
				System.out.print("����(M/F): ");
				gender = sc.nextLine().toUpperCase().charAt(0);
				
				if(gender != 'M' && gender != 'F') {
					System.out.println("���� ��Ȯ�� �� ���ĺ� M(m) �Ǵ� F(f)���� �Է��ϼ���.");
					continue;
				}
					break;
				}
		
		System.out.print("�̸���: ");
		String email = sc.nextLine();
		
		System.out.print("�޴�����ȣ: ");
		String phone = sc.nextLine();
		
		int result = mc.insertMember(userId, userPwd, userName, age, gender, email, phone);
		
		if(result > 0) {
			System.out.println("���������� �߰��Ǿ����ϴ�.");
		} else {
			System.out.println("ȸ�� �߰��� �����Ͽ����ϴ�.");
		}

	}
	
	// ȸ�� ��ü ��ȸ ȭ��
	public void selectMemberList() {
		
		ArrayList<Member> list = mc.selectMemberList();
		
		System.out.println("��ü ȸ���� ��ȸ�մϴ�.");
		System.out.println("���� ��ϵ� ȸ���� " + list.size() + "���Դϴ�.");
		System.out.println("=== ��� ��� ===");

		
		if(list.isEmpty()) {
			
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
			
		} else {
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}

	}
	
	// ȸ�� ���̵� �˻� ȭ��
	public void searchMemberById() {
		
		System.out.println("�˻���� ȸ���� ���̵� �˻��մϴ�.");
		System.out.print("�˻��� ���̵�: ");
		String searchedId = sc.nextLine();
		
		ArrayList<Member> searchedList = mc.searchMemberById(searchedId);
		
		if(searchedList.isEmpty()) {
			
			System.out.println("��ġ�ϴ� ���̵� �����ϴ�. �ٽ� �Է��� �ּ���.");
			searchMemberById();
			return;
			
		} else {
			
			for(int i = 0; i < searchedList.size(); i++) {
				System.out.println(searchedList.get(i));
			}
			
		}

	}
	
	// ȸ�� �̸� Ű���� �˻� ȭ��
	public void searchMemberByName() {
		
		System.out.println("�˻��� Ű���带 �����ϴ� �̸��� �ִ� ��� �ش� ȸ�� ������ ��Ÿ���ϴ�.");
		System.out.print("�˻��� �̸�: ");
		String searchedName = sc.nextLine();
		
		ArrayList<Member> searchedNameList = mc.searchMemberByName(searchedName);
		
		for(int i = 0; i < searchedNameList.size(); i++) {
			System.out.println(searchedNameList.get(i));
		}
		
	}
	
	// ȸ�� ��й�ȣ �ʱ�ȭ ȭ��
	public void initMemberPwd() {
		
		System.out.println("��й�ȣ�� 'passwordKH@123' ���� �ʱ�ȭ�մϴ�.");
		System.out.print("��й�ȣ�� �ʱ�ȭ�� ���̵�: ");
		String userId = sc.nextLine();
		
		int result = mc.initMemberPwd(userId);
		
		if (result > 0) {
			 System.out.println("���������� �ʱ�ȭ�Ǿ����ϴ�.");
		} else {
			System.out.println("��ġ�ϴ� ���̵� �����Ƿ� �ʱ�ȭ�� �� �����ϴ�. �ٽ� �õ��ϼ���.");
			initMemberPwd();
			return;
		}
		
	}
	
	// ȸ�� ���� ȭ��
	public void deleteMember() {
		System.out.println("ȸ���� �����մϴ�.");
		System.out.print("������ ȸ���� ���̵�: ");
		String userId = sc.nextLine();
		
		char answer = ' ';
		
		while (true) {
		
			System.out.print("���� �� ������ �� �����ϴ�. ���� �����Ͻðڽ��ϱ�? (Y/N): ");
			answer = sc.nextLine().toUpperCase().charAt(0);
			
			if(answer == 'Y') {
				int result = mc.deleteMember(userId);
				
					if(result > 0) {
						System.out.println("���������� �����Ǿ����ϴ�.");
						break;
					} else {
						System.out.println("��ġ�ϴ� ���̵� �����Ƿ� ������ �� �����ϴ�.");
						return;
					}
			}
			else if (answer == 'N') {
				System.out.println("ȸ�� ������ ����ϼ̽��ϴ�. �޴� ȭ������ ���ư��ϴ�.");
				break;
				
			} else {
				System.out.println("Y �Ǵ� N�� �Է��Ͻ� �� �ֽ��ϴ�. �ٽ� �Է��� �ּ���.");
			}
		}
		
	}

}
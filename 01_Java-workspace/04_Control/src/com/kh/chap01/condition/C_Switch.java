package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * *Switch��: ���ǹ��� ���� ���ǹ�
	 * 		 	 ���������� ����� ���꿡 ���ؼ��� ���ǽ��� ����Ǵ� ����
	 * 
	 * [ ǥ���� ]
	 *  switch(�����γ�������񱳸��ϰ���������) {
	 *  case ��1 : �������ڵ�; // �����γ�������񱳸��ϰ��������� == ��1 << �� ��쿡�� �����
	 *  			break; // switch �߰�ȣ ������ ������
	 *  case ��2 : �������ڵ�; // �����γ�������񱳸��ϰ��������� == ��2 << �� ��쿡�� �����
	 *  			brake; // switch �߰�ȣ ������ ��������
	 * 	...
	 *  case ��n : �������ڵ�;
	 *  			break;
	 *  default : �������ڵ�; // ��1 ~ ��n���� ���� ����񱳸� �ϰ� ���� ����ڿ� �� �ϳ��� ��ġ���� ���� ��� �����
	 *  				   // else ���� �ش��
	 * 					   // ������ ���� ���������� ����Ǵ� �ڵ��̱� ������ break;�� ���� ����
	 * }
	 * 
	 * *if���� switch���� ������
	 * if(���ǽ�) => ���ǽ��� �����ϰԵ� ��� ����(������ ����), ���� ���� ���� �� 
	 * switch(����񱳴����) => ���� �񱳸� �����, Ȯ���� ���� ���Ǹ� ��� ����
	 */

	public void method1() {
		
		// 1 ~ 3 ������ ������ �Է¹޾�
		// 1�� ��� "�������Դϴ�" ���
		// 2�� ��� "�Ķ����Դϴ�" ���
		// 3�� ��� "�ʷϺ��Դϴ�" ���
		// �� �̿��� ���ڸ� �Է��� ��� "�߸� �Է��߽��ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 ������ ���� �Է�: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// ������ if�� �迭 ����
		/* if (num == 1) { // num == 1 
			System.out.println("�������Դϴ�.");
		}
		else if (num == 2) { // num == 2 
			System.out.println("�Ķ����Դϴ�.");
		}
		else if (num == 3) { // num == 3
			System.out.println("�ʷϺ��Դϴ�.");
		}
		else {
			System.out.println("�߸� �Է��߽��ϴ�.");
		} */ 
		
		// => ��� ���ǽ��� num�̶�� ������ ���� �� �������� ����񱳸� �����ϰ� ����
		
		// switch�� ����
		/*
		switch(num) {
		case 1 : System.out.println("�������Դϴ�");
				break;
		case 2 : System.out.println("�Ķ����Դϴ�");
				break;
		case 3 : System.out.println("�ʷϺ��Դϴ�");
				break;
		default : System.out.println("�߸� �Է��߽��ϴ�");
		}
		*/
		
		String result = "";
		
		switch (num) {
		case 1 : result = "������";
				break;
		case 2 : result = "�Ķ���";
				break;
		case 3 : result = "�ʷϺ�";
				break;		
		default : System.out.println("�߸� �Է��߽��ϴ�");
				return; // return���� ���� ���� ���� �޼ҵ带 ��������
						// ���� ȣ���ߴ� �κ����� ���ư��� ����
		
		}
		
		System.out.println(result + "�Դϴ�");

	}
	
	// ����
	public void method2() {
		
		/* 
		 * ����ڿ��� ������ ���ϸ�(���, �ٳ���, ������) �� �Է¹޾�
		 * �� ���ϸ����� ������ ��� (��� 1000��, �ٳ��� 2000��,������ 5000��)
		 * xx�� ������ xxxx���Դϴ�. ���(printf)
		 * ���࿡ �ٸ� ���ϸ��� �Է¹��� ��� "���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�" ���
		 */
		
		
		/* Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���ϸ��� �Է��ϼ���: ");
		String fruit = sc.nextLine();
		
		int result = 0;
		
		switch (fruit) {
		
		case "���" : result = 1000;
					break;
			
		case "�ٳ���" : result = 2000;
					break;
			
		case "������" : result = 5000;
					break;
			
		default : System.out.print("���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�");
				return;
					
		}
				
		System.out.printf("%s�� ������ %d���Դϴ�.", fruit, result);
		
		*/
		
		// if�� �迭 ���� (������ �߰� Ǯ��)
		// => ����� �� ���ڿ��� �Է¹޾������� �ұ��ϰ� �߸��� ����� ������ �̽� �߻�(������ else ��¹� ����)
		
		// �⺻ �ڷ��� (boolean, int, byte, short, long, float, double, char)�鳢��
		// ���� ��(==, !=) �� �� �̷����
		
		// ���� �ڷ��� (String)�� ����� �ϰ��� �� ��� ���� ��(==, !=)�� �� �̷������ ����
		// => stack ������ �ּҰ��� ���� ������ �ּҰ� �������� �񱳰� �̷����!!
		
		// ���ڿ� ���빰�� ���� �� �ϰ��� �� ��쿡�� equals �޼ҵ带 Ȱ���ؾ� ��
		
		// [ ǥ���� ] ���ڿ�.equals(������ϰ����ϴ¹��ڿ�);
		// => ���빰�� ��ġ�� ��� true, �ƴ� ��� false�� ������ ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���ϸ��� �Է��ϼ���: ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		if (fruit.equals("���")) { // fruit == "���" �� �˰� �𸣰� �ּҰ��� ���� �ſ���!!
			price = 1000;
		}
		else if (fruit.equals("�ٳ���")) { 
			price = 2000;
		}
		else if (fruit.equals("������")) {
			price = 5000;
		}
		else {
			System.out.println("���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�.");
			return;
		}
		
		System.out.printf("%s�� ������ %d���Դϴ�.", fruit, price);
		 
	}
		
	// break�� �� ���� ���
	public void method3() {
		
		// ����ڷκ��� Ű����� ����� �Է¹޾� �ش� ��޺��� ���� ����ϱ�
		// 1���: ���� ����, ���� ����, �б� ����
		// 2���: ���� ����, �б� ����
		// 3���: �б� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է��ϼ���: ");
		int grade = sc.nextInt();
		
		sc.nextLine();
		
		switch (grade) {
		
		case 1 : System.out.println("���� ���� �ο�");
		case 2 : System.out.println("���� ���� �ο�");
		case 3 : System.out.println("�б� ���� �ο�");
		
		}
		
		// ���� ����� �Ŀ� true�� ������ �������� �ڵ尡 ���۵�����
		// break ������ ��Ÿ�� �������� ��� ������ �Ǵ� ����
		
	}
	
	public void method4() {
		
		// ����ڷκ��� �ֹι�ȣ�� �Է¹��� �� ���� �Ǻ�
		// xxxxxx-*xxxxxx => * �κ��� ������ ��Ÿ���� �ڸ�(1, 3: ���� / 2, 4 : ����)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ �Է� (-����): ");
		String personId = sc.nextLine();
		
		// ���� �ڸ� ����
		
		char gender = personId.charAt(7);
		
		// ���� ���� ���� �� �ִ� ���ڿ� ���� ����
		String result = "";
		
		switch (gender) {
		case '1' : result = "����"; break;
		case '2' : result = "����"; break;
		case '3' : result = "����"; break;
		case '4' : result = "����"; break;
		default : System.out.println("�߸��� �ֹι�ȣ�� �Է��߽��ϴ�."); return;
		
		/* break���� ������ �������� ���������� ���ϴ� ���� �̿��� �̷� ������ �ڵ带 ���� ���� �ִ�
		 * case '1' : 
		 * case '3' : result = "����"; break; // gender == '1' || gender == '3'
		 * case '2' :
		 * case '4' : result = "����"; break; // gender == '2' || gender == '4'
		 * default : System.out.println("�߸��� �ֹι�ȣ�� �Է��߽��ϴ�."); return;
		 */
				
		}
		
		 System.out.println(result + "�Դϴ�.");
	}
	
	public void method5() {
		
		// ����ڷκ��� 1 ~ 12 ������ ���� �Է¹޾�
		// �ش� ���� ������ ��¥�� ����ϴ� ���α׷�
		// 1, 3, 5, 7, 8, 10, 12�� => 31�ϱ����Դϴ�.
		// 4, 6, 9, 11 => 30���Դϴ�.
		// 2 => 28�� �Ǵ� 29�ϱ����Դϴ�.
		// �� �̿��� => �ݵ�� 1 ~ 12�� ���̸� �Է��ؾ� �մϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12): ");
		int month = sc.nextInt();
		
		sc.nextLine();
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println("31�ϱ����Դϴ�."); break;
		case 4 :
		case 6 : 
		case 9 :
		case 11 : System.out.println("30���Դϴ�."); break;
		case 2 : System.out.println("28�� �Ǵ� 29�ϱ����Դϴ�."); break;
		default : System.out.println("�ݵ�� 1 ~ 12�� ���̸� �Է��ؾ� �մϴ�."); return;
		
		}
	} 
	
	// ����
	public void method6() {
		
		/*
		 * ����ڿ��� 1�� ~ 12�� ������ ���� �Է¹޾� �ش� �޿� �ش��ϴ� ������ ���
		 * 
		 * 3, 4, 5: "���Դϴ�."
		 * 6, 7, 8: "�����Դϴ�."
		 * 9, 10, 11: "�����Դϴ�."
		 * 12, 1, 2: "�ܿ��Դϴ�."
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��(1~12)�� �Է��Ͻÿ�: ");
		
		int month = sc.nextInt();
		
		sc.nextLine();
		
			switch(month) {
			case 3 :
			case 4 : 
			case 5 : System.out.println("���Դϴ�."); break;
			case 6 :
			case 7 :
			case 8 : System.out.println("�����Դϴ�."); break;
			case 9 :
			case 10 :
			case 11 : System.out.println("�����Դϴ�."); break;
			case 12 :
			case 2 : 
			case 1 : System.out.println("�ܿ��Դϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
				
			}
		
		}
	}


			


	
	
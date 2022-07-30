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
		
		
		Scanner sc = new Scanner(System.in);
		
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
		
	}
}

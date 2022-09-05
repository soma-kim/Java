package com.kh.chap01.condition;

import java.util.Scanner; // import ������ �߰��� �� �ִ� ����Ű: Ctrl + Shift + o

public class A_If {

	/*
	 * *�ܵ� if��: ǥ���ϰ��� �ϴ� ����� ���� �� ���� ��
	 *
	 * [ ǥ���� ]
	 * if(���ǽ�) {
	 * 		���ǽ��� true�� ��� �����ϰ��� �ϴ� �ڵ�;
	 * }
	 * => ���ǽ��� ����� true�� ���� �߰�ȣ ��� ���� �ڵ� ����
	 * => ���ǽ��� ����� false�� ��� �߰�ȣ ��� ���� �ڵ带 �ǳ� �ٰ� ����
	 */
	
	// ���� �����ڸ� ���ǹ����� �ٲ� ����
	
	public void method1() {
		
		// ����ڷκ��� �������� �Է¹��� �� ���, 0, ������ ���� ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// ���� ������ ����
		// String result = (num > 0) ? "����Դϴ�." : ((num == 0) ? "0�Դϴ�." : "�����Դϴ�.");
		
		// �ܵ� if�� ����
		if (num > 0) { // num�� ����� ���
			System.out.println("����Դϴ�.");
		}
		
		if (num == 0) { // num�� 0�� ���
			System.out.println("0�Դϴ�.");
		}
		
		if (num < 0) { // num�� ������ ���
			System.out.println("�����Դϴ�.");
		}
		
		System.out.println("�޼ҵ� ���� ����");
		
	}
	
	public void method2() {
		
		// ����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ��Ͽ� ����� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// ���׿����� ����
		// String result = (num % 2 == 0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		
		// �ܵ� if�� ����
		/*
		if ((num % 2 == 0) && (num > 0)) { // ¦���̸鼭 ����� ���
			
			System.out.println("¦���Դϴ�.");
		}
		
		// � ���̵� ���� 2�� ������ ���� �������� 0 �Ǵ� 1�� ����
		if ((num % 2 != 0) && (num > 0)) { //Ȧ���̸鼭 ����� ���
			
			System.out.println("Ȧ���Դϴ�.");
		}
		*/
		
		// ��ø if��
		if (num > 0) { // ����� ���
			
			// �� �� �� �˻�
			if (num % 2 == 0) { // ¦���� ���
				System.out.println("¦���Դϴ�.");
			}
			
			if(num % 2 != 0) { // Ȧ���� ���
				System.out.println("Ȧ���Դϴ�.");
				
			}
		}
		
		
	}
	
	public void method3() {
		
		// ����ڷκ��� ���̸� �Է¹ް� �Է��� ���̰��� ������ ��� û�ҳ�, ���� ���
		// ��� (13�� ����), û�ҳ� (19�� �̸�), ���� (19�� �̻�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		if(age <= 13) { // ����� ���
			
			System.out.println("����Դϴ�.");
			
		}
		
		if ((age > 13) && (age < 19)) { // û�ҳ��� ��� (13�� �ʰ� ������ �߰��ؾ� ��)
			
			System.out.println("û�ҳ��Դϴ�.");
			
		}
		
		if (age >= 19) { // ������ ���
			
			System.out.println("�����Դϴ�.");
		}
		
	}
	
	// ���̵� up
	public void method4() {
		
		// ����ڷκ��� �ֹε�Ϲ�ȣ �Է¹��� ��
		// ����, ���� �Ǻ� �� ��� ���
		// ���ڶ� ��Ģ����(�������)�� ���� ������ ���ڿ��� ���
		
		// ����: �ֹι�ȣ ���� (�������6��-�����ڸ�1�ڸ�xxxxxx)
		// (xxxxxx-*xxxxxx)
		
		// 1�ܰ�: �ֹι�ȣ �Է¹޾Ƽ� ������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (-����): ");
		String personId = sc.nextLine();
		
		// 2�ܰ�: �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� �ڸ��� ����
		
		char gender = personId.charAt(7);
		
		// 3�ܰ�: ���� ���� ���� ���� �ٸ� ����� ��� => ���ǹ� �̿�
		// ������ ��� '1', '3'
		// ������ ��� '2', '4'
		
		if ((gender == '1') || (gender == '3')) { // ������ ��� 
			
		System.out.println("�����Դϴ�.");
		
		}
		
		if ((gender == '2') || (gender == '4')) { // ������ ��� 
			
			System.out.println("�����Դϴ�.");
		}
		
		if ((gender != '1') && (gender != '2')
				&& (gender != '3') && (gender != '4')) { // ��ȣ�� �߸� �Է��� ���
			
			System.out.println("�߸��� �ֹε�Ϲ�ȣ�� �Է��߽��ϴ�.");
		}
	}
	
}

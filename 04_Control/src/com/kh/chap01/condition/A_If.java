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
	 * => ���ǽ��� ����� true�� ���� �߰�ȣ ���� ���� �ڵ� ����
	 * => ���ǽ��� ����� false�� ��� �߰�ȣ ���� ���� �ڵ带 �ǳ� �ٰ� ����
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
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		
		if (num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
	
	
	
	
}
package com.kh.operator;

import java.util.Scanner;

// ���� ������
public class G_Triple {
	
	/*
	 * *���� ������: 3���� �׸��� ������ �����ϴ� ������
	 * 
	 * [ ǥ���� ]
	 * ���ǽ� ? ���ǽ���true�ϰ���ǰ���� : ���ǽ���false�ϰ���ǰ����
	 * 
	 * ���ǽ�: ������ ����� true �ƴϸ� false�� ������ ��
	 *
	 */
	
	public void method1() {
		
		// ����ڰ� �Է��� �������� ������� �ƴ��� �Ǻ� �Ŀ� �׿� �´� ����� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// String result = ���ǽ� ? true�ϰ����ϴ°� : false�ϰ����ϴ°�
		
		String result = (num > 0) ? "����Դϴ�." : "����� �ƴմϴ�.";
		
		// x�� ����Դϴ�.
		// System.out.println(num + "�� " + result);
		
		//System.out.println(num + "�� " + ((num > 0) ? "����Դϴ�." : "����� �ƴմϴ�."));
		// ��������� ���׿��꺸�� �켱������ �����Ƿ�
		// ���� ���� �κ��� �켱������ ���� ��� �Ѵ�.
		
		System.out.println(num + "�� " + ((num <= 0) ? "����� �ƴմϴ�." : "����Դϴ�."));
		// ��������� ���� ����� ���������
		// ���ǿ� ���� �� ���� ����� �ٸ��Ƿ� : �������� ���ʰ� �����ʿ� ������ �ٸ� ���� �ִ�.
		
	}
	
	public void method2() {
		// ����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ� �� ����� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// String result = (num % 2 == 0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		String result = (num % 2 == 1) ? "Ȧ���Դϴ�." : "¦���Դϴ�.";
		
		System.out.printf("%d�� %s \n", num, result);
		
	}
	
	

}

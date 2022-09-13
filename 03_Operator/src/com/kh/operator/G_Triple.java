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
	
	public void method3() {
		
		// ����ڷκ��� ������ �ϳ��� �Է¹޾Ƽ� �빮������ �빮�ڰ� �ƴ��� �Ǻ� �� ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� ���� �Է�: ");
		char ch = sc.nextLine().charAt(0);
		
		// String result = (ch >= 65 && ch <= 90) ? "�빮���Դϴ�." : "�빮�ڰ� �ƴմϴ�.";
		String result = ((ch >= 'A') && (ch <= 'Z')) ? "�빮���Դϴ�." : "�빮�ڰ� �ƴմϴ�.";
		
		//System.out.println("�����ڴ� " + result);
		System.out.printf("%c�� %s", ch, result);
		
	}
	
	public void method4() {
		
		// method1�� ���� ����
		// ����ڰ� �Է��� �������� �������, 0����, �������� �Ǻ� �� �׿� �´� ����� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// ���׿����� Ư) true �ƴϸ� false�� ��� �� ������ ����
		// String result = (���ǽ�) ? true�ϰ�� : ((���ǽ�) ? true�ϰ�� : false�ϰ��);
		String result = (num > 0) ? "����Դϴ�." : ((num == 0) ? "0�Դϴ�." : "�����Դϴ�."); 
		
		System.out.println(result);
		
		// ���� ǥ���ϰ� ���� ����� ���� 3�� �̻��� ��쿡��
		// ���׿����� �ȿ� ���׿����ڸ� ��ø�ؼ� ����� �� ����!!!
	}
	
	// �ǽ� ����
	
	public void method5() {
		
		/* ����ڷκ��� ���̸� �Է¹޾Ƽ�
		 * ���̰� 13�� ���ϸ� "����Դϴ�."
		 * ���̰� 19�� �̸��̸� "û�ҳ��Դϴ�."
		 * ���̰� 19�� �̻��̸� "�����Դϴ�."
		 * 
		 * �� ����ϼ���
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		String result = (age <= 13) ? "����Դϴ�." : ((age > 18) ? "�����Դϴ�." : "û�ҳ��Դϴ�.");
		
		System.out.println(result);
		
	}
	

}
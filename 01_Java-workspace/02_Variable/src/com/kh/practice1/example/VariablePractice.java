package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		
		/* �̸�(String), ����(char), ����(int), Ű(double)�� ����ڿ��� �Է¹޾� ������ ������ ��� ����ϼ���.
		 * 
		 * ex)
		 * �̸��� �Է��ϼ���: �ƹ���
		 * ���̸� �Է��ϼ���: 20
		 * ������ �Է��ϼ���(��/��): ��
		 * Ű�� �Է��ϼ��� (cm): 180.5
		 * 
		 * Ű 180.5�� 20�� ���� �ƹ����� �ݰ����ϴ� ^^
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.print("������ �Է��ϼ���(��/��): ");
		 char gender = sc.nextLine().charAt(0);
		 
		 System.out.print("Ű�� �Է��ϼ���(cm): ");
		 double height = sc.nextDouble();
		 
		 System.out.println("Ű " + height + "�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ� ^^");
		 
	}
	
	public void method2() {
		
		/*
		 * Ű����� ���� �� ���� �Է¹޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
		 * hint: ����(+), ����(-), ����(*), ������(/)
		 * 
		 * ex)
		 * ù ��° ������ �Է��ϼ���: 23
		 * �� ��° ������ �Է��ϼ���: 7
		 * 
		 * ���ϱ� ���: 30
		 * ���� ���: 16
		 * ���ϱ� ���: 161
		 * ������ �� ���: 3
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ���: ");
		int num1  = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�� ��° ������ �Է��ϼ���: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println();
		
		System.out.println("���ϱ� ���: " + (num1 + num2));
		System.out.println("���� ���: " + (num1 - num2));
		System.out.println("���ϱ� ���: " + (num1 * num2));
		System.out.println("������ �� ���: " + (num1 / num2));
		
	}
	
	public void method3() {
		/* 
		 * Ű����� ����, ���� ���� �Ǽ������� �Է¹޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���
		 * 
		 * ����
		 * ���� = ���� * ����, �ѷ� = (����+����)*2
		 * 
		 * ex)
		 * ����: 13.5
		 * ����: 41.7
		 * 
		 * ����: 562.95
		 * �ѷ�: 110.4
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���̸� �Է��ϼ���: ");
		double width = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� ���̸� �Է��ϼ���: ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.println();
		
		System.out.println("����: " + (width * height));
		System.out.println("�ѷ�: " + (width + height) *2);

	}
	
	public void method4() {
		/*
		 * ���� ���ڿ� ���� Ű����� �Է¹޾� ���� ���� �� ���� ����ϼ���
		 * hint: charAt(�ε���) �޼ҵ� Ȱ���� ����
		 * 
		 * ex)
		 * ���ڿ��� �Է��ϼ���: apple
		 * 
		 * ù ��° ����: a
		 * �� ��° ����: p
		 * �� ��° ����: p
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���ڿ��� �Է��ϼ���: ");
		String str = sc.nextLine();
		
		System.out.println("ù ��° ����: " + str.charAt(0));
		System.out.println("�� ��° ����: " + str.charAt(1));
		System.out.println("�� ��° ����: " + str.charAt(2));
		
	}

}

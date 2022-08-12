package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			System.out.println("�����");
		}
		else {
			System.out.println("����� �ƴϴ�");
		}
	}
		
		public void practice2() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("����: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num > 0) {
				System.out.println("�����");
			}
			else {
				if(num == 0) {
					System.out.println("0�̴�");
				}
				else {
					System.out.println("������");
				}
		}
	
	}
		
		public void practice3() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("����: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if (num % 2 == 0) {
				System.out.println("¦����");
			}
			else {
				System.out.println("Ȧ����");
			}
		}
		
		public void practice4() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�ο� ��: ");
			int person = sc.nextInt();
			sc.nextLine();
			
			System.out.print("���� ��: ");
			int candy = sc.nextInt();
			sc.nextLine();
			
			System.out.println("1�δ� ���� ����: " + candy / person);
			System.out.println("���� ���� ����: " + candy % person);
			
		}
		
		public void practice5() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�̸�: ");
			String name = sc.nextLine();
			
			System.out.print("�г�(���ڸ�): ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("��(���ڸ�): ");
			int class_ = sc.nextInt();
			sc.nextLine();
			
			System.out.print("��ȣ(���ڸ�): ");
			int no = sc.nextInt();
			sc.nextLine();
			
			System.out.print("����(M/F): ");
			char gender = sc.nextLine().charAt(0);
			
			if(gender == 'F' || gender == 'f') {
				gender = '��';
			}
			else {
				gender = '��';
			}
			
			System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����): ");
			double score = sc.nextDouble();
			sc.nextLine();
			
			System.out.println(grade + "�г� " + class_ + "�� " + no + "�� " + name + " " + gender + "�л��� ������ " + score + "�̴�.");

		}
		
		public void practice6() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("����: ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			if(age > 0) {
				if (age <= 13) { 
					System.out.println("���");
				}
				else if (age <= 19) {
					System.out.println("û�ҳ�");
				}
				else {
					System.out.println("����");
				}
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���");
			}

		}
		
		public void practice7() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("����: ");
			int score1 = sc.nextInt();
			
			System.out.print("����: ");
			int score2 = sc.nextInt();
			
			System.out.print("����: ");
			int score3 = sc.nextInt();
			
			System.out.println();
			
			int sum = score1 + score2 + score3;
			double avg = (score1 + score2 + score3)/3.0;
			
			System.out.println("�հ�: " + sum);
			System.out.println("���: " + avg);
			
			if(score1 >= 40 && score2 >= 40 && score3 >= 40 && avg >= 60) {
				System.out.println("�հ�");
			}
			else {
				System.out.println("���հ�");
			}
			
		}
		
		public void practice8() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����): ");
			 String id = sc.nextLine();
			 
			 if(id.charAt(7) == '2' || id.charAt(7) == '4') {
				 System.out.println("����");
			 }
			 else if(id.charAt(7) == '1' || id.charAt(7) == '3') {
				 System.out.println("����"); 
			 }
			 else {
				 System.out.println("�ٽ� �Է��ϼ���");
			 }
			
		}
		
		public void practice9() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("����1: ");
			int num1 = sc.nextInt();
			
			System.out.print("����2: ");
			int num2 = sc.nextInt();
			
			System.out.print("�Է�: ");
			int testNum = sc.nextInt();
			
			boolean result = (testNum <= num1 || testNum > num2);
			
			System.out.println();
			
			System.out.println(result);
				
		}
		
		public void practice10() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�Է�1: ");
			int num1 = sc.nextInt();
			
			System.out.print("�Է�2: ");
			int num2 = sc.nextInt();
			
			System.out.print("�Է�3: ");
			int num3 = sc.nextInt();
			
			boolean result = (num1 == num2) && (num1 == num3) && (num2 == num3);
			
			System.out.println(result);
			
		}

}

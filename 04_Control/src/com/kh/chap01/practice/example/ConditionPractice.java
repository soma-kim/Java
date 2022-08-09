package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch (num) {
		case 1 : System.out.println("�Է� �޴��Դϴ�.");
				break;
		case 2 : System.out.println("���� �޴��Դϴ�.");
				break;
		case 3 : System.out.println("��ȸ �޴��Դϴ�.");
				break;
		case 4 : System.out.println("���� �޴��Դϴ�.");
				break;
		case 9 : System.out.println("���α׷��� ����˴ϴ�.");
				break;
		default : System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		
		}
	
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ���: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num <= 0) {
			System.out.println("����� �Է��� �ּ���");
		}
		else {
			if(num % 2 == 0) {
				System.out.println("¦����");
			}
			else {
				System.out.println("Ȧ����");
			}
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������: ");
		int score1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��������: ");
		int score2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��������: ");
		int score3 = sc.nextInt();
		sc.nextLine();
		
		if ((score1 + score2 + score3) / 3 >= 60 && score1 >= 40 && score2 >= 40 && score3 >= 40) {

			System.out.println("����: " + score1);
			System.out.println("����: " + score2);
			System.out.println("����: " + score3);
			System.out.println("�հ�: " + (score1 + score2 + score3));
			System.out.println("���: " + (score1 + score2 + score3) / 3);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
			}
		else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է�: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch (num) {
		case 3 :
		case 4 :
		case 5 : System.out.println("���Դϴ�.");
				break;
		case 6 :
		case 7 :
		case 8 : System.out.println("�����Դϴ�.");
				break;
		case 9 :
		case 10 :
		case 11 : System.out.println("�����Դϴ�.");
				break;
		case 12 :
		case 1 :
		case 2 : System.out.println("�ܿ��Դϴ�.");
				break;
		default : System.out.println(num + "���� �߸� �Էµ� ���Դϴ�.");
		
		}
		
	}
	
	public void practice5() {
		
		String id = "kim";
		int pwd = 1234;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵�: ");
		String inputId = sc.nextLine();
		
		System.out.print("��й�ȣ: ");
		int inputPwd = sc.nextInt();
		sc.nextLine();
		
		if(inputId.equals(id)) {
			if(inputPwd == pwd) {
			System.out.println("�α��� ����");
			}
			else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
			}
		}
		else {
			if(inputPwd == pwd) {
				System.out.println("���̵� Ʋ�Ƚ��ϴ�");
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���: ");
		String grade = sc.nextLine();
		
		/* Ǯ�� 1
		switch (grade) {
		case "������" : System.out.print("ȸ������, �Խñ� ���� \n�Խñ��ۼ�, ����ۼ� \n�Խñ� ��ȸ");
						break;
		case "ȸ��" : System.out.print("�Խñ��ۼ�, ����ۼ� \n�Խñ� ��ȸ");
						break;
		case "��ȸ��" : System.out.print("�Խñ� ��ȸ");
						break;
		default : System.out.println("�߸� �Է��߽��ϴ�.");
		}
		*/
		
		// Ǯ�� 2
		
		String gradeAdmit = "ȸ������, �Խñ� ���� \n�Խñ��ۼ�, ����ۼ� \n�Խñ� ��ȸ";
		String gradeMem = "�Խñ��ۼ�, ����ۼ� \n�Խñ� ��ȸ";
		String gradeUnmem = "�Խñ� ��ȸ";
		
		switch (grade) {
		case "������" : System.out.println(gradeAdmit);
						break;
		case "ȸ��" : System.out.println(gradeMem);
						break;
		case "��ȸ��" : System.out.println(gradeUnmem);
						break;
		default : System.out.println("�߸� �Է��߽��ϴ�.");
		}
	}
		
		public void practice7() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Ű: ");
			double height = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("������: ");
			double weight = sc.nextDouble();
			sc.nextLine();
			
			double BMI = weight / (height * height);
			
			System.out.println("BMI ����: " + BMI);
			
			if(BMI < 18.5) {
				System.out.println("��ü��");
			}
			
			else if(BMI < 23) {
				System.out.println("����ü��");
			}
			
			else if(BMI < 25) {
				System.out.println("��ü��");
			}
			
			else if(BMI < 30) {
				System.out.println("��");
			}
			
			else {
				System.out.println("�� ��");
			}
			
		}
		
		public void practice8() {
			
			
			
		}
		

}

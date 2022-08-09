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
		} else {
			if(num % 2 == 0) {
				System.out.println("¦����");
			} else {
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
		} else {
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
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է�: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ǿ�����2 �Է�: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%): ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		} else {
			switch (op) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			case '%' :
				result = num1 % num2;
				break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			
			System.out.printf("%d %c %d = %d", num1, op, num2, result);
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ����: ");
		double score1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("�⸻ ��� ����: ");
		double score2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� ����: ");
		double score3 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("�⼮ ȸ��: ");
		double score4 = sc.nextDouble();
		
		System.out.println("==========���==========");
		
		double result = (score1 * 0.2) + (score2 * 0.3)
						+ (score3 * 0.3) + score4;
		
		if(score4 < (20*0.7)) {
			System.out.printf("FAIL [�⼮ Ƚ�� ����] (%d/20)", (int)(score4));
			System.out.println();
		} 
		
		if(result < 70) {
			System.out.println("FAIL [���� �̴�] (���� " + result + ")");
			return;
		}
		
		if(result >= 70 && score4 >= (20*0.7)) {
			System.out.println("�߰� ��� ����(20): " + score1 * 0.2);
			System.out.println("�⸻ ��� ����(30): " + score2 * 0.3);
			System.out.println("���� ����(30): " + score3 * 0.3);
			System.out.println("�⼮ ����(20): " + score4);
			System.out.println("����: " + result);
			System.out.println("PASS");	
		}
		
	}
	
	public void practice10() {
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		System.out.print("����: ");
		
		Scanner sc = new Scanner(System.in);
		int selectMenuNo = sc.nextInt();
		sc.nextLine();
		
		switch (selectMenuNo) {
		case 1 :
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			practice5();
			break;
		case 6 :
			practice6();
			break;
		case 7 :
			practice7();
			break;
		case 8 :
			practice8();
			break;
		case 9 :
			practice9();
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� ������ �ּ���.");
			practice10();
			break;
		}
		
	}
	
	
		

}

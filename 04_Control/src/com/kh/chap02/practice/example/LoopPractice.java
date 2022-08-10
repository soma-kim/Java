package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	public void method2() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
			method2();
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void method4() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			method4();
		}
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}
		}
		System.out.println(" = " + sum);
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ����: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� ��° ����: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ��� �Է��� �ּ���.");
		}
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void method7() {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ����: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� ��° ����: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		/* �� Ǯ
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է��� �ּ���.");
			method7();
		}
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
		*/
		
		// �� Ǯ��
		
		if(num1 > num2) {
			int temp = 0;
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		for(int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
	
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("=====" + num + "�� =====\n");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
			// System.out.printf("%d * %d = %d", num, i, (num*i));
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 2 && num <= 9) {
			for(int i = num; i <= 9; i++) {
				System.out.printf("=====%d��=====\n",i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
			}
		} else {
				System.out.println("2~9 ������ ���ڸ� �Է��� �ּ���.");
		}
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 2 && num <= 9) {
			for(int i = num; i <= 9; i++) {
				System.out.printf("=====%d��=====\n",i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
			}
		} else {
				System.out.println("2~9 ������ ���ڸ� �Է��� �ּ���.");
				method10();
		}
	}


	
	public void method11() {
		
		/* ����ڷκ��� ���� ���ڿ� ������ �Է¹޾�
		* ������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���
		* ��, ��µǴ� ���ڴ� �� 10���Դϴ�.
		*
		* '����'�� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�
		* ex) 2, 7, 12, 17, 22, ...
		*      5   5   5   5 => ���⼭ ������ 5
		* (for�� �̿�)
		* ex.
		* ���� ����: 4
		* ����: 3
		* ��¹�: 4 7 10 13 16 19 22 25 28 31
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������ �Է��ϼ���: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(num1 + (num2*i) + " ");
			
			// System.out.print(num1 + (i-1) * num2 + " "); //  ����� �������� �̰��� Ǯ�̹� ��¾�� ��¥ ���־�
			
		}
	}
	
	/* ������ �Է¿� ��exit����� ���� ���� ������ ���� �ݺ��ϸ�
	exit�� ������ �����α׷��� �����մϴ�.���� ����ϰ� �����մϴ�.
	���� �����ڰ� �������̸鼭 �� ��° ������ 0���� ������
	��0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.���� ����ϸ�,
	���� �����ڰ� ���� �� ������ �������Դϴ�. �ٽ� �Է����ּ���.����� ����ϰ�
	�� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
	*/

	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		while (true) { // ���� �ݺ��� ���� true ������ �ɰ� while�� ��
		
			System.out.print("������(+, -, *, /, %): ");
			String op = sc.nextLine(); // ������ String������ �Է¹ޱ�(�䱸����)
			
			if(op.equals("exit")) { // ���ڿ� �񱳴� .equals
				System.out.println("���α׷��� �����մϴ�.");
				return; // ���α׷� ����
			}				
			
			// ����1 �Է¹ް� ���� ����
			System.out.print("����1: ");
			int num1 = sc.nextInt();
			sc.nextLine();
			
			// ���� 2 �Է¹ް� ���� ����
			System.out.print("����2: ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			// �����ڰ� /�̸鼭 ����2�� 0�� �� ����ϰ� ó������ ���ư� �����ں��� �ٽ� �Է�( == �޼ҵ� �����)
			if(op.equals("/") && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է��� �ּ���.");
				method12();
			}
			
			// num1, num2 ������ ���� ���� ����
			int result = 0;
			
			// �� �����ڿ� ���� ������ �����Ͽ� ������� result ������ ���
			switch (op) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" : 
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
			default : // ���õ��� ���� ������ �Է� �� ��¹� ��� ó������ ���ư� �����ں��� �ٽ� �Է� (== �޼ҵ� �����)
				System.out.println("���� �������Դϴ�. �ٽ� �Է��� �ּ���.");
				method12();
			}
		
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result); // ��¹� ��
			
		}
		
	}

}

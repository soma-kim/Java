package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
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

}

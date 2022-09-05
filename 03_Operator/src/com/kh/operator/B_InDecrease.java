package com.kh.operator;

// ���� ������
public class B_InDecrease {
	
	/*
	 * ���� ������: ���� �����ڷν� ���� 1���� ������Ű�ų� Ȥ�� ���ҽ�Ű�� ������
	 * 
	 * [ ���� ]
	 * ++: ���� 1�� ������Ű�� ������
	 * 		++��(���� ������)
	 * 		��++(���� ������)
	 * 
	 * --: ���� 1�� ���ҽ�Ű�� ������
	 * 		--��(����������)
	 * 		��--(����������)
	 * 
	 * (���� ������)��: �������� => �� ���� �� ó��
	 * ��(���� ������): �������� => �� ó�� �� ����
	 */
	
	public void method1() {
		
		int num = 10;
		
		System.out.println("num: " + num);
		
		num++; // num�� 1�� ������Ű�ڴ�
			   // num = num + 1; �� ���� �ǹ�
		
		System.out.println("����� num: " + num);
		
		int num2 = 10;
		
		System.out.println("num2: " + num2);
		
		num2--; // num2�� 1�� ���ҽ�Ű�ڴ�
				// num2 = num2 - 1; �� ���� �ǹ�
		
		System.out.println("����� num2: " + num2);
	}
	
	public void method2() {
		
		// ++ ��������
		// ���� ����: �� ���� �� ó��
		int a = 10; // �� ���������� a�� ���� 10
		int b = ++a; // a�� ���� �켱������ 1 ���� �� b�� ����
		
		System.out.println("a: " + a + ", b: " + b); // a: 11, b: 11
		
		// ��������: �� ó�� �� ����
		int c = 10; // �� ���������� c�� ���� 10
		int d = c++; // �켱������ d�� c�� ���� ���Եǰ� ���� c�� 1 ����
		// ���������� ���̸� �ϴ� ����� ������!
		// int d = c; �� ����� ���� ++ ����� c = c+1 = 11�� �����ϱ�
		
		System.out.println("c: " + c + ", d: " + d); // c: 11, d: 10

	}
	
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ * 3;
		
		// ���������ڴϱ� ����� ������ ���� result1: 60
		// ��� �� ���������� ����� ����ϸ� num1: 21
		
		System.out.println("num1: " + num1); // 21
		System.out.println("result1: " + result1); // 60
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		// ���������ڴ� ���� �ʿ� ����! num2: 21
		// result2 = 21 * 3 = 63
		
		System.out.println("num2: " + num2); // 21
		System.out.println("result2: " + result2); // 63
		
		// ���: ���� ������ ���� ���� �ϴ� ���� �����ϰ� ó���� �� ���� ó���� ���� �츮��!
	}
	
	// ����
	public void method4() {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		int d = c / a;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		
		// a = 5; -> 6 -> 7
		// b = 10; -> 9
		// c = 16; -> 15
		// d = 2; -> 1
		// e = 4; -> 5 -> 6
		// f = 4;
		// g = 9 + 2 = 11; -> 10
		// h = 2
		// i = 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
		//	 = 6 + 9 / 3 * 10 % 8
		//	 = 6 + 9 / 3 * 10 % 8
		//	 = 6 + 3 * 10 % 8
		//	 = 6 + 30 % 8
		//	 = 6 + 6
		//	 = 12
		
		
		System.out.println(a); // 7
		System.out.println(b); // 9
		System.out.println(c); // 15
		System.out.println(d); // 1
		System.out.println(e); // 6
		System.out.println(f); // 4
		System.out.println(g); // 10
		System.out.println(h); // 2
		System.out.println(i); // 12
				
	}
}

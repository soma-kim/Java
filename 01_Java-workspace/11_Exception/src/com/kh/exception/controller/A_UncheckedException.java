package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

//	����� ���� ������ ������(RuntimeException �ڽ� Ŭ������) �� ���� ����ó��: UncheckedException
public class A_UncheckedException {
	
	/*
	 * RuntimeException
	 * - ���α׷� ���� �� �߻��Ǵ� ���ܵ�
	 * 
	 * *RuntimeException�� �ڽ� Ŭ������
	 * - ArraysIndexOutOfBoundsException: �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
	 * - NegativeArraySizeException: �迭�� ũ�⸦ ������ ������ ��� �߻��ϴ� ����
	 * - ClassCastException: �������� ����� ��Ȳ���� �� ��ȯ�� �߸����� �� �߻��ϴ� ����
	 * - NullPointerException: ������������ ���� null�ӿ��� �ұ��ϰ� �����Ϸ��� �� �� �߻��ϴ� ����
	 * - ArithmethicException: ������ ���� �� 0���� ���� �� �߻��ϴ� ����
	 * - ...
	 * 
	 * => �̷��� RuntimeException�� ���õ� ���ܵ��� ����� ���� �����ϱ� ������
	 * 	    ���� ��ü�� ���ʿ� �߻��� �� �ǰԲ� "���ǹ�"���� �ذ� �����ϱ� �� (��ó��)
	 * 	    ���� ����ó�� (���ܰ� �߻����� �� ������ ������ ������ �δ� ��ó��) �� �� �ʿ䰡 ����
	 */
	
	// ��ĳ�� ��ü�� ���������� ����
	// => �� Ŭ���� ������ ��� �޼ҵ忡�� ������ �� �� �ְԲ� �� �� ��
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// ArithmeticException: ������ ���� �� 0���� ���� �� �߻��ϴ� ����
		
		// ����ڷκ��� �� ���� �������� �Է¹޾� ������ ������ ���
		System.out.print("ù ��° ����: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� ��° ����(0 ����): ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// int result = num1 / num2;
		// System.out.println("������ ���� ���: " + result);
		
		// �ذ���1. ���ǹ����� ó��(���ʿ� ���� ��ü�� �߻����� �ʰԲ� if������ ���� �˻� �� ��� ����)
		//			=> ���� ó���� �ƴ�

		/*
		if(num2 != 0) {
			int result = num1 / num2;
			System.out.println("������ ���� ���: " + result);
		}
		else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("���α׷� ����");
		*/
		
		// �ذ���2. ����ó�� �������� �ذ�
		//			=> ���ܰ� �߻����� ��츦 ����ؼ� ������ ������ ������ �δ� ��
		/*
		 * try ~ catch��
		 * 
		 * [ ǥ���� ]
		 * try {
		 * 		������ �ڵ� (���ܰ� �߻��� ���� ������ ���ԵǾ� ����);
		 * } catch(�߻��ҿ���Ŭ������ ������) {
		 * 		�ش� ���ܰ� �߻��� ��� ������ ����;
		 * }
		 */
		
		try {
			
			int result = num1 / num2; // ������ ����� �� �������� ����
			System.out.println("������ ���� ���: " + result); // ������ ����� �� ���� ���� X
			
		} catch(ArithmeticException e) { // ����Ŭ������� ���� �������
			System.out.println("0���� ���� �� �����ϴ�."); // �� ������ ������ O (== ����ó��)
			
			e.printStackTrace(); // ������ ������ �� ����
			// ���� ���ܰ� ��� �߻��ߴ��� �˷� ��

//			���� ����
//			java.lang.ArithmeticException: / by zero
//			at com.kh.exception.A_UncheckedException.method1(A_UncheckedException.java:75) // �д� ���� �� ��°: �� �����̾�
//			at com.kh.exception.run.ExceptionRun.main(ExceptionRun.java:34) // �д� ���� ù ��°: �̰� ȣ���� �� ������ ����
		}
		
		System.out.println("���α׷� ����"); // ����ó�� �� �� ���� ���� O
		
		// => if���� ��ó��, try ~ catch���� ��ó���̱� ������ if���� �� �����ϱ�� ��!

	}
	
	public void method2() {
		
		System.out.println("���� �Է� (0����): ");
		
		try {
			
			int num = sc.nextInt(); // InputMismatchException�� �߻��� ���� ����(���� �̿��� ���� �Է��� ���)
			sc.nextLine();
			
			int result = 10 / num; // ArithmeticException �� �߻��� ���� ����
			
			System.out.println("������ ���: " + result);
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch(InputMismatchException e) {
			System.out.println("������ ����� �Է��ؾ� �մϴ�.");
		} // ���� catch ��: ���ܰ� ���� �� �߻��� ���ɼ� ~~~~~~~~~~~

		
		System.out.println("���α׷� ����");
	}
	
	public void method3() {
		
		// ArrayIndexOutOfBoundException: �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
		
		// NegativeArraySizeException: �迭�� ũ�⸦ ������ ������ ��� �߻��ϴ� ����
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		// if���� �̿��� ���
		/*
		if(size > 101) {
		int[] arr = new int[size]; // NagativeArraySizeException�� �߻��� ���� ���� (����ڰ� ������ �Է��� ���� ����)
		
		System.out.println("100�� �ε��� ��: " + arr[100]); // ArrayIndexOutOfBoundsException�� �߻��� ���� ����(����ڰ� 100 ������ ���� �Է��� ���� ����)
		}
		
		System.out.println("���α׷� ����");
		*/
		
		// try ~ catch���� �̿��� ���
		/*
		try {
			
			int[] arr = new int[size];
			System.out.println("100�� �ε��� ��: " + arr[100]);
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭�� ũ��δ� ������ ������ �� �����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ε����� �����߽��ϴ�.");
		}
		System.out.println("���α׷� ����");
		*/
		
		/*
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε�����: " + arr[100]);
		} catch (RuntimeException e) { // ������ �����ؼ� NegativeArraySizeException, ArrayIndexOutOfBoundsException��
									   // �θ� Ÿ���� RuntimeException�� �̿��ؼ� ���� Ŭ���� ó�� ����
			System.out.println("���ܰ� �߻��ϱ� ����... �迭�� ũ�⸦ ������ �Է��߰ų� �������� �ε����� ��������...");
			System.out.println("���α׷� �����Ұ�...");
			// ���� catch ����� �پ ���ϱ� ������
			// � ������ �߻��ߴ��� ��Ȯ�ϰ�(�������ϰ�) �ľ��� �� ���� ������ ����

		 */
		
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� ��: " + arr[100]);
			
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭�� ũ��δ� ������ ������ �� �����ϴ�.");

		} catch (RuntimeException e) {
			System.out.println("���ܰ� �߻��ϱ� ����");

		}
		// �������� �����ؼ� �θ� ���� Ŭ������ �ڽ� ���� Ŭ������ catch���� �������� �ۼ��Ϸ���
		// => ������ ���� �ڽ� Ÿ���� ���� Ŭ������ ���� ����ؾ� ��
		
	}
	
	/*
	 * RuntimeException ���õ� ���ܴ�
	 * - ���ǹ����� �ذ� ����: ���� ��ü�� �߻� �� �ǰԲ� �����ڰ� �ҽ� �ڵ�� �ڵ鸵 ����(���� ó���� �ƴ�!!)
	 * 					  => ������ ����
	 * - ����ó���������� �ذ� ����: ���ܰ� �߻����� ���� ����ؼ� �׶� ������ ������ ������ �δ� ��
	 * 					 	  => ������ ����
	 * 
	 * ������ ������ ��Ȳ: ���ǹ����� �ذ�(�� �����ϴ� ���)
	 * ������ �Ұ����� ��Ȳ: ������ ����ó���������� �ذ��� ���ۿ� ����
	 * 
	 * => RuntimeException �迭�� ��� ����� ���� ������ ��Ȳ�̱� ������
	 * 	   ���ǹ����� �ذ��ϴ� ���� ������
	 * 	   ��, ����ó�������� �ۼ��ϴ� ���� �ʼ��� �ƴ� => "Unchecked Exception"
	 */

	

}

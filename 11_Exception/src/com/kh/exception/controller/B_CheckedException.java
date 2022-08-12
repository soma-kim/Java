package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� �Ұ����� ���ܵ�(IOException�� �ڽ� Ŭ������)�� ���� ����ó��: CheckedException 
public class B_CheckedException {
	
	/*
	 * *CheckedException�� �ݵ�� ����ó���� �ؾ� �ϴ� ���ܵ�
	 *  (��, ���� �Ұ��� ������ �߻��ϱ� ������ �̸� ���� ó�� ������ �ۼ��ؾ� ��)
	 *  => �ַ� ����� �ƴ� �ܺ� ��ü�� � "�����"�̶�� ������ ��Ÿ�� �� �ַ� �߻���
	 */
	
	public void method1() {
		
		method2();
	}
	
	public void method2() {
		
		// Scanner �� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü (��, �� ��ü�� ���ڿ��θ� ���� ���� == �̳� ���� �����̶�)
		// => IOException�� �߻��� ���� ��Ȳ ������ ������
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // import
		
		System.out.print("�ƹ� ���ڿ��̳� �Է��ϼ���: ");
		// String str = br.readLine(); // ���� �� �� ������ �Է¹ްڴ�
		// �� �޼ҵ带 ȣ�� �� IOException�� �߻��� ���� ������ ������ ������ �˷� ��(���� ����)
		// => ���� ���� �߸� �������� �� ��!
		//	    ��, �����ϰ� ������ ���� ó�� �ϰ� ������Ѷ�!
		
		// 1. try ~ catch��: ���ܰ� �߻��� ���� �ڵ尡 �ִ� �� �ڸ� �״�� �ٷ� ���⿡�� ���ܸ� ó���ϰ���
		/*
		try {
			
			String str = br.readLine();
			System.out.println("���ڿ��� ����: " + str.length());
		} catch(IOException e) { // import �� �ֱ�
								 // IOException�� ���� �߻����� ��
			System.out.println("���� �߻���");
		}
		*/
		
		// 2. throws: ���ѱ��, �����ϱ�
		
	}

}

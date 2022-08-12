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
	
	public void method1() throws IOException { // �굵 ���ѱ�ٸ�? method1�� ����ó���� method1�� ȣ���� b.method1(); (== RunŬ������ ���� �޼ҵ�)�� ����ó�� �ؾ� ��
		/*
		try {
			method2();
		} catch (IOException e) {
			System.out.println("���� �߻���"); // method2�� ���ѱ� ���� ó���� �ݵ�� �̷��� try ~ catch������ �޾� ��� ��
		}
		*/
		
		method2(); // public void method1() "throws IOException" { // ���� ���� ���� ���� �����

	}
	
	// throws ���
	public void method2() throws IOException {
		
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
		//			    ���� ���⼭ ���ܸ� �ٷ� ó������ �ʰ� ���� �� �޼ҵ带 ȣ���� ������ ���ѱ�ڴٶ�� ��
		
		String str = br.readLine(); // public void method2() "throws IOException" { // �� �߰��ϴ� ���� �� ������ method2()�� ȣ���� method1()���� ���ѱ�� ��
									// ��, be.readLine()������ ���� ������ ������� method1�� ���� ������ ����!
		System.out.println("���ڿ��� ����: " + str.length());
		
	}

}

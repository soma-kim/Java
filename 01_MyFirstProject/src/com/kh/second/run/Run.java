package com.kh.second.run;

import com.kh.second.MethodTest; // �ش� ��Ű���� �ִ� Ŭ������ �� Ŭ���� ���� �ȿ��� ������ ���ڴ�. **40��~ �ذ��� 2)**

// com.kh.second.run.Run
public class Run {
	
	// �� Ŭ�������� �� ��: ������ ���� main �޼ҵ� �����
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����"); // ��¹��� ������ �޼ҵ�
		
		// �ٸ� �޼ҵ带 ȣ���� ����
		
		/*
		 * *�޼ҵ� ȣ�� ���
		 * 1. ���� ���� Ŭ���� �ȿ� �����ϴ� �޼ҵ带 ȣ���� ���
		 * => ȣ���ϰ����ϴ¸޼ҵ��();
		 * 
		 * 2. ���� �ٸ� Ŭ���� �ȿ� �����ϴ� �޼ҵ带 ȣ���� ���
		 * 
		 */
		
		 // testPrintA();
		 // The method testPrintA() is undefined for the type Run: ���� Ŭ���� �ȿ� ���ǵ� �޼ҵ尡 �ƴ�

		
		// 1) ���� ȣ���� �޼ҵ尡 �����ϴ� Ŭ������ ���� (new) �̶�� �� �ؾ� ��
		// [ ǥ���� ] Ŭ������ �뺯���̸� = new Ŭ������();
		// MethodTest mt = new MethodTest();
		// MethodTest cannot be resolved to a type: Run�� run ��Ű�� �ȿ� �ִµ� MethodTest�� run ��Ű�� �ٱ��� ����
		
		// => �⺻������ ���� ���� ��Ű�� ���� �ش� �̸��� ���� Ŭ������ ã��
		// 	    �ٸ� ��Ű���� �����ϴ� Ŭ�����̱� ������ MethodTest�� ã�� ����
		
		// �ذ� ��� 1) �ش� Ŭ������ ��Ȯ�� ��� ��Ű���� �ִ� Ŭ�������� Ǯ Ŭ�������� ���
		// com.kh.second.MethodTest mt = new com.kh.second.MethodTest();
		// => �ʹ� ��ٴ� ���� ����
		
		// �ذ� ��� 2) �׳� Ŭ�������� ������ ���� ������ �ۼ��ϵ�,
		//			  �� Ŭ������ � ��Ű���� ���� �ִ��� ������ �߰� => �ַ� ���̴� ���
		MethodTest mt = new MethodTest();
		
		// 2) �뺯���̸��� ���� �� ���� �ش� Ŭ������ �ִ� �޼ҵ带 ȣ��
		// [ ǥ���� ] �뺯���̸�.ȣ���ϰ����ϴ¸޼ҵ��();
		mt.testPrintA();
		
		
	}
}

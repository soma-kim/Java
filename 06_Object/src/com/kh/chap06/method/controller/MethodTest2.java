package com.kh.chap06.method.controller;

public class MethodTest2 {
	
	// static �޼ҵ�
	// => ȣ���� �� ��ü�� ������ �ʿ䰡 ����
	public static void method1() {
		
		System.out.println("�Ű������� ��ȯ���� ���� static �޼ҵ�");
	}
	
	public static String method2() {
		
		return "�Ű������� ������ ��ȯ���� �ִ� static �޼ҵ�";
	}
	
	// �Ű� ������ ������ ��ȯ���� ���� static �޼ҵ�
	public static void method3(String name, int age) {
		
		// xx���� xxx �� ȯ���մϴ�.
		
		System.out.println(age + "���� " + name + " �� ȯ���մϴ�.");
	}
	
	public static int method4(int num1, int num2, char op) {
		
		/* ���� ����!!! switch ���� if ���� �̿��ؼ�
		 * return; ���� ����� �� �ֵ��� Ǯ�� ���ÿ�
		switch(op) {
		case '+': +;
			break;
		
		
		}
		*/
		
		// op: ������
		// => ������ ����(+, -, *, /, %)�� ���� ���� ����� return
		
		// return; //This method must return a result of type int: ������ return �ڷ��� �� �־� ��� ��! ���� �� ®�ٰ� �� ������ ���� ��!
		// ��ȯ �ڷ����� ���ϵǴ� ���� �ڷ����� �׻� ���� ��� ��
		
		return num1 + num2;
	}

}

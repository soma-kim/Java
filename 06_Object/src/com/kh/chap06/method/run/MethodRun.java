package com.kh.chap06.method.run;

import com.kh.chap06.method.controller.MethodTest1;
import com.kh.chap06.method.controller.MethodTest2;

public class MethodRun {

	public static void main(String[] args) {
		
		// 1. MethodTest1 Ŭ���� �׽�Ʈ
		
		MethodTest1 m1 = new MethodTest1();
		
		m1.method1();
		
		System.out.println("-------------------------");
		
		// m1.method2(); // �Ű������� ���� ��ȯ���� �ִ� �޼ҵ��Դϴ�.
		// ��� ��¹��� ����! int������ m1.method1()�� ���� ������ ������ �ش� ���� ����� ��¹��� ���� ����!
		
		// int random = m1.method2();
		//�̷��� �ڷ����� ���缭 random���� �ҷ��� ������ ������ �� �ڿ�
		//System.out.println("������: " + random);
		// ��¹��� �ۼ������ν� ������ ��� ��������
		
		// Ȥ�� �̷��� �� ť�ε� ��� ����!
		System.out.println("������: " + m1.method2());
		
		System.out.println("-------------------------");
		
		m1.method3(20, 10);
		// �Ű������� ���� ���� ��쿡��
		// ȣ�� ���� ���ް��� ����, ����, �ڷ����� ��Ȯ�� ��ġ�ؾ� ��
		
		System.out.println("-------------------------");
		
		// int result = m1.method4(42, 2);
		// System.out.println("�� ���� ��: " + result); // ó�� ����� �ְų�
		
		System.out.println(m1.method4(42, 2)); // ó�� ����� �ְų�
		
		// ��ȯ���� �ִ� ���: ȣ�� �κп��� ��ȯ���� �޾� �� ������ �̸� �����ϰ� �����ϴ� ������ ���ų�
		// 				    ��¹� ���ο��� ȣ���ϴ� ������ Ȱ��
		// ��ȯ���� ���� ���: ���� ����� ����ڿ��� ���� �ְ��� �Ѵٸ� �޼ҵ� ���ο��� ��¹� Ȱ��

		System.out.println("-------------------------");
		
		// 2. MethodTest2 Ŭ���� �׽�Ʈ
		// static �޼ҵ��̹Ƿ� �뺯�� �̸� �ʿ� ���� �ٷ� ȣ�� ����
		
		MethodTest2.method1();
		
		System.out.println("-------------------------");
		
		// MethodTest2.method2(); // ���� ���� String�� �ش��ϴ� ��¹��� �����Ƿ� ��µ��� ����
		
		System.out.println(MethodTest2.method2());
		
		System.out.println("-------------------------");
		
		MethodTest2.method3("ȫ�浿", 20); // �̹� ��¹��� �����ϴ� �����̹Ƿ� �ڷ��� ���缭 ���� �� �Է��� �ָ� ��
		
		System.out.println("-------------------------");
		
		System.out.println(MethodTest2.method4(5, 11, '+'));
		
		
	}

}

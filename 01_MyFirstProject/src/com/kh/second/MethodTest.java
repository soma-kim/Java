package com.kh.second;

// com.kh.second.MethodTest
public class MethodTest {
	
	/*
	 * �� Ŭ���� ���� ���� ���� �޼ҵ带 ������ �� �� ����
	 * ������ ���� �޼ҵ带 ������ �ʿ� ����(com.kh.first.HelloEveryone�� ���� �޼ҵ� �����߱� ����)
	 */

	// �Ϲ� �޼ҵ�� �ۼ�
	public void testPrintA() {
		
		// �� �޼ҵ尡 ȣ��Ǵ� ���� ������ ���� �ۼ�
		System.out.println("testPrintA �޼ҵ� ����");
		
		// testPrintB �޼ҵ� ȣ��
		testPrintB(); // ���� ���� Ŭ���� ���� ��ġ�ϹǷ� �޼ҵ�� ȣ���ϸ� ��
		
		// testPrintC(); // (1) testPrintC �޼ҵ带 �� �������� ȣ�� ����
	}
	
	public void testPrintB() {
		
		System.out.println("testPrintB �޼ҵ� ����");
		
		testPrintC(); // (2) testPrintC �޼ҵ带 �� �������� ȣ�� ����
	}
	
	public void testPrintC() {
		
		System.out.println("testPrintC �޼ҵ� ����");
		
		// testPrintA();
		// ���� �� �������� testPrintA �޼ҵ带 ȣ������ ���?
		// => ���� �ݺ����� A, B, C�� ȣ��Ǿ���
		// => �� ��� ���� �ݺ����� ����� ����Ǵٰ� StackOverflowError �� �߻�
		// (�޸𸮰� �� �̻� �ߵ��� ���ϰ� ���α׷��� �����Ŵ)
		
		/*
		 * �������
		 * 1. �ڵ� �ۼ� => �ϵ��ũ (HDD) �� ���� (������ ���� == "���α׷�")
		 * 2. �����Ϸ��� ���ؼ� ����� ����
		 * 3. JVM �� ���ؼ� ���� => �޸� ���� (RAM) ���� �ε��ʰ� ���ÿ� ���� (������ ���� == "���μ���")
		 * 
		 * Stack: �޸� ������ ���� �� �ϳ�, Stack�� ũ�⸦ ��� ��� StackOverflowError �߻�
		 */
		
		
	}
}
// com.kh.second.MethodTest�� ���� �����ؼ� Run As �� ���� ���� => ���� �޼ҵ尡 �����ϱ� �������� ���� ����!
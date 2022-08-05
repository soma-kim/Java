package com.kh.chap06.method.controller;

public class OverloadingTest {
	
	// �޼ҵ� �����ε� (Overloading)
	// - �� Ŭ���� ���� ���� �޼ҵ������ ������ �� �ִ� ���
	// - �Ű������� �ڷ����� ����, ������ �ٸ��� �ۼ��Ǿ� �־�� ��
	// - ��, �Ű������� �̸�, ����������, ��ȯ���� �޼ҵ� �����ε��� ������ ���� ����
	
	public void test() { // �Ű����� 0��
		
		// �޼ҵ� �����ε��� ���� �ߵǾ� �ִ� ����
		System.out.println(); // �Ű����� ���� ����
		System.out.println(1); // �Ű����� int Ÿ�� 1��
		System.out.println(true); // �Ű����� boolean Ÿ���� �� �ϳ�
		System.out.println("�ȳ��ϼ���"); // �Ű����� String Ÿ���� �� �ϳ�
		
		System.out.printf("%d", 1); // �Ű������� ������ 2��
		System.out.printf("%d %d", 1, 2); // �Ű������� ������ 3��(String, int, int)
		System.out.printf("%d %c", 1, 'a'); // �Ű������� ������ 3��(String, int, char)
		
	}
	
	// Duplicate method test() in type OverloadingTest
	/*
	 public void test() { 
	}
	*/
	
	public void test(int a) { // �Ű����� int Ÿ�� 1��
	}
	
	// Duplicate method test(int) in type OverloadingTest ���� �߻�
	// �Ű����� �̸��� �ٸ����� int�� 1���� �̹� �����Ƿ� �����ε� �ȵ�!
	/*
	 public void test(int b) { 
	
	 }
	*/
	
	public void test(int a, String s) { // �Ű����� int�� 1��, ���ڿ� 1��! �ڷ����� ���� �޶� �����ε� �ߵ�!	
	}
	
	public void test(String s, int a) { // �Ű����� ���ڿ� 1��, int�� 1��! ���� ���� �޶� �����ε� �ߵ�!
	}
	
	public void test(int a, int b) { // �Ű����� int�� 2��! �ڷ����� ���� ��ġ�ϴ� �� �����Ƿ� �����ε� �ߵ�!
	}
	
	// Duplicate method test(int) in type OverloadingTest ���� �߻�
	// - �Ű���������� ������� �ڷ����� ������ ������ ���� ������ ������ �޼ҵ�� �Ǻ��� (�ߺ� ����)
	// - ��, �Ű������� �ڷ����� ������ ������ �ٸ��� �ۼ��ؾ� ��!
	/* 
	 * public void test(int c, int d) { // �Ű����� int�� 2��! �̸��� �޶� int�� 2���� �̹� �����ϱ� ������ �����ε� �� ��!
	 * 
	 * }
	 */
	
	public void test(int a, int b, String s) {
	}
	
	// ������ �߻�
	// - ��ȯ���� �ٸ��ٰ� �����ε��� ��������� ����
	// - �޼ҵ带 ȣ���ϴ� �������� �Ű������� �����ϱ� ������ ���� �߻�
	// - ��, ��ȯ���� ������� �Ű������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ�� ��
	/* 
	 * public int test(int a, int b, String s) {
	 * 
	 * return a + b;
	 * }
	*/
	
	// ������ �߻�
	// - ���������ڰ� �ٸ��ٰ� �ؼ� �����ε��� ������� ����
	// - ��, ���������ڿ� ������� �Ű������� �ڷ��� ������ ������ �ٸ��� �ۼ��Ǿ�߸� �����ε��� ������
	/*
	private void test(int a, int b, String s) {	
	
	}
	*/
}

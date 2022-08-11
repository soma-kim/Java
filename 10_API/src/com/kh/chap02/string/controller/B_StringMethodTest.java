package com.kh.chap02.string.controller;

import java.util.Scanner;

public class B_StringMethodTest {
	
	public void method1() {
		
		String str1 = "Hell world";
		
		// �޼ҵ��(�Ű�����): ��ȯ��
		
		// 1. ���ڿ�.charAt(int indec): ��ȯ�� char��
		// => ���ڿ����� ���޹��� index ��ġ�� ���� �ϳ��� �̾Ƽ� ����
		char ch = str1.charAt(3);
		System.out.println("ch: " + ch); // ch: l
		
		// 2. ���ڿ�.concat(String str): ��ȯ�� String��
		// => ���ڿ��� ���޵� �� �ٸ� ���ڿ��� �ϳ��� ���̾ ����
		String str2 = str1.concat("!!!"); // String str2 = str1 + "!!!";
		System.out.println("str2: " + str2); // str2: Hell world!!!
		
		// 3. ���ڿ� .length(): ��ȯ�� int��
		// => ���ڿ��� ���� ��ȯ
		System.out.println("str1�� ����: " + str1.length()); // str1�� ����: 10
		
		// 4_1. ���ڿ�.subString(int beginIndex): ��ȯ�� String��
		// => ���ڿ��� beginIndex ��ġ�������� �������� ���ڿ��� �����ؼ� ����
		System.out.println(str1.substring(6)); // orld
		
		// 4_2. ���ڿ�.subString(int beginIndex, int endIndex): ��ȯ�� String��
		// => ���ڿ��� beginIndex ��ġ�������� endInex - 1 ��ġ���� �����ؼ� ���� 
		System.out.println(str1.substring(0, 6)); // 0 <= �ε������� < 6, Hell w

		
		// 5. ���ڿ�.replace(char old, char new): ��ȯ�� String��
		// => ���ڿ��κ��� old ���ڸ� new ���ڷ� ��ȯ�� ���ڿ��� ����
		String str3 = str1.replace('l', 'c');
		System.out.println("str3: " + str3); // str3: Hecc worcd
		
		// 6. ���ڿ�.trim(): ��ȯ�� Stirng��
		// => ���ڿ��� ��, �� ������ ��� ������ ���ڿ��� Ƽ��
		String str4 = "      JA         VA       ";
		System.out.println("trim(): " + str4.trim()); // trim(): JA         VA, ���� ���� �߰� ������ �������� ����!
		
		// ����) �߰��� �ִ� ������ ���ְ� �ʹٸ�?
		// replace �޼ҵ带 Ȱ���� ����!
		System.out.println("replace�� Ȱ���ؼ� ��� ���鵵 ���ֱ�: " + str4.replace(" ", "")); // replace�� Ȱ���ؼ� ��� ���鵵 ���ֱ�: JAVA
		
		// 7_1. ���ڿ�.toUpperCase(): ��ȯ�� String��
		// => ���ڿ��� ��� �� �빮�ڷ� ���� �� ���ڿ� ����
		System.out.println("upper: " + str1.toUpperCase()); // upper: HELL WORLD
		
		// 7_2. ���ڿ�.toLowerCase(): ��ȯ�� String��
		// => ���ڿ��� ��� �� �ҹ��ڷ� ���� �� ���ڿ� ����
		System.out.println("lower: " + str1.toLowerCase()); // lower: hell world
		
		// Ȱ�� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ͻðڽ��ϱ�? (y/n): ");
		// char answer = sc.nextLine().charAt(0); // Y, y, N, n
		char answer = sc.nextLine().toUpperCase().charAt(0); // Y, N���� ��찡 ������!
		// => �޼ҵ带 ���̾ ȣ��(�޼ҵ�ü�̴�)
		
		if(answer == 'Y') {
			System.out.println("���α׷��� �����մϴ�.");
		} else {
			System.out.println("���α׷��� �������� �ʽ��ϴ�.");
		}
	}

}

package com.kh.chap02.string.controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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
		// => ���ڿ��� ��, �� ������ ��� ������ ���ڿ��� ����
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
		
		/*
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
		*/
		
		
		// ���ڿ� => char[]
		/*
		char[] arr = new char[str1.length()];
		
		for(int i = 0; i < arr.lengh; i++) {
			arr[i] = str1.charAt(i);
		}
		*/
		
		// 8. ���ڿ�.toCharArray(): ����� char[]��
		// => ���ڿ��� �� ���ڵ��� char[] �迭�� �Ű� ���� �� �� �迭�� ����
		char[] arr = str1.toCharArray();
		System.out.println(Arrays.toString(arr)); // [H, e, l, l,  , w, o, r, l, d]
		
		
		// char[] => ���ڿ�
		char[] arr2 = {'a', 'p', 'p', 'l', 'e'};
		
		// 9. String.valueOf(char[] data): ��ȯ�� String��
		// => ���޵� char[] �迭�� ��� ���ڵ��� �ϳ��� ���ڿ��� ���̾ ����
		System.out.println(String.valueOf(arr2)); // apple

	}
	// �ǽ� ����
	public void method2() {
		
		/*
		 * �弳 ���͸� ���α׷�
		 * - ����ڿ��� ������ �ϳ� �Է¹޽��ϴ�
		 * - ���� ���õǴ� �ܾ �ش��� ��� * ���� ��ü�ؼ� ����ϵ��� ������ ������
		 * - �Ź߲�, ������, ���ھ�, ȣ����, �ú�����, �����, ��ī, �ֿ�, �ֹֽ�, ���ڼ�, �Ļ�
		 * 
		 * ex) �̷� �Ź߲� ���� ������ ȣ�����!!!
		 * => �̷� *** ���� *** ****��!!!
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String sen = sc.nextLine();
		// sc.next(); // �� ���� ���� �������� ��µ�!! "�� ���ٶ�"�� �Է��� �� "��"�� ��µ�!
		
		// �ܾ���� �迭�� ��� ���� �� ���ϴ�?
		String abuse = "�Ź߲�,������,���ھ�,ȣ����,�ú�����,�����,��ī,�ֿ�,�ֹֽ�,���ڼ�,�Ļ�"; // 11��
		String[] arr = abuse.split(","); // ���� arr[10] �迭�� 11���� ���� ��� ����
		// System.out.println(arr.length); // 11
		
		// ���ڿ� �迭�� ��� for���� �̷� �����ε� �� �� ���� (���� for��, foreach��)
		// for(�����޾��ټ��ִº������� : ���������������ҹ迭�Ǵ��÷��Ǹ�)
		// <���� for��>
		
		// arr �迭�� ��� ���� ����ŭ for���� �� �� 
		for( String sAbuse : arr ) {	//sAbuse ó������ �Ź߲���, �ι�°�� ��������,����°�� ���ھ��� ��� ��
			int abuseLth = sAbuse.length();	// ���� ���� ���� �̴´� (ex �Ź߲�: 3)
			
			String trans = "";
			
			// ���� ���� ����ŭ *�� ��������� �Ѵ� (ex �Ź߲� -> ***, �ú����� -> ****)
			for( int i = 0 ; i < abuseLth ; i ++ ) {
				trans += "*";
			}
			
			// ���� �Է��� ���忡�� ���� �ִٸ� ���� �ٲܰ�!
			sen = sen.replace(sAbuse, trans);
		}
		
		System.out.println(sen);
		
		
//		<�Ϲ� for��>
//		for(int i = 0; i < arr.length; i++) {
//		
//		int abuseLth = arr[i].length();		
//		String trans = "";
//		
//		for( int j = 0 ; j < abuseLth ; j ++ ) {
//			trans += "*";
//		}
//				
//		sen = sen.replace(arr[i], trans);
//		
//		========================================================
//		
//		<����� Ǯ��>
//		// ���͸� �迭
//		String[] filter = {"�Ź߲�", "������", "���ھ�", "ȣ����", "�ú�����", "�����", "��ī", "�ֿ�", "�ֹֽ�", "���ڼ�", "�Ļ�"};
// 		// ���͸� �۾�
//		for(int i = 0; i < filter.length; i++) {
//			
//			// �� �ε����� ���� ���͸��� ���ڿ� �������� ġȯ�� ���ڿ��� ���� ����
//			int size = filter[i].length(); // �ش� ������ ���� ���� ����
//			String star = "";
//			for(int j = 0, j < size; j++) {
//				star += "*";
//			}
//			
//			// filter[i] ���ڸ� star�� ��ü => replace �޼ҵ�
//			str = str.replace(filter[i], star);
//		}
		
		// ���
//		System.out.println(str);
//		
//	}
		/*
		 * �弳�� ���ڸ��� ����� ����ϰ� �ʹٸ�?
		 * ex: �̷� ��** ���� ��** ȣ***��!!!
		 * 
		 * String[] filter = {"�Ź߲�", "������", "���ھ�", "ȣ����", "�ú�����", "�����", "��ī", "�ֿ�", "�ֹֽ�", "���ڼ�", "�Ļ�"};
		 * 
		 * for(int i = 0; i < filter.length; i++) {
		 * 		int size = filter[i].length(); 
		 *		String star ="" + filter[i].charAt(0); // �弳�� ù ���ڸ� ������ �ְ� ��
		 *
		 *		for(int j = 0, j < size -1; j++) { // size - 1 �ؼ� �弳�� ���ں��� �� ���� ���� ������!
		 *			star += "*";
		 *
		 *			str = str.replace(filter[i], star);
		 *	}
		
		 *	// ���
		 *	System.out.println(str);
		 * 
		 */
		
		
	}
}

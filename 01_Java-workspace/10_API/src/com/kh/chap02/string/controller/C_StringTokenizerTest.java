package com.kh.chap02.string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		// ���ڿ��� �и���Ű�� ���
		
		String str = "Java,Oracle,JDBC,HTML,Server,Spring";
		
			// �����ڸ� �����ؼ� �ش� ���ڿ��� �и���Ű�� ���
			// ���1. �и��� ���ڿ����� String[] �迭�� �������� �����ϰ��� �� ��
			//		  ���ڿ�.split(String ������): ��ȯ�� String[]��
				
			String[] arr = str.split(",");
			/*
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			*/
			
			// ���ڿ� �迭�� ��� for���� �̷� �����ε� �� �� ���� (���� for��, foreach��)
			// for(�����޾��ټ��ִº������� : ���������������ҹ迭�Ǵ��÷��Ǹ�)
	
			for(String s : arr) {
				System.out.println(s);
			}
			
			System.out.println("====================");
		
			// ���2. �и��� ������ ���ڿ����� "��ū"(�ܾ�) ������ ����ϰ� ���� ��
			//		 java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
			//		 StringTokenizer stn = new StringTokenizer(�и���Ű�����ϴ¹��ڿ�, ������);
			
			StringTokenizer stn = new StringTokenizer(str, ",");
			
			System.out.println("�и��� ���ڿ��� ����: " + stn.countTokens()); // �и��� ���ڿ��� ����: 6
			
			/*
			// ���
			System.out.println(stn.nextToken()); // Java
			// �� �������� ��ū�� ������ 5��
			System.out.println(stn.countTokens()); // 5
			System.out.println(stn.nextToken()); // Oracle
			System.out.println(stn.nextToken()); // JDBC
			System.out.println(stn.nextToken()); // HTML
			System.out.println(stn.nextToken()); // Server
			System.out.println(stn.nextToken()); // Spring
			
			System.out.println(stn.nextToken());
			// NoSuchElementException: �� �̻� ã�� ��Ұ� ����
			// => ���� ���� �ִ� stn ��ū ������ ������ ����� �� �߻��ϴ� ����
			*/
			
			// �ݺ��� Ȱ��
			for(int i = 0; i < stn.countTokens(); i++) {
				System.out.println(stn.nextToken());
			}
			
			/* �ݺ������� ���� ���� �־�����?
			 *  i = 0, ��ū ���� 6�� => true => Java ��� => i++
			 *  i = 1, ��ū ���� 5�� => true => Oracle ��� => i++
			 *  i = 2, ��ū ���� 4�� => true => JDBC ��� => i++
			 *  i = 3, ��ū ���� 3�� => false => �ݺ��� ��!
			 */
			
			
			// �ذ���1. ���� Ȱ��
			/*
			int count = stn.countTokens(); // ó�� ��ū�� ������ ����ȭ���Ѽ� �������� ����
			
			for(int i = 0; i < count; i++) {
				System.out.println(stn.nextToken());
			}
			*/
			
			// �ذ���2. while�� ���
			// stn.hasMoreTokens(): stn ��ü�� �� �̻� �̾Ƴ� ��ū�� �ִٸ� true, �ƴ϶�� false�� ��ȯ
			while (stn.hasMoreTokens()) { // stn ������ ���� �ִ� ��ū�� ���� ���ȿ��� �ݺ��� �����ϰڴ�
				System.out.println(stn.nextToken());;
			}
			
			
	}

}

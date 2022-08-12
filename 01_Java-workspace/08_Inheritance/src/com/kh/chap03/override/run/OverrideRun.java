package com.kh.chap03.override.run;

import com.kh.chap03.override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		// ��� Ŭ������ Object Ŭ������ �ļ���
		// ��, �ֻ��� Ŭ������ �׻� Object
		// => Object�� �ִ� �޼ҵ���� �� ������ �� �� ����
		// => Object�� �ִ� �޼ҵ���� �� �Ը���� �������̵� �� �� ����
		
		Book bk = new Book("����������", "������", 10000);
		
		System.out.println(bk /* .toString() */); // �ּҰ�
		System.out.println(bk.hashCode()); // �ּҰ� ������ ����
		// Object���� �����ϴ� ������ �޼ҵ带 ��ӹ޾Ƽ� ��� ����
		
		// ���߿����� ����! �����ϰ� �� �� �ִ� �޼ҵ�
		// toString() �޼ҵ�
		System.out.println(bk.toString()); // �ּҰ� ������ bk�� �������� ���� �����ϰ� ���
		
		/*
		 * toString() �޼ҵ�
		 * �ش� ���� Ÿ���� ǮŬ������ + @ + �ش� ��ü�� �ּҰ��� 16������ ���·� �����ִ� �޼ҵ�
		 * �˰� �𸣰� ��ü�� �������� ��� ���������� toString() �޼ҵ尡 ȣ��� �� (JVM�� ����)
		 * 
		 * ��¹� �ȿ��� ������ ������ �����ؼ� �ش� ������ ����ϰ��� �� ��
		 * toString() �޼ҵ尡 ���������� �˾Ƽ� ȣ��ȴٴ� ���� �̿��ؼ�
		 * toString() �޼ҵ带 �������̵� �ؼ� �� �ʵ��� ���� �� ���� ���ڿ��� ������ �ְԲ� �������ؼ� ��!!
		 * => ������ information �޼ҵ��� ������ toString�� �ϰԲ� �������̵� �ϰ���
		 */
		
		// �������̵� ��: com.kh.chap03.override.model.vo.Book@6d06d69c
		// �������̵� ��: title: ����������, author: ������, price: 10000
		
		/*
		 * Ŭ���� ����
		 * public class Ŭ������ {
		 * 
		 * 		// �ʵ��
		 * 
		 * 		// �����ں�: �⺻ ������, ����ʵ忡���ѸŰ�����������
		 * 
		 * 		// �޼ҵ��: getter / setter, toString() �������̵�
		 */

	}

}

package com.kh.chap02.inherit.run;

import com.kh.chap02.inherit.model.vo.Airplane;
import com.kh.chap02.inherit.model.vo.Car;
import com.kh.chap02.inherit.model.vo.Ship;

public class Run /* extends Object */ {
	// ��õǾ� ������ ������ ��� Ŭ������ Object�� �ļ�(�ڽ� Ŭ����)��
	
	public static void main(String[] args) {
		
		// ��ü ����
		Car c = new Car("��Ʋ��", 12.5, "����", 4);
		Ship s = new Ship("�������̹�", 3, "�", 1);
		Airplane a = new Airplane("����774", 0.02, "������", 10, 5);
		
		// ���
		System.out.println(c.information()); // Car Ŭ������ �����ǵ� information ȣ��
		System.out.println(s.information()); // Ship Ŭ������ �����ǵ� information ȣ��
		System.out.println(a.information()); // Airplane Ŭ������ �����ǵ� information ȣ��
		// ���࿡ �� �ڽ� Ŭ������ information �޼ҵ带 ���������� �ʾҴٸ� (������ == �������̵�)
		// ���� �θ� Ŭ������ Vehicle�� �ִ� information �޼ҵ�� ȣ����� ��!!
		// => ������ �ϴ� ���� �ڽ� �޼ҵ�� �켱���� �Ѿ�� ȣ���
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		// �ڽ� Ŭ������ howToMove();�� ���� ������ ���� ���� ������ ���� �θ� Ŭ������ "�����δ�."�� ��µ�
		// �ڽ� Ŭ������  howToMove();�� ���� ���������� ���(�������̵�) �ڽ� Ŭ������ ��¹��� ��µ�
		
		/*
		 * *����� ����
		 * - ���� ���� ���� �ڵ�� ���ο� Ŭ�������� �ۼ� ������
		 * - �ߺ��� �ڵ带 ���������� �����ϱ� ������ ���ο� �ڵ带 �߰��ϰų� ������ �� ����
		 * - ���α׷��� ���꼺�� ���������� ū �⿩
		 * 
		 * *����� Ư¡
		 * - �ڽ� Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ带 ��� ������ �� �� ������
		 *   �θ� Ŭ������ �ڽ� Ŭ������ �ڵ带 ������ �� �� ����
		 * - Ŭ���� ���� ����� ���� ����� �Ұ�����(���� ��Ӹ� ����)
		 *   ���� ���� ��� �ÿ� ���� ���� �ʵ��, �޼ҵ���� ���� �Ϳ� ����� ó������ ���� ��
		 * - ��õǾ� ������ ������ ��� Ŭ����(�ڹٿ��� �̸� ���� �����Ǵ� Ŭ����, ���� ���� Ŭ����)
		 *   Object(�ڹٿ��� �̸� ���� �����Ǵ� Ŭ����) Ŭ������ �ļ���
		 *   => Object Ŭ�������� �̹� ������� �޼ҵ带 ������ �� �� ����
		 *   => Object Ŭ�������� �̹� ������� �޼ҵ尡 ������ ���� �ʴ´ٸ�
		 *   	�������̵��� ���� ������ ����
		 */
		
		System.out.println(c.hashCode()); // 10���� ������ �ּҰ� ��ȯ
		System.out.println(c.equals(s)); // ���� �񱳷� false ��� 
		// => Object��� �ֻ��� Ŭ�������� �����ϴ� �޼ҵ��!!

		
		
	}

}

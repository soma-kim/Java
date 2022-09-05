package com.kh.chap04.field.run;

import com.kh.chap04.field.model.vo.FieldTest2;
import com.kh.chap04.field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		
		// 1. FieldTest1 Ŭ���� �׽�Ʈ
		/*
		FieldTest1 f1 = new FieldTest1(); // (1) ��ü �����
		// �� �������� ��ü�� ���� �� f1�� global�� ����, �ʱ�ȭ(����)�� ��
		
		f1.test(10); // test �޼ҵ� ȣ�� �� num�̶�� �Ű������� 10�� ���Ե� ��
		
		//System.out.println(num); // �޼ҵ尡 ����Ǿ��� ������ �Ҹ�
		//System.out.println(local); // �޼ҵ尡 ����Ǿ��� ������ �Ҹ�
		System.out.println(f1.global); // ���� �Ҹ���� ����
		
		// ������� ���ڴ� == ��ü�� �Ҹ��ߴ�
		
		// f1 = null;
		// System.out.println(f1.global); // NullPointerException �߻�
		// �� �������� ������ �÷����� �Ͼ�� global ���� �Ҹ�� ������!
		*/
		
		/*
		FieldTest2 f2 = new FieldTest2();
		

		System.out.println(f2.pub); // public: ��𼭵� ���� ���� ����
		
		// �� �Ʒ����ʹ� is not visible ���� �߻�
		// System.out.println(f2.pro); // protected: ���� ��Ű�������� ���� ���� ����
		  							   //	   		    �ٸ� ��Ű�������� ��� ������ ���� ����
		// System.out.println(f2.df); // default: ���� ��Ű�������� ���� ���� ����
		// System.out.println(f2.pri); // private: �ش� Ŭ���� �������� ���� ���� ����
		*/
		
		// 3. FieldTest3 Ŭ���� �׽�Ʈ
		
		// FieldTest3 f3 = new FieldTest3();
		// => �̱��� ����: ��� �ʵ尡 static�� ��Ȳ�̹Ƿ� ��ü ������ �ʿ� ����!
		
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		
		// �׻� Static�� ã�� ������ �ش� Ŭ�������� �տ� �� �ٿ��� ��
		// => �̸��� �ߺ��� �� �ֱ� ������!
		
		// ��� �ʵ忡 ���� �����ϱ�!
		//FieldTest3.NUM = 20; // �Ұ���! ����� �ٲ� �� ����!
		
		FieldTest3.sta = "FieldTest3�� static"; // ����!
		
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest3.NUM);
		
		// static �޼ҵ嵵 ȣ���� ����
		
		FieldTest3.test();
		// => �޼ҵ嵵 ���������� ��ü�� ������ �ʿ� ���� Ŭ���������� ȣ�� ����
		
		System.out.println(Math.PI); // ������
		// Math Ŭ������ ��� �ʵ�� ��� �޼ҵ尡 ���� static�� "�̱��� ����"�̴�
			}

}

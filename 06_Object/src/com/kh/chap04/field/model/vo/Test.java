package com.kh.chap04.field.model.vo;

public class Test {

	public static void main(String[] args) {
		
		FieldTest2 f2 = new FieldTest2();
		System.out.println(f2.pub); // public: ���� ���� ����
		System.out.println(f2.pro); // protected: ���� ��Ű���� �ֱ� ������ ���� ���� ����
		System.out.println(f2.df); // default: ���� ���� ����
		
		// is not visible ���� �߻�
		// System.out.println(f2.pri);
		

	}

}

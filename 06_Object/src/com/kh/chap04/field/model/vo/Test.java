package com.kh.chap04.field.model.vo;

public class Test {

	public static void main(String[] args) {
		
		FieldTest2 f2 = new FieldTest2();
		System.out.println(f2.pub); // public: 직접 접근 가능
		System.out.println(f2.pro); // protected: 같은 패키지에 있기 때문에 직접 접근 가능
		System.out.println(f2.df); // default: 직접 접근 가능
		
		// is not visible 오류 발생
		// System.out.println(f2.pri);
		

	}

}

package com.kh.chap04.field.run;

import com.kh.chap04.field.model.vo.FieldTest2;
import com.kh.chap04.field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		
		// 1. FieldTest1 클래스 테스트
		/*
		FieldTest1 f1 = new FieldTest1(); // (1) 객체 만들기
		// 이 시점에서 객체가 생성 시 f1의 global이 생성, 초기화(대입)된 것
		
		f1.test(10); // test 메소드 호출 시 num이라는 매개변수에 10이 대입된 것
		
		//System.out.println(num); // 메소드가 종료되었기 때문에 소멸
		//System.out.println(local); // 메소드가 종료되었기 때문에 소멸
		System.out.println(f1.global); // 아직 소멸되지 않음
		
		// 연결고리를 끊겠다 == 객체를 소멸했다
		
		// f1 = null;
		// System.out.println(f1.global); // NullPointerException 발생
		// 이 시점에서 가비지 컬렉션이 일어나면 global 값도 소멸될 예정임!
		*/
		
		/*
		FieldTest2 f2 = new FieldTest2();
		

		System.out.println(f2.pub); // public: 어디서든 직접 접근 가능
		
		// 이 아래부터는 is not visible 오류 발생
		// System.out.println(f2.pro); // protected: 같은 패키지에서는 직접 접근 가능
		  							   //	   		    다른 패키지에서는 상속 관계일 때만 가능
		// System.out.println(f2.df); // default: 같은 패키지에서만 직접 접근 가능
		// System.out.println(f2.pri); // private: 해당 클래스 내에서만 직접 접근 가능
		*/
		
		// 3. FieldTest3 클래스 테스트
		
		// FieldTest3 f3 = new FieldTest3();
		// => 싱글톤 패턴: 모든 필드가 static인 상황이므로 객체 생성할 필요 없음!
		
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		
		// 항상 Static을 찾을 때에는 해당 클래스명은 앞에 꼭 붙여야 함
		// => 이름이 중복될 수 있기 때문에!
		
		// 상수 필드에 값을 대입하기!
		//FieldTest3.NUM = 20; // 불가능! 상수는 바꿀 수 없음!
		
		FieldTest3.sta = "FieldTest3의 static"; // 가능!
		
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest3.NUM);
		
		// static 메소드도 호출해 보기
		
		FieldTest3.test();
		// => 메소드도 마찬가지로 객체를 생성할 필요 없이 클래스명만으로 호출 가능
		
		System.out.println(Math.PI); // 원주율
		// Math 클래스는 모든 필드와 모든 메소드가 전부 static인 "싱글톤 패턴"이다
			}

}

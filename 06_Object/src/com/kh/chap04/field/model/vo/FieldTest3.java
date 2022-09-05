package com.kh.chap04.field.model.vo;

// 클래스변수(static 변수)와 상수필드(static final)에 대해 테스트
public class FieldTest3 {
	
	// 클래스변수 (static 변수)
	// [ 표현법 ]
	// 접근제한자 static 자료형 변수명;
	
	public static String sta = "static 변수";
	// 생성 시점: 프로그램 시작과 동시에 static 영역에 올라가면서 생성
	//		   (굳이 이 객체를 생성하지 않아도 가져다 쓸 수 있다)
	// 소멸 시점: 프로그램 종료와 동시에 소멸됨
	
	// static: "공유"의 목적, 개념이 강함
	// => 프로그램 시작과 동시에 메모리 영역에 박스를 만들어 두고 끝날 때까지 공유해서 쓰자
	// => 주로 어디서든지 자주 쓰이는 것들에 대해서만 static 붙여서 쓰는 게 가장 이득임
	
	// 참고) 해당 클래스의 모든 메소드와 모든 필드가 static인 경우
	// => Math 클래스
	// => "싱글톤패턴"
	
	/*
	 * 상수 필드
	 * [ 표현법 ]
	 * public static final 자료형 상수필드명 = 값;
	 * 
	 * 한 번 지정된 값을 고정해서 계속 가져다 쓰기 때문에 처음부터 무조건 초기화를 해 줘야 함
	 * static final 예약어의 순서는 바꿔서 써도 됨 (final static도 가능)
	 * 
	 * static: 공유의 개념
	 * final: 한 번 지정된 값은 고정의 개념(상수)
	 * 
	 * => 값이 변경되어서는 안 되는 고정적인 값을 메모리 static 영역에 올려 두고
	 * 	    두고두고 공유할 목적으로 사용
	 * 
	 * + 상수명은 항상 대문자임!
	 */
	
	public static final int NUM = 10;
	
	public static void test() {
		System.out.println("나는 static 메소드야");
	}

}

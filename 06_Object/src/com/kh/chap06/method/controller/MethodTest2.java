package com.kh.chap06.method.controller;

public class MethodTest2 {
	
	// static 메소드
	// => 호출할 때 객체를 생성할 필요가 없음
	public static void method1() {
		
		System.out.println("매개변수와 반환값이 없는 static 메소드");
	}
	
	public static String method2() {
		
		return "매개변수는 없지만 반환값은 있는 static 메소드";
	}
	
	// 매개 변수는 있지만 반환값이 없는 static 메소드
	public static void method3(String name, int age) {
		
		// xx살의 xxx 님 환영합니다.
		
		System.out.println(age + "살의 " + name + " 님 환영합니다.");
	}
	
	public static int method4(int num1, int num2, char op) {
		
		/* 도전 과제!!! switch 문과 if 문을 이용해서
		 * return; 으로 진행될 수 있도록 풀어 보시오
		switch(op) {
		case '+': +;
			break;
		
		
		}
		*/
		
		// op: 연산자
		// => 연산자 종류(+, -, *, /, %)에 따른 연산 결과를 return
		
		// return; //This method must return a result of type int: 지정한 return 자료형 값 넣어 줘야 함! 로직 안 짰다고 안 넣으면 오류 남!
		// 반환 자료형과 리턴되는 값의 자료형을 항상 맞춰 줘야 함
		
		return num1 + num2;
	}

}

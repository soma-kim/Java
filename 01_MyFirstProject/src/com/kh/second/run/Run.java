package com.kh.second.run;

import com.kh.second.MethodTest; // 해당 패키지에 있는 클래스를 이 클래스 영역 안에서 가져다 쓰겠다. **40줄~ 해결방법 2)**

// com.kh.second.run.Run
public class Run {
	
	// 이 클래스에서 할 일: 실행을 위한 main 메소드 만들기
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작"); // 출력문도 일종의 메소드
		
		// 다른 메소드를 호출해 보자
		
		/*
		 * *메소드 호출 방법
		 * 1. 나랑 같은 클래스 안에 존재하는 메소드를 호출할 경우
		 * => 호출하고자하는메소드명();
		 * 
		 * 2. 나랑 다른 클래스 안에 존재하는 메소드를 호출할 경우
		 * 
		 */
		
		 // testPrintA();
		 // The method testPrintA() is undefined for the type Run: 같은 클래스 안에 정의된 메소드가 아님

		
		// 1) 내가 호출할 메소드가 존재하는 클래스를 생성 (new) 이라는 걸 해야 함
		// [ 표현법 ] 클래스명 대변할이름 = new 클래스명();
		// MethodTest mt = new MethodTest();
		// MethodTest cannot be resolved to a type: Run은 run 패키지 안에 있는데 MethodTest는 run 패키지 바깥에 있음
		
		// => 기본적으로 현재 같은 패키지 내에 해당 이름을 가진 클래스를 찾음
		// 	    다른 패키지에 존재하는 클래스이기 때문에 MethodTest를 찾지 못함
		
		// 해결 방법 1) 해당 클래스가 정확히 어느 패키지에 있는 클래스인지 풀 클래스명을 명시
		// com.kh.second.MethodTest mt = new com.kh.second.MethodTest();
		// => 너무 길다는 단점 있음
		
		// 해결 방법 2) 그냥 클래스명을 가지고 생성 구문을 작성하되,
		//			  이 클래스가 어떤 패키지에 속해 있는지 선언문을 추가 => 주로 쓰이는 방법
		MethodTest mt = new MethodTest();
		
		// 2) 대변할이름을 생성 후 이제 해당 클래스에 있는 메소드를 호출
		// [ 표현법 ] 대변할이름.호출하고자하는메소드명();
		mt.testPrintA();
		
		
	}
}

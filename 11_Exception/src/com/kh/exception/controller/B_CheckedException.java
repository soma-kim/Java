package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 예측 불가능한 예외들(IOException의 자식 클래스들)에 대한 예외처리: CheckedException 
public class B_CheckedException {
	
	/*
	 * *CheckedException은 반드시 예외처리를 해야 하는 예외들
	 *  (즉, 예측 불가한 곳에서 발생하기 때문에 미리 예외 처리 구문을 작성해야 함)
	 *  => 주로 사람이 아닌 외부 매체와 어떤 "입출력"이라는 과정이 나타날 때 주로 발생함
	 */
	
	public void method1() {
		
		method2();
	}
	
	public void method2() {
		
		// Scanner 와 같이 키보드로 값을 입력받을 수 있는 객체 (단, 이 객체는 문자열로만 생성 가능 == 겁나 옛날 버전이라서)
		// => IOException이 발생할 법한 상황 연출을 위함임
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // import
		
		System.out.print("아무 문자열이나 입력하세요: ");
		// String str = br.readLine(); // 문자 한 줄 단위로 입력받겠다
		// 이 메소드를 호출 시 IOException가 발생할 수도 있음을 컴파일 에러로 알려 줌(빨간 밑줄)
		// => 빨간 밑줄 뜨면 실행조차 안 됨!
		//	    즉, 실행하고 싶으면 예외 처리 하고 실행시켜라!
		
		// 1. try ~ catch문: 예외가 발생할 법한 코드가 있는 이 자리 그대로 바로 여기에서 예외를 처리하겠음
		/*
		try {
			
			String str = br.readLine();
			System.out.println("문자열의 길이: " + str.length());
		} catch(IOException e) { // import 해 주기
								 // IOException이 언제 발생될지 모름
			System.out.println("예외 발생됨");
		}
		*/
		
		// 2. throws: 떠넘기기, 위임하기
		
	}

}

package com.kh.chap06.method.controller;

public class MethodTest1 {
	
	/*
	 *  *메소드: 하나의 기능 단위
	 * 			입력을 가지고 어떤 일을 수행한 다음 결과물을 내어놓는 것
	 * 			메인 메소드와 일반 메소드로 나뉨
	 * 
	 * 그동안 썼던 가장 기본적인 메소드의 표현법
	 * public void 메소드명() {
	 * 		실행할 코드;
	 * }
	 * 
	 * [ 표현법 ]
	 * 접근제한자 예약어(생략가능) 반환할값의자료형 메소드명(매개변수 => 생략 가능) {
	 * 
	 * 		수행할 코드;
	 * 
	 * 		return 반환할값; (생략 가능: 반환할 자료형이 void일 경우에만)
	 * 
	 * }
	 * 
	 * => 메소드를 정의한 후 항상 얼마든지 호출해서 쓸 수 있음
	 */
	
	// 1. 매개변수가없고 반환값도 없는 메소드(입력(매개변수, 받아올 값) X, 출력(반환값) X)
	public void method1() {
		
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		
		// 1부터 10까지 합계를 구해서 출력하는 기능
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
		}
		
		
		System.out.println("총 합계: " + sum);
		
		// return; // 반환형이 void라서 빈손으로 돌아간다는 의미! 뒤에 sum 적으면 오류 뜸
				   // void 메소드일 경우에는 알게 모르게 return; 구문이 생략되어 있음
				   // JVM이 자동으로 생성해 주는 구문 
	}
	
	// 2. 매개변수가 없고 반환값은 있는 메소드
	public int method2() { // ++ 얘만 썼을 때는 오류가 나는데 이건 이클립스가 return int값; 까먹지 말라고 힌트 주는 거라고 생각하면 됨!
		
		System.out.println("매개변수는 없고 반환값은 있는 메소드입니다.");
		
		// 1에서부터 100까지의 랜덤값을 발생시켜서 돌려주는 기능 추가
		// int random = (int)(Math.random() * 100) + 1;
		// return random;
		
		return (int)(Math.random() * 100) + 1; // return int값;을 입력하면 method2()에 생겼던 빨간 밑줄은 자동으로 사라짐!
		
	}
	
	// 3. 매개변수가 있고 반환값은 없는 메소드
	
	public void method3(int num1, int num2) {
		
		System.out.println("매개변수가 있고 반환값이 없는 메소드입니다.");

		// num1과 num2의 값을 비교하여 결과를 출력해 주는 기능 추가
		// 최소값: xx
		// 최대값: xx
		
		int min = 0; // 두 수 중 작은 값을 보관할 용도
		int max = 0; // 두 수 중 큰 값을 보관할 용도
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}
		
		else if(num1 < num2) {
			max = num2;
			min = num1;
		}
		
		else {
			System.out.println("두 정수가 같습니다.");
			return;
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		// return; // 이 생략되어 있는 구조
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	public int method4(int a, int b) {
		
		System.out.println("매개변수도 있고 반환값도 있는 메소드입니다.");
		
		// 두 매개변수를 곱한 결과값을 리턴
		return a * b;
	}
	
	

}

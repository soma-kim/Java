package com.kh.operator;

import java.util.Scanner;

// 비교 연산자
public class E_Comparison {
	
	/*
	 * *비교 연산자(관계 연산자): 이항 연산자로써 두 개의 값을 가지고 비교
	 * 					     비교 연산한 결과가 참일 경우 true / 거짓일 경우 false
	 * => 후에 특정 조건을 제시할 수 있는 "조건문"에서 많이 쓰일 예정
	 * 
	 * 크고 작음을 비교 (4가지)
	 * a < b: a가 b보다 작습니까?
	 * a > b: a가 b보다 큽니까?
	 * a <= b: a가 b보다 작거나 같습니까?
	 * a >= b: a가 b보다 크거나 같습니까?
	 * 
	 * 일치함을 비교 (2가지)
	 * a == b: a와 b가 일치합니까?
	 * a != b: a와 b가 일치하지 않습니까?
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a > b: " + (a > b)); // a = 10, b = 25
		// 비교 연산보다 산술연산이 우선순위가 더 크기 때문에
		// (a > b) 부분은 괄호로 묶어서 우선순위를 더 높여 줘야 한다
		
		System.out.println("a <= b: " + (a <= b));
		
		boolean result1 = (a == b); // false
		
		System.out.println("result1: " + result1);
		
		boolean result2 = (a != b); // true
		
		System.out.println("result2: " + result2);
		
		// 산술연산 + 비교연산 => 우선 순위에 의해서 산술연산이 먼저 진행되고 마지막으로 비교가 이루어짐
		System.out.println("a - b < 0: " + (a - b < 0)); // true
		
		// 예시1) 어떤 수가 있을 때 양수 / 음수임을 판별
		// => 양수: 0보다 큰 수
		// => 음수: 0보다 작은 수
		// => 0: 양수도 음수도 아님! 그냥 0
		
		// 예시2) 어떤 수가 있을 때 짝수 / 홀수임을 판별
		// => 짝수: 2로 나누어 떨어지는 수 (== 2로 나눈 나머지가 0)
		// => 홀수: 2로 나누어지지 않는 수 (== 2로 나눈 나머지가 1)
		
		System.out.println("a가 짝수입니까?: " + (a % 2 == 0));
		System.out.println("b가 짝수입니까?: " + (b % 2 == 0));
		
		// 예시3) 어떤 수가 있을 때 n의 배수임을 판별
		// => n의 배수: 어떤 수를 n으로 나누었을 때 나머지가 0인 경우
		
		System.out.println("a는 5의 배수입니까? " + (a % 5 == 0));
		System.out.println("b는 a의 배수입니까? " + (b % a == 0));
	
	}
	
	// 실습 문제
	public void method2() {
		
		/*
		 * 사용자로부터 키보드로 정수값 1개를 입력 받고
		 * 양수인지, 짝수인지 판별해 보세요
		 * 
		 * 실행 예시
		 * 정수값 1개 입력: x
		 * 
		 * 사용자가 입력한 값이 양수입니까?: xxx
		 * 사용자가 입력한 값이 짝수입니까?: xxx
		 */
		
		Scanner sc = new Scanner(System.in);
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// 이렇게 쓰면 import 구문 필요 없음!
		
		System.out.print("정수값 1개 입력: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println();
		
		System.out.println("사용자가 입력한 값이 양수입니까?: " + (num > 0));
		System.out.println("사용자가 입력한 값이 짝수 입니까?: " + (num % 2 == 0));
		
		// 사용자가 입력한 값이 양수이고 그리고 짝수입니까?
		
	}

}

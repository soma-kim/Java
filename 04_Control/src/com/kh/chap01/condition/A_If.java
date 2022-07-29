package com.kh.chap01.condition;

import java.util.Scanner; // import 구문을 추가할 수 있는 단축키: Ctrl + Shift + o

public class A_If {

	/*
	 * *단독 if문: 표현하고자 하는 경우의 수가 한 개일 때
	 *
	 * [ 표현법 ]
	 * if(조건식) {
	 * 		조건식이 true일 경우 실행하고자 하는 코드;
	 * }
	 * => 조건식의 결과가 true일 때는 중괄호 블록 안의 코드 실행
	 * => 조건식의 결과가 false일 경우 중괄호 블록 안의 코드를 건너 뛰고 실행
	 */
	
	// 삼항 연산자를 조건문으로 바꿔 보자
	
	public void method1() {
		
		// 사용자로부터 정수값을 입력받은 후 양수, 0, 음수에 따른 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 삼항 연산자 버전
		// String result = (num > 0) ? "양수입니다." : ((num == 0) ? "0입니다." : "음수입니다.");
		
		// 단독 if문 버전
		if (num > 0) { // num이 양수일 경우
			System.out.println("양수입니다.");
		}
		
		if (num == 0) { // num이 0일 경우
			System.out.println("0입니다.");
		}
		
		if (num < 0) { // num이 음수일 경우
			System.out.println("음수입니다.");
		}
		
		System.out.println("메소드 영역 종료");
		
	}
	
	public void method2() {
		
		// 사용자가 입력한 정수값이 짝수인지 홀수인지 판별하여 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 삼항연산자 버전
		// String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		
		// 단독 if문 버전
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		
		if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		
		 
	}
	
	
	
	
}

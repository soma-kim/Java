package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * *while문
	 * 내가 반복하고자 하는 횟수를 알고 있을 때 써도 되고, 모를 때도 쓸 수 있는 반복문
	 * => 문법상 표현법에 초기식과 증감식이 포함되어 있지 않기 때문
	 * 
	 * [ 표현법 ]
	 * 초기식; // 1. while문에 의해 반복이 일어나기 전에 단 한 번 실행되는 구문(필수는 아님)
	 * while(조건식) { // 2. 조건식에 의한 조건 검사: 조건이 true라면 중괄호 안의 코드가 실행 (필수)
	 * 		조건식 결과가 true일 경우 반복적으로 실행할 코드; // 3. 조건이 true일 경우 위에서 아래로 실행 (필수)
	 * 		증감식; // 4. 초기식에서 지정한 변수를 가지고 증가 또는 감소가 이루어짐 (문법상 필수는 아님)
	 * }
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		
		// for문으로 "안녕하세요" 를 5번 출력하기
		
		/*
		for(int i = 0; i < 5; i++) { // 0, 1, 2, 3, 4
			
			System.out.println("안녕하세요");
		}
		*/
		
		// while문으로 "안녕하세요"를 5번 출력하기
		
		int i = 0; // 초기식
		while(i < 5) { // 조건식
			
				System.out.println("안녕하세요"); // 실행할 코드
				
				i++; // 증감식
		}
		
		System.out.println("i: " + i); // i: 5
		
		while(i >= 1) {
			
			System.out.print(i-- + " "); // --i일 경우는 4, 3, 2, 1, 0으로 출력 
			
			//i--;
		}
	}
	
	public void method2() {
		
		// 1에서부터 10까지의 총 합계
		
		
		int sum = 0;
		
		
		// for문 버전
		/*
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
			
		}
		
		System.out.println("sum: " + sum);
		*/
		
		// while문 버전
		int i = 1; // 초기식
		while(i <= 10) { // 조건식
			
			sum += i; // 실행할 코드
		
			i++;
		}
		
		System.out.println("sum: " + sum);		
		
	}
	
	public void method3() {
		
		// 1부터 랜덤값 (1 ~ 100 사이의 정수값) 까지의 총 합계
		
		int random = (int)(Math.random() * 100) + 1;
		
		System.out.println("random: " + random);
		
		int sum = 0;
		
		// for문 버전
		
		/*
		for(int i = 1; i <= random; i++) {
			
			sum += i;
		
		}
		
		System.out.println("sum: " + sum);
		*/
		
		// while문 버전
		
		/*
		int i = 1; // 초기식
		while(i <= random) { // 조건식
			sum += i;
			
			i++;
		}
		System.out.println("sum: " + sum);
		*/
		
		// while문 버전 (초기식과 증감식이 없는 형태)
		while (random > 0) {
			
			sum += random--;
			
		}
		
		System.out.println("sum: " + sum);

	}
	
	public void method4() {
		
		// 무한대로 아무 문자열이나 매번 입력받고
		// "exit" 문자열이 입력되는 순간 프로그램을 아예 종료시키기
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(i == 0) { // i에 별다른 증감이 일어나지 않는 한 계속 true
			
			System.out.print("아무 문자열이나 입력하세요: ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) { // 문자열 내용물이 "exit"일 경우에는
				
				return;
			}
			

		}

		
	}
	
	/*
	 * do-while문
	 * 조건이 true가 아니더라도 일단은 한 번 실행하고 나서 생각해 보는 구조
	 * 
	 * [ 표현법 ]
	 * do {
	 * 
	 * 		실행할 코드;
	 * } while(조건식);
	 * 
	 * => 별도의 조건 검사 없이 무조건 한 번 실행
	 * => 한 번 실행 후 그제서야 조건식에 의한 조건 검사가 이루어짐
	 * => 조건식의 결과가 true일 경우 다시 그 실행할 코드가 실행
	 * => 조건식의 결과가 false일 경우 반복문을 빠져나옴
	 * 
	 */
	
	public void method5() {
		int num = 1;
		
		while(num == 0) {
			
			System.out.println("안녕!");
			
		} // 출력이 0번 이루어짐
		
		do {
			
			System.out.println("잘 가!");
		} while(num == 0);
	}
}

package com.kh.chap06.method.controller;

public class OverloadingTest {
	
	// 메소드 오버로딩 (Overloading)
	// - 한 클래스 내에 같은 메소드명으로 정의할 수 있는 방법
	// - 매개변수의 자료형의 개수, 순서가 다르게 작성되어 있어야 함
	// - 단, 매개변수의 이름, 접근제한자, 반환형은 메소드 오버로딩에 영향을 주지 않음
	
	public void test() { // 매개변수 0개
		
		// 메소드 오버로딩이 아주 잘되어 있는 예시
		System.out.println(); // 매개변수 없는 상태
		System.out.println(1); // 매개변수 int 타입 1개
		System.out.println(true); // 매개변수 boolean 타입의 값 하나
		System.out.println("안녕하세요"); // 매개변수 String 타입의 값 하나
		
		System.out.printf("%d", 1); // 매개변수의 개수가 2개
		System.out.printf("%d %d", 1, 2); // 매개변수의 개수가 3개(String, int, int)
		System.out.printf("%d %c", 1, 'a'); // 매개변수의 개수가 3개(String, int, char)
		
	}
	
	// Duplicate method test() in type OverloadingTest
	/*
	 public void test() { 
	}
	*/
	
	public void test(int a) { // 매개변수 int 타입 1개
	}
	
	// Duplicate method test(int) in type OverloadingTest 에러 발생
	// 매개변수 이름이 다르더라도 int형 1개는 이미 있으므로 오버로딩 안됨!
	/*
	 public void test(int b) { 
	
	 }
	*/
	
	public void test(int a, String s) { // 매개변수 int형 1개, 문자열 1개! 자료형의 개수 달라서 오버로딩 잘됨!	
	}
	
	public void test(String s, int a) { // 매개변수 문자열 1개, int형 1개! 위와 순서 달라서 오버로딩 잘됨!
	}
	
	public void test(int a, int b) { // 매개변수 int형 2개! 자료형의 종류 일치하는 게 없으므로 오버로딩 잘됨!
	}
	
	// Duplicate method test(int) in type OverloadingTest 에러 발생
	// - 매개변수명과는 상관없이 자료형의 개수와 순서가 같기 때문에 동일한 메소드로 판별됨 (중복 오류)
	// - 즉, 매개변수의 자료형의 개수와 순서를 다르게 작성해야 함!
	/* 
	 * public void test(int c, int d) { // 매개변수 int형 2개! 이름이 달라도 int형 2개는 이미 존재하기 때문에 오버로딩 안 됨!
	 * 
	 * }
	 */
	
	public void test(int a, int b, String s) {
	}
	
	// 에러가 발생
	// - 반환형이 다르다고 오버로딩이 적용되지는 않음
	// - 메소드를 호출하는 시점에서 매개변수가 동일하기 때문에 에러 발생
	// - 즉, 반환형과 상관없이 매개변수의 자료형의 개수와 순서가 다르가 작성되어야 함
	/* 
	 * public int test(int a, int b, String s) {
	 * 
	 * return a + b;
	 * }
	*/
	
	// 에러가 발생
	// - 접근제한자가 다르다고 해서 오버로딩이 적용되지 않음
	// - 즉, 접근제한자와 상관없이 매개변수의 자료형 개수와 순서가 다르게 작성되어야만 오버로딩이 가능함
	/*
	private void test(int a, int b, String s) {	
	
	}
	*/
}

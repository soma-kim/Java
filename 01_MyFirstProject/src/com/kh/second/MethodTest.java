package com.kh.second;

// com.kh.second.MethodTest
public class MethodTest {
	
	/*
	 * 한 클래스 내에 여러 개의 메소드를 정의해 둘 수 있음
	 * 무조건 메인 메소드를 포함할 필요 없음(com.kh.first.HelloEveryone에 메인 메소드 지정했기 때문)
	 */

	// 일반 메소드들 작성
	public void testPrintA() {
		
		// 이 메소드가 호출되는 순간 실행할 내용 작성
		System.out.println("testPrintA 메소드 실행");
	}
	
	public void testPrintB() {
		
		System.out.println("testPrintB 메소드 실행");
	}
	
	public void testPrintC() {
		
		System.out.println("testPrintC 메소드 실행");
	}
}
// com.kh.second.MethodTest만 따로 지정해서 Run As 할 수는 없음 => 메인 메소드가 없으니까 시작점이 없기 때문!
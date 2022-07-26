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
		
		// testPrintB 메소드 호출
		testPrintB(); // 나랑 같은 클래스 내에 위치하므로 메소드명만 호출하면 됨
		
		// testPrintC(); // (1) testPrintC 메소드를 이 시점에서 호출 가능
	}
	
	public void testPrintB() {
		
		System.out.println("testPrintB 메소드 실행");
		
		testPrintC(); // (2) testPrintC 메소드를 이 시점에서 호출 가능
	}
	
	public void testPrintC() {
		
		System.out.println("testPrintC 메소드 실행");
		
		// testPrintA();
		// 만약 이 시점에서 testPrintA 메소드를 호출했을 경우?
		// => 무한 반복으로 A, B, C가 호출되었음
		// => 이 경우 무한 반복으로 결과가 실행되다가 StackOverflowError 가 발생
		// (메모리가 더 이상 견디지 못하고 프로그램을 종료시킴)
		
		/*
		 * 배경지식
		 * 1. 코드 작성 => 하드디스크 (HDD) 에 저장 (정적인 형태 == "프로그램")
		 * 2. 컴파일러에 의해서 기계어로 번역
		 * 3. JVM 에 의해서 실행 => 메모리 영역 (RAM) 으로 로딩됨과 동시에 실행 (동적인 형태 == "프로세스")
		 * 
		 * Stack: 메모리 공간의 유형 중 하나, Stack의 크기를 벗어난 경우 StackOverflowError 발생
		 */
		
		
	}
}
// com.kh.second.MethodTest만 따로 지정해서 Run As 할 수는 없음 => 메인 메소드가 없으니까 시작점이 없기 때문!
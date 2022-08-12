package com.kh.chap06.method.run;

import com.kh.chap06.method.controller.MethodTest1;
import com.kh.chap06.method.controller.MethodTest2;

public class MethodRun {

	public static void main(String[] args) {
		
		// 1. MethodTest1 클래스 테스트
		
		MethodTest1 m1 = new MethodTest1();
		
		m1.method1();
		
		System.out.println("-------------------------");
		
		// m1.method2(); // 매개변수는 없고 반환값은 있는 메소드입니다.
		// 라는 출력문만 나옴! int형으로 m1.method1()에 값이 들어오긴 했지만 해당 값을 출력할 출력문이 없는 상태!
		
		// int random = m1.method2();
		//이렇게 자료형을 맞춰서 random값을 불러올 공간을 마련해 준 뒤에
		//System.out.println("랜덤값: " + random);
		// 출력문을 작성함으로써 랜덤값 출력 가능해짐
		
		// 혹은 이렇게 한 큐로도 출력 가능!
		System.out.println("랜덤값: " + m1.method2());
		
		System.out.println("-------------------------");
		
		m1.method3(20, 10);
		// 매개변수가 여러 개인 경우에는
		// 호출 시의 전달값의 순서, 개수, 자료형이 정확히 일치해야 함
		
		System.out.println("-------------------------");
		
		// int result = m1.method4(42, 2);
		// System.out.println("두 수의 곱: " + result); // 처럼 출력해 주거나
		
		System.out.println(m1.method4(42, 2)); // 처럼 출력해 주거나
		
		// 반환값이 있는 경우: 호출 부분에서 반환값을 받아 줄 변수를 미리 선언하고 대입하는 구문을 쓰거나
		// 				    출력문 내부에서 호출하는 식으로 활용
		// 반환값이 없는 경우: 연산 결과를 사용자에게 보여 주고자 한다면 메소드 내부에서 출력문 활용

		System.out.println("-------------------------");
		
		// 2. MethodTest2 클래스 테스트
		// static 메소드이므로 대변할 이름 필요 없이 바로 호출 가능
		
		MethodTest2.method1();
		
		System.out.println("-------------------------");
		
		// MethodTest2.method2(); // 값만 담기고 String에 해당하는 출력문이 없으므로 출력되지 않음
		
		System.out.println(MethodTest2.method2());
		
		System.out.println("-------------------------");
		
		MethodTest2.method3("홍길동", 20); // 이미 출력문이 존재하는 상태이므로 자료형 맞춰서 값만 잘 입력해 주면 됨
		
		System.out.println("-------------------------");
		
		System.out.println(MethodTest2.method4(5, 11, '+'));
		
		
	}

}

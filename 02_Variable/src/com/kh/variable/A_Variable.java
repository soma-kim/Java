package com.kh.variable;

public class A_Variable {
	
	// 변수의 필요성
	// 시급과 근무 시간과 근무 일수를 곱해서 월급을 계산하는 프로그램
	public void printSalary() {
		
		System.out.println("===== 변수 사용 전 =====");
		
		System.out.println("시급: 9160원");
		System.out.println("근무시간: 6시간");
		System.out.println("근무일수: 5일");
		
		// 월급 = 시급 x 근무시간 x 근무일수
		// 홍길동: 00000 원 형식으로 출력
		
		// 자바의 문법
		// 1. 자바에서 문자열은 ""(쌍따옴표) 안에 표기한다.
		// 2. 자바에서 곱셈 연산은 x 표시가 아닌 * 표시로 표현한다. 
		// 3. 자바에서의 서로 다른 종류의 값들을 연이어 붙이고 싶을 때에는 + 표시로 표현한다.
		System.out.println("강성훈: " + 9160 * 6 * 5 + " 원");
		System.out.println("구샛별: " + 9160 * 6 * 5 + " 원");
		System.out.println("김도연: " + 9160 * 6 * 5 + " 원");
		System.out.println("김수빈: " + 9160 * 6 * 5 + " 원");
		
		// 내년에 시급 10,000원으로 바뀌었다면? 모든 시급 관련 출력물을 10,000원으로 수기로 바꿔 줘야 함
		// => 알바가 100명이면? 1,000명이면?? 실수로 잘못된 값을 입력할 수도 있음
		
		System.out.println(); // 줄 바꾸려고(엔터 효과) 의도적으로 쓴 것! 
		System.out.println("===== 변수 사용 후 =====");
		
		// 내가 쓰고자 하는 값들을 "변수"에 담아 둘 것
		// 4. 자바에서의 = 표시는 "대입하겠다"
		// 	    추가적으로 자바에서의 "같다"라는 의미는 == 기호가 담당한다
		
		int pay = 11000; // pay 라는 이름을 가진 상자에 10000 이라는 숫자를 보관해 두겠다
		// => 이제 시급이 올랐다면 시급에 대한 변수 값만 바꿔 주면 됨!
		int time = 6; // time 이라는 이름을 가진 상자에 6 이라는 숫자를 보관해 두겠다
		int day = 5; // day 라는 이름을 가진 상자에 5 라는 숫자를 보관해 두겠다
		
		System.out.println("시급: " + pay + " 원");
		System.out.println("근무시간: " + time + " 시간");
		System.out.println("근수일수: " + day + " 일");
		
		System.out.println("김정현: " + pay * time * day + " 원");
		System.out.println("나성진: " + pay * time * day + " 원");
		System.out.println("박성현: " + pay * time * day + " 원");
		
		/*
		 * *변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용됨(가독성 향상 = 변수의 이름이 값의 의미를 손쉽게 알게 해 줌)
		 * 2. 단 한 번 값을 기록해 두고 필요할 때마다 계속 사용할 목적으로 사용됨(재사용성 좋아짐)
		 * 3. 유지보수를 보다 편하게 할 수 있음
		 */
		
	}
	

}

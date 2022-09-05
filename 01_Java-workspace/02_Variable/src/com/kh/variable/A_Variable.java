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
		
	} // printSalary 메소드 영역 끝, 메소드 안에 또 다른 메소드를 만들 수 없기 때문에 기존 메소드 영역 밖에서 진행해야 함
	
	// 변수의 선언
	public void declareVariable() {
		
		/*
		 * *변수의 선언
		 * 선언? 값을 기록하기 위한 변수를 메모리 공간에 할당하겠다는 뜻
		 * == 값을 기록하기 위한 변수를 메모리 공간에 확보해 두겠다 (땅따먹기)
		 * == 값을 담아둘 수 있는 상자를 만들겠다
		 * 
		 * [ 표현법 ] 자료형 변수명;
		 *  - 자료형: 변수의 크기 및 모양을 지정하는 부분(종류를 지정)
		 *  - 변수명: 변수의 이름을 지정하는 부분
		 *  
		 * *변수 선언 시 주의할 점
		 * 1. 변수명은 소문자로 시작하게끔 이름 지어 줄 것(자바 명명 규칙에 따름, 단! 낙타표기법 지키기)
		 * 2. 같은 영역({}) 안에서는 동일한 변수명으로 선언 불가함
		 * 3. 해당 영역({}) 에 선언된 변수는 해당 영역 안에서만 사용 가능
		 * 	  => 다른 메소드에서는 사용 불가(지역변수 개념)
		 * 
		 */
		
		// ----- 자료형에 대한 개념 -----
		// 기본 자료형 8가지
		// 1. 논리형 (논리값 = true / false)
		boolean isTrue; // 1byte짜리 빈 상자가 만들어짐
		
		// 2. 숫자형
		// 2_1. 정수형
		byte bNum; // 1byte (정수 -128 ~ 127까지만 담을 수 있음, 256개)
		short sNum; // 2byte (정수 -32768 ~ 32767까지만 담을 수 있음)
		int iNum; // 4byte (정수 -21억xx ~ 21억xx) => 정수형 자료형 중에서 기본 (CPU는 연산 시 4byte 단위로 처리하기 때문)
		long lNum; // 8byte (제일 많은 범위의 수를 표현 가능)
		
		// 2_2. 실수형
		float fNum; // 4byte => 소수점 아래 7자리까지 표현 가능
		double dNum; // 8byte => 소수점 아래 15자리까지 표현 가능, 실수형 자료형 중에서 기본 (더 정밀한 표현이 가능하기 때문)
		
		// 3. 문자형
		char ch; // 2byte => 문자 하나가 담김
		
		// ----- 여기까지 총 8개의 기본 자료형 -----
		
		// 참조 자료형 1가지
		// 4. 문자열형
		String str; // 표면상 4byte => 문자열의 길이는 가늠할 수 없기 때문에 4byte짜리 상자에 실제 값이 담기지는 않음!
		
		// ----- 여기까지 총 9개의 빈 상자가 생성됨 -----
		
		/*
		 * *변수에 값을 대입한다
		 * 변수에 값을 담기 == 빈 상자에 담기
		 * 
		 * [ 표현법 ] 변수명 = 값;
		 * 
		 * 대입 연산자 실행 순서 int pay = 10000;
		 * first: int pay
		 * second: 10000
		 * third: =
		 */
		
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // L, l: long type임을 알려 주기 위해서 쓰는 것! (대소문자 상관없으나 대문자 권장)
		
		fNum = 4.0f; // f: float type임을 알려 주기 위해서 "반드시" 써야 함
		dNum = 8.0;
		
		ch = 'A'; // 문자는 반드시 '' (홑따옴표) 안에 작성해야 한다
	
		str = "ABC"; // 문자열은 반드시 "" (쌍따옴표) 안에 작성해야 한다
		
		// 각 변수에 담긴 값들을 출력
		System.out.println("isTrue :" + isTrue); // isTrue: true
		System.out.println("bNum: " + bNum);
		System.out.println("sNum: " + sNum);
		System.out.println("iNum: " + iNum);
		System.out.println("lNum: " + lNum);
		System.out.println("fNum: " + fNum);
		System.out.println("dNum: " + dNum);
		System.out.println("ch: " + ch);
		System.out.println("str: " + str);
		
	} // declareVariable 메소드 영역 끝
	
	// 변수 선언과 동시에 초기화(=제일 먼저 이루어지는 대입)
	public void initVariable() {
		
		/*
		 * *변수 선언과 동시에 초기화
		 * 상자를 만듦과 동시에 값을 채워 넣겠다
		 * 
		 * [ 표현법 ] 자료형 변수명 = 값;
		 *     순서:    (1) (3)(2)
		 * 
		 */
		
		// 기본 자료형 8가지
		// 1. 논리형
		boolean isTrue = 3 + 5 < 1; // 서로 다른 메소드에 같은 변수명 괜찮아요~! 1btye
		// boolean isTrue = false; 와 같은 구문임
		// 3 + 5 < 1: 3 + 5가 (8이) 1보다 작습니까? => 아니오(false)
		// 논리형 변수에는 물론 true/false가 들어갈 수 있지만
		// 연산 결과가 논리값인 수식도 들어갈 수 있음
		
		// 2_1. 정수형
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 4; // 4byte
		long lNum = 8L; // 8byte
		
		// 2_2. 실수형
		float fNum = 4.0f; // 4byte
		double dNum = 8.0; // 8byte
		
		// 3. 문자형
		char ch = '김'; // 2byte
		
		// 참조 자료형 1가지
		// 4. 문자열형
		String str = "자바 공부 중";
		
		// 각 변수에 담긴 값 출력
		System.out.println("isTrue: " + isTrue);
		System.out.println("bNum: " + bNum);
		System.out.println("sNum: " + sNum);
		System.out.println("iNum: " + iNum);
		System.out.println("lNum: " + lNum);
		System.out.println("fNum: " + fNum);
		System.out.println("dNum: " + dNum);
		System.out.println("ch: " + ch);
		System.out.println("str: " + str);
		
	} // initVariable 메소드 영역 끝
	
	// 상수
	public void constant() {
		
		// 변수일 경우
		int age = 20;
		
		System.out.println("age: " + age); // 20
		
		age = 25;
		
		System.out.println("변경된 age: " + age); // 25
		
		// 상수일 경우
		// 한 번 기록된 값은 변경 불가함(항상 고정적인 값을 기록할 때 사용, 파이 같은 거)
		// [ 표현법 ] final 자료형 상수명 = 값;
		// => 상수명은 대문자로 짓는다
		
		final int AGE = 20;
		
		System.out.println("상수 age: "+ AGE); // 20
		
		// 만약에 이 시점에서 AGE 라는 상자에 값을 또 대입하는 구문이 나온다면?
		// AGE = 21; // 오류를 발생시킴
		
		
		
	}

}

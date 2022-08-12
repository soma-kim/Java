package com.kh.variable;

// 형변환과 관련된 개념
public class C_Cast {
	
	/*
	 * *형변환: 값의 자료형을 바꾸는 개념
	 * 1. 대입 연산자(=) 를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 함
	 * 	  => 즉, 같은 자료형에 해당되는 값만 대입이 가능
	 *	  => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 먼저 이루어져야 함 (필수)
	 *        왼쪽                  =     오른쪽
	 *     값이 들어갈 공간             값으로 넣고 싶은 애(얘를 대입하기 전 형 변환 먼저 해 줌!)
	 * [ 표현법 ] 자료형 변수명 = (바꿀자료형)값;
	 * 
	 * 2. 같은 자료형끼리만 연산이 가능함
	 * 	  => 즉, 다른 자료형끼리 연산을 수행하고 싶으면 적어도 둘 중에 하나는 "형변환"을 먼저 한 후 자료형을 맞춰 줘야 함(필수)
	 * [ 표현법 ] 값 + (바꿀자료형)값;
	 * 
	 * 3. 1, 2번 규칙을 합쳐서
	 *	   같은 자료형끼리 연산이 이루어진 경우 그 연산 결과는 동일한 자료형으로 나옴
	 *	  => 즉, 같은 자료형끼리 연산이 이루어진 결과는 그 동일한 변수에만 대입 가능
	 *		ex) int result = int형숫자 + int형숫자;
	 * 
	 * *형변환의 종류
	 * 1. 자동 형변환: 컴퓨터에서 자동으로 형변환이 진행되기 때문에 내가 직접 형변환을 할 필요가 없음
	 * 			      작은 바이트의 자료형 => 큰 바이트의 자료형
	 * 2. 강제 형변환(명시적 형변환-이름을 붙여 주며 형변환을 하겠다): (바꿀자료형)값처럼 바꿀 자료의 이름을 붙여 줌
	 * 			 : 자동 형변환이 되지 않아 직접 강제로 형변환 해야 하는 경우
	 * 			      큰 바이트의 자료형 => 작은 바이트의 자료형
	 * [ 표현법 ] (바꿀자료형)값; 
	 * ex) 휴대폰 상자에 에어팟, 애플워치? 넣을 수 있음 = 자동 형변환
	 *	      휴대폰상자에 패드, 노트북? 넣을 수 없음 = 강제 형변환
	 * 
	 * *(바꿀자료형): 형변환 "연산자" == Cast 연산자
	 */
	
	// 자동 형변환: 작은 바이트 => 큰 바이트로 자동 형변환되는 경우
	public void autoCasting() {
		
		// 1. int (4byte 정수) -> double (8byte 실수)
		int i1 = 10;
		double d1 = i1; // 자동으로 형변환이 되었다
						// 10 -> 10.0
		// double d1 = (double)i1; // 라고 써도(강제 형변환 해도) 무방하나 자동으로 해 주니까 굳이! 
		
		System.out.println("d1: " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result2 = i2 + d2; // 12.0(자동 형변환) + 3.3 = 15.3
		// double result2 = (double)i2 + d2; // 과 같다
		
		System.out.println("result2: " + result2); // 15.3
		
		// 2. int (4byte) -> long (8byte)
		int i3 = 1000;
		long l3 = i3;
		// long l3 = (long)i3; //과 같다
		
		System.out.println("l3: " + l3);
		
		long l4 = 2000; // L을 안 붙였으므로 int 자료형의 2000으로 인식하나 long 타입의 상자를 만들면서 자동형변환 된 것
		// long l4 = (long)2000; // 이것들과
		// long l4 = 2000L;      // 같다
		
		// 특이 케이스 3. long (8byte) -> float (4byte)
		// 정수가 실수로 담길 때에는 큰 사이즈의 정수가 작은 사이즈의 실수에 대입 가능
		// 4byte float은 사실 long 형보다 담을 수 있는 범위가 더 크기 때문
		// +질문 추가 답변: 실수는 소수점 아래를 더 많이 계산해 주기 때문에 사실 정수의 범위가 더 크다고 할 수 있다...?! 는 것처럼 답변해 주심 소수점의 계산 체계는 다르다고...!! 
		
		long l5 = 1000;
		float f5 = l5; // 1000.0
		// float f5 = (float)l5; // 와 같음
		
		System.out.println("f5: " + f5);
		
		// 특이케이스 4. char (2byte) <-> int (4byte) 양방향 형변환 가능
		// char의 범위: 0 ~ 65535
		//		           각 문자마다 고유의 정수값이 정해져 있음
		// => 해당 정수값들을 각 문자로 매칭시켜 주는 아스키코드표(0 ~ 127, 128가지의 문자를 나타낼 수 있음 - 영문자 대소문자 알파벳, 숫자, 특수문자)
		// => 아스키코드표의 확장된 개념으로 유니코드표(0 ~ 65535, 65536가지의 문자를 나타낼 수 있음 - 영어, 숫자, 특수문자, 한글, 그 이외의 언어)
		
		char ch = 65;
		// char ch = (char)65; // 와 같음
		System.out.println("ch: " + ch); // A => 아스키코드표 기준 65가 대문자 A
		
		int num = 'A';
		// int num = (int)'A'; // 와 같음
		System.out.println("num: " + num); // 65
		
		System.out.println('김'); // 김
		System.out.println((int)'김'); // 44608
		
		int sum = 'A' + 10; // 유추: (1) 산술적인 연산 결과로는 75
							// 		(2) 문자로써 연산 결과로는 'K'
		

		System.out.println("sum: " + sum); // 75
		System.out.println("sum: " + (char)sum); // K
		
		System.out.println("A가 a보다 큽니까?: " + ('A' > 'a')); // false, 아스키코드표 기준 A = 65, a = 97
		//문자끼리 숫자만 가능한 연산도 가능하다!
		
		// 특이 케이스 5. byte끼리의 연산, short끼리의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		// byte result = b1 + b2;
		// Type mismatch: cannot convert from int to byte: 자료형이 맞지 않아! int를 byte로 바꿀 수 없어
		
		byte result = (byte)(b1 + b2); // 정수형의 기본형은 int이기 때문에 나타나는 오류이므로 결과값 int를 byte로 변환
		// byte나 short로 연산 시 무조건 연산 결과를 int로 취급됨
		// => 강제로 형변환을 하면 저장 가능
		
	}

	// 강제 형변환(명시적 형변환): 큰 크기의 자료형을 작은 크기의 자료형으로 형변환 할 경우
	public void forceCasting() {
		
		// 1. double (8byte) -> float (4byte)
		//float f1 = 4.0;
		float f1 = 4.0f; // 실수형은 기본 double형으로 간주하므로 반드시 f를 붙여 줘야 함!
		// float f1 = (float)4.0; // 혹은 이렇게 
		
		double d2 = 8.0;
		// float f2 = d2;
		float f2 = (float)d2;
		
		// 2. double (8byte) -> int (4byte)
		double d3 = 10.89;
		int i3 = (int)d3; // 10.89 -> 10
		
		System.out.println("i3: " + i3);
		// 10 소수점 아래 내용이 절삭됨(즉, 소수점 아래 데이터가 손실되므로 신중히 진행해야 함)
		
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum;
		// int가 4byte, double이 8byte이므로 int가 double로 자동 형변환(오른쪽 값)되지만 int 상자(왼쪽 공간)에 담고 싶어서 오류가 뜨는 것!
		// iNum이 double 형으로 자동 형변환되고(10 -> 10.0)
		// iNum과 dNum이 더해지면서 15.89가 됨
		// => double 형태 결과인 15.89 값이 int형 상자인 iSum에 담기려고 해서 오류
		
		// 해결 방법 1. 연산결과를 int형에 맞춰서 강제 형변환
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum: " + iSum); // 15
		
		// 해결 방법 2. 덧셈 연산 전에 dNum을 int형으로 강제 형변환 후에 덧셈 진행
		
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2: " + iSum2); // 15
		
		// 해결 방법 1과 해결 방법 2의 순서 차이
		// 해결 방법 1
		// 1단계: iNum이 double로 자동형변환
		// 2단계: 바뀐 iNum과 dNum이 더해지고
		// 3단계: 더해진 결과가 int형으로 강제형변환
		
		// 해결 방법 2
		// 1단계: dNum이 int로 강제형변환
		// 2단계: iNum과 dNum이 더해짐
		
		// 해결 방법 3. 애초에 결과값을 담을 변수를 double형으로 지정
		
		double dSum = iNum + dNum; // iSum은 자동형변환으로 double로 형변환 되며, 데이터 손실 없이 정확한 값이 담김
		System.out.println("dSum: " + dSum);
		
	}
	
	/* 
	 * (바꾸고자하는자료형)값;
	 * 
	 * 작은사이즈 -> 큰사이즈
	 * 큰사이즈 -> 작은사이즈
	 * 
	 */
	
}

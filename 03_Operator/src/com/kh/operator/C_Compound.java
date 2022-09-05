package com.kh.operator;

// 복합 대입 연산자
public class C_Compound {
	
	/*
	 * 복합 대입 연산자: 산술 연산자와 대입 연산자를 함께 사용하는 연산자
	 * 
	 * [ 종류 ]
	 *  +=
	 *  -=
	 *  *=
	 *  /=
	 *  %=
	 *	=> 해당 산술 연산 진행 후에 자기 자신한테 대입하겠다
	 *
	 * ex) a = a + 3;
	 * 	   a += 3;
	 *
	 */
	
	public void method() {
		
		int num = 12;
		
		System.out.println("현재 num: " + num);
		
		// num을 3 증가시키기
		num = num + 3;
		System.out.println("3 증가시킨 num: " + num);
		 
		// num을 3 증가시키기
		num += 3;
		System.out.println("또 3 증가시킨 num: " + num);
		
		// num을 5 감소시키기
		num -= 5; // num = num - 5;
		System.out.println("5 감소시킨 num: " + num);
		
		// num을 6배 증가시키기
		num *= 6; // num = num * 6;
		System.out.println("6배 증가시킨 num: " + num);
		
		// num을 2배 감소시키기
		num /= 2; // num = num / 2
		System.out.println("2배 감소시킨 num: " + num);
		
		// num을 4로 나눴을 때의 나머지
		num %= 4; // num = num % 4
		System.out.println("최종 num: " + num );
		
		// +: 숫자끼리 연산하면 덧셈, 문자열과 다른 타입끼리 연산하면 접합(한 개의 문자열로 연이어짐)
		// +=: 문자열에도 적용 가능
		
		String str = "Hello";
		str += " World"; // str = str + " World";
		System.out.println(str);
	}

	

}

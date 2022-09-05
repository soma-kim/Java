package com.kh.operator;

// 논리 부정 연산자
public class D_LogicalNegation {
	
	/*
	 * 논리 부정 연산자: 단항 연산자로써 논리값(true / false) 를 반대로 바꿔 주는 연산자
	 * 
	 * [ 표현법 ]
	 * !논리값
	 */
	
	public void method() {
		
		System.out.println("true의 부정: " + !true);
		System.out.println("false의 부정: " + !false);
		
		boolean b = true;
		boolean b2 = !b;
		
		// b2에는 false가 들어 있을 것임
		// b에는 원본 true가 있을지, false로 바뀌어 대입되어 있을지 궁금해
		
		System.out.println("b: " + b);
		System.out.println("b2 = " + b2);
		
		// 논리 부정 연산자는 연산 결과를 다시 자기자신에게 대입하지 않음
		
		System.out.println(!(3 + 5 < 1));
	}

}

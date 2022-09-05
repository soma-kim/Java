package com.kh.operator;

// 증감 연산자
public class B_InDecrease {
	
	/*
	 * 증감 연산자: 단항 연산자로써 값을 1씩만 증가시키거나 혹은 감소시키는 연산자
	 * 
	 * [ 종류 ]
	 * ++: 값을 1씩 증가시키는 연산자
	 * 		++값(전위 연산자)
	 * 		값++(후위 연산자)
	 * 
	 * --: 값을 1씩 감소시키는 연산자
	 * 		--값(전위연산자)
	 * 		값--(후위연산자)
	 * 
	 * (증감 연산자)값: 전위연산 => 선 증감 후 처리
	 * 값(증감 연산자): 후위연산 => 선 처리 후 증감
	 */
	
	public void method1() {
		
		int num = 10;
		
		System.out.println("num: " + num);
		
		num++; // num에 1을 증가시키겠다
			   // num = num + 1; 와 같은 의미
		
		System.out.println("변경된 num: " + num);
		
		int num2 = 10;
		
		System.out.println("num2: " + num2);
		
		num2--; // num2에 1을 감소시키겠다
				// num2 = num2 - 1; 와 같은 의미
		
		System.out.println("변경된 num2: " + num2);
	}
	
	public void method2() {
		
		// ++ 기준으로
		// 전위 연산: 선 증감 후 처리
		int a = 10; // 이 시점에서는 a의 값이 10
		int b = ++a; // a의 값이 우선적으로 1 증가 후 b에 대입
		
		System.out.println("a: " + a + ", b: " + b); // a: 11, b: 11
		
		// 후위연산: 선 처리 후 증감
		int c = 10; // 이 시점에서는 c의 값이 10
		int d = c++; // 우선적으로 d에 c의 값이 대입되고 나서 c가 1 증가
		// 후위연산이 보이면 일단 지우고 시작해!
		// int d = c; 로 계산한 다음 ++ 살려서 c = c+1 = 11로 생각하기
		
		System.out.println("c: " + c + ", d: " + d); // c: 11, d: 10

	}
	
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ * 3;
		
		// 후위연산자니까 지우고 생각해 보면 result1: 60
		// 계산 후 후위연산자 살려서 계산하면 num1: 21
		
		System.out.println("num1: " + num1); // 21
		System.out.println("result1: " + result1); // 60
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		// 전위연산자는 가릴 필요 없음! num2: 21
		// result2 = 21 * 3 = 63
		
		System.out.println("num2: " + num2); // 21
		System.out.println("result2: " + result2); // 63
		
		// 요령: 후위 연산자 같은 경우는 일단 없다 생각하고 처리할 걸 먼저 처리한 다음 살리기!
	}
	
	// 퀴즈
	public void method4() {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		int d = c / a;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		
		// a = 5; -> 6 -> 7
		// b = 10; -> 9
		// c = 16; -> 15
		// d = 2; -> 1
		// e = 4; -> 5 -> 6
		// f = 4;
		// g = 9 + 2 = 11; -> 10
		// h = 2
		// i = 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
		//	 = 6 + 9 / 3 * 10 % 8
		//	 = 6 + 9 / 3 * 10 % 8
		//	 = 6 + 3 * 10 % 8
		//	 = 6 + 30 % 8
		//	 = 6 + 6
		//	 = 12
		
		
		System.out.println(a); // 7
		System.out.println(b); // 9
		System.out.println(c); // 15
		System.out.println(d); // 1
		System.out.println(e); // 6
		System.out.println(f); // 4
		System.out.println(g); // 10
		System.out.println(h); // 2
		System.out.println(i); // 12
				
	}
}

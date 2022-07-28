package com.kh.operator;

import java.util.Scanner;

// 산술 연산자
public class A_Arithmetic {

	/*
	 * 산술 연산자: 이항 연산자로써 연산 방법과 우선 순위가 일반 수학 산술과 동일
	 * [ 종류 ]
	 * +: 덧셈
	 * -: 뺄셈
	 * *: 곱셈
	 * /: 나눗셈 					=> 나눗셈에서 몫을 구한다
	 * %: 모듈러(Modular,나머지)	=> 나눗셈에서 나머지를 구한다
	 * 
	 */
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		// 문자열과 int를 연결지어 주는 +와
		// 숫자끼리의 산술연산을 해 주는 +의 우선순위가 동일하기 때문에
		// 왼쪽에서부터 차례대로 연산이 진행되기 때문에 ()로 실제 산술연산인 +의 우선순위를 높여 줌
		
		// System.out.println("num1 - num2 = " + num1 - num2);
		// 문자열 int를 연결지어 주는 +와
		// 숫자끼리의 산술연산을 해 주는 -의 우선 순위가 동일하기 때문에
		// 문자열 - 숫자 => undefined가 발생한 것
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		// 소괄호로 우선순위 매겨 주면 됨
		
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		// 곱셈, 나눗셈, 모듈러의 경우 덧셈보다 우선순위가 높기 때문에
		// 소괄호() 로 묶지 않아도 정확한 결과가 나옴
		// => 다만! 소괄호로 묶는 게 가독성이 좋으므로 권장함
		
		// System.out.println(10 / 0);
		// ArithmeticException: / by zero 오류
		// 수학과 마찬가지로 프로그래밍 상에서 0으로 나누기는 불가함. 주의!
		
		// System.out.println(10 % 0);
		// 나머지를 구할 때도 나눗셈을 해야 하니까 같은 오류 나옴!
		
		//실수일 경우
		double a = 35; // 35.0
		double b = 10; // 10.0
		
		System.out.println("a + b = " + (a + b)); // 45.0
		System.out.println("a - b = " + (a - b)); // 25.0
		System.out.println("a * b = " + (a * b)); // 350.0
		System.out.println("a / b = " + (a / b)); // 3.5
		System.out.println("a % b = " + (a % b)); // 5.0
		
		// 실수끼리의 실행 결과는 실수
	}
	
	// 응용문제
	public void method2() {
		
		/*
		 * 인원 수와 사탕의 갯수를 키보드로부터 입력받고
		 * 1인당 동일하게 나눠 가진 사탕의 개수와
		 * 남은 사탕의 개수를 출력하세요
		 * 
		 * 실행 예시
		 * 인원 수: x
		 * 사탕 개수: x
		 * 
		 * 1인당 나눠 가진 사탕 개수: x
		 * 남는 사탕 개수: x
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수: ");
		int person = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("사탕 개수: ");
		int candy = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println();
		
		// System.out.println("1인당 나눠 가진 사탕 개수: " + (candy / person));
		// System.out.println("남는 사탕 개수: " + (candy % person));
		
		System.out.printf("1인당 나눠 가질 사탕 개수: %d \n", (candy / person));
		System.out.printf("남는 사탕 개수: %d \n", (candy % person));
	}
}

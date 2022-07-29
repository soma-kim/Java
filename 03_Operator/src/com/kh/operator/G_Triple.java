package com.kh.operator;

import java.util.Scanner;

// 삼항 연산자
public class G_Triple {
	
	/*
	 * *삼항 연산자: 3개의 항목을 가지고 연산하는 연산자
	 * 
	 * [ 표현법 ]
	 * 조건식 ? 조건식이true일경우의결과값 : 조건식이false일경우의결과값
	 * 
	 * 조건식: 연산의 결과가 true 아니면 false로 나오는 식
	 *
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 양수인지 아닌지 판별 후에 그에 맞는 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// String result = 조건식 ? true일경우원하는값 : false일경우원하는값
		
		String result = (num > 0) ? "양수입니다." : "양수가 아닙니다.";
		
		// x은 양수입니다.
		// System.out.println(num + "은 " + result);
		
		//System.out.println(num + "은 " + ((num > 0) ? "양수입니다." : "양수가 아닙니다."));
		// 산술연산이 삼항연산보다 우선순위가 높으므로
		// 삼한 연산 부분의 우선순위를 높여 줘야 한다.
		
		System.out.println(num + "은 " + ((num <= 0) ? "양수가 아닙니다." : "양수입니다."));
		// 결론적으로 같은 결과를 출력하지만
		// 조건에 따라서 참 거짓 결과가 다르므로 : 기준으로 왼쪽과 오른쪽에 내용이 다를 수도 있다.
		
	}
	
	public void method2() {
		// 사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		String result = (num % 2 == 1) ? "홀수입니다." : "짝수입니다.";
		
		System.out.printf("%d은 %s \n", num, result);
	}
	
	public void method3() {
		
		// 사용자로부터 영문자 하나를 입력받아서 대문자인지 대문자가 아닌지 판별 후 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 한 문자 입력: ");
		char ch = sc.nextLine().charAt(0);
		
		// String result = (ch >= 65 && ch <= 90) ? "대문자입니다." : "대문자가 아닙니다.";
		String result = ((ch >= 'A') && (ch <= 'Z')) ? "대문자입니다." : "대문자가 아닙니다.";
		
		//System.out.println("영문자는 " + result);
		System.out.printf("%c는 %s", ch, result);
		
	}
	
	public void method4() {
		
		// method1의 내용 보완
		// 사용자가 입력한 정수값이 양수인지, 0인지, 음수인지 판별 후 그에 맞는 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 삼항연산자 특) true 아니면 false일 경우 두 가지만 제공
		// String result = (조건식) ? true일경우 : ((조건식) ? true일경우 : false일경우);
		String result = (num > 0) ? "양수입니다." : ((num == 0) ? "0입니다." : "음수입니다."); 
		
		System.out.println(result);
		
		// 내가 표현하고 싶은 경우의 수가 3개 이상일 경우에는
		// 삼항연산자 안에 삼항연산자를 중첩해서 사용할 수 있음!!!
	}
	
	// 실습 문제
	
	public void method5() {
		
		/* 사용자로부터 나이를 입력받아서
		 * 나이가 13세 이하면 "어린이입니다."
		 * 나이가 19세 미만이면 "청소년입니다."
		 * 나이가 19세 이상이면 "성인입니다."
		 * 
		 * 를 출력하세요
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		String result = (age <= 13) ? "어린이입니다." : ((age > 18) ? "성인입니다." : "청소년입니다.");
		
		System.out.println(result);
		
	}
	

}

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
	
	

}

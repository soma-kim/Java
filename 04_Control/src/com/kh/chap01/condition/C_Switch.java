package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * *Switch문: 조건문이 없는 조건문
	 * 		 	 내부적으로 동등비교 연산에 대해서만 조건식이 적용되는 구조
	 * 
	 * [ 표현법 ]
	 *  switch(앞으로내가동등비교를하고싶은대상자) {
	 *  case 값1 : 실행할코드; // 앞으로내가동등비교를하고싶은대상자 == 값1 << 일 경우에만 실행됨
	 *  			break; // switch 중괄호 영역을 빠져나
	 *  case 값2 : 실행할코드; // 앞으로내가동등비교를하고싶은대상자 == 값2 << 일 경우에만 실행됨
	 *  			brake; // switch 중괄호 영역을 빠져나감
	 * 	...
	 *  case 값n : 실행할코드;
	 *  			break;
	 *  default : 실행할코드; // 값1 ~ 값n까지 내가 동등비교를 하고 싶은 대상자와 단 하나도 일치하지 않을 경우 실행됨
	 *  				   // else 블럭에 해당됨
	 * 					   // 어차피 가장 마지막으로 실행되는 코드이기 때문에 break;를 쓰지 않음
	 * }
	 * 
	 * *if문과 switch문의 차이점
	 * if(조건식) => 조건식을 복잡하게도 기술 가능(자유도 높음), 값의 범위 제시 가 
	 * switch(동등비교대상자) => 동등 비교만 수행됨, 확실한 값의 조건만 기술 가능
	 */

	public void method1() {
		
		// 1 ~ 3 사이의 정수를 입력받아
		// 1인 경우 "빨간불입니다" 출력
		// 2인 경우 "파란불입니다" 출력
		// 3인 경우 "초록불입니다" 출력
		// 그 이외의 숫자를 입력한 경우 "잘못 입력했습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 사이의 정수 입력: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 기존의 if문 계열 버전
		/* if (num == 1) { // num == 1 
			System.out.println("빨간불입니다.");
		}
		else if (num == 2) { // num == 2 
			System.out.println("파란불입니다.");
		}
		else if (num == 3) { // num == 3
			System.out.println("초록불입니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		} */ 
		
		// => 모든 조건식이 num이라는 변수에 들은 값 기준으로 동등비교만 수행하고 있음
		
		// switch문 버전
		/*
		switch(num) {
		case 1 : System.out.println("빨간불입니다");
				break;
		case 2 : System.out.println("파란불입니다");
				break;
		case 3 : System.out.println("초록불입니다");
				break;
		default : System.out.println("잘못 입력했습니다");
		}
		*/
		
		String result = "";
		
		switch (num) {
		case 1 : result = "빨간불";
				break;
		case 2 : result = "파란불";
				break;
		case 3 : result = "초록불";
				break;		
		default : System.out.println("잘못 입력했습니다");
				return; // return문은 현재 실행 중인 메소드를 빠져나가
						// 나를 호출했던 부분으로 돌아가는 역할
		
		}
		
		System.out.println(result + "입니다");

	}
	
	// 숙제
	public void method2() {
		
		/* 
		 * 사용자에게 구매할 과일명(사과, 바나나, 복숭아) 을 입력받아
		 * 각 과일마다의 가격을 출력 (사과 1000원, 바나나 2000원,복숭아 5000원)
		 * xx의 가격은 xxxx원입니다. 출력(printf)
		 * 만약에 다른 과일명을 입력받은 경우 "저희 가게에서 판매하는 과일이 아닙니다" 출력
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 과일명을 입력하세요: ");
		String fruit = sc.nextLine();
		
		int result = 0;
		
		switch (fruit) {
		
		case "사과" : result = 1000;
					break;
			
		case "바나나" : result = 2000;
					break;
			
		case "복숭아" : result = 5000;
					break;
			
		default : System.out.print("저희 가게에서 판매하는 과일이 아닙니다");
				return;
					
		}
				
		System.out.printf("%s의 가격은 %d원입니다.", fruit, result);
		
	}
}

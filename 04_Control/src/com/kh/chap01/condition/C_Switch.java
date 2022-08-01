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
		
		
		/* Scanner sc = new Scanner(System.in);
		
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
		
		*/
		
		// if문 계열 버전 (선생님 추가 풀이)
		// => 제대로 된 문자열을 입력받았음에도 불구하고 잘못된 결과가 나오는 이슈 발생(무조건 else 출력문 나옴)
		
		// 기본 자료형 (boolean, int, byte, short, long, float, double, char)들끼리
		// 동등 비교(==, !=) 가 잘 이루어짐
		
		// 참조 자료형 (String)을 동등비교 하고자 할 경우 동등 비교(==, !=)가 잘 이루어지지 않음
		// => stack 영역에 주소값이 담기기 때문에 주소값 기준으로 비교가 이루어짐!!
		
		// 문자열 내용물을 동등 비교 하고자 할 경우에는 equals 메소드를 활용해야 함
		
		// [ 표현법 ] 문자열.equals(동등비교하고자하는문자열);
		// => 내용물이 일치할 경우 true, 아닐 경우 false를 내보내 줌
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 과일명을 입력하세요: ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		if (fruit.equals("사과")) { // fruit == "사과" 는 알게 모르게 주소값을 비교한 거였다!!
			price = 1000;
		}
		else if (fruit.equals("바나나")) { 
			price = 2000;
		}
		else if (fruit.equals("복숭아")) {
			price = 5000;
		}
		else {
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다.");
			return;
		}
		
		System.out.printf("%s의 가격은 %d원입니다.", fruit, price);
		 
	}
		
	// break를 안 쓰는 경우
	public void method3() {
		
		// 사용자로부터 키보드로 등급을 입력받아 해당 등급별로 권한 출력하기
		// 1등급: 관리 권한, 쓰기 권한, 읽기 권한
		// 2등급: 쓰기 권한, 읽기 권한
		// 3등급: 읽기 권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요: ");
		int grade = sc.nextInt();
		
		sc.nextLine();
		
		switch (grade) {
		
		case 1 : System.out.println("관리 권한 부여");
		case 2 : System.out.println("쓰기 권한 부여");
		case 3 : System.out.println("읽기 권한 부여");
		
		}
		
		// 내가 동등비교 후에 true가 나오는 시점에서 코드가 시작되지만
		// break 구문이 나타날 때까지는 계속 실행이 되는 구조
		
	}
	
	public void method4() {
		
		// 사용자로부터 주민번호를 입력받은 후 성별 판별
		// xxxxxx-*xxxxxx => * 부분이 성별을 나타내는 자리(1, 3: 남자 / 2, 4 : 여자)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력 (-포함): ");
		String personId = sc.nextLine();
		
		// 성별 자리 추출
		
		char gender = personId.charAt(7);
		
		// 성별 값을 담을 수 있는 문자열 변수 세팅
		String result = "";
		
		switch (gender) {
		case '1' : result = "남자"; break;
		case '2' : result = "여자"; break;
		case '3' : result = "남자"; break;
		case '4' : result = "여자"; break;
		default : System.out.println("잘못된 주민번호를 입력했습니다."); return;
		
		/* break문을 만나기 전까지는 빠져나가지 못하는 점을 이용해 이런 식으로 코드를 줄일 수도 있다
		 * case '1' : 
		 * case '3' : result = "남자"; break; // gender == '1' || gender == '3'
		 * case '2' :
		 * case '4' : result = "여자"; break; // gender == '2' || gender == '4'
		 * default : System.out.println("잘못된 주민번호를 입력했습니다."); return;
		 */
				
		}
		
		 System.out.println(result + "입니다.");
	}
	
	public void method5() {
		
		// 사용자로부터 1 ~ 12 사이의 월을 입력받아
		// 해당 달의 마지막 날짜를 출력하는 프로그램
		// 1, 3, 5, 7, 8, 10, 12월 => 31일까지입니다.
		// 4, 6, 9, 11 => 30일입니다.
		// 2 => 28일 또는 29일까지입니다.
		// 그 이외의 => 반드시 1 ~ 12월 사이를 입력해야 합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12): ");
		int month = sc.nextInt();
		
		sc.nextLine();
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println("31일까지입니다."); break;
		case 4 :
		case 6 : 
		case 9 :
		case 11 : System.out.println("30일입니다."); break;
		case 2 : System.out.println("28일 또는 29일까지입니다."); break;
		default : System.out.println("반드시 1 ~ 12월 사이를 입력해야 합니다."); return;
		
		}
	} 
	
	// 숙제
	public void method6() {
		
		/*
		 * 사용자에게 1월 ~ 12월 사이의 월을 입력받아 해당 달에 해당하는 계절을 출력
		 * 
		 * 3, 4, 5: "봄입니다."
		 * 6, 7, 8: "여름입니다."
		 * 9, 10, 11: "가을입니다."
		 * 12, 1, 2: "겨울입니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월(1~12)을 입력하시오: ");
		
		int month = sc.nextInt();
		
		sc.nextLine();
		
			switch(month) {
			case 3 :
			case 4 : 
			case 5 : System.out.println("봄입니다."); break;
			case 6 :
			case 7 :
			case 8 : System.out.println("여름입니다."); break;
			case 9 :
			case 10 :
			case 11 : System.out.println("가을입니다."); break;
			case 12 :
			case 2 : 
			case 1 : System.out.println("겨울입니다."); break;
			default : System.out.println("잘못 입력하셨습니다."); return;
				
			}
		
		}
	}


			


	
	
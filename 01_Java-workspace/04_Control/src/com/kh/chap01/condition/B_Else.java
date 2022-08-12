package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * *if-else문: 표현하고 싶은 경우의 수가 두 개일 경우 사용하는 조건문
	 * 
	 * [ 표현법 ]
	 * if(조건식) {
	 * 		해당 조건식이 true일 경우 실행하고자 하는 코드;
	 * }
	 * else {
	 * 		해당 조건식이 false일 경우 실행하고자 하는 코드;
	 * }
	 * 
	 * => 조건식의 결과가 true일 경우 if 블럭 안을 실행하고 if-else문 자체를 빠져나감
	 * 
	 */
	
	public void method1() {
		
		// 사용자에게 정수값을 입력받은 후 짝수, 홀수 판별 후 결과 출력
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 양수일 경우만 판별 가능하게끔 중첩 if문 사용
		
		if (num > 0) {
			
			// 짝수일 경우 또는 홀수일 경
			if (num % 2 == 0) { // 짝수일 경우
				System.out.println("짝수입니다. ");
			}
			else { // 짝수가 아닐 경우
				System.out.println("홀수입니다.");
			}
			// else 블럭에서는 별도의 조건을 내세울 필요가 없음!!
			// 조건식 결과가 true이면 else 블럭을 건너뛰기 때문에
			// 단독 if문 두 개로 표현하는 것보다 효율적임
			
		}
		else { // 양수가 아닙니
			System.out.println("양수만 입력해야 합니다.");
		}
		
	}
	
	/*
	 * if-else if문: 동일한 비교 대상을 가지고 3개 이상의 조건을 제시해 두고자 할 때 사용되는 조건문
	 * 
	 * [ 표현법 ]
	 * if (조건식1) {
	 * 		조건식1이 true일 경우 실행할 코드;
	 * }
	 * else if (조건식2) {
	 * 		조건식2가 true일 경우 실행할 코드;
	 * }
	 * else if (조건식3) {
	 * 		조건식3이 true일 경우 실행할 코드;
	 * }
	 * else {
	 * 		앞에서 제시한 모든 조건식들이 모두 false일 경우 실행할 코드;
	 * }
	 * 
	 */
	
	public void method2() {
		
		// 사용자로부터 정수 입력 후 양수, 0, 음수 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		if (num > 1) { // 양수일 경우
			
			System.out.println("양수입니다.");
			
		}
		else if (num == 0) {
			
			System.out.println("0입니다.");
			
		}
		else {
			
			System.out.println("음수입니다.");
			
		}
	}

	
	// 실습 문제
	
	public void method3() {
		
		/*
		 * 사용자로부터 나이를 입력받고
		 * 13세 이하까지 어린이, 14세부터 18세까지 청소년, 19세 이상부터는 성
		 * 판별 후 출력
		 * 
		 * 경우의 수
		 * 우선적으로 고려해야 할 것: 나이는 0살부터 셀 수 있게끔(0보다 작을 경우 판별 불가)
		 * 						나이가 0살부터라면 판별
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		if ((age >= 0) && (age < 14)) {
			System.out.println("어린이입니다.");
		}
		else if (age < 19) {
			System.out.println("청소년입니다.");
		}
		else if (age >= 19) {
			System.out.println("어른입니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		
		/* 선생님 풀이
		 * 
		 * if (age < 0) { // 나이를 음수로 입력했을 경우
		 * 
		 *  System.out.println("잘못 입력했습니다.");
		 *  
		 *  }
		 *  else {
		 * 
		 * 		if (age <= 13) { // 나이가 13 이하라면 (+ 나이가 0살 이상이라면)
		 * 
		 * 		System.out.println("어린이입니다.");
		 * 
		 * 		}
		 * 		else if (age < 19) {
		 * 
		 *  		System.out.println("청소년입니다.");
		 * 		}
		 * 		else {
		 * 		
		 * 		System.out.println("성인입니다.");
		 * 
		 * 		}
		 * 	}
		 * 
		 */
	}
	
	// 숙제
	public void method4() {
	
	/*
	 * 사용자에게 정수를 입력받아
	 * 90점 이상일 경우 "A등급"
	 * 90점 미만 80점 이상일 경우 "B등급"
	 * 80점 미만 70점 이상일 경우 "C등급"
	 * 70점 미만일 경우 "D등급"
	 * 
	 * "당신의 점수는 xx점이고, 등급은 xxx입니다." 출력(printf)
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int score = sc.nextInt();
		
		sc.nextLine();
		
		String result = "";
		
			if (score >= 90) {
			result = "A등급";
			}
			else if (score >= 80) {
			result = "B등급";
			}
			else if (score >= 70) {
			result = "C등급";
			}
			else {
			result = "D등급";
			}
		
			System.out.printf("당신의 점수는 %d점이고, 등급은 %s입니다.", score, result);
			}


		/*
		 * 선생님 풀이
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("점수를 입력하세요: ");
		 * int score = sc.nextInt();
		 * 
		 * sc.nextLine();
		 * 
		 *  // 등급을 담을 수 있는 변수 지정(char)
		 * char grade = ' ';
		 *  // char 자료형의 경우 일반적으로 공백으로 초기화
		 * 
		 * if ((score > = 0) && (score <= 100)) {
		 *  // 0 ~ 100점 사이 = > 유효한 점수로 처리 (등급 판별이 가능)
		 *  	if (score >= 90) { // 90점 이상일 경우
		 *  	grade = 'A';
		 *  	}
		 *  	else if (score >= 80) { // 80점 이상일 경우
		 *  	grade = 'B';
		 *  	}
		 *  	else if (score >= 70) { // 70점 이상일 경우
		 *  	grade = 'C';
		 *  	}
		 *  	else { // 그 이외의 점수일 경우
		 *  	grade = 'D';
		 *  	}
		 *  
		 *  	// 이 시점에서 출력
		 *  	System.out.printf("당신의 점수는 %d점이고, 등급은 %c등급입니다.", score, grade);
		 *  
		 *  else {
		 *  	// 아닐 경우 => 잘못 입력했습니다. (등급 판별이 불가능)
		 *  	System.out.println("잘못 입력했습니다.");
		 *  
		 *  	return; // 나를 호출했던 메소드로 돌아감
		 *  }
		 *  
		 *  	// 이 시점에서 출력하면 잘못 입력한 경우에도 출력되게 되는데, 그러기 싫으면  240 줄처럼 return; 써 주면 됨!
		 *  	System.out.printf("당신의 점수는 %d점이고, 등급은 %c등급입니다.", score, grade);
		 */
	
	// 숙제
	public void method5() {
		/* 사용자로부터 이름을 키보드로 입력 받아 본인과 일치할 경우 "본인입니다. 어서오세요."
		 * 아닐 경우 "일치하지 않습니다. 돌아가세요" 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		
		String name = sc.nextLine();
		
		if(name.equals("김수빈")) {
			
			System.out.println("본인입니다. 어서오세요.");
			
		}
		else {
			System.out.println("본인이 아닙니다. 돌아가 주세요.");
		}
	}




}



package com.kh.chap01.condition;

import java.util.Scanner; // import 구문을 추가할 수 있는 단축키: Ctrl + Shift + o

public class A_If {

	/*
	 * *단독 if문: 표현하고자 하는 경우의 수가 한 개일 때
	 *
	 * [ 표현법 ]
	 * if(조건식) {
	 * 		조건식이 true일 경우 실행하고자 하는 코드;
	 * }
	 * => 조건식의 결과가 true일 때는 중괄호 블록 안의 코드 실행
	 * => 조건식의 결과가 false일 경우 중괄호 블록 안의 코드를 건너 뛰고 실행
	 */
	
	// 삼항 연산자를 조건문으로 바꿔 보자
	
	public void method1() {
		
		// 사용자로부터 정수값을 입력받은 후 양수, 0, 음수에 따른 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 삼항 연산자 버전
		// String result = (num > 0) ? "양수입니다." : ((num == 0) ? "0입니다." : "음수입니다.");
		
		// 단독 if문 버전
		if (num > 0) { // num이 양수일 경우
			System.out.println("양수입니다.");
		}
		
		if (num == 0) { // num이 0일 경우
			System.out.println("0입니다.");
		}
		
		if (num < 0) { // num이 음수일 경우
			System.out.println("음수입니다.");
		}
		
		System.out.println("메소드 영역 종료");
		
	}
	
	public void method2() {
		
		// 사용자가 입력한 정수값이 짝수인지 홀수인지 판별하여 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 삼항연산자 버전
		// String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		
		// 단독 if문 버전
		/*
		if ((num % 2 == 0) && (num > 0)) { // 짝수이면서 양수일 경우
			
			System.out.println("짝수입니다.");
		}
		
		// 어떤 수이든 간에 2로 나눴을 때의 나머지는 0 또는 1만 나옴
		if ((num % 2 != 0) && (num > 0)) { //홀수이면서 양수인 경우
			
			System.out.println("홀수입니다.");
		}
		*/
		
		// 중첩 if문
		if (num > 0) { // 양수일 경우
			
			// 한 번 더 검사
			if (num % 2 == 0) { // 짝수일 경우
				System.out.println("짝수입니다.");
			}
			
			if(num % 2 != 0) { // 홀수일 경우
				System.out.println("홀수입니다.");
				
			}
		}
		
		
	}
	
	public void method3() {
		
		// 사용자로부터 나이를 입력받곡 입력한 나이값을 가지고 어린이 청소년, 성인 출력
		// 어린이 (13세 이하), 청소년 (19세 미만), 성인 (19세 이상)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		if(age <= 13) { // 어린이일 경우
			
			System.out.println("어린이입니다.");
			
		}
		
		if ((age > 13) && (age < 19)) { // 청소년일 경우 (13세 초과 조건을 추가해야 함)
			
			System.out.println("청소년입니다.");
			
		}
		
		if (age >= 19) { // 성인일 경우
			
			System.out.println("성인입니다.");
		}
		
	}
	
	// 난이도 up
	public void method4() {
		
		// 사용자로부터 주민등록번호 입력받은 후
		// 남자, 여자 판별 후 결과 출력
		// 숫자라도 사칙연산(산술연산)을 하지 않으면 문자열로 취급
		
		// 참고: 주민번호 포맷 (생년월일6자-성별자리1자리xxxxxx)
		// (xxxxxx-*xxxxxx)
		
		// 1단계: 주민번호 입력받아서 변수에 담기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 (-포함): ");
		String personId = sc.nextLine();
		
		// 2단계: 입력받은 주민번호로부터 성별에 해당하는 자리만 추출
		
		char gender = personId.charAt(7);
		
		// 3단계: 뽑힌 값에 따라 서로 다른 결과를 출력 => 조건문 이용
		// 남자일 경우 '1', '3'
		// 여자일 경우 '2', '4'
		
		if ((gender == '1') || (gender == '3')) { // 남자일 경우 
			
		System.out.println("남자입니다.");
		
		}
		
		if ((gender == '2') || (gender == '4')) { // 여자일 경우 
			
			System.out.println("여자입니다.");
		}
		
		if ((gender != '1') && (gender != '2')
				&& (gender != '3') && (gender != '4')) { // 번호를 잘못 입력한 경우
			
			System.out.println("잘못된 주민등록번호를 입력했습니다.");
		}
	}
	
}

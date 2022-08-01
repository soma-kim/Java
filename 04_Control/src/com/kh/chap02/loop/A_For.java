package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * for문
	 * 반복하고자 하는 횟수가 정해져 있을 경우 사용
	 * 괄호 안에 반복을 지정하는 부분이 초기식, 조건식, 증감식으로 이루어져 있음
	 * 각 초기식, 조건식, 증감식에 의해서 반복할 횟수가 정해짐
	 * 
	 * [ 표현법 ]
	 * for(초기식; 조건식; 증감식) {
	 * 		반복적으로 실행하고자 하는 코드;
	 * }
	 * 
	 * - 초기식:반복문이 시작될 때 "초기에 단 한 번만 실행"되는 구문
	 * 		  (반복문에서 횟수를 지정할 때 쓰고자 하는 변수를 선언 및 초기화하는 구문)
	 * 			ex) int i = 1;
	 * - 조건식: "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 반복문 실행
	 * 			조건식이 false가 되는 순간 반복문이 멈춤
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 * 			ex) i < 10;
	 * - 증감식: 반복문을 제어하는 변수값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감식을 작성)
	 * 			ex) i++; 
	 * 
	 * *for문의 흐름
	 * for문을 만나는 순간
	 * 초기식  -> 조건식 (조건검사) -> true일 경우 -> 실행하고자 하는 코드 실행 -> 증감식
	 * 		-> 조건식 (조건검사) -> true일 경우 -> 실행하고자 하는 코드 실행 -> 증감식
	 * 		-> 조건식 (조건검사) -> true일 경우 -> 실행하고자 하는 코드 실행 -> 증감식
	 * 		...
	 * 		-> 조건식 (조건검사) -> fasle일 경우 -> 실행하고자 하는 코드 실행 x -> 반복문을 빠져나옴
	 * 
	 *		 => 매번 조건식의 조건검사를 통해 조건이 true일 경우에만 반복해서 실행
	 * 
	 * *조건식 부분에 대놓고 true라는 값이 들어가면? => 무한반복
	 * for(초기식; true; 증감식) 또는 for(;;) => 무한반복 
	 */
	
	public void method1() {
		
		// "안녕하세요"를 5번 반복해서 출력하고 싶음
		/* System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		*/
		
		// 적은 횟수일 경우에는 복사 붙여넣기가 가능하지만
		// 100번 반복하고 싶을 경우? 1000번 반복하고 싶을 경우? => 실수할 여지가 있음
		
		// i 변수 값이 1에서부터 5보다 작거나 같을 때까지 1씩 증가할 동안 반복
		// 1, 2, 3, 4, 5 (총 5회)
		for(int i = 1; i <= 5; i++) { // i는 index(순서 세기)의 약자
			
			System.out.println("안녕하세요");
		}
		
		// 5번 반복 돌리기 => 초기식, 조건식, 증감식은 항상 같을 필요가 없다!
		
		// i 변수값이 0에서부터 4보다 작거나 같을 때까지 1씩 증가할 동안 반복 수행
		// 0, 1, 2, 3, 4
		for(int i = 0; i <= 4; i++) {
			
			System.out.println("저리 가세요");
			
		}
		
	}
		
		public void method2() {
			
			// i 변수값이 1에서부터 6보다 작을 때까지 1씩 증가할 동안 반복 수행
			// 1, 2, 3, 4, 5
			
			for (int i = 1; i < 6; i++) {
				
				System.out.println("반갑습니다");
			}
			
			// i 변수값이 11에서부터 16보다 작을 때까지 1씩 증가할 동안 반복 수행
			// 11, 12, 13, 14, 15
			
			for (int i = 11; i < 16; i++) {
				
				System.out.println("다시 만나요");
				
			}
		}
		
		public void method3() {
			
			// i 변수값이 1에서부터 10까지 매번 2씩 증가할동안 반복 수행
			// 1, 3, 5, 7, 9
			for (int i = 1; i < 10; i += 2) {
				
				System.out.println("하이");
				
			}
		}
		
		public void method4() {
			
			// i 변수값이 10에서부터 6보다 크거나 같을 때까지 매번 1씩 감소
			// 10, 9, 8, 7, 6
			for(int i = 10; i >= 6; i--) {
				System.out.println("헬로우");
			}
			
			// 참고
			// 제일 단순하게 반복되는 횟수를 지정하는 방법
			// int i = 0; i < 반복시키고자하는횟수; i++
			
			// 예시
			// int i = 0; i < 5; i++ >= 0, 1, 2, 3, 4 (5회 반복)
			// int i = 0; i < 7, i++ >= 0, 1, 2, 3, 4, 5, 6 (7회 반복)
		}
		
		public void method5() {
			
			// 반복이 돌 때마다 매번 고정적인 문자열 말고 매번 달라지는 출력 결과를 보자
			
			// i 변수의 값이 1에서부터 10보다 작거나 같을 때까지 1씩 증가시키면서 반복을 수행
			// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 (10회)
			
			/* for(int i = 1; i < 11; i++) { // i <= 10와 같은 조건
				
				System.out.println("i: " + i);
				
			} */
			
			// i 변수의 값이 0에서부터 10보다 작을 때까지 1씩 증가시키면서 매번 반복 수행
			// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 (10회)
			for (int i = 0; i < 10; i++) {

				// System.out.println("i: " + i);
				
				// 1부터 시작하고 싶다면?
				// System.out.println("i: " + i++); // 0, 2, 4, 6, 8
				System.out.println("i: " + (i + 1)); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			}
		}
		
		public void method6() {
			
			// 1부터 10까지의 숫자를 한줄로 연이어서 출력
			// 1 2 3 4 5 6 7 8 9 10
			
			for(int i = 1 ; i <= 10; i++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
			
			// 1부터 10까지의 숫자들 중에서 홀수만을 출력
			// 1 3 5 7 9
			/* for(int i = 1; i <= 10; i += 2) { // 반복 총 5회 진행
				
				System.out.print(i + " ");
				
				*/
			
			// 다른 풀이
			for (int i = 1; i <= 10; i++) { // 반복 총 10회, 홀수, 짝수 모두 반복 진행
				
				// 하고 싶은 거: 홀수일 경우만 출력 (해당 값을 2로 나눴을 때의 나머지가 1인 경우)
				if(i % 2 == 1) { // i가 홀수인 상태
					System.out.print(i + " ");
				}
			}
		}
		
		public void method7() {
			
			// 1에서부터 10까지의 숫자들의 총 합계 
			
			// 방법1. int sum = 1 + 2 + 3 + ... + 10;
			
			// 방법2.
			/*
			 * int sum = 0; // 누적된 합계 값을 출력하고 싶을 때는 정확한 결과를 얻기 위해 0으로 초기화 해 놓기
			 * 				// 누적된 곱하기 값을 출력하고 싶을 때는 정확한 결과를 얻기 위해 0으로 초기해 해 놓기
			 * 
			 * sum = sum + 1; => sum += 1;
			 * sum = sum + 2; => sum += 2;
			 * sum = sum + 3; => sum += 3;
			 * ...
			 * sum = sum + 10; => sum += 10;
			 * 
			 * 규칙을 찾자!
			 * => sum이라는 변수에 매번 규칙적으로 더해지는 수는
			 *	  1에서부터 10까지 매번 1씩 증가하면서 더해짐!
			 */
			
			// 누적하여 더할 값을 담는 변수 선언 및 "0으로 초기화" (덧셈의 정확한 값을 얻기 위해서)
			int sum = 0;
			
			for(int i = 1; i <= 10; i++) {
				
				sum += i; // sum = sum + i;
				
				// System.out.println(sum); // 1 3 6 10 15 21 28 36 45 55
				
			}
			
			System.out.println(sum); // 55
		}
		
		public void method8() {
			
			// 1에서부터 사용자가 키보드가 입력받은 수까지 모두 더해서 출력해 보기
			
			// 고려해야 할 사항: 양수를 입력했을 경우에만 덧셈
			//				양수가 아닐 경우에는 "잘못 입력했습니다." 출력
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("양수를 입력하세요: ");
			
			int num = sc.nextInt();
			
			sc.nextLine();
			
			
			
			if (num > 0) { // 입력받은 수가 양수일 경우
				
				// 1에서부터 해당 num까지의 모든 수를 합산
				
				int sum = 0;
				
				for(int i = 1; i <= num; i++) { // 조건식: i <= num 못 적어서 틀림!, 빈칸으로 두니까 무한 반복 됨
					
					sum += i;
					
					// system.out.println 구문을 여기 넣었을 경우 입력한 값까지 합 과정을 모두 표시함
					
				}
				// System.out.println 구문 위치!!함
				//System.out.println("1부터 입력한 값까지의 합은 " + sum + "입니다.");
				System.out.println("1부터 입력한 값까지의 합은 " + sum + "입니다.");
			}
			else { // 입력받은 수가 양수가 아닐 경우 => 잘못 입력한 경우
				System.out.println("잘못 입력했습니다.");

			}

			 //System.out.println 구문을 여기 넣었을 경우 sum이라는 변수를 받지 못함
			
		}
		
		public void method9() {
			
			// 1에서부터 매번 달라지는 랜덤값(1 ~ 10 사이의 랜덤한 정수)까지의 총 합계
			
			/*
			 * *랜덤값 뽑기
			 * Math 클래스에 정의되어 있는 random() 메소드를 호출하여
			 * 매번 다른 랜덤값을 얻어올 수 있음
			 * 
			 * [ 표현법 ] Math.random() // 기본적으로 실수 형태!
			 * 코딩을 하며 수학적 계산을 할 상황이 많기 때문에 언제든지 사용할 준비가 된 static으로 구성되어 있음
			 * 그렇기 때문에 대변할 이름 없이 클래스.메소드로 가지고 오기 가능함!
			 * => 0.0 ~ 0.999999 ... 사이의 랜덤값이 발생
			 * => 0.0 <= 랜덤값 => 0.99999 ...
			 */
			
			// int random = Math.random(); // double형이라서 오류
			
			// int random = (int)Math.random();
			// 0.0 ~ 0.999999... => 0 ~ 0
			
			int random = (int)(Math.random() * 10) +1;
			// 0.0 ~ 0.99999... => * 10을 하면: 0.0 ~ 9.99999... => int형 변환 시: 0 ~ 9 +1 => 1 ~ 10
			
			// *Math.random() 메소드를 이용해서 내가 원하는 범위의 정수값을 뽑아내고자 할 때
			// (int)(Math.random() * 뽑고싶은랜덤값의개수) + 시작하고자하는수
			
			// 예시) 로또 번호 추출 (1 ~ 45까지의 랜덤값)
			// => (int)(Math.random() * 45) + 1
			
			System.out.println("현재 발생한 랜덤값: " + random);
			
			int sum = 0;
			
			for(int i = 1; i <= random; i++) {
				
				sum += i;
				
			}
			
			System.out.printf("1부터 %d까지의 총 합은 %d입니다. \n", random, sum);
			
		}
		
		public void method10() {
			
			// 구구단 출력
			
			// 2단 출력
			// 2 * 1 = 2
			// 2 * 2 = 4
			// 2 * 3 = 6
			// 2 * 4 = 8
			// 2 * 5 = 10
			// 2 * 6 = 12
			// 2 * 7 = 14
			// 2 * 8 = 16
			// 2 * 9 = 18
			
			System.out.println("----- 2단 -----");
			
			for(int i = 1; i <= 9; i++) {
				System.out.printf("2 * %d = %d \n", i, (2*i));
			}
		}
			
		// 실습 문제
		public void method11() {
			
			// 사용자로부터 2 ~ 9 사이의 정수를 입력받아 해당 구구단을 출력
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("2 ~ 9 사이의 정수를 입력하시오: ");
			
			int num = sc.nextInt();
			
			sc.nextLine();
			
			if ((num >= 2) && (num <= 9)) { // 2 ~ 9 사이의 정수가 맞다면
				
				System.out.printf("----- %d단 ----- \n", num);
				
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d \n", num, i, (num*i));
				}
			}
			else { // 아니라면
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
		// 중첩 for문(행렬과 함께 알면 좋음!)
		public void method12() {
			
			// 1 2 3 4 5
			// 1 2 3 4 5
			// 1 2 3 4 5
			
			// 3번 반복 => 기본적인 표현법 0부터 반복하고자 하는 수보다 작을 때까지
			for(int i = 0; i < 3; i++) { // 0, 1, 2 (3회 반복) -> 안쪽 for문을 반복!
				
				for (int j = 1; j <= 5; j++) {
					
					System.out.print(j + " ");
				} // 1 2 3 4 5 한줄 완성
				
				System.out.println();
			
			}
		}
		
		// 중첩 for문(행렬과 함께 알면 좋음!)
		public void method13() {
			
			// ***** 1행 1열 ~ 5열
			// ***** 2행 1열 ~ 5열
			// ***** 3행 1열 ~ 5열
			// ***** 4행 1열 ~ 5열
			// ***** 5행 1열 ~ 5열
			
			/*
			for (int i = 1; i <= 5; i++) { // 반복 5트, 행
				for(int j = 1; j <= 5; j++) { // 안쪽 for문(5번) = 1트, 열
					System.out.print("*");
				} // ***** 완성
				System.out.println();
			}
			*/
			
			// 총 반복 횟수는? 5*5
			// 안쪽 for문에서 5번씩 총 5번
			// => total 25번
			// => 안쪽 for문 반복횟수 + 바깥쪽 for문 반복횟수
			
			// 총 25번의 반복을 반복문 하나로 처리하기
			for(int i = 1; i <= 25; i++) {
				
				System.out.print("*");
				
				// 별이 5개 찍힐 때마다 enter 추가
				// => i가 5의 배수일 때마다 별을 찍고 개행을 추가하고자 함
				
				if(i %5 == 0) {
					System.out.println();
				}
				
			}
		}
		
		public void method14() {
			
			// 1*** => 1행 1열일 때
			// *2** => 2행 2열일 때
			// **3* => 3행 3열일 때
			// ***4 => 4행 4열일 때
			
			for(int i = 1; i <= 4; i++) { // 4번 반복, 나의 세로 위치

				for(int j = 1; j <= 4; j++) { // 4번 반복, 나의 가로 위치
						
					if(i == j) { // 경우 1
							System.out.print(i);// 숫자 출력
						}
					else {
							System.out.print("*");// 별 출력
						}
					} // 1*** 한줄 완성
					
				System.out.println();
					
			}
		}
		
		public void method15() {
			
			// *
			// **
			// ***
			// ****
			// *****
			
			for(int i = 1; i <= 5; i++) { // 5번
				
				for(int j = 1; j <= i; j++) { // 1트: 1번(j <= 1), 2트: 2번(j <= 2), 3트: 3번,...
				
					System.out.print("*");
				} // * 한줄 완성
				
				System.out.println();
			}
		}
		
		public void method16() {
			
			// 2 ~ 9단까지 모두 출력
			
			for(int i = 2; i <= 9; i++) { // 8번
				
				System.out.printf("----- %d 단 ----- \n", i);
				
				for(int j = 1; j <= 9; j++) { // 9번
					System.out.printf("%d * %d =%d \n", i, j, (i*j));
				}
				System.out.println();
			}
		}		// 총 72번의 연산이 이루어짐
		
		// 숙제
		public void method17() {
			
			/*
			 * 사용자로부터 두 개의 정수를 입력받아 그 사이의 모든 수를 오름차순 순서대로 출력하세요
			 * 단, 두 정수가 일치할 경우는 "정수 1과 정수 2의 값이 같습니다." 출력
			 * 
			 * 실행 예시 1
			 * 정수1 입력: 3
			 * 정수2 입력: 7
			 * 
			 * 3 4 5 6 7
			 * 
			 * 실행 예시 2
			 * 정수1 입력: 7
			 * 정수2 입력: 3
			 * 
			 * 3 4 5 6 7
			 */
		}
		
		
	}

	
	


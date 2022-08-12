package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * *break문
	 * 반복문 안에서 break문을 만나는 순간 "가장 가까운 내가 포함된 반복문" 한 겹만 빠져나가는 구문
	 * 즉, 해당 break문이 속해 있는 반복문만을 빠져나가는 구문
	 * 
	 * *주의할 점 : switch문 안의 break와는 다른 개념
	 * 			 switch문 안의 break는 해당 switch 중괄호 영역을 빠져나가는 역할
	 * 			  반복문 안의 break는 해당 반복문 중괄호 영역을 빠져나가는 역할
	 */
	
	public void method1() {
		
		// 매번 새로이 반복적으로 발생되는 랜덤값(1 ~ 100 사이의 정수) 출력
		// 단, 그 랜덤값이 홀수일 경우는 반복문을 빠져나가게끔
		
		while(true) { // 무한 반복
			
			int random = (int)(Math.random() * 100) + 1; // 랜덤값 뽑기
			
			if(random % 2 == 1) { // random 값이 홀수일 경우 => 반복문을 빠져나감
			
				break;
			}
			
			else { // random 값이 짝수일 경우 => 출력
				System.out.println("random: " + random);
			}
		}
		
		System.out.println("반복문을 빠져나왔음");
		
	}
	
	public void method2() {
		
		// 매번 사용자에게 문자열을 입력받고 해당 문자열의 길이를 출력
		// 단, 사용자가 "exit"라는 문자열을 입력하는 순간 반복문을 빠져나가게끔
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("문자열 입력: ");
			String str = sc.nextLine();
			
			// 만약 str에 들어 있는 문자열의 내용물이 "exit"라면 반복문을 빠져나감
			
			if(str.equals("exit")) {
				
				break;
				// break; 대신 return; 을 쓴다면?
				// 해당 메소드를 호출한 BranchRun 클래스로 가 버리므로 이 밑으로는 실행되지 않음
				
			}
			// else를 써도 되지만 if문에서 조건을 충족하지 않으면 if문을 빠져나오므로 자동으로 얘 실행됨
			System.out.println(str + " 의 글자 수 길이: " + str.length());
			
			}
		
		// 	위에서 break; 대신 return;을 썼다면 해당 줄 밑으로는 "Unreachable code: 도달할 수 없는 코드"
		// exit이 입력되었을 때 break를 만나 해당 반복문을 빠져나옴
		System.out.println("프로그램이 종료됩니다.");
	}
	
	public void method3() {
		
		// 매번 반복적으로 사용자로부터 양수를 입력받아 1 ~ 해당 그 수까지 출력
		// 단, 정상적으로 양수를 입력했을 경우에만 출력
		// 만약에, 잘못 입력했을 경우 "다시 입력해 주세요"
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("양수 입력: ");
		int num = sc.nextInt();
		
		sc.nextLine(); // 이렇게 쓰면 한 번 입력받고 끝!
		*/
		
		while(true) { // 이 구문에 넣어 줌으로써 무한 반복
			
			System.out.print("양수 입력: ");
			int num = sc.nextInt();
			
			sc.nextLine();
			
			// num을 잘 입력받은 시점에서 유효한 양수인지 확인부터!
			
			if(num > 0) { // 양수일 경우
				
				// 1에서부터 num까지 순차적으로 한줄에 연이어서 출력
				for(int i = 1; i <= num; i++) {
					
					System.out.print(i + " ");
				} // 1 2 3 4 ... num 한 줄 완성
				
				break; // 현재 내가 포함된 while(true)를 빠져나가는 역할
			}
			else { // 양수가 아닐 경우
				System.out.println("다시 입력해 주세요");
				
			}
		
		
		
			
		}
	}
}

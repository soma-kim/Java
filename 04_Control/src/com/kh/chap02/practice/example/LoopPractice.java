package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void method11() {
		
		/* 사용자로부터 시작 숫자와 공차를 입력받아
		* 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요
		* 단, 출력되는 숫자는 총 10개입니다.
		*
		* '공차'는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다
		* ex) 2, 7, 12, 17, 22, ...
		*      5   5   5   5 => 여기서 공차는 5
		* (for문 이용)
		* ex.
		* 시작 숫자: 4
		* 공차: 3
		* 출력문: 4 7 10 13 16 19 22 25 28 31
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("공차를 입력하세요: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(num1 + (num2*i) + " ");
			
			// System.out.print(num1 + (i-1) * num2 + " "); //  루루의 등차수열 이과생 풀이법 개쩐다 진짜 멋있어
			
		}
	}

}

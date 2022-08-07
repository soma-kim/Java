package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		else {
			System.out.println("양수가 아니다");
		}
	}
		
		public void practice2() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num > 0) {
				System.out.println("양수다");
			}
			else {
				if(num == 0) {
					System.out.println("0이다");
				}
				else {
					System.out.println("음수다");
				}
		}
	
	}
		
		public void practice3() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if (num % 2 == 0) {
				System.out.println("짝수다");
			}
			else {
				System.out.println("홀수다");
			}
		}
		
		public void practice4() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("인원 수: ");
			int person = sc.nextInt();
			sc.nextLine();
			
			System.out.print("사탕 수: ");
			int candy = sc.nextInt();
			sc.nextLine();
			
			System.out.println("1인당 사탕 개수: " + candy / person);
			System.out.println("남는 사탕 개수: " + candy % person);
			
		}
		
		public void practice5() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			System.out.print("학년(숫자만): ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("반(숫자만): ");
			int class_ = sc.nextInt();
			sc.nextLine();
			
			System.out.print("번호(숫자만): ");
			int no = sc.nextInt();
			sc.nextLine();
			
			System.out.print("성별(M/F): ");
			char gender = sc.nextLine().charAt(0);
			
			if(gender == 'F' || gender == 'f') {
				gender = '여';
			}
			else {
				gender = '남';
			}
			
			System.out.print("성적(소수점 아래 둘째자리까지): ");
			double score = sc.nextDouble();
			sc.nextLine();
			
			System.out.println(grade + "학년 " + class_ + "반 " + no + "번 " + name + " " + gender + "학생의 성적은 " + score + "이다.");

		}
		
		public void practice6() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			if(age > 0) {
				if (age <= 13) { 
					System.out.println("어린이");
				}
				else if (age <= 19) {
					System.out.println("청소년");
				}
				else {
					System.out.println("성인");
				}
			}
			else {
				System.out.println("다시 입력하세요");
			}

		}
		
		public void practice7() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어: ");
			int score1 = sc.nextInt();
			
			System.out.print("영어: ");
			int score2 = sc.nextInt();
			
			System.out.print("수학: ");
			int score3 = sc.nextInt();
			
			System.out.println();
			
			int sum = score1 + score2 + score3;
			double avg = (score1 + score2 + score3)/3.0;
			
			System.out.println("합계: " + sum);
			System.out.println("평균: " + avg);
			
			if(score1 >= 40 && score2 >= 40 && score3 >= 40 && avg >= 60) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
			
		}
		
		public void practice8() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("주민번호를 입력하세요(- 포함): ");
			 String id = sc.nextLine();
			 
			 if(id.charAt(7) == '2' || id.charAt(7) == '4') {
				 System.out.println("여자");
			 }
			 else if(id.charAt(7) == '1' || id.charAt(7) == '3') {
				 System.out.println("남자"); 
			 }
			 else {
				 System.out.println("다시 입력하세요");
			 }
			
		}
		
		public void practice9() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수1: ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2: ");
			int num2 = sc.nextInt();
			
			System.out.print("입력: ");
			int testNum = sc.nextInt();
			
			boolean result = (testNum <= num1 || testNum > num2);
			
			System.out.println();
			
			System.out.println(result);
				
		}
		
		public void practice10() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("입력1: ");
			int num1 = sc.nextInt();
			
			System.out.print("입력2: ");
			int num2 = sc.nextInt();
			
			System.out.print("입력3: ");
			int num3 = sc.nextInt();
			
			boolean result = (num1 == num2) && (num1 == num3) && (num2 == num3);
			
			System.out.println(result);
			
		}

}

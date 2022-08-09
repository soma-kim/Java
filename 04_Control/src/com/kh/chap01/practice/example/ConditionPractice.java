package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch (num) {
		case 1 : System.out.println("입력 메뉴입니다.");
				break;
		case 2 : System.out.println("수정 메뉴입니다.");
				break;
		case 3 : System.out.println("조회 메뉴입니다.");
				break;
		case 4 : System.out.println("삭제 메뉴입니다.");
				break;
		case 9 : System.out.println("프로그램이 종료됩니다.");
				break;
		default : System.out.println("번호를 잘못 입력하셨습니다.");
		
		}
	
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num <= 0) {
			System.out.println("양수만 입력해 주세요");
		} else {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int score1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학점수: ");
		int score2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어점수: ");
		int score3 = sc.nextInt();
		sc.nextLine();
		
		if ((score1 + score2 + score3) / 3 >= 60 && score1 >= 40 && score2 >= 40 && score3 >= 40) {

			System.out.println("국어: " + score1);
			System.out.println("수학: " + score2);
			System.out.println("영어: " + score3);
			System.out.println("합계: " + (score1 + score2 + score3));
			System.out.println("평균: " + (score1 + score2 + score3) / 3);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch (num) {
		case 3 :
		case 4 :
		case 5 : System.out.println("봄입니다.");
				break;
		case 6 :
		case 7 :
		case 8 : System.out.println("여름입니다.");
				break;
		case 9 :
		case 10 :
		case 11 : System.out.println("가을입니다.");
				break;
		case 12 :
		case 1 :
		case 2 : System.out.println("겨울입니다.");
				break;
		default : System.out.println(num + "월은 잘못 입력된 달입니다.");
		
		}
		
	}
	
	public void practice5() {
		
		String id = "kim";
		int pwd = 1234;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String inputId = sc.nextLine();
		
		System.out.print("비밀번호: ");
		int inputPwd = sc.nextInt();
		sc.nextLine();
		
		if(inputId.equals(id)) {
			if(inputPwd == pwd) {
			System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}
		else {
			if(inputPwd == pwd) {
				System.out.println("아이디가 틀렸습니다");
			}
			else {
				System.out.println("다시 입력하세요");
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String grade = sc.nextLine();
		
		/* 풀이 1
		switch (grade) {
		case "관리자" : System.out.print("회원관리, 게시글 관리 \n게시글작성, 댓글작성 \n게시글 조회");
						break;
		case "회원" : System.out.print("게시글작성, 댓글작성 \n게시글 조회");
						break;
		case "비회원" : System.out.print("게시글 조회");
						break;
		default : System.out.println("잘못 입력했습니다.");
		}
		*/
		
		// 풀이 2
		
		String gradeAdmit = "회원관리, 게시글 관리 \n게시글작성, 댓글작성 \n게시글 조회";
		String gradeMem = "게시글작성, 댓글작성 \n게시글 조회";
		String gradeUnmem = "게시글 조회";
		
		switch (grade) {
		case "관리자" : System.out.println(gradeAdmit);
						break;
		case "회원" : System.out.println(gradeMem);
						break;
		case "비회원" : System.out.println(gradeUnmem);
						break;
		default : System.out.println("잘못 입력했습니다.");
		}
	}
		
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키: ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("몸무게: ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		double BMI = weight / (height * height);
		
		System.out.println("BMI 지수: " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}
		
		else if(BMI < 23) {
			System.out.println("정상체중");
		}
		
		else if(BMI < 25) {
			System.out.println("과체중");
		}
		
		else if(BMI < 30) {
			System.out.println("비만");
		}
		
		else {
			System.out.println("고도 비만");
		}
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("피연산자2 입력: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%): ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} else {
			switch (op) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			case '%' :
				result = num1 % num2;
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
			
			System.out.printf("%d %c %d = %d", num1, op, num2, result);
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수: ");
		double score1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("기말 고사 점수: ");
		double score2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("과제 점수: ");
		double score3 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("출석 회수: ");
		double score4 = sc.nextDouble();
		
		System.out.println("==========결과==========");
		
		double result = (score1 * 0.2) + (score2 * 0.3)
						+ (score3 * 0.3) + score4;
		
		if(score4 < (20*0.7)) {
			System.out.printf("FAIL [출석 횟수 부족] (%d/20)", (int)(score4));
			System.out.println();
		} 
		
		if(result < 70) {
			System.out.println("FAIL [점수 미달] (총점 " + result + ")");
			return;
		}
		
		if(result >= 70 && score4 >= (20*0.7)) {
			System.out.println("중간 고사 점수(20): " + score1 * 0.2);
			System.out.println("기말 고사 점수(30): " + score2 * 0.3);
			System.out.println("과제 점수(30): " + score3 * 0.3);
			System.out.println("출석 점수(20): " + score4);
			System.out.println("총점: " + result);
			System.out.println("PASS");	
		}
		
	}
	
	public void practice10() {
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.print("선택: ");
		
		Scanner sc = new Scanner(System.in);
		int selectMenuNo = sc.nextInt();
		sc.nextLine();
		
		switch (selectMenuNo) {
		case 1 :
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			practice5();
			break;
		case 6 :
			practice6();
			break;
		case 7 :
			practice7();
			break;
		case 8 :
			practice8();
			break;
		case 9 :
			practice9();
			break;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 선택해 주세요.");
			practice10();
			break;
		}
		
	}
	
	
		

}

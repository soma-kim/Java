package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void method2() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			method2();
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void method4() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			method4();
		}
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}
		}
		System.out.println(" = " + sum);
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자만을 입력해 주세요.");
		}
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void method7() {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		/* 내 풀
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해 주세요.");
			method7();
		}
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
		*/
		
		// 루 풀이
		
		if(num1 > num2) {
			int temp = 0;
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		for(int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
	
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("=====" + num + "단 =====\n");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
			// System.out.printf("%d * %d = %d", num, i, (num*i));
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 2 && num <= 9) {
			for(int i = num; i <= 9; i++) {
				System.out.printf("=====%d단=====\n",i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
			}
		} else {
				System.out.println("2~9 사이의 숫자만 입력해 주세요.");
		}
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 2 && num <= 9) {
			for(int i = num; i <= 9; i++) {
				System.out.printf("=====%d단=====\n",i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
			}
		} else {
				System.out.println("2~9 사이의 숫자만 입력해 주세요.");
				method10();
		}
	}


	
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
	
	/* 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
	exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
	또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
	“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
	없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
	두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
	*/

	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		while (true) { // 무한 반복을 위해 true 조건을 걸고 while문 적
		
			System.out.print("연산자(+, -, *, /, %): ");
			String op = sc.nextLine(); // 연산자 String형으로 입력받기(요구사항)
			
			if(op.equals("exit")) { // 문자열 비교는 .equals
				System.out.println("프로그램을 종료합니다.");
				return; // 프로그램 종료
			}				
			
			// 정수1 입력받고 버퍼 비우기
			System.out.print("정수1: ");
			int num1 = sc.nextInt();
			sc.nextLine();
			
			// 정수 2 입력받고 버퍼 비우기
			System.out.print("정수2: ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			// 연산자가 /이면서 정수2가 0일 때 출력하고 처음으로 돌아가 연산자부터 다시 입력( == 메소드 재시작)
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요.");
				method12();
			}
			
			// num1, num2 연산을 위한 변수 생성
			int result = 0;
			
			// 각 연산자에 대한 연산을 수행하여 결과값을 result 변수에 담기
			switch (op) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" : 
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
			default : // 제시되지 않은 연산자 입력 시 출력문 뱉고 처음으로 돌아가 연산자부터 다시 입력 (== 메소드 재시작)
				System.out.println("없는 연산자입니다. 다시 입력해 주세요.");
				method12();
			}
		
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result); // 출력문 형
			
		}
		
	}

}

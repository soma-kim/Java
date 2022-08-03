package com.kh.array;

import java.util.Scanner;

public class A_Array {

	/*
	 * *변수: "자료형에 맞는 값 하나만" 담을 수 있는 개념
	 * 		 예) int a =10; // a == 10
	 * 		    a = 20; // a == 20
	 * 
	 * *배열: "자료형에 맞는 값 여러 개"를 담을 수 있는 개념
	 * 		 예) int[] b = new int[3]; // int형의 값이 들어갈 수 있는 방을 3개 만들겠다
	 * 								  // 방 [0], [1], [2] 호실이 만들어짐
	 * 								  // 인덱스는 항상 0에서부터 시작한다
	 * 								  // 문자열의 크기가 5라면, 마지막 인덱스 = 4 (0, 1, 2, 3, 4)
	 * 								  // 배열의 크기가 3이라면, 마지막 인덱스 = 2 (0, 1, 2)
	 * 								  // 배열의 크기가 7이라면, 마지막 인덱스 = 6 (0, 1, 2, 3, 4, 5, 6)
	 * 								  // 항상! 배열의 크기 = n, 마지막 인덱스 = n - 1 공식을 외워 두자!
	 * 								  //  => for 문에서 반복 횟수를 지정하는 가장 기본적인 방법
	 * 								  //  int i = 0; i < 횟수; i++
	 * 
	 */
	
	public void method1() {
		
		// 배열을 왜 써야 할까?
		// 변수만을 이용해서 프로그래밍을 하게 되면...
		// 0, 1, 2, 3, 4를 기록해야 함
		
		/*
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 출력할 때는? => 일일이 출력해야 한다. 반복문 사용 불가!
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		for(int i = 1; i <= 5; i++) {
			
			// System.our.println(numi); // numi라는 변수 없다는 오류 뜸
			// System.out.println("num" + i); // num이라는 문자열 + i값이 문자열로 출력됨 num1, num2 ...
		}
		
		// 총 합계 구할 때는? => 일일이 더해 줘야 한다. 반복문 사용 불가!
		int sum = num1 + num2 + num3 + num4 + num5;
		*/
		
		// 만약 기록해야 하는 변수가 100, 1000, 10000개로 늘어난다면?
		
		// 배열을 가지고 프로그래밍하기
		// 0, 1, 2, 3, 4을 기록해야 함
		
		/*
		 * 1. 배열 선언 "나 배열 쓸 거야!" => 상자 생성
		 * [ 표현법 ] => 두 가지 표현법이 있음
		 * 자료형 배열명[];
		 * 자료형[] 배열명; 
		 */
		
		// int a; // 변수를 선언
		// int arr[]; // 배열을 선언
		// int[] arr;
		
		/*
		 * 2. 배열 할당 "이만큼 쓸 거야!" => 상자 칸 생성, 이 과정까지 거쳐야 원하는 만큼의 빈 상자가 만들어짐
		 * 이 배열에 지금부터 몇 개의 값들을 묶어서 보관할 것인지 배열의 크기를 지정해 주는 과정
		 * 지정한 이 개수만큼 값이 들어갈 방이 만들어짐
		 * 
		 * [ 표현법 ]
		 * 배열명 = new 자료형[배열크기];
		 */
		
		// arr = new int[5];
		
		// 변수 선언 및 초기화 한 큐에!
		
		int a = 1;
		
		// 배열 선언 및 할당 한 큐에!
		int[] arr = new int[5];
		
		// => 이 과정까지 거치지 않는다면 절대로 배열을 사용할 수 없음!
		
		/*
		 * 3. 배열의 각 인덱스 방 자리에 값 대입
		 * [ 표현법 ]
		 * 배열명[인덱스] = 값;
		 */
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		// 배열의 출력 => 반복문 활용이 가능!
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(arr[i]);
		}
		
		// 총 합계 구하기
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			
			sum += arr[i];
		}
			System.out.println("sum: " + sum);
			
			System.out.println(arr[0]); // 0
			System.out.println(arr); // [I@6d06d69c == 주소값
			
		
	}
	
	public void method2() {
		
		int i = 10;
		
		int[] iArr = new int[5]; // [0], [1], [2], [3], [4]
		
		System.out.println("i: " + i);
		System.out.println("iArr: " + iArr);
		System.out.println("iArr의 해시코드값: " + iArr.hashCode());
		// 해시코드: 주소값을 10진수의 형태로 보여 주는 개념
		
		double[] dArr = new double[3];
		System.out.println("dArr: " + dArr);
		System.out.println("dArr의 해시코드 값: " + dArr.hashCode());
		
		/*
		 * 기본 자료형: boolean, char, byte, short, int, long, double
		 * => stack 영역에 실제 값을 바로 담을 수 있는 변수 => 일반 변수
		 * 
		 * 그 이외의 자료형: String, int[], double[], short[], byte[], Scanner, A_Array(내가 만든 클래스), ...
		 * => new를 쓰는 변수들 // stack 영역에 주소값을 담고 있는 변수(실제 값은 heap 영역에 담겨 있음) => 참조 변수(레퍼런스 변수)
		 */
		
	}
	
	public void method3() {
		
		// 배열의 선언과 동시에 할당
		// 자료형[] 배열명 = new 자료형[사이즈];
		
		int[] iArr = new int[3]; // iArr 에는 주소값이 대입되어 있고, heap영역에는 [0], [1], [2] 방 생성
		double[] dArr = new double[3]; // [0], [1], [2]
		
		// System.out.println(iArr[0]);
		
		// 배열을 출력할 때 반복문을 쓰면 더 유리함
		// 0번 인덱스부터 마지막 인덱스까지 순차적으로 출력 가능
		// 마지막인덱스 == 배열의크기 - 1
		
		// 배열의 크기를 아는 방법
		// [ 표현법 ] 배열명.length
		// => 주의할 점! 여기서의 length는 메소드가 아님! 소괄호 안 들어감!
		System.out.println("iArr 배열의 크기: " + iArr.length);
		System.out.println("dArr 배열의 크기: " + dArr.length);
		
		/* 내가 배열의 크기를 알고 있으므로 조건식을 이렇게 써도 되긴 하지만
		 * 이렇게 쓰면 나중에 코드를 바꾸거나 할 때 티가 안 남!
		for (int i = 0; i < 3; i++) { // i < 3 으로 설정해 두면 나중에 티가 안 남...
			
			System.out.println(iArr[i]);
		}
		*/
		
		for(int i = 0; i < iArr.length; i++) {
			
			System.out.println(iArr[i]);
		}
		
		for (int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		/*
		 * 각각의 인덱스에 값을 대입하지 않아도 뭔가 담겨 있음!
		 * int형 배열에는 정수 0, double형 배열에는 실수 0.0이 담겨 있음
		 * 
		 * => 메모리의 heap 영역에서는 절대 빈 공간으로 존재할 수 없음
		 * 	    배열이 만들어짐과 동시에 JVM에 의해서 기본값으로 초기화가 진행됨
		 */

	}
	
	public void method4() {
		
		int[] arr = new int[5]; // 4*5= 20byte [0], [1], [2], [3], [4]
								//  현재 채워진 값    0    0    0    0    0   
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		arr[10] = 10;
		// ArrayIndexOutOfBoundsException: 10
		// 배열의 인덱스 범위를 벗어남
		// 10번 인덱스에서 오류가 발생
		
		// => 내가 한 번 배열을 만들었으면 그 사이즈 범위를 벗어난 곳은 이용할 수 없음
		// 	    제한된 범위 안에서만 이용 가능함
		*/
		
		// 값 대입을 위한 for문
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = i + 1;

		}
		
		// 값 출력과 동시에 누적 덧셈을 해 주는 for문
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]); // 1 2 3 4 5
			sum += arr[i];
			
		}
		
		System.out.println("총 합계: " + sum); // 총 합계: 15
		
		System.out.println("arr: " + arr); // 주소값 [I@6d06d69c
		System.out.println("arr: " + arr.hashCode()); // 주소값의 해시코드 1829164700
		
	}
	
	public void method5() {
		
		// 배열에 각 랜덤한 수를 대입
		
		int[] arr = new int[10]; // [0], [1], ... , [9]
		
		// 0번 인덱스에서부터 마지막 9번 인덱스까지 51 ~ 100 사이의 랜덤값
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 50) + 51;
			
		}
		
		// 잘 담겨 있나 출력용 반복문
		// arr[x]: xx 형식 출력
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d \n", i, arr[i]);
		}
		
		// 랜덤한 숫자 (1 ~ 45)를 중복 없이 6개를 뽑을 수 있는 프로그램? => 로또
	}
	
	public void method6() {
		
		int[] arr = new int[5];
		
		System.out.println(arr);
		System.out.println("arr의 해시코드값: " + arr.hashCode());
		
		/*
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		*/
		
		// 대입
		
		int value = 2; // 값 대입용 일종의 초기식
		for(int i = 0; i < arr.length; i++) {
			
			// arr[i] = (i + 1) * 2; // 2, 4, 6, 8, 10 
			arr[i] = value;
			value += 2;
		}
		
		for(int i = 0; i < arr.length; i++) { 
			
			System.out.println(arr[i] + " ");
			
		}
		
		// arr[5] = 12;
		// arr[6] = 14; // ArrayIndexOutOfBoundsException: 5
		// => 이미 배열의 크기를 할당했는데 공간이 더 필요해졌다면?
		
		/*
		 * 배열의 가장 큰 단점
		 * 한 번 지정한 배열의 크기에 따라 제한적으로 사용됨
		 * 한 번 지정한 배열의 크기를 변경 불가(지정한 이외의 인덱스 방 번호는 쓸 수 없음)
		 * => 배열의 크기를 변경하고자 한다면 어쩔 수 없이 새로운 배열을 만들어야 함(재할당)
		 */
		
		arr = new int[7]; // 재할당(할당만 다시 해 줌)
		
		System.out.println();
		System.out.println("===== arr 변경 후 =====");
		System.out.println(arr);
		System.out.println("arr의 해시코드값: " + arr.hashCode());
		
		/*
		 * 메모리 영역은 항상 고유한 주소값을 가지고 있음, 할당 시 기존에 부여되었던 주소값과 절대 겹치지 않음
		 * 새롭게 배열을 할당만 다시 한다면
		 * 기존에 참조하고 있던 연결이 끊어지고 새로운 곳을 참조하게 됨
		 * 연결이 끊어진 기존의 배열의 heap 영역에 일단 동동 떠다님
		 * 일정 시간이 지나면 "가비지 컬렉터"에 의해 정리됨 = 가비지 컬렉션(자동 메모리 관리)
		 */
		
		// 참고) 현재 연결되어 있는 고리만 끊고자 한다면?
		
		arr = null; // null: "없음"을 의미하는 값
		
		System.out.println(arr); // null 출력
		
		// arr[0] = 10;
		// NullPointerException: 주소가 없는데 어떻게 접근해서 연산할래?
		//						  라고 알려 주는 오류
		
		// System.out.println(arr.hashCode());
		
		/*
		 * 기본 자료형의 기본값은 다음과 같음
		 * 정수형: 0
		 * 실수형: 0.0
		 * 문자형: ' '
		 * 논리형: false
		 * 
		 * 참조 자료형의 기본값은 다음과 같음
		 * null: "없음"을 나타내는 값 => "주소값이 없다"
		 */
		
	}
	
	public void method7() {
		
		// 3명의 사용자에게 매번 키의 정보를 double로 입력받아 배열에 담아 두고
		// 3명의 키 정보를 반복문을 이용하여 출력
		// 3명의 키 정보의 합계, 평균(총 합계 / 개수)
		
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3]; // [0], [1], [2]
		
		for(int i = 0; i < heights.length; i++) { // 고정
			
			System.out.printf("사용자 %d의 키(cm)를 입력하세요: ", (i+1));
			heights[i] = sc.nextDouble();
			
			sc.nextLine();
				
		}
		
		// 3명의 키 정보를 출력, 합계도 같이 구하기
		
		double sum = 0.0;
		for(int i = 0; i < heights.length; i++) {
			
			System.out.printf("사용자 %d의 키는 %f입니다 \n", (i+1), heights[i]);

			sum += heights[i];

		}

		System.out.println("3명의 키 정보 합계: " + sum);
		System.out.println("3명의 키 정보 평균: " + (sum / heights.length));
		
	}
	
	// 실습 문제
	
	public void method8() {
		
		// 사용자에게 문자열을 하나 입력받은 후
		// 각각의 문자들을 char 배열에 옮겨 담기
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		
		// 어떤 문자열을 입력받을지 모르기 때문에 문자열을 길이를 가늠할 수 없음!
		// => 문자열의 길이만큼의 방을 갖는 char 배열 만들기 ( 배열 크기 == 문자열의 길이 )
		
		// 한 큐에 char[] arr = new char[str.length()]; 쓰는 거 헷갈린다면!
		int length = str.length();
		char[] arr = new char[length]; // [0], [1], [2], ..., [length -1]
		
		// 할 만하다 싶으면 이렇게 1줄로 줄일 수도 있음!
		// char[] arr = new char[str.length()]; // [0], [1], [2], ..., [length -1]
		
		// 문자열로부터 각 인덱스 자리의 문자를 추출해서 각 배열의 방에 담기
		
		/*
		arr[0] = str.charAt(0);
		arr[1] = str.charAt(1);
		arr[2] = str.charAt(2);
		*/
		
		for(int i = 0; i < length; i++) {
			
			arr[i] = str.charAt(i);
			
		}
		
		// char 배열의 각 인덱스에 접근해서 값이 잘 담겨 있는지 출력
		for(int i = 0; i < arr.length; i++) {
		// for(int i = 0; i < length; i++) { // arr.length가 곧 length이므로 그냥 length로 써도 무방함!
			
			System.out.println(arr[i]);
		}
		
	}
	
	public void method9() {
		
		// 배열 선언
		int[] arr1;
		
		// 배열 할당
		arr1 = new int[5];
		
		// 배열의 선언과 할당
		int[] arr = new int[4];
		
		// 배열의 각 인덱스에 값 대입
		arr[0] = 1; // 처음 대입하는 거니까 얘네는 초기화라고도 볼 수 있음!
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		// 배열 선언과 할당을 하는 동시에 값을 초기화(대입)까지 한 번에 끝내는 방법 2가지
		// 배열에 고정된 값을 넣어 놓은 상태로 시작하고 싶을 때 유용함!
		
			// 방법 1.
			int[] arr2 = new int[] {1, 2, 3, 4};
			
			// 방법 2.
			int[] arr3 = {1, 2, 3, 4};
			
		// 배열 비교
		System.out.println(arr == arr2); // false
		System.out.println(arr2 == arr3); // false
		System.out.println(arr3 == arr); // false
		// => 주소값 간의 동등 비교이기 때문에 false가 나옴!!
		// (String 과 마찬가지)
		
	}
	
	public void method10() {
		
		/*
		 * 실습 문제
		 * 좋아하는 과일의 개수를 입력받아
		 * 그만큼 반복을 돌리면서 과일명을 입력받기 => 입력받을 때마다 문자열 배열에 담고 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 과일의 개수를 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] fruits = new String[num];
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.printf("좋아하는 %d번째 과일명을 입력하세요: ", i+1);
			
			fruits[i] = sc.nextLine();

		}
		
		for(int i = 0; i < num; i++) {
			
			System.out.printf("사용자가 좋아하는 %d번째 과일의 이름은 %s입니다.\n", i+1, fruits[i]);

		}
		
	}
	
	public void method11() {
		
		/*
		 * 로또 생성 자동 프로그램을 만드세요
		 * 
		 * 힌트
		 * 1 ~ 45까지의 임의의 수를 "중복 없이" 6개 발생시켜 각 배열에 담으시면 됩니다
		 */
		
		int[] num = new int[6]; // [0], [1], [2], [3], [4], [5]
		
		for(int i = 0; i < num.length; i++) {
			
			num[i] = (int)(Math.random() * 45) + 1;
				
			}
			
		
		for(int i = 0; i < num.length; i++) {
				
			System.out.println("로또 번호: " + num[i]);

		}
		
	}
			
}
	

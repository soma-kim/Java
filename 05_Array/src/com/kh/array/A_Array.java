package com.kh.array;

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
	 * 								  // 항상 크기 = n, 마지막 인덱스 = n - 1 공식을 외워 두자!
	 * 								  //  
	 * 								  // int = 
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
		
		int[] iArr = new int[5];
		
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
		for (int i = 0; i < 3; i++) {
			
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
	
	
}
	

package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 변수에 담는 방법
// 키보드로 입력한 값은 어차피 변수에 담으려고 입력하는 것이기 때문에 따로 안 하고 늘 한 큐에!
public class B_KeyboardInput {
	
	public void inputTest1() {
		
		/*
		 * *자바를 통해서 사용자로부터 어떠한 값을 "입력"받으려면
		 *  자바에서 제공하는 java.util.Scanner 클래스를 이용해야 함
		 *  => Scanner 클래스에서 제공하는 이미 만들어진 메소드를 호출만 잘해서 쓰면 됨
		 *  
		 * - 만약 지금 내가 작성 중인 클래스랑 다른 클래스에 있는 메소드를 호출하고 싶을 때,
		 * 1. 내가 호출하고자 하는 메소드가 있는 클래스를 대변할이름을 생성 (new)
		 * 2. 만약 그 클래스가 나랑 다른 패키지에 있을 경우 import 구문 추가해 줘야 함
		 * 3. 만들어진 대변할이름을 통해서 해당 메소드를 호출
		 * 
		 */
		
		Scanner sc = new Scanner(System.in); // System.in: 입력받은 값들을 바이트 단위로 읽어들이겠다
		
		// 사용자의 인적사항을 입력받는 프로그램 (이름, 나이, 키)
		
		// 입력받고자 하는 내용을 먼저 출력을 해서 입력 유도
		 System.out.print("당신의 이름은 무엇입니까?: ");
		
		// 이름: 김말똥, 홍길동, 고길동, ... => String (문자열)
		// 사용자가 입력한 값을 문자열로써 받아오는 메소드: next(), nextLine()

		// sc.next(); // 입력만 받고 끝
		// String name = sc.next(); // 변수 선언과 동시에 키보드로부터 입력받은 값을 대입
		
		// next(): 사용자가 입력한 값 중에서 공백이 있을 경우 공백 이전까지만 입력을 받음
		// ex) 김 가현 => 김
		
		String name = sc.nextLine();
		
		// nextLine(): 사용자가 입력한 값 중에서 개행이 있을 경우(엔터키를 누른 경우) 공백에 무관하게 한 줄 단위로 입력을 받는 메소드
		// 특히 사용자가 입력한 값에 공백이 포함될 여지가 있을 경우 nextLine()을 사용하는 게 더 좋음
		// ex) 주소지
		
		// Scanner 에서 제공하는 입력을 받아 주는 메소드들은 모두 엔터를 입력하기 전까지는 무작정 대기 상태!
		
		 // System.out.println(name);
		
		// 나이: 10, 11, 12, 20, ... => int (정수)
		System.out.print("당신의 나이는 몇 살입니까?: ");
		
		// 사용자가 입력한 값을 정수로써 받아오는 메소드: nextInt()
		// sc.nextInt(); // 입력만 받고 끝
		
		int age = sc.nextInt();
		
		// 이 시점에서는 사용자가 엔터키를 누르기 전까지 대기 상태
		
		// System.out.println(age);
		
		// 키: 160.0, 177.2, ... => double (실수형)
		System.out.print("당신의 키는 cm입니까?: ");
		
		// 사용자가 입력한 값을 실수형으로 받아올 수 있는 메소드: nextDouble()
		// sc.nextDouble(); // 입력만 받고 끝
		
		double height = sc.nextDouble();
		
		// 사용자가 엔터키를 누를 때까지 대기 상태
		//System.out.println(height);
		
		
		// name, age, height 를 이용하여 하나의 문자열로 가공해서 출력하기
		/// xxx님의 나의는 xxx살이고, 키는 xxxcm입니다.
		System.out.println(name + " 님의 나이는 " + age + "살이고, 키는 " + height + "cm입니다.");
		
	} // inputTest1 메소드 영역 끝
	
	// 키보드로 값을 입력받을 때 종종 발생되는 문제
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		// 버퍼에 개행문자가 남아 있는 상태
		sc.nextLine(); // 입력만 받고 끝
		// 버퍼가 비워진 상태
		
		// nextLine() 메소드는 버퍼에서 "엔터" 이전까지의 모든 값을 가져온 후 버퍼를 비워 주는 역할(청소부)
		// nextLine() 이외의 메소드들은 버퍼를 비워 주지 않음!
		// => nextLine() 이외의 메소드를 호출할 경우 nextLine() 으로 버퍼를 비워 주자!
		
		System.out.print("주소: ");
		String address = sc.nextLine();
		
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		// 이름, 나이, 주소, 키
		// xxx 님은 xx살이며, 사는 곳은 xxx이고, 키는 xxxcm입니다.
		
		System.out.println(name + " 님은 " + age + "살이며, 사는 곳은 " + address + "이고, 키는 " + height + "cm입니다.");
		
	} // inputTest2 메소드 영역 끝
	
	// 그 이외의 입력 메소드들
	public void inputTest3() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * *Scanner 의 입력용 메소드들
		 * 문자열을 입력받고자 할 때: next(), nextLine()
		 * 정수값을 입력받고자 할 때: nextInt(), nextByte(), nextShort(), nextLong()
		 * 실수값을 입력받고자 할 때: nextDouble(), nextFloat()
		 * 논리값을 입력받고자 할 때: nextBoolean()
		 * 문자값을 입력받고자 할 때: 해당 메소드가 없음
		 */
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F): ");
		// char gender = 문자타입으로입력받고자함;
				
		// index: 색인, 순번
		// "apple" 문자열에서 a의 위치를 찾고 싶다!
		//  01234 <- 컴퓨터 기준에서의 순서(0부터 시작함)
		// => a 의 위치값 (index) 은 0
		// => e 의 위치값 (index) 은 4
		
		// => 우선적으로 nextLine() 메소드를 이용해서 문자열 형태로 입력받고
		//	    그 입력받은 문자열로부터 0번째 인덱스의 문자값 하나만 추출
		
		// charAt(위치값): 문자열로부터 해당 위치값에 해당되는 문자 하나만 돌려 주는 메소드
		// [ 표현법 ] 문자열.charAt(위치값);
		
		char gender = sc.nextLine().charAt(0);
		// 먼저 문자열을 입력받은 후, 0번째 글자를 추출하여, gender에 대입
		
		// char gender = sc.nextLine().charAt(100);
		// StringIndexOutOfBoundsException: 추출하고자 하는 인덱스 값이 문자열의 길이를 넘어섰을 때 발생하는 오류
		// => 배열에서도 비슷한 오류 발생 예정
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		sc.nextLine();
		// 이후에 실행할 코드 없어서 nextLine() 메소드 꼭 호출할 필요는 없지만 깔끔하게 습관 들이면 좋으니까~
		
		System.out.println(name + " 님의 개인 정보");
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		
	} // inputTest3 메소드 영역 끝
	
	// 응용문제1
	public void inputTest4() {
		
		/*
		 * 영어 문자열 값을 키보드로 입력받은 후
		 * 그 문자열로부터 앞에서 3개를 출력해 보세요
		 * 
		 * 출력 예시
		 * 첫번째문자: x
		 * 두번째문자: x
		 * 세번째문자: x
		 */
		
		/* 내가 푼 건데 이러면 입력을 3번 받아야 해서 흔히 하는 실수라고 합니다 ㅜ
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 문자: ");
		char wordA = sc.nextLine().charAt(0);
		
		System.out.print("두 번째 문자: ");
		char wordB = sc.nextLine().charAt(1);
		
		System.out.print("세 번째 문자: ");
		char wordC = sc.nextLine().charAt(2);
		
		System.out.println("첫 번째 문자: " + wordA);
		System.out.println("두 번째 문자: " + wordB);
		System.out.println("세 번째 문자: " + wordC);
		*/
		
		// 공통 풀이 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3글자 이상의 문자열을 입력하시오: ");
		
		String str = sc.nextLine(); // 우선적으로 문자열을 한 번 입력받아서 변수가 보관해 두기
		
		/* ----- 풀이 1 변수 쓰는 버전 -----
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("첫 번째 문자: " + ch1);
		System.out.println("두 번째 문자: " + ch2);
		System.out.println("세 번째 문자: " + ch3);
		*/

		/* ----- 풀이 2. 변수 안 쓴 버전 -----
		// 풀이 1에 비해 변수가 없어 상자 3개를 안 쓰고 진행됨! 메모리 절약 굿! 
		System.out.println("첫 번째 문자: " + str.charAt(0));
		System.out.println("두 번째 문자: " + str.charAt(1));
		System.out.println("세 번째 문자: " + str.charAt(2));
		*/
		
		// Apple을 입력했을 경우 App를 출력하고 싶다면?
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		//System.out.println(ch1 + ch2 + ch3); // 289
		// char는 int 형이랑 서로 형 변환이 가능한 관계, 컴퓨터는 내가 int형이랑 바꿔서 숫자 계산을 하고 싶다고 생각하고 289 출력하는 것
		
		// 우리가 여태 배운 선에서 해결할 수 있는 방법
		// 해결 방법 1) 약간 무식한 방법
		/*
		System.out.print(ch1);
		System.out.print(ch2);
		System.out.print(ch3);
		*/
		
		// 해결 방법 2) 약간 예상치 못한 방법 ㄴㅇㄱ
		System.out.println("" + ch1 + ch2 + ch3); // 문자열을 더해서 문자로 출력하는데 그 문자가 빈문자다? 그럼 ch1+ch2+ch3만 출력됨
	
	} // inputTest4 메소드 영역 끝
	
	// 응용문제 2
	public void inputTest5() {
		
		/*
		 * 키보드로 정수 2개를 입력받아서
		 * 두 수의 합, 차, 곱, 나누기한 결과를 각각 출력하시오
		 * 
		 * *힌트
		 * 덧셈: +
		 * 뺄셈: -
		 * 곱셈: *
		 * 나누기: /
		 * 
		 * 출력 예시
		 * 더하기 결과: x
		 * 빼기 결과: x
		 * 곱하기 결과: x
		 * 나누기 결과: x
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하시오: ");
		int a = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("두 번째 정수를 입력하시오: ");
		int b = sc.nextInt();

		sc.nextLine();
		
		// ----- 풀이 1 ----- 두 변수를 미리 계산한 것을 따로 변수로 두어 푸는 방법 있음
		// int result1 = a + b;
		// system.out.println("더하기 결과: " + result1);
		
		// ----- 풀이 2 ----- 연산의 우선 순위를 고려해 소괄호로 묶는 방법 / 내가 한 방법
		// 우선순위가 같은 경우 왼쪽에서부터 순차적으로 연산이 행해짐
		System.out.println("더하기 결과: " + (a + b));
		System.out.println("빼기 결과: " + (a - b));
		System.out.println("곱하기 결과: " + (a * b));
		System.out.println("나누기 결과: " + (a / b));
		
	} // inputTest5 메소드 영역 끝
	
	// 숙제
	public void inputTest6() {
		
		/*
		 * 키보드로 가로, 세로 값을 "실수형"으로 입력받아서
		 * 사각형의 면적과 둘레를 출력해 주세요
		 * 
		 * 힌트
		 * 사각형의 면적(넓이): 가로 * 세로
		 * 사각형의 둘레: (가로 + 세로) * 2
		 * 
		 * 실행 예시
		 * 가로 길이를 입력하세요: 13.5
		 * 세로 길이를 입력하세요: 41.7
		 * 
		 * 면적: xx
		 * 둘레: xx
		 */
	}
}

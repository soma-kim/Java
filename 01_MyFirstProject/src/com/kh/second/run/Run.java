package com.kh.second.run;

import com.kh.second.MethodTest; // 해당 패키지에 있는 클래스를 이 클래스 영역 안에서 가져다 쓰겠다. **40줄~ 해결방법 2)**
import com.kh.first.HelloEveryone; // import구문은 패키지 선언부와 클래스 선언부 사이에 씀

// com.kh.second.run.Run
public class Run {
	
	// 이 클래스에서 할 일: 실행을 위한 main 메소드 만들기
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작"); // 출력문도 일종의 메소드
		
		// 다른 메소드를 호출해 보자
		
		/*
		 * *메소드 호출 방법
		 * 1. 나랑 같은 클래스 안에 존재하는 메소드를 호출할 경우
		 * => 호출하고자하는메소드명();
		 * 
		 * 2. 나랑 다른 클래스 안에 존재하는 메소드를 호출할 경우
		 * 
		 */
		
		 // testPrintA();
		 // The method testPrintA() is undefined for the type Run: 같은 클래스 안에 정의된 메소드가 아님

		
		// 1) 내가 호출할 메소드가 존재하는 클래스를 생성 (new) 이라는 걸 해야 함
		// [ 표현법 ] 클래스명 대변할이름 = new 클래스명();
		// MethodTest mt = new MethodTest();
		// MethodTest cannot be resolved to a type: Run은 run 패키지 안에 있는데 MethodTest는 run 패키지 바깥에 있음
		
		// => 기본적으로 현재 같은 패키지 내에 해당 이름을 가진 클래스를 찾음
		// 	    다른 패키지에 존재하는 클래스이기 때문에 MethodTest를 찾지 못함
		
		// 해결 방법 1) 해당 클래스가 정확히 어느 패키지에 있는 클래스인지 풀 클래스명을 명시
		// com.kh.second.MethodTest mt = new com.kh.second.MethodTest();
		// => 너무 길다는 단점 있음
		
		// 해결 방법 2) 그냥 클래스명을 가지고 생성 구문을 작성하되,
		//			  이 클래스가 어떤 패키지에 속해 있는지 선언문을 추가 => 주로 쓰이는 방법 *3줄 import구문 함께 추가*
		MethodTest mt = new MethodTest();
		
		// 2) 대변할이름을 생성 후 이제 해당 클래스에 있는 메소드를 호출
		// [ 표현법 ] 대변할이름.호출하고자하는메소드명();
		/*
		 * mt.testPrintA();
		 * mt.testPrintB();
		 * mt.testPrintC();
		 */
		// System.out.println("메인 메소드 끝");
		// 다른 클래스의 메소드를 호출하면 호출한 뒤 원래의(=나를 호출한) 클래스로 되돌아옴! 돌아오지 않았다면 "메인 메소드 끝"이 출력될 수 없음 
		
		// testPrintA 메소드 하나만 호출해서 A, B, C 모두 출력하는 결과를 얻기
		mt.testPrintA();
		
		// 여태까지 일반 메소드들만 호출해 봤음
		// main 메소드도 호출해 보자
		// HelloEveryone 클래스의 main 메소드를 호출할 예정
		// => 우선적으로 대변할이름을 만들어 줘야 하나,
		// => main 메소드는 static(언제나 사용할 준비가 되어 있음)이라는 키워드가 붙었기 때문에 대변할이름 없이 다이렉트 호출 가능
		// => 일반 메소드의 경우에도 static 붙으면 대변할이름 없이 다이렉트 호출 가능
		// [ 표현법 ] 클래스명.메소드명();
		
		// HelloEveryone.main();
		// import 구문까지 썼을 때 main에 오류 뜸(The method main(String[]) in the type HelloEveryone is not applicable for the arguments ())
		// => 오류 뜻: 입력값 하나는 넣어 줘야 해! = String(배열) 형태의 값 하나는 넣어야 돼!
		 HelloEveryone.main(null); // null: 없음을 나타내는 값, 값을 넣긴 넣어야 하는데 뭘 넣어야 할지 모르겠을 때
		 
		 /*
		  * 질문
		  * 1. 중괄호({, })를 닫았는데 오류 발생? => 오류 메시지: ~ insert "}" => 중괄호 짝이 안 맞았을 때 발생하는 오류 
		  * 							  => 자동, 수동 들여쓰기(tab)를 생활화하자
		  * 2. 메소드를 정의하는 순서와 메소드가 실행되는 순서는 다르다! => 실행은 호출된 순서로 진행됨, 
		  */
		 
		 // 실습 과제
		 // 01_MyFirstProject 프로젝트 내에
		 // com.kh.third 패키지에 MyName 클래스 생성
		 // => callMyName 메소드 정의
		 // => 출력문을 이용해서 "안녕하세요 xxx 입니다." 출력
		 // com.kh.third.run 패키지에 Run 클래스 생성
		 // => main 메소드 생성 후 callMyName 메소드를 호출
		 
	}
}

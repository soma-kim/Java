package com.kh.chap03.override.run;

import com.kh.chap03.override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		// 모든 클래스는 Object 클래스의 후손임
		// 즉, 최상위 클래스는 항상 Object
		// => Object에 있는 메소드들은 다 가져다 쓸 수 있음
		// => Object에 있는 메소드들을 내 입맛대로 오버라이딩 할 수 있음
		
		Book bk = new Book("수학의정석", "나수학", 10000);
		
		System.out.println(bk /* .toString() */); // 주소값
		System.out.println(bk.hashCode()); // 주소값 십진수 형태
		// Object에서 제공하는 유용한 메소드를 상속받아서 사용 가능
		
		// 그중에서도 아주! 유용하게 쓸 수 있는 메소드
		// toString() 메소드
		System.out.println(bk.toString()); // 주소값 내용이 bk만 제시했을 때랑 동일하게 출력
		
		/*
		 * toString() 메소드
		 * 해당 참조 타입의 풀클래스명 + @ + 해당 객체의 주소값의 16진수의 형태로 돌려주는 메소드
		 * 알게 모르게 객체명만 제시했을 경우 내부적으로 toString() 메소드가 호출된 꼴 (JVM에 의해)
		 * 
		 * 출력문 안에서 참조형 변수를 제시해서 해당 내용을 출력하고자 할 때
		 * toString() 메소드가 내부적으로 알아서 호출된다는 점을 이용해서
		 * toString() 메소드를 오버라이딩 해서 각 필드의 값을 한 개의 문자열로 리턴해 주게끔 재정의해서 씀!!
		 * => 기존에 information 메소드의 역할을 toString이 하게끔 오버라이딩 하겠음
		 */
		
		// 오버라이딩 전: com.kh.chap03.override.model.vo.Book@6d06d69c
		// 오버라이딩 후: title: 수학의정석, author: 나수학, price: 10000
		
		/*
		 * 클래스 구조
		 * public class 클래스명 {
		 * 
		 * 		// 필드부
		 * 
		 * 		// 생성자부: 기본 생성자, 모든필드에대한매개변수생성자
		 * 
		 * 		// 메소드부: getter / setter, toString() 오버라이딩
		 */

	}

}

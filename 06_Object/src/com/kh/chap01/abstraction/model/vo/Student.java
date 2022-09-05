package com.kh.chap01.abstraction.model.vo;

/*
 * 클래스의 구조
 * 
 * public class 클래스명 {
 * 
 * 		// 필드부(필드들이 모여 있는 부분), 필드 = 변수
 * 
 * 		// 생성자부(생성자들이 모여 있는 부분), 생성자 = new 뒤에 붙는 클래스명
 * 
 * 		// 메소드부(메소드들이 모여 있는 부분)
 * 
 * }
 */

// 학생들을 추상화해서 만든 클래스
public class Student {
	
	// [ 필드부 ]
	// 접근제한자 자료형 필드명;
	
	// 필드: 클래스 안에 바로 선언하는 변수
	// 접근제한자: 이 필드에  접근할 수 있는 범위를 제한할 수 있음
	//			(public > protected > default > private)
	//			클래스 영역 안에서 필드를 선언할 때 반드시 접근제한자를 붙여 줘야 함
	public String name; // 접근제한자를 쓰지 않을 경우 기본값 default로 잡힘
	public int age;
	public double height;
	
	// [ 생성자부 ]
	
	// [ 메소드부 ]
}

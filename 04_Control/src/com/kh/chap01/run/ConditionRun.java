package com.kh.chap01.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Else;
import com.kh.chap01.condition.C_Switch;

public class ConditionRun {
	
	/*
	 * 프로그램은 기본적으로 위에서부터 아래로 순차적으로 진행됨
	 * 하지만 이 순차적인 흐름을 바꾸고자 할 때 "제어문"이라는 걸 통해서 직접 흐름을 제어 가능
	 * 
	 * 선택적으로 실행하는 선택문 => 조건문(if문, if-else문, if-else if문, switch문)
	 * 반복적으로 실행하는 실행문 => 반복문(for문, while문, do-while문)
	 * 그 이외의 흐름을 제어하는 구문 => 분기문(brake문, continue문)
	 * 
	 * *조건문
	 * "조건식"을 통해 참이냐 거짓이냐를 판단해서 해당 조건이 참일 경우 그에 해하는 구문만 실행 가능
	 * => 조건식의 결과는 true / false 라는 논리값이 나와야 함
	 * => 조건식에서는 보통 비교 연산자, 논리 연산자 등 주로 결과가 논리값으로 나오는 연산자를 사용한다.
	 * 
	 * [ 종류 ]
	 * 조건문은 크게 if문 계열과 switch문으로 나뉜다.
	 * 1. if문 계열
	 * - 단독 if문: 표현하고자 하는 경우의 수가 한 개일 경우
	 * - if-else문: 표현하고자 하는 경우의 수가 두 개일 경우
	 * - if-else if문: 표현하고자 하는 경우의 수가 세 개 이상일 경우
	 * 
	 * 2. switch문: 조건식 중에서도 "동등 비교"에 대하여 편리하게 사용 가능하도록 고안된 문법
	 */
	
	public static void main(String[] args) {
		
		A_If a = new A_If();
		
		// a.method1();
		
		// a.method2();
		
		// a.method3();
		
		// a.method4();
		
		B_Else b = new B_Else();
		
		// b.method1();
		
		// b.method2();
		
		// b.method3();
		
		// b.method4();
		
		C_Switch c = new C_Switch();
		
		// c.method1();
		
		// c.method2();
		
		// c.method3();
		
		// c.method4();
		
		c.method5();
		
		
		
		
				
	}
}

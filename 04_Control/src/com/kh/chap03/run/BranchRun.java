package com.kh.chap03.run;

import com.kh.chap03.branch.A_Break;
import com.kh.chap03.branch.B_Continue;

public class BranchRun {

	/*
	 * 조건문 또는 반복문과 함께 쓰이며 "보조" 해 주는 역할
	 * => 선택 또는 반복 그 이외의 흐름을 제어하는 역할
	 * 
	 * *분기문
	 * 1. break문: 반복문 안에서 반복문을 빠져나가는 역할
	 * 2. continue문: 반복문 안에서 그 뒤의 코드는 무시하고 바로 다음 증감식으로 넘어가는 역할
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		A_Break a = new A_Break();
		
		// a.method1();
		
		// a.method2();
		
		// a.method3();
		
		B_Continue b = new B_Continue();
		
		// b.method1();
		
		// b.method2();
		
		 b.method3();
		
	}

}

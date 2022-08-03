package com.kh.array;

public class B_ArrayCopy {

	/*
	 * 배열 복사
	 * - 얕은 복사: 복사하는 시늉만 내는 것 -> 주소값만 복사됨
	 * - 깊은 복사: 동일한 새로운 배열을 하나 실제로 생성해서 실제 내부값들을 복사
	 */
	
	// 얕은 복사
	public void method1() {
		
		// 복사: 원본을 본떠서 만들겠다
		// => 이 테스트는 원본 배열이 있어야지만 가능함!
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== 원본 배열 출력 ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
	}
}

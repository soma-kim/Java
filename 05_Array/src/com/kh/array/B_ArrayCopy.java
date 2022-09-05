package com.kh.array;

import java.util.Arrays;

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
		
		// 복사열 배열: 원본으로부터 복사를 떠서 만들 예정
		int[] copy = origin;
		
		System.out.println("\n== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 복사본 배열 출력
		copy[2] = 99;
		
		System.out.println("\n== 복사본 배열 출력 수정 후 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 원본 배열 출력 -> 카피본을 바꿨는데 원본은 잘 남아 있는지를 확인
		
		System.out.println("\n== 복사본 배열을 수정 후의 원본 ==");
		for(int i =0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		// 복사본 배열만을 가지고 수정을 했는데 원본 배열의 내용도 같이 수정이 된 것 같다.
		// => 원본 배열도 함께 값이 변경된 것을 알 수 있다.
		// 얕은 복사: 배열의 주소값이 복사되어 원본과 복사본이 같은 상태
		
		System.out.println("\n원본 배열의 해시코드값: " + origin.hashCode()); // 원본 배열의 해시코드값과
		System.out.println("복사본 배열의 해시코드값: " + copy.hashCode()); // 복사본 배열의 해시코드값이 같음
		
	}
	
	// 깊은 복사 4가지 방법
	public void method2() {
		// 1. for문을 이용하는 방법
		// 새로운 배열을 선언 및 할당까지 끝낸 다음에
		// 원본 배열로부터 일일이 다 for문을 이용해서 옮겨 대입하는 방법
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		int[] copy = new int[origin.length]; // 각 방은 기본값인 0으로 초기화된 상태
		
		/*
		 * copy[0] = origin[0];
		 * copy[1] = origin[1];
		 * ...
		 */
		for (int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n==복사본 배열 수정 후 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n== 복사본 배열 수정 후의 원본 ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n원본 배열의 해시코드값: " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드값: " + copy.hashCode());
		
	}
	
	public void method3() {
		
		// 2. 새로운 배열을 생성 (선언 및 할당) 후
		//	  system 클래스에서 제공하는 arraycopy 메소드를 호출하여 복사
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		int[] copy = new int[10]; // origin의 사이즈 그대로가 아닌 넉넉하게~ 0 0 0 0 0 0 0 0 0 0 
		
		// System 클래스의 arraycopy 메소드 사용법
		// [ 표현법 ]
		// System.arraycopy(원본배열명, 원본배열의복사를시작할인덱스, 복사본배열명, 복사본배열의복사시작할인덱스, 복사할개수);
		// System.arraycopy(src(원본배열명), srcPos(pos:position, 원본 어디서부터?, 원본 시작할 인덱스), dest(destination:목적지, 복사본 배열명), destPos(복사본 어디서부터?, 복사본 시작할 인덱스), length(총 몇 개를 복사? 복사할개수);
		
		System.arraycopy(origin, 0, copy, 0, 5); // 1 2 3 4 5 0 0 0 0 0
		// System.arraycopy(origin, 0, copy, 2, 5); // 0 0 1 2 3 4 5 0 0 0
		// System.arraycopy(origin, 0, copy, 1, 3); // 0 1 2 3 0 0 0 0 0 0
		// System.arraycopy(origin, 2, copy, 1, 3); // 0 3 4 5 0 0 0 0 0 0
		// System.arraycopy(origin, 2, copy, 9, 2); // 0 0 0 0 0 0 0 0 0 3 (4) ???
		// ArrayIndexOutOfBoundsException => 복사하는 과정에서 인덱스 범위를 벗어나서 발생
				
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) { 
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 배열의 해시코드값: " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드값: " + copy.hashCode());
		// 다른 주소값을 가지고 있음 == 다른 곳을 참조하고 있음
		// => 깊은 복사가 제대로 이루어져 배열을 수정할 때 서로 영향을 받지 않는다는 것을 유추 가능
		
	}
	
	public void method4() {
		
		// 3. Arrays 클래스의 copyOf 메소드를 호출하는 방법
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		// Arrays 클래스의 copyOf 메소드 사용 방법
		// [ 표현법 ] 복사본배열 = Arrays.copyOf(원본배열명, 복사할개수);
		int[] copy = Arrays.copyOf(origin, 10); // 이때, copy배열의 크기 == 복사할 개수
		// 원본 배열보다 작거나 많아도 해당 메소드의 복사할개수가 우선됨!
		
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 배열의 해시코드값: " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드값: " + copy.hashCode());
		// => 깊은 복사가 잘되었음
		
	}
	
	public void method5() {
		
		// 4. Clone 메소드를 호출하여 복사
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		// clone 메소드 사용법
		// [ 표현법 ] 복사본배열명 = 원본배열명.clone();
		int[] copy = origin.clone(); // 별도의 옵션 존재하지 않음
		
		// 복사본 출력해 보기
		// [1, 2, 3, 4, 5] 형태로 출력하고 싶음!
		
		/*
		System.out.print("[");
		for(int i = 0; i < copy.length; i++) {
			
			// 내용물 출력
			
			if(i < copy.length - 1) { // 마지막 인덱스가 아닐 경우
				
				System.out.print(copy[i] + ", ");
			}
			
			else { // 마지막 인덱스일 경우
				System.out.println(copy[i]);
			}
			
		}
		
		System.out.print("]");
		*/
		
		System.out.println(Arrays.toString(copy));
		// Arrays.toString(출력하고자하는배열명);
		// => 앞과 뒤에 각각 '['과 ']'을 붙이고, 내용물 사이에는 쉼표(,)로 연이어져서 한 개의 문자열로 내보내 주는 메소드
		
		System.out.println("원본 배열의 해시코드값: " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드값: " + copy.hashCode());
		// 깊은 복사가 잘 이루어졌다.
	}

}
	
	

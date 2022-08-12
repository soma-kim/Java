package com.kh.chap02.abstractAndInterface.part01.basic.run;

import com.kh.chap02.abstractAndInterface.part01.basic.model.vo.Basketball;
import com.kh.chap02.abstractAndInterface.part01.basic.model.vo.Football;
import com.kh.chap02.abstractAndInterface.part01.basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {
		
		/*
		// Sports s = new Sports();
		// 추상 클래스로 만들면 절대 객체 생성 불가
		// => 미완성된 클래스이기 때문
		
		Sports s; // 변수를 선언할 뿐이기 때문에 가능(참조자료형 변수로는 활용 가능)
		
		s = new Football();
		// 아무리 추상클래스 타입이어도 "다형성"에 의해 자식 타입의 객체를 생성 후 담을 수 있음
		*/
		
		// 선언과 동시에 생성하고 싶다면?
		
		Sports s = /* (Sports) */ new Football();
		
		// 객체 배열
		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].rule();
		}
		
		/*
		 * 추상 클래스(미완성된 클래스) => abstract calss
		 * - 해당 클래스 내부에 추상 메소드가 하나라도 존재하는 순간 반드시 추상 클래스로 정의해야 함
		 * - 단, 추상 메소드가 굳이 없어도 abstract class로 정의하면 추상 클래스로 정의함
		 * 	 (일반 필드 + 일반 메소드 + 추상 메소드(생략 가능))
		 * 	 => 개념적 이유: 클래스가 아직 구체적이지 않은 덜 왈성된 상태인 것 같을 때
		 * 	 => 기술적 이유: 이 클래스를 객체 불가능하게 막고 싶을 때 
		 * - 객체 생성이 불가하나 다형성적을 적용하여 참조변수로는 활용 가능!
		 * 
		 * *추상 메소드(미완성된 메소드) => abstract 반환형
		 * - 미완성된 메소드로 몸통부 { }가 구현되어 있지 않은 메소드
		 * - 자식 클래스에서 오버라이딩을 통해 완성됨 (즉, 강제로 오버라이딩을 해야 함)
		 * 
		 */ 
		

	}

}

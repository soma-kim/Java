package com.kh.chap01.poly.part01.basic.run;

import com.kh.chap01.poly.part01.basic.model.vo.Child1;
import com.kh.chap01.poly.part01.basic.model.vo.Child2;
import com.kh.chap01.poly.part01.basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		/*
		 * 객체지향프로그래밍(Object Oriented Programming, OOP) 3대 요소
		 * => 캡슐화, 상속, 다형성
		 * 
		 * *다형성
		 * 같은 자료형에 여러 가지 객체를 대입하여 다양한 결과를 얻어내는 성질
		 * => "상속" 관계에서만 이루어질 수 있는 "형 변환"의 개념!
		 */
		
		// 명심할 사항: 대입연산자 (=) 기준으로 왼쪽과 오른쪽의 자료형은 같아야 함
		
		// 1. 부모 타입의 참조변수(주소값이 들어가는 stack영역의 상자)로 부모 객체(heap 영역의 알맹이)를 다루는 경우
		System.out.println("1. 부모 타입의 참조변수로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
		//  Parent 주소갑 타입 = heap 영역 실물 타입
		p1.printParent();
		// p1.printChild1();
		// => p1 참조 변수로 Parent 객체에만 접근 가능
		
		// 2. 자식 타입의 참조변수로 자식 객체를 다루는 경우
		System.out.println("2. 자식 타입의 참조변수로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		// Child1 주소값 타입 = heap 영역 실물 타입
		c1.printChild1();
		c1.printParent();
		// => c1 참조변수로 Child1, Parent 둘 다 접근 가능
		
		// 3. 부모 타입 참조변수로 자식 객체를 다루는 경우(다형성이 적용된 개념)
		System.out.println("3. 부모 타입 참조변수로 자식 객체를 다루는 경우(다형성이 적용된 개념)");
		Parent p2 = /* (Parent) */ new Child1(); // 자동 형변환으로 자식 객체가 부모 타입 참조변수에 담김
		// 대입 연산자 기준으로 양쪽의 자료형이 다름에도 불구하고 오류 발생하지 않음
		// Child1 타입의 객체가 Parent형으로 "자동 형변환"이 되고 있음
		// => "상속" 구조에서는 클래스간의 형 변환이 가능함
		
		p2.printParent(); // p2 참조변수로 Parent에만 접근 가능
		// (Child1)p2.printChild1(); 로 진행할 경우 우선 순위 때문에 여전히 오류가 남!
		((Child1)p2).printChild1(); // 단, Child1형으로 강제 형변환 한 후 Child1에 접근 가능
		
		// 자식이 부모 되는 건 자동 형변환, 부모가 자식 되려면 강제 형변환
		
		/*
		 * "상속" 구조에서 클래스 간의 "형 변환"이 가능함
		 * 1. UpCasting: 자식타입 => 부모타입(자동 형변환, 형변환연산자 생략 가능)
		 * 2. DownCasting: 부모타입 => 자식타입(강제 형변환, 형변환연산자 명시적으로 작성해야 함)
		 */
		
		// 다형성을 배워야 하는 이유에 대한 예시
		
		// Child1 객체 2개, Child2 객체 2개가 필요한 상황이라고 가정
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(2, 3, 5);
		
		// 단, 다형성이 적용되면 부모 타입의 참조변수로
		// 다양한 자식객체를 받아줄 수 있음
		
		System.out.println("===== 다형성을 적용한 객체 배열 =====");
		Parent[] arr = new Parent[4]; // 자식 객체에 대한 배열 선언 없이 가능해짐!
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(5, 7, 2);
		arr[2] = new Child1(2, 1, 5);
		arr[3] = new Child2(2, 3, 5);
		// 부모 타입에 담길 때는 자식 타입이 자동 형변환 된 꼴 => UpCasting
		
		// arr[0].printParent();
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child1)arr[2]).printChild1();
		((Child2)arr[3]).printChild2();
		// 자식타입객체로써 사용하고자 할 경우에는 강제형변환으로 원산 복구 후에 사용 가능 => DownCasting
		
		// ((Child1)arr[3]).printChild1();
		// => Child2 타입인 arr[3]을 Child1으로 형 변환 하려고 해서 오류가 발생함! 
		// ClassCastException: 클래스간 형 변환이 잘못되었을 경우 발생하는 에러
		
		System.out.println("===== 반복문 이용해서 해 보기 =====");
		
		for(int i = 0; i < arr.length; i++) {
			
			// 각 인덱스별로 실제로 참조하고 있는 자식 클래스로 형 변환 후에 메소드 호출
			// (강제형변환)arr[i].필요한메소드();
			
			// instanceof 연산자
			// 현재 참조변수가 실제로 어떤 자식 클래스를 참고하고 있는지 확인할 때 사용
			// [ 표현법 ]
			// 참조변수명 instanceof 검사할클래스명
			
			// 부모객체명 instanceof 부모클래스명 == true
			// 자식객체명 instanceof 부모클래스명 == true (상속을 받았으니 부모님 거도 내 거)
			// 부모객체명 instanceof 자식클래스명 == false (부모객체는 자식객체의 내용물에 접근 불가)
			// 자식객체면 instanceof 자식클래스명 == true
			
			/*
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}
			else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print();
			// print 메소드는 "오버라이딩" 된 상태
			// => 오버라이딩 시 "자식 메소드"가 우선권을 가져 호출됨
			
			// 단, 오버라이딩을 이용하면 굳이 형변환을 안 해도 됨
			// (알아서 자식객체의 메소드로 찾아가서 호출되는 꼴이기 때문에)
			
			
		}
		
		
	
		
	}

}

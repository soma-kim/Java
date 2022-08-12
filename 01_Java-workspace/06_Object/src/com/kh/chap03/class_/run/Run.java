package com.kh.chap03.class_.run;

import com.kh.chap03.class_.model.vo.Person;
import com.kh.chap03.class_.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// Person이라는 클래스
		// == 사람의 정보를 담고자 내가 만든 나의 자료형
		// 	  (여러 개의 자료형, 여러 개의 값들을 보관 가능)
		// == 사용자 정의 자료형 (커스터마이징)
		
		Person p = new Person(); // 객체 생성 == 인스턴스화
		
		System.out.println(p); // 주소값
		System.out.println(p.information()); // 초기값, JVM에 의해 채워진 기본값들이 출력

		// => 값 대입을 안 해서 기본값이 출력된 것이므로 메소드가 잘 만들어진 것임을 알 수 있음!
		
		// 값 넣기 => setter 메소드
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("홍길동");
		
		System.out.println(p.information()); // id, pwd, name만 입력되고 나머지는 기본값 출력됨
		
		p.setAge(25);
		p.setGender('남');
		p.setPhone("010-1111-2222");
		p.setEmail("hong@naver.com");
		
		System.out.println(p.information());
		
		// --------------------------------------------
		
		// 상품 객체 생성
		Product p1 = new Product();
		
		p1.setpName("아이폰11pro");
		p1.setPrice(1000000);
		// p1.setBrand("애플");
		// brand는 일치하므로 Product 클래스에서 필드 선언과 동시에 초기화! 즉, 해당 구문 없어도 출력됨!
		p1.setBrand("apple"); // 변수이므로 값이 바뀔 수 있음! apple 출력
		// => brand 필드에 "애플"로 초기화해 두었을 경우
		// setter 메소드로 굳이 brand명을 정해 두지 않아도 됨
		// 단, 해당 필드를 상수로 지정하지 않았기 때문에
		// 변경하고자 할 때는 언제든지 setter 메소드를 호출해서 값을 변경 가능함
		
		System.out.println(p1.information());
		
		// default 접근제한자의 클래스는
		// 다른 패키지에 있을 경우 갖다 쓸 수 없게 제한됨
		// 단, 같은 패키지에 있을 경우에만 사용 가능
		
		Product p2 = new Product();
		
		p2.setpName("애플워치7");
		p2.setPrice(500000);
		// p2.setBrand("애플");
		
		System.out.println(p2.information());
		


	}

}

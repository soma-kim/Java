package com.kh.chap02.encapsulation.model.vo;

// 캡슐화 과정을 거친 Student 클래스
public class Student {
	
	// 필드부
	/*
	 * 필드: 클래스 안에 바로 선언해 두는 변수
	 * 		(== 멤버변수 == 인스턴스 변수)
	 * 
	 * [ 표현법 ]
	 * 접근제한자 자료형 필드명;
	 */
	
	private String name;
	private int age;
	private double height;
	
	// 생성자부
	
	// 메소드부
	/*
	 * 각 기능(기능 단위 == 메소드)을 구현하는 부분
	 * 
	 * [ 표현법 ]
	 * 접근제한자 반환형 메소드명(매개변수 => 생략 가능하나 적을 때는 짝 맞춰서 값 잘 넣어 줘야 함) {
	 * 
	 * 		기능 구현 코드;
	 * 
	 * 		반환형이 있다면 return 돌려줄값;
	 * }
	 * 
	 * 반환형: 출력되는(가지고 오는) 자료형의 결과값
	 * (반환형과 돌려줄값의 형은 일치해야 함)
	 * 매개변수: 입력되는(들어오는) 값
	 */
	
	// setter 메소드: 데이터를 기록 및 수정하는 용도의 메소드
	// getter 메소드: 데이터를 반환해 주는 기능의 메소드
	// => setter / getter 메소드는 항상 접근 가능해야 하기 때문에 public으로 써야 함
	// => 필드 한 개당 setter와 getter 메소드를 1개씩 !꼭! 만들어 줘야 함
	
	// setter 메소드: 주로 대입이 일어남
	// 각각 String name, int age, double height에 대하여 만들기
	// 이름값을 기록 및 수정할 수 있는 메소드(name 필드에 대입하는 용도)
	
	public void setName(String name) {
	// setter는 기록/수정용이기 때문에 반환할 반환형이 없음! 항상 void를 씀
	
		// name = "홍길동";
		// 이렇게 쓰면 setName 메소드에 무조건 홍길동만 입력되기 때문에 이러면 안 됨!
		// 매개변수에 입력받을 값을 넣은 뒤
		
		this.name = name;
		
		// this에는 현재 나의 주소값이 담김
	}
	
	/*
	 * [ 표현법 ]
	 * public void set필드명(해당필드의자료형 해당필드명과동일한매개변수명) {
	 * 
	 * 		this.필드명 = 매개변수명;
	 * }
	 * 
	 * => 필드명 앞에는 항상 this. (나의 주소값)을 붙여 줘야 함
	 * => 메소드 영역 안에서는 이름이 같을 때 매개변수 (일종의 지역변수 개념) 의 우선순위가 높게 지정되기 때문에
	 * 	    구분 용도로 필드명 앞에는 this.을 붙여야 함 반드시!
	 */
	
	// 나이값을 기록 및 수정할 수 있는 메소드(age 필드에 대입하는 용도)
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	// 키값을 기록 및 수정할 수 있는 메소드(height 필드에 대입하는 용도)
	public void setHeight(double height) {
		
		this.height = height;
		
	}
	
	// getter 메소드: 필드에 들은 값을 외부로 반출시키는 용도 (가지고 나가겠다)
	//				 주로 필드값을 반환시키는 구문이 작성됨
	// String name, int age, double height에 대해서 작성
	
	// name 필드에 들어 있는 값을 돌려주는 용도의 메소드
	public String getName() {
		
		return name; // name 값을 들고 돌아가겠다( == 결과값을 돌려주겠다) 
		
	}
	
	/*
	 * [ 표현법 ]
	 * public 해당필드의자료형 get필드명() {
	 * 
	 * 		return 필드명;
	 * }
	 * 
	 * => getter 메소드에서는 필드명 앞에 this. 을 붙이지 않음
	 * 	   굳이 이름을 구분할 매개변수가 없기 때문
	 */
	
	// age 필드에 들은 값을 돌려주는 용도의 메소드
	public int getAge() {
		
		return age;
		
	}
	
	// height 필드에 들은 값을 돌려주는 용도의 메소드
	public double getHeight() {
		
		return height;
	}
	
	// => setter와 getter 메소드까지 만들어 주는 과정까지가 캡슐화이다!
	
	// 모든 필드값들을 하나의 문자열로 연이어서 돌려 주는 용도의 메소드(information 메소드)
	// => 캡슐화 과정은 아니기 때문에 필수는 아님! 하지만 있으면 편리하니까 꼭 만들자
	
	// 접근제한자 반환형 메소드명(매개변수) {
	//		return 리턴값;
	// }
	
	public String information() {
		
		// return name, age, height; // 한 번에 한 개의 값만 리턴 가능함
		return name + " 님의 나이는" + age + "살이고, 키는 " + height + "cm입니다.";
		// 그래서 하나의 문자열로 만든 후에 리턴!
		
	}
}

package com.kh.chap05.constructor.model.vo;

public class User {
	
	// 필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	// 생성자부
	
	/*
	 * *생성자
	 * 메소드명이 클래스명과 동일하고 리턴 자료형이 없는 public 메소드
	 * 객체가 생성될 때 (new문을 쓸 때) 호출되는 메소드
	 * 
	 * [ 표현법 ]
	 * public 클래스명(매개변수 => 생략 가능) {
	 * 
	 * 		객체를 생성할 때 내가 실행하고자 하는 코드;
	 * 		(내가 원하는 값으로 필드를 초기화하는 코드를 주로 씀)
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성해 주기 위한 목적(new문을 쓸때 함께 쓰임) // Product p1 = new Product(); 구문에서 new 뒤의 Product()가 생성자임!
	 * 2. 객체 생성뿐 아니라 매개변수로 전달한 값을 곧바로 필드에 초기화할 목적
	 * 
	 * 생성자 작성 시 주의사항
	 * 1. 반드시 클래스명과 이름이 동일해야 함 (대소문자 구분)
	 * 2. 반환형이 존재하지 않음 (메소드와 유사하게 생겨서 헷갈릴 수 있으므로) // 반환형 없다고 냅다 void 쓰면 안 됨!
	 * 3. 여러 개 작성이 가능하지만 매개변수가 중복되면 안 됨(이름은 중복 가능하나, 매개변수를 다르게 적어 줌) => 오버로딩
	 * 4. 매개변수가 없는 기본 생성자는 작성하지 않는다면 JVM에 의해 자동으로 만들어짐
	 * 	    단, 다른 생성자들과 같이 작성할 경우에는 매개변수가 없는 기본 생성자를 꼭 명시해 줘야 함!
	 * 
	 */
	
	// 가장 기본적인 형태의 생성자: 기본 생성자
	// => 매개변수가 없는 형태
	// => 작성하지 않는다면 JVM에 의해 자동으로 생성됨
	

	public User() { // user01에 적용, 필수는 아니지만 당분간은 무조건 만들어 놓을 것!
		
		// 기본 생성자 == 매개변수가 없는 생성자
		// 단지 객체를 생성(공간을 확보)만을 목적으로 할 때 사용
		// => 그래서 보통의 경우는 아무 코드도 작성하지는 않음
		
		// 기본 생성자를 생략하는 경우 => 오류도 나지 않고, 객체를 생성하는 데 문제도 없엇음
		//						    그동안 알게 모르게 JVM이 자동으로 만들어 줬기 때문에 가능
		
		// 단 JVM이 매번 기본 생성자를 만들어 주는 것은 아니고
		// 매개변수가 있는 다른 생성자를 내가 직접적으로 작성했을 때에는 JVM에 기본 생성자를 만들어 주지 않음
		// => 즉, 어찌되었든 간에 기본 생성자는 항상 작성하는 습관을 들이자!
		
		// System.out.println("잘 출력이 되나...?");
	}

	
	// 매개변수가 있는 생성자: 필드값을 "내가 원하는 값으로" 초기화하고자 할 때 주로 쓰임
	public User(String userId) { // 객체 생성과 동시에 userId 필드에만 값을 내가 원하는 형태로 초기화할 목적
		
		this.userId = userId; // user02에 적용
		
	}
	
	// 객체 생성과 동시에 userId, userPwd, userName 필드만 초기화해 주는 생성자
	public User(String userId, String userPwd, String userName) {
		
		// 관례상 매개변수 생성자의 매개변수명도 필드명과 일치되게끔 작성함
		
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; // user03에 적용
		
	}
	
	// 객체 생성과 동시에 모든 필드에 대해서 내가 원하는 값으로 한 번에 초기화까지 해 줄 수 있는 생성자, 필수는 아니지만 있으면 편하므로 당분간 만들어 버릇 해 놓을 것!
	public User(String userId, String userPwd, String userName, int age, char gender) {
		
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		// 위와 같이 중복되는 동일한 초기화하는 구문이 있을 경우
		// 해당 코드를 대체할 수 있는 생성자를 호출 가능함
		// => this(== 나의 주소값) 생성자 호출하면 됨
		// 주의사항: this 생성자 호출 시에는 반드시 생성자 내부 첫 줄에 기술해야 함
		this(userId, userPwd, userName);
		
		this.age = age;
		this.gender = gender; // user04에 적용
		
		// this(userId, userPwd, userName);
		// Constructor call must be the first statement in a constructor: this 생성자는 첫 줄에 기술해야 함
	}
	
	
	// 메소드부
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return "userId: " + userId + ", userPwd: " + userPwd + ", userName: " + userName +
				", age: " + age + ", gender: " + gender;
	}

}

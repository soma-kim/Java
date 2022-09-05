package com.kh.chap02.set.part01.hashSet.model.vo;

public class Student {
	
	// 필드부
	private String name;
	private int age;
	private int score;
	
	// 생성자부
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	// 메소드부
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	// 동일한 객체로 판별이 되지 않게끔 equals 메소드, hashCode 메소드 오버라이딩
	// hashCode 메소드 오버라이딩: 필드값을 기반으로 십진수를 발생시켜서 반환하도록 재정의
	@Override
	public int hashCode() {
		// "공유43100" => 모든 필드의 값들을 하나의 문자열로 연이어서 해시코드 발생
		String str = name + age + score;
		return str.hashCode();
	}
	
	// equals 메소드 오버라이딩: 모든 필드의 값들이 모두 일치해야만 true 반환시키도록 재정의
	@Override
	public boolean equals(Object obj) {
		
		// 자동 완성 ver.
		if (this == obj) // 주소값이 일치하면 무조건 true 반환
			return true;
		if(obj == null) // 비교 대상의 주소가 null이라면 애초에 검사할 가치도 없어서 false 반환
			return false; 
		if(getClass() != obj.getClass()) // 나의 타입과 비교 대상의 타입이 애초에 다르다면 검사할 가치도 없어서 false 반환
			return false;
		
		// Student객체.equals(비교할Student객체);
		
		// Student 객체          vs          Object 객체
		//    this                        obj
		
		// 우선적으로 매개변수로 받은 obj를 Student 타입으로 다운캐스팅
		Student other = (Student)obj;
		
		// 직접 만들기 ver.
		// name, age, score 필드값 모두 일치하는지 비교
		// this.name = equals(other.name)
		// this.age == other.age
		// this.score == other.score
		if((this.name.equals(other.name)) && (this.age == other.age) && (this.score == other.score)) {
			return true;
		} else {
			return false;
		}
		
	}
	
}

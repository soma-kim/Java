package com.kh.chap03.class_.model.vo;

public class Person {
	
	// 필드부
	// 필드 == 멤버변수 == 인스턴스변수
	
	// 1. 필드 만들기
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 생성자부
	
	// 메소드부
	// 2. setter, getter 메소드 만들기
	// 각 필드에 대입시키고자 하는 값을 전달받아서 해당 필드에 대입시켜 주는 setter 메소드 7개ㅑ
	// setter 메소드명: setXXX (낙타표기법)
	
	public void setId(String id) {
		
		this.id = id;
		
	}
	
	public void setPwd(String pwd) {
		
		this.pwd = pwd;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	public void setGender(char gender) {
		
		this.gender = gender;
		
	}
	
	public void setPhone(String phone) {
		
		this.phone = phone;
		
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	
	// 각 필드값을 돌려 주는 getter 메소드 7개
	// getter 메소드명: getXXX (낙타표기법)
	
	public String getId() {
		
		return id;
		
	}
	
	public String getPwd() {
		
		return pwd;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public char getGender() {
		
		return gender;
		
	}
	
	public String getPhone() {
		
		return phone;
		
	}
	
	public String getemail() {
		
		return email;
		
	}
	
	// => 캡슐화 작업 끝!
	
	// 3. information 메소드 만들기
	// 모든 필드값을 하나의 문자열로 연이어서 반환해 주는 information 메소드
	
	public String information() {
		
		return "id: " + id + ", pwd: " + pwd + ", name: " + name + ", age: " + age
				+ ", gender: " + gender + ", phone: " + phone + ", email: " + email;
	}

	

}

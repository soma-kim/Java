package com.kh.chap03.class_.model.vo;

public class Person {
	
	// �ʵ��
	// �ʵ� == ������� == �ν��Ͻ�����
	
	// 1. �ʵ� �����
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// �����ں�
	
	// �޼ҵ��
	// 2. setter, getter �޼ҵ� �����
	// �� �ʵ忡 ���Խ�Ű���� �ϴ� ���� ���޹޾Ƽ� �ش� �ʵ忡 ���Խ��� �ִ� setter �޼ҵ� 7����
	// setter �޼ҵ��: setXXX (��Ÿǥ���)
	
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
	
	
	// �� �ʵ尪�� ���� �ִ� getter �޼ҵ� 7��
	// getter �޼ҵ��: getXXX (��Ÿǥ���)
	
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
	
	// => ĸ��ȭ �۾� ��!
	
	// 3. information �޼ҵ� �����
	// ��� �ʵ尪�� �ϳ��� ���ڿ��� ���̾ ��ȯ�� �ִ� information �޼ҵ�
	
	public String information() {
		
		return "id: " + id + ", pwd: " + pwd + ", name: " + name + ", age: " + age
				+ ", gender: " + gender + ", phone: " + phone + ", email: " + email;
	}

	

}
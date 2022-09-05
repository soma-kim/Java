package com.kh.chap03.class_.model.vo;

public class Dog {
	
	// 필드부
	private String name;
	private String type;
	private String color;
	private int age;
	private char gender;
	private double weight;
	
	// 생성자부
	
	// 메소드
	// setter, getter 메소드
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public double getWeight() {
		return weight;
	}
	
	// information 메소드

	public String information() {
		
		return "name: " + name + ", type: " + type + ", color: " + color
				 + ", age: " + age + ", gender: " + gender + ", weight: " + weight; 
	}

}

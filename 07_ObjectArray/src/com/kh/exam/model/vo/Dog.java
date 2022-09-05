package com.kh.exam.model.vo;

public class Dog {
	
	// 필드부
	
	private String name;
	private double weight;
	private double height;
	
	// 생성자부
	
	public Dog() {
		
	}
	
	public Dog(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		
	}
	
	// 메소드부
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public String info() {
		return name + "은(는) 몸무게는 " + weight + "kg이고, 몸의 길이는 " + height + "cm 입니다.";
	}

}

package com.kh.chap02.inherit.model.vo;

public class Vehicle {
	
	// 필드부
	private String name; // 이름
	private double mileage; // 움직인 거리
	private String kind; // 종류
	
	// 생성자부
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	
	// 메소드부
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String information() {
		return "name: " + name + ", mileage: " + mileage + ", kind: " + kind;
	}
	
	public void howToMove() {
		System.out.println("움직인다.");
	}

}

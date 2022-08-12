package com.kh.chap02.inherit.model.vo;

public class Car extends Vehicle {
	
	// 필드부
	private int tire; // 바퀴 개수
	
	// 생성자부
	public Car() {
		
	}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	// 메소드부
	
	public int getTire() {
		return tire;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public String information() {
		return super.information() + ", tire: " + tire;
	}
	
	public void howToMove() {
		System.out.println("바퀴를 굴려가며 움직인다.");
	}

}

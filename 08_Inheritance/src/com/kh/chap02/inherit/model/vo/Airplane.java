package com.kh.chap02.inherit.model.vo;

public class Airplane extends Vehicle {
	
	// 필드부
	
	private int tire; // 바퀴 개수
	private int wing; // 날개 개수
	
	// 생성자부
	
	public Airplane() {
		
	}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}

	
	// 메소드부
	
	public int getTire() {
		return tire;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public int getWing() {
		return wing;
	}
	
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	public String information() {
		return super.information() + "tire: " + tire + ", wing: " + wing;
	}
	
	

}

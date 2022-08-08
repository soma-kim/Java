package com.kh.chap02.inherit.model.vo;

public class Car extends Vehicle {
	
	// �ʵ��
	private int tire; // ���� ����
	
	// �����ں�
	public Car() {
		
	}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	// �޼ҵ��
	
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
		System.out.println("������ �������� �����δ�.");
	}

}

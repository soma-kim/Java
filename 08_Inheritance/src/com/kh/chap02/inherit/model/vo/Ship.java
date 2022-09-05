package com.kh.chap02.inherit.model.vo;

public class Ship extends Vehicle {
	
	// �ʵ��
	private int propeller; // �����緯 ����
	
	// �����ں�
	
	public Ship() {
		
	}
	
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	// �޼ҵ��
	
	public int getPropeller() {
		return propeller;
	}
	
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	public String information() {
		return super.information() + ", propeller: " + propeller;
	}
	
	public void howToMove() {
		System.out.println("�����緯�� �������� �����δ�.");
	}

}

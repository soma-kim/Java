package com.kh.chap02.inherit.model.vo;

public class Vehicle {
	
	// �ʵ��
	private String name; // �̸�
	private double mileage; // ������ �Ÿ�
	private String kind; // ����
	
	// �����ں�
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	
	// �޼ҵ��
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
		System.out.println("�����δ�.");
	}

}

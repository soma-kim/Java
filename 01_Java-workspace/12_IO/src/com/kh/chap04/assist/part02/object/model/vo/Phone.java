package com.kh.chap04.assist.part02.object.model.vo;

public class Phone {
	
	// �ʵ��
	private String name;
	private int price;
	
	// �����ں�
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// �޼ҵ��
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "name: " + name + ", price: " + price;
	}

}

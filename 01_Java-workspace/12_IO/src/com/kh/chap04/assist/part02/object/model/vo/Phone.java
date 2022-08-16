package com.kh.chap04.assist.part02.object.model.vo;

public class Phone {
	
	// 鞘靛何
	private String name;
	private int price;
	
	// 积己磊何
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 皋家靛何
	
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

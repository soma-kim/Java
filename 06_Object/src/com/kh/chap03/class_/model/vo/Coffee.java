package com.kh.chap03.class_.model.vo;

public class Coffee {
	
	private String name;
	private String size;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return "name: " + name + ", size: " + size + ", price: " + price;
	}

}

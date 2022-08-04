package com.kh.chap03.class_.model.vo;

public class Car {
	
	private String type;
	private String name;
	private String color;
	private String vender;
	private int price;
	private boolean isNew;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setVender(String vender) {
		this.vender = vender;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setisNew(boolean isNew) {
		this.isNew = isNew;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getVender() {
		return vender;
	}
		
	public int getPrice() {
		return price;
	}
	
	public boolean getisNew() {
		return isNew;
	}
	
	public String information() {
		return "type: " + type + ", name: " + name + ", color: " + color +
				 ", vender: " + vender + ", price: " + price + ", isNew: " + isNew;
	}

}

package com.kh.chap01.beforeVSafter.before.model.vo;

public class Desktop {
	
	// 鞘靛何
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	// 积己磊何
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	// 皋家靛何
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean getAllInOne() {
		return allInOne;
	}
	
	public String information() {
		return "brand: " + brand + ", pCode: " + pCode + ", pName: " + pName + ", price: " + price + ", allInOne: " + allInOne;
	}

}

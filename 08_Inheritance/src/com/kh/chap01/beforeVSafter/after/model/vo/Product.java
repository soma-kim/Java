package com.kh.chap01.beforeVSafter.after.model.vo;

// 부모 클래스: 세 클래스 모두 공통적으로 기술했던 요소들만 추출해서 단 한 번 정의해 둔 클래스
public class Product {
	
	// 필드부

	private String brand;
	private String pCode;
	private String pName;
	private int price;

	
	/*
	protected String brand;
	protected String pCode;
	protected String pName;
	protected int price;
	*/
	
	// 생성자부
	
	public Product() {
		
	}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	// 메소드부
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public int getprice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "brand: " + brand + ", pCode: " + pCode + ", pName: " + pName + ", price: " + price;
	}
}

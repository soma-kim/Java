package com.kh.chap03.class_.model.vo;

// 클래스에서 사용 가능한 접근 제한자: public, default(생략 가능)
public class Product {
	
	// 필드부
	// 1. 필드(변수) 만들기
	
	private String pName;
	private int price;
	private String brand = "애플"; // 필드 선언과 동시에 초기화, 변경 가능한 필드값
	// public static final String BRAND = "애플"; 
	// 상수(변경 불가능한)필드로 만들고 싶을 때는 항상 언제나 어디서든 쓸 수 있게끔 "public static final ~"로 만들어 줘야 함
	
	// 생성자부
	
	// 메소드부
	// 2. setter, getter 메소드 만들기
	
	public void setpName(String pName) {
		
		this.pName = pName;
		
	}
	
	public void setPrice(int price) {
		
		this.price = price;
		
	}
	
	public void setBrand (String brand) {
		
		this.brand = brand;
	}
	
	public String getpName() {
		
		return pName;
		
	}
	
	public int getPrice() {
		
		return price;
		
	}
	
	public String brand() {
		
		return brand;
		
	}
	
	// 3. information 메소드 만들기
	
	public String information() {
		
		return "pName: " + pName + ", price: " + price + ", brand: " + brand;
	}

}

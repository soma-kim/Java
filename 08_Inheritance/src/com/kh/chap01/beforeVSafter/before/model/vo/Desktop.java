package com.kh.chap01.beforeVSafter.before.model.vo;

public class Desktop {
	
	// 필드부
	
	private String brand; // 브랜드명
	private String pCode; // 상품 코드
	private String pName; // 상품명
	private int price; // 가격
	private boolean allInOne;
	
	// 생성자부
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	// 메소드부
	
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
		this.allInOne = allInOne; // 일치 여부
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
	
	/* public boolean getAllInOne() {
		return allInOne;
	}
	
	* boolean 타입의 필드에 대한 getter 메소드명은 관례상 isXXX()으로 짓는다
	*/
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public String information() {
		return "brand: " + brand + ", pCode: " + pCode + ", pName: " + pName
				+ ", price: " + price + ", allInOne: " + allInOne;
	}

}

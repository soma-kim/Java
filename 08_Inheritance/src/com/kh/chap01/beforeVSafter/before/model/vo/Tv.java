package com.kh.chap01.beforeVSafter.before.model.vo;

public class Tv {
	
		// 필드부
	
		private String brand; // 브랜드명
		private String pCode; // 상품코드
		private String pName; // 상품명
		private int price; // 가격
		private int inch; // 인치
		
		// 생성자부
		
		public Tv() {
			
		}
		
		public Tv(String brand, String pCode, String pName, int price, int inch) {
			this.brand = brand;
			this.pCode = pCode;
			this.pName = pName;
			this.price = price;
			this.inch = inch;
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
		
		public void setInch(int inch) {
			this.inch = inch;
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
		
		public int getInch() {
			return inch;
		}
		
		public String information() {
			return "brand: " + brand + ", pCode: " + pCode + ", pName: " + pName + ", price: " + price + ", inch: " + inch;
		}

	}

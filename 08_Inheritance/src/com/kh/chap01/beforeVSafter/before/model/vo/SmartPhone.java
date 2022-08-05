package com.kh.chap01.beforeVSafter.before.model.vo;

public class SmartPhone {
	
	// 鞘靛何
	
		private String brand;
		private String pCode;
		private String pName;
		private int price;
		private String mobileAgency;
		
		// 积己磊何
		
		public SmartPhone() {
			
		}
		
		public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
			this.brand = brand;
			this.pCode = pCode;
			this.pName = pName;
			this.price = price;
			this.mobileAgency = mobileAgency;
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
		
		public void setMobileAgency(String mobileAgency) {
			this.mobileAgency = mobileAgency;
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
		
		public String getMobileAgency() {
			return mobileAgency;
		}
		
		public String information() {
			return "brand: " + brand + ", pCode: " + pCode + ", pName: " + pName + ", price: " + price + ", mobileAgency: " + mobileAgency;
		}

}

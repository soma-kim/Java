package com.kh.chap01.beforeVSafter.after.model.vo;

public class SmartPhone extends Product {
	
		// 鞘靛何
		private String mobileAgency; 
		
		// 积己磊何
		public SmartPhone() {
			
		}
		
		public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency ) {
			
			super(brand, pCode, pName, price);
			this.mobileAgency = mobileAgency;
		}
		
		// 皋家靛何
		public String mobileAgency() {
			return mobileAgency;
		}
		
		public void setmobileAgency(String mobileAgency) {
			this.mobileAgency = mobileAgency;
		}
		
		public String information() {
			return super.information() + ", mobileAgency: " + mobileAgency;
		}


}

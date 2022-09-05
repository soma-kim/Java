package com.kh.chap01.beforeVSafter.after.model.vo;

public class SmartPhone extends Product {
	
		// �ʵ��
		private String mobileAgency; 
		
		// �����ں�
		public SmartPhone() {
			
		}
		
		public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency ) {
			
			super(brand, pCode, pName, price);
			this.mobileAgency = mobileAgency;
		}
		
		// �޼ҵ��
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

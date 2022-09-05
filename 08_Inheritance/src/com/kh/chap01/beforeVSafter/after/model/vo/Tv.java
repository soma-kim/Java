package com.kh.chap01.beforeVSafter.after.model.vo;

public class Tv extends Product {
	
		// 鞘靛何
		private int inch; 
			
		// 积己磊何
		public Tv() {
				
		}
		
		public Tv(String brand, String pCode, String pName, int price, int inch) {
			super(brand, pCode, pName, price);
			this.inch = inch;
		}
			
		// 皋家靛何
		public int inch() {
			return inch;
		}
			
		public void inch(int inch) {
			this.inch = inch;
		}
		
		public String information() {
			return super.information() + ", inch: " + inch;
		}

}

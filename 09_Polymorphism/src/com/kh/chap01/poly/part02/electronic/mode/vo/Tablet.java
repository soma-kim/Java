package com.kh.chap01.poly.part02.electronic.mode.vo;

public class Tablet extends Electronic {
	
	// 鞘靛何
	private boolean penFlag;
	
	// 积己磊何
	public Tablet() {
		
	}

	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}

	// 皋家靛何
	public boolean isPenFlag() {
		return penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}

	@Override
	public String toString() {
		return super.toString() + ", penFlag: " + penFlag;
	}



}

package com.kh.chap01.beforeVSafter.before.model.vo;

public class Desktop {
	
	// �ʵ��
	
	private String brand; // �귣���
	private String pCode; // ��ǰ �ڵ�
	private String pName; // ��ǰ��
	private int price; // ����
	private boolean allInOne;
	
	// �����ں�
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	// �޼ҵ��
	
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
		this.allInOne = allInOne; // ��ġ ����
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
	
	* boolean Ÿ���� �ʵ忡 ���� getter �޼ҵ���� ���ʻ� isXXX()���� ���´�
	*/
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public String information() {
		return "brand: " + brand + ", pCode: " + pCode + ", pName: " + pName
				+ ", price: " + price + ", allInOne: " + allInOne;
	}

}
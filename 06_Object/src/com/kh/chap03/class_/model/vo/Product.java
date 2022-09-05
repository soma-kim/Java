package com.kh.chap03.class_.model.vo;

// Ŭ�������� ��� ������ ���� ������: public, default(���� ����)
public class Product {
	
	// �ʵ��
	// 1. �ʵ�(����) �����
	
	private String pName;
	private int price;
	private String brand = "����"; // �ʵ� ����� ���ÿ� �ʱ�ȭ, ���� ������ �ʵ尪
	// public static final String BRAND = "����"; 
	// ���(���� �Ұ�����)�ʵ�� ����� ���� ���� �׻� ������ ��𼭵� �� �� �ְԲ� "public static final ~"�� ����� ��� ��
	
	// �����ں�
	
	// �޼ҵ��
	// 2. setter, getter �޼ҵ� �����
	
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
	
	// 3. information �޼ҵ� �����
	
	public String information() {
		
		return "pName: " + pName + ", price: " + price + ", brand: " + brand;
	}

}

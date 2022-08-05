package com.kh.chap02.objectArray.model.vo;

public class Phone {
	
	// �ʵ��
	// �̸�, �ø���, �귣���, ����
	private String name;
	private String series;
	private String brand;
	private int price;
	
	// �����ں�
	public Phone() {
		
	}
	
	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	
	// �޼ҵ��
	public String getName() {
		return name;
	}
	
	public String getSeries() {
		return series;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSeries(String series) {
		this.series = series;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "name: " + name + ", series: " + series + ", brand: " + brand + ", price: "+ price;
	}

}

package com.kh.chap04.assist.part02.object.model.vo;

import java.io.Serializable;

// 직렬화 선언을 하지 않으면 객체를 파일로 내보낼 때 NotSerializableException이 발생
// => 1byte짜리 좁은 통로로 큰 객체가 지나갈 수 없기 때문에 가로로 배열해 주는 과정: 직렬화
public class Phone implements Serializable { // 직렬화 선언
	
	// 필드부
	private String name;
	private int price;
	
	// 생성자부
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 메소드부
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "name: " + name + ", price: " + price;
	}

}

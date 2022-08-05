package com.kh.exam.model.vo;

public class Cat {
	
	// 필드부
	public static final String STORE = "가현가게";
	private String name;
	
	// 생성자부
	
	public Cat() {
		
	}
	
	public Cat(String name) {
		this.name = name;
	}
	
	// 메소드부
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String info() {
		return STORE + "에 살고있는 " + name + "이(가) 있습니다.";
	}

}

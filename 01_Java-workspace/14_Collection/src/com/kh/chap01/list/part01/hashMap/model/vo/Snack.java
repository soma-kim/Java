package com.kh.chap01.list.part01.hashMap.model.vo;

public class Snack {
	
	// 필드부
	private String flavor;
	private int calory;

	// 생성자부
	public Snack() {
		super();
	}
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}
	
	// 메소드부
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	
	// Set을 쓸 때가 아니라면 equals(), hashCode() 메소드를 굳이 오버라이딩 할 필요 없다!

}

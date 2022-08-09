package com.kh.chap01.poly.part01.basic.model.vo;

public class Child1 extends Parent {
	
	// 필드부
	private int z;
	
	// 생성자부
	public Child1() {
		
	}
	
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// 메소드부
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("나 첫 번째 자식이야");
	}
	
	@Override
	public void print() {
		System.out.println("나 첫 번째 자식이야");
	}

}

package com.kh.chap01.poly.part01.basic.model.vo;

public class Parent {
	
	// �ʵ��
	private int x;
	private int y;
	
	// �����ں�
	public Parent() {
		
	}
	
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// �޼ҵ��
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void printParent() {
		System.out.println("�� �θ��");
	}
	
	// instanceof �����ڸ� ����ϱ� ���� ���
	public void print() {
		System.out.println("�� �θ��");
	}

}

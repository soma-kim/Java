package com.kh.chap01.list.part01.hashMap.model.vo;

public class Snack {
	
	// �ʵ��
	private String flavor;
	private int calory;

	// �����ں�
	public Snack() {
		super();
	}
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}
	
	// �޼ҵ��
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
	
	// Set�� �� ���� �ƴ϶�� equals(), hashCode() �޼ҵ带 ���� �������̵� �� �ʿ� ����!

}

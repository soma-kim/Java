package com.kh.exam.model.vo;

public class Cat {
	
	// �ʵ��
	public static final String STORE = "��������";
	private String name;
	
	// �����ں�
	
	public Cat() {
		
	}
	
	public Cat(String name) {
		this.name = name;
	}
	
	// �޼ҵ��
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String info() {
		return STORE + "�� ����ִ� " + name + "��(��) �ֽ��ϴ�.";
	}

}

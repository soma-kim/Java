package com.kh.chap02.abstractAndInterface.part01.basic.model.vo;

public class Sports {
	
	// �ʵ��
	private int people; // �������� �����ϴ� ���� �� ��
	
	// �����ں�
	public Sports() {
		
	}
	
	public Sports(int people) {
		this.people = people;
	}
	
	// �޼ҵ��
	// getter/setter, toString() �������̵�, ��Ģ�� ����ϴ� public void rule �޼ҵ�
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public String toString() {
		return "people: " + people;
	}
	
	public void rule() {
		System.out.println("��Ģ�� �� ���Ѽ� �÷����ϼ���");
	}

}

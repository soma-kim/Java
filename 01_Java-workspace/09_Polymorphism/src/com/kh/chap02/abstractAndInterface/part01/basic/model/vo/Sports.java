package com.kh.chap02.abstractAndInterface.part01.basic.model.vo;

// public class Sports {
public abstract class Sports { // �߻� Ŭ����(abstract Ű����)
	
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
	
	@Override
	public String toString() {
		return "people: " + people;
	}
	
	// ��Ģ�� ����ϴ� public void rule() �޼ҵ�
	/*
	public void rule() {
		System.out.println("��Ģ�� �� ���Ѽ� �÷����ϼ���"); // Sports ��� ���������� ǥ������ �� ��Ȯ�� ���� ����
	}
	*/
	
	// �ƴ� ������ �ڽ� Ŭ������ �� �Ը���� �޼ҵ� �ٲ� �� ������ �θ� Ŭ���������� �׳�
	
	// public void rule(); // �̷��� ���� �� �ǳ�?
	// This method requires a body instead of a semicolon ���� ��
	
	public abstract void rule();
	// The abstract method rule in type Sports can only be defined by an abstract class: abstract Ŭ���� �������� ���ǵ� �� �ִٴ� �������� ���� �޽��� �ٲ�
	
	/*
	 * ����ΰ� �������� �ʴ� �̿ϼ��� �޼ҵ� == �߻� �޼ҵ�
	 * ��, �߻� �޼ҵ带 �����ϰ��� �ϴٸ� ǥ���� abstract ��� ���� �߰��� ��� ��
	 * 
	 * �̿ϼ��� �߻� �޼ҵ尡 �ϳ��� ���ԵǴ� ���� �ش� Ŭ���� ���� �̿ϼ��� Ŭ���� (�߻� Ŭ����)�� �Ǿ� ����
	 * 
	 * �߻� Ŭ���� ���� ������ abstract�� ���̸� ��!
	 * public class Sports { => public abstract class Sports { ������ �ָ� ���� ������!
	 */
	


}

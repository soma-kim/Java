package com.kh.chap02.abstractAndInterface.part02.family.model.vo;

public class Mother extends Person implements Basic {
	
	// �ʵ��
	private String babyBirth; // �Ʊ��� ź�� ����
	
	// �����ں�
	public Mother() {
		super();
	}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health); // �θ� Ŭ������ �佺
		this.babyBirth = babyBirth;
	}
	
	// �޼ҵ��

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", babyBirth: " + babyBirth;
	}
	
	// ���� �ڴ� ����, ���� �Դ� ����
	@Override
	public void eat() { // ������ ���� ������?
		
		// �����԰� ������ �����Կ� 10kg ���� ����
		// super.weight = super.getWeight() + 10;
		// ���� ���� �� �Ǵϱ� getter �޼ҵ带 �̿��� ����
		super.setWeight(super.getWeight() + 10);
		// ���� ���� �� �Ǵϱ� setter �޼ҵ带 �̿��� �� �Է�
		// ������ ������ == ���� ������ + 10
		
		// �ǰ����� ������ �ǰ����� 10 ����
		super.setHealth(super.getHealth() - 10);
		// ������ �ǰ��� == ���� �ǰ��� - 10
	}
	
	@Override
	public void sleep() { // ������ ���� �ܴٸ�?
		
		// �ǰ����� 10 ����
		super.setHealth(super.getHealth() + 10);
		
	}

}

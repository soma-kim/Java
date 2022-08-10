package com.kh.chap02.abstractAndInterface.part02.family.model.vo;

public abstract class Person {
	
	// �ʵ��
	private String name; // �̸�
	private double weight; // ������
	private int health; // �ǰ���
	
	// �����ں�
	public Person() {
		super();
	}

	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	// �޼ҵ��

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", weight: " + weight + ", health: " + health;
	}
	
	// ����� ������ �޼ҵ�� ǥ��
		// �Ϲ� �޼ҵ� ����
		/*
		public void eat() {
			System.out.println("���� �Դ´�.");
	
		}
		
		public void sleep() {
			System.out.println("���� �ܴ�.");
		}
		*/
	
	/*
	// �߻� �޼ҵ� ���� (abstract, ����� x) => �̿ϼ��� ���� = > ��ӹ޴� ������ �ϼ����� ��� ��(�������̵� Ȱ��)
	public abstract void eat();
	public abstract void sleep();
	*/

}

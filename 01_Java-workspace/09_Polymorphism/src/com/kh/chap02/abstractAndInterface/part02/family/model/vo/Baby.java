package com.kh.chap02.abstractAndInterface.part02.family.model.vo;
				// Ȯ���Ѵ� 		// �����Ѵ�. ��� �� 
public class Baby extends Person implements Basic {
	
	// �ʵ��
	// �߰� �ʵ� ����
	
	// �����ں�
	public Baby() {
		
	}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// �޼ҵ��
	// �߰� �ʵ� �����Ƿ� getter, setter �ʿ����� ����
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void eat() { // �ƱⰡ ���� ������?
		
		// ������ 3 ����
		super.setWeight(super.getWeight() + 3);
		
		// �ǰ��� 1 ����
		super.setHealth(super.getHealth() + 1);
	}
	
	@Override
	public void sleep() { // �ƱⰡ ���� �ڸ�?
		
		// �ǰ��� 3 ����
		super.setHealth(super.getHealth() + 3);
		
	}
	
	

}

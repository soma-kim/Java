package com.kh.chap02.abstractAndInterface.part01.basic.model.vo;

// Sports ��ӹޱ�
public class Football extends Sports {
	
	// �ʵ��
	// ���� ���� �ʵ� �����ϴ�~
	
	// �����ں�
	public Football () {
		
	}
	
	public Football(int people) {
		super(people);
	}
	
	// �޼ҵ��
	// rule �޼ҵ� �������̵�
	
	public void rule() {
		System.out.println("�ڵ鸵 ���� ������");
	}

}

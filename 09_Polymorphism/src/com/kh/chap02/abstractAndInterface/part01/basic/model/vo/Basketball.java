package com.kh.chap02.abstractAndInterface.part01.basic.model.vo;

//Sports ��ӹޱ�
public class Basketball extends Sports{
	
	// �ʵ��
	// ���� ���� �ʵ� �����ϴ�~
	
	// �����ں�
	public Basketball() {
		
	}
	
	public Basketball(int people) {
		super(people);
	}
	
	// �޼ҵ��
	// rule �޼ҵ� �������̵�
	
	public void rule() {
		System.out.println("�帮�� ���� 3 ���ڱ� �̻� �����̸� �� �ǳ�...��?");
	}

}

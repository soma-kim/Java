package com.kh.chap01.beforeVSafter.after.model.vo;

// �ڽ� Ŭ����: �θ� Ŭ�����κ��� �ߺ��� ��(�ʵ�, �޼ҵ�)�� �����޾� ����ϴ� Ŭ���� - �����ڴ� �������� ����
// => �ڽ� Ŭ�������� �켱������ �ؾ� �� ��: �����κ��� �ڵ带 �������� ������ ����ϱ�!!

			// �ڽ�     ------->  �θ�
			// �ļ�                         ����
			// ����                         ����
			// ����                         ����
public class Desktop extends Product {
	
	// �ʵ��
	private boolean allInOne; // Product���� 4���� �ʵ带 ��ӹ޾����Ƿ� Desktop�� �ʵ�� 5���� ��
	
	// �����ں�
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// ��ü ������ ���ÿ� ���� ���ϴ� ������ �ʱ�ȭ�ϴ� �뵵�� ��
		
		// ��� ���迡�� �� �θ� Ŭ������ �ʵ尪�� �����ϰ��� �� ��� super.�θ��ʵ��
		// => super. �� �ش� �θ��� �ּҰ��� ��� ����(��, super. ���� �θ� ���� ����) - this. �� ���� �ּҰ��� ��� ����
		// 	    ��, �����ϰ��� �ϴ� �� private�� ��쿡�� ���� �Ƶ� �ܺο��� ���� ������ �Ұ�����
		
		// �ذ� ��� 1: �θ� Ŭ������ �ʵ带 �ڽı����� ���� �����ϵ���
		//			 private -> protected�� ���� �����ڸ� �����ϴ� ���
		//		  	 "��������"�� �� �� ����
		
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		this.allInOne = allInOne;
		*/
		
		// �ذ� ���2: �θ� Ŭ������ �ִ� public ���� �������� setter �޼ҵ带 ȣ���ؼ� �ʵ尪�� ä�� �ִ� ���
		// ��� ���迡�� �θ� Ŭ������ �ִ� �޼ҵ忡 ���� ���� �ϰ��� �� ��� super.�޼ҵ��()���� ȣ��
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// �ذ� ���3: �θ� Ŭ������ �ִ� �Ű����� �����ڸ� ȣ���ϱ�
		// ��Ӱ��迡�� �θ� Ŭ������ �ִ� �����ڸ� ȣ���ϰ��� �� ��� super �����ڸ� ȣ��
		// => �� �ȿ� �ִ� �����ڸ� ȣ���� ��� this �����ڸ� ȣ���߾���! (�ݵ�� �������� ���� ���ٿ� ȣ�� ���� �ۼ�)
		
		// super(); // �θ��� �⺻ �����ڰ� ȣ���� ��
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
		
	}
	
	// �޼ҵ��
	public boolean isallInOne() {
		return allInOne;
	}
	
	public void setallInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

}

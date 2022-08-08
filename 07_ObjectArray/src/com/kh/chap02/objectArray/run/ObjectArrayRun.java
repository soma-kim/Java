package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ObjectArrayRun {
	
	public static void main(String[] args) {
		
		// "Phone Ÿ���� �ּҰ���" ���� �� �ִ� �迭 ����
		Phone[] arr = new Phone[3]; // JVM�� ���� ��� ���� null ������ �ʱ�ȭ�� ����
		
		System.out.println(arr); // �ּҰ�
		System.out.println(arr.length); // �迭�� ������: 3
		System.out.println(arr[0]); // null
		
		arr[0] = new Phone();
		arr[0].setName("������");
		System.out.println(arr[0].getName());
		
		arr[0] = new Phone();
		arr[1] = new Phone("������", "10", "�Ｚ", 1000000);
		arr[2] = new Phone("������", "11pro", "����", 800000);
				
		arr[0].setName("������");
		arr[0].setSeries("8");
		arr[0].setBrand("����");
		arr[0].setPrice(500000); // ���� ���� �Ͽ� ���� �ִ� ����
		
		System.out.println("---------------------------");
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i].information());
			sum += arr[i].getPrice();
			
		}
		System.out.println("�� ����: " + sum + "��");
		System.out.println("��հ�: " + sum / arr.length + "��");
	}

}
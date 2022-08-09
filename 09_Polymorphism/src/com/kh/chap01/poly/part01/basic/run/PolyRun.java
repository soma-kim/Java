package com.kh.chap01.poly.part01.basic.run;

import com.kh.chap01.poly.part01.basic.model.vo.Child1;
import com.kh.chap01.poly.part01.basic.model.vo.Child2;
import com.kh.chap01.poly.part01.basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		/*
		 * ��ü�������α׷���(Object Oriented Programming, OOP) 3�� ���
		 * => ĸ��ȭ, ���, ������
		 * 
		 * *������
		 * ���� �ڷ����� ���� ���� ��ü�� �����Ͽ� �پ��� ����� ���� ����
		 * => "���" ���迡���� �̷���� �� �ִ� "�� ��ȯ"�� ����!
		 */
		
		// ����� ����: ���Կ����� (=) �������� ���ʰ� �������� �ڷ����� ���ƾ� ��
		
		// 1. �θ� Ÿ���� ��������(�ּҰ��� ���� stack������ ����)�� �θ� ��ü(heap ������ �˸���)�� �ٷ�� ���
		System.out.println("1. �θ� Ÿ���� ���������� �θ� ��ü�� �ٷ�� ���");
		Parent p1 = new Parent();
		//  Parent �ּҰ� Ÿ�� = heap ���� �ǹ� Ÿ��
		p1.printParent();
		// p1.printChild1();
		// => p1 ���� ������ Parent ��ü���� ���� ����
		
		// 2. �ڽ� Ÿ���� ���������� �ڽ� ��ü�� �ٷ�� ���
		System.out.println("2. �ڽ� Ÿ���� ���������� �ڽ� ��ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
		// Child1 �ּҰ� Ÿ�� = heap ���� �ǹ� Ÿ��
		c1.printChild1();
		c1.printParent();
		// => c1 ���������� Child1, Parent �� �� ���� ����
		
		// 3. �θ� Ÿ�� ���������� �ڽ� ��ü�� �ٷ�� ���(�������� ����� ����)
		System.out.println("3. �θ� Ÿ�� ���������� �ڽ� ��ü�� �ٷ�� ���(�������� ����� ����)");
		Parent p2 = /* (Parent) */ new Child1(); // �ڵ� ����ȯ���� �ڽ� ��ü�� �θ� Ÿ�� ���������� ���
		// ���� ������ �������� ������ �ڷ����� �ٸ����� �ұ��ϰ� ���� �߻����� ����
		// Child1 Ÿ���� ��ü�� Parent������ "�ڵ� ����ȯ"�� �ǰ� ����
		// => "���" ���������� Ŭ�������� �� ��ȯ�� ������
		
		p2.printParent(); // p2 ���������� Parent���� ���� ����
		// (Child1)p2.printChild1(); �� ������ ��� �켱 ���� ������ ������ ������ ��!
		((Child1)p2).printChild1(); // ��, Child1������ ���� ����ȯ �� �� Child1�� ���� ����
		
		// �ڽ��� �θ� �Ǵ� �� �ڵ� ����ȯ, �θ� �ڽ� �Ƿ��� ���� ����ȯ
		
		/*
		 * "���" �������� Ŭ���� ���� "�� ��ȯ"�� ������
		 * 1. UpCasting: �ڽ�Ÿ�� => �θ�Ÿ��(�ڵ� ����ȯ, ����ȯ������ ���� ����)
		 * 2. DownCasting: �θ�Ÿ�� => �ڽ�Ÿ��(���� ����ȯ, ����ȯ������ ��������� �ۼ��ؾ� ��)
		 */
		
		// �������� ����� �ϴ� ������ ���� ����
		
		// Child1 ��ü 2��, Child2 ��ü 2���� �ʿ��� ��Ȳ�̶�� ����
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(2, 3, 5);
		
		// ��, �������� ����Ǹ� �θ� Ÿ���� ����������
		// �پ��� �ڽİ�ü�� �޾��� �� ����
		
		System.out.println("===== �������� ������ ��ü �迭 =====");
		Parent[] arr = new Parent[4]; // �ڽ� ��ü�� ���� �迭 ���� ���� ��������!
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(5, 7, 2);
		arr[2] = new Child1(2, 1, 5);
		arr[3] = new Child2(2, 3, 5);
		// �θ� Ÿ�Կ� ��� ���� �ڽ� Ÿ���� �ڵ� ����ȯ �� �� => UpCasting
		
		// arr[0].printParent();
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child1)arr[2]).printChild1();
		((Child2)arr[3]).printChild2();
		// �ڽ�Ÿ�԰�ü�ν� ����ϰ��� �� ��쿡�� ��������ȯ���� ���� ���� �Ŀ� ��� ���� => DownCasting
		
		// ((Child1)arr[3]).printChild1();
		// => Child2 Ÿ���� arr[3]�� Child1���� �� ��ȯ �Ϸ��� �ؼ� ������ �߻���! 
		// ClassCastException: Ŭ������ �� ��ȯ�� �߸��Ǿ��� ��� �߻��ϴ� ����
		
		System.out.println("===== �ݺ��� �̿��ؼ� �� ���� =====");
		
		for(int i = 0; i < arr.length; i++) {
			
			// �� �ε������� ������ �����ϰ� �ִ� �ڽ� Ŭ������ �� ��ȯ �Ŀ� �޼ҵ� ȣ��
			// (��������ȯ)arr[i].�ʿ��Ѹ޼ҵ�();
			
			// instanceof ������
			// ���� ���������� ������ � �ڽ� Ŭ������ �����ϰ� �ִ��� Ȯ���� �� ���
			// [ ǥ���� ]
			// ���������� instanceof �˻���Ŭ������
			
			// �θ�ü�� instanceof �θ�Ŭ������ == true
			// �ڽİ�ü�� instanceof �θ�Ŭ������ == true (����� �޾����� �θ�� �ŵ� �� ��)
			// �θ�ü�� instanceof �ڽ�Ŭ������ == false (�θ�ü�� �ڽİ�ü�� ���빰�� ���� �Ұ�)
			// �ڽİ�ü�� instanceof �ڽ�Ŭ������ == true
			
			/*
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}
			else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print();
			// print �޼ҵ�� "�������̵�" �� ����
			// => �������̵� �� "�ڽ� �޼ҵ�"�� �켱���� ���� ȣ���
			
			// ��, �������̵��� �̿��ϸ� ���� ����ȯ�� �� �ص� ��
			// (�˾Ƽ� �ڽİ�ü�� �޼ҵ�� ã�ư��� ȣ��Ǵ� ���̱� ������)
			
			
		}
		
		
	
		
	}

}

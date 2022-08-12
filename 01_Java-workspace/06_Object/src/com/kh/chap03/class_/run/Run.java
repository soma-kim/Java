package com.kh.chap03.class_.run;

import com.kh.chap03.class_.model.vo.Person;
import com.kh.chap03.class_.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// Person�̶�� Ŭ����
		// == ����� ������ ����� ���� ���� ���� �ڷ���
		// 	  (���� ���� �ڷ���, ���� ���� ������ ���� ����)
		// == ����� ���� �ڷ��� (Ŀ���͸���¡)
		
		Person p = new Person(); // ��ü ���� == �ν��Ͻ�ȭ
		
		System.out.println(p); // �ּҰ�
		System.out.println(p.information()); // �ʱⰪ, JVM�� ���� ä���� �⺻������ ���

		// => �� ������ �� �ؼ� �⺻���� ��µ� ���̹Ƿ� �޼ҵ尡 �� ������� ������ �� �� ����!
		
		// �� �ֱ� => setter �޼ҵ�
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("ȫ�浿");
		
		System.out.println(p.information()); // id, pwd, name�� �Էµǰ� �������� �⺻�� ��µ�
		
		p.setAge(25);
		p.setGender('��');
		p.setPhone("010-1111-2222");
		p.setEmail("hong@naver.com");
		
		System.out.println(p.information());
		
		// --------------------------------------------
		
		// ��ǰ ��ü ����
		Product p1 = new Product();
		
		p1.setpName("������11pro");
		p1.setPrice(1000000);
		// p1.setBrand("����");
		// brand�� ��ġ�ϹǷ� Product Ŭ�������� �ʵ� ����� ���ÿ� �ʱ�ȭ! ��, �ش� ���� ��� ��µ�!
		p1.setBrand("apple"); // �����̹Ƿ� ���� �ٲ� �� ����! apple ���
		// => brand �ʵ忡 "����"�� �ʱ�ȭ�� �ξ��� ���
		// setter �޼ҵ�� ���� brand���� ���� ���� �ʾƵ� ��
		// ��, �ش� �ʵ带 ����� �������� �ʾұ� ������
		// �����ϰ��� �� ���� �������� setter �޼ҵ带 ȣ���ؼ� ���� ���� ������
		
		System.out.println(p1.information());
		
		// default ������������ Ŭ������
		// �ٸ� ��Ű���� ���� ��� ���� �� �� ���� ���ѵ�
		// ��, ���� ��Ű���� ���� ��쿡�� ��� ����
		
		Product p2 = new Product();
		
		p2.setpName("���ÿ�ġ7");
		p2.setPrice(500000);
		// p2.setBrand("����");
		
		System.out.println(p2.information());
		


	}

}

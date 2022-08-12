package com.kh.chap01.beforeVSafter.before.run;

import com.kh.chap01.beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01.beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01.beforeVSafter.before.model.vo.Tv;

public class BeforRun {

	public static void main(String[] args) {
		
		// Desktop ��ü
		// �⺻ �����ڷ� ��ü ����
		
		Desktop d = new Desktop();
		
		d.setBrand("�Ｚ");
		d.setpCode("d-01");
		d.setpName("¯¯����ũž");
		d.setPrice(2000000);
		d.setAllInOne(true);
		
		
		// SmartPhone ��ü
		// �Ű����� �����ڷ� �� ���� ��ü ������ ���ÿ� �ʱ�ȭ
		// brand, pCode, pName, price, mobileAgency
		
		SmartPhone s = new SmartPhone("����", "s-01", "������", 1300000, "SKT");
		
		// Tv ��ü
		// �Ű����� �����ڷ� �� ���� ��ü ������ ���ÿ� �ʱ�ȭ
		// brand, pCode, pName, price, inch
		
		Tv t = new Tv("����", "t-01", "����޺�����Ƽ��", 4000000, 100);
		
		// ���
		System.out.println(d);
		System.out.println(s);
		System.out.println(t);
		// => ������ �ּҰ��� ��µ�(��ü�� ���� �ڷ��� �����̱� ������)
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		// => information �̶�� �޼ҵ带 ȣ���ؼ� �� �ʵ忡 ��� ������ ���ڷ� ���̾ ���
		
		/*
		 * �� Ŭ�������� �ߺ��� �ڵ���� ������ ����ϸ�
		 * ������ ���� �������� �� �Ź� ������ ã�Ƽ� �����ؾ� �Ѵٴ� ���ŷο��� ����
		 * 
		 * => "���"�̶�� ������ ������Ѽ� �� Ŭ�������� �ߺ��� �ʵ�, �ߺ��� �޼ҵ���� �� �� �� �� �ϳ��� Ŭ������ ������ �� ��
		 * 	    �ش� Ŭ������ ������ ���� ������� ���� 
		 * 
		 * *���
		 * �ٸ� Ŭ������ ������ �ִ� �ʵ�, �޼ҵ���� ���� �ۼ��� Ŭ�������� ���� ������ �ʰ�
		 * �̹� ������� Ŭ�������� "���" �������μ� �ڽ��� �ʵ�, �ڽ��� �޼ҵ�ó�� ��� ������ ����
		 * => ��, �ڵ带 �����ްڴ�
		 * 
		 * �ڵ带 �����޴� �� -------> �ڵ带 �����ִ� ��
		 *     �ڽ�                                        �θ�
		 *     �ļ�                                        ����
		 *     ����                                        ����
		 */

	}

}

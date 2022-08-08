package com.kh.chap01.beforeVSafter.after.run;

import com.kh.chap01.beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01.beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01.beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		// �⺻ �����ڸ� ���� ��ü ���� �� setter �޼ҵ�� �ʵ尪 ����
		
		/*
		Desktop d = new Desktop();
		d.setBrand("�Ｚ");
		d.setpCode("d-01");
		d.setpName("¯¯����ũž");
		d.setPrice(2000000);
		d.setallInOne(true);
		*/
		
		// �Ű����� ������ �̿�
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 2000000, true);
		
		// brand, pCode, pName, price, mobileAgency
		
		SmartPhone s = new SmartPhone("����", "s-01", "������", 1300000, "SKT");
		
		// brand, pCode, pName, price, inch
		
		Tv t = new Tv("����", "t-01", "����޺�����Ƽ��", 4000000, 100);
		
		// ���
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		// �����ϰ��� �ϴ� �޼ҵ尡 �θ� Ŭ�������� �ְ� �ڽ� Ŭ�������� ����
		// �ڽ� Ŭ���������� �θ� Ŭ������ ������ ������ �� �� ������
		// �θ� Ŭ���������� �ڽ� Ŭ������ ������ ������ �� ���� ����!! => ��� ������ ���� �ٽ����� Ư¡
		// �ڽ� Ŭ���� ���忡�� �������� �θ� Ŭ������ �޼ҵ带 �� �Ը���� �������ؼ� �� �� ���� (�������̵�)

	}

}

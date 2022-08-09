package com.kh.chap01.poly.part02.electronic.run;

import com.kh.chap01.poly.part02.electronic.controller.ElectronicController2;
import com.kh.chap01.poly.part02.electronic.mode.vo.Desktop;
import com.kh.chap01.poly.part02.electronic.mode.vo.Electronic;
import com.kh.chap01.poly.part02.electronic.mode.vo.NoteBook;
import com.kh.chap01.poly.part02.electronic.mode.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		
		/*
		// 1. �������� �����ϱ� ��(ElectronicController1)
		ElectronicController1 ec = new ElectronicController1();
		
		// �� ���� ���ؿ��� ec.desk == null, ec.note == null, ec.tab == null
		// => �츮 ���Կ� �� ���ڰ� �� �� ���� ��
		
		// ec.desk = new Desktop("�Ｚ", "��ž", 1200000, "Geforce 1070");
		// => is not visible: private ���� �������̹Ƿ� ���� ���� �Ұ���
		// => desk��� ���ڴ� private�̶� ���� ���� �Ұ��ϹǷ� ��ȸ�ؼ� ���� ���� �ؾ� �� 
		
		// �̷��� ��Ƶ� �ǰ�
		// Desktop d = new Desktop("�Ｚ", "��ž", 1200000, "Geforce 1070");
		// ec.insert(d);
		//
		
		// �̷��� ��Ƶ� ��!
		ec.insert(new Desktop("�Ｚ", "��ž", 1200000, "Geforce 1070"));
		
		ec.insert(new NoteBook("����", "�׷�", 2000000, 4));
		
		ec.insert(new Tablet("����", "�����е�", 500000, false));
		
		// => ������� ������ ���� ��ǰ�޾Ƽ� ���ڿ� ��� �� ��
		
		// �մԿ��� ��ǰ���� ���ڷκ��� ������ ���� �ֱ�
		Desktop d = ec.selectDesktop(); // �ȿ��� �ٱ����� ����
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		System.out.println(d); // ���� �� ���� ���� �ֱ�
		System.out.println(n); // ������ toString�� �ּҰ��� ȣ���ϴ� �޼ҵ������� 
		System.out.println(t); // �츮�� �������̵��� ���� toString�� ���� ǥ��� �ٲ����Ƿ� �׷��� ����
		
	
		// ���� ���ڰ� ���� ���ƿ�...
	 
		 */
		
		// 2.�������� �������� ��� (ElectonicController2)
		ElectronicController2 ec2 = new ElectronicController2();
		
		ec2.insert(new Desktop("�Ｚ", "��ž", 1200000, "Geforce 1070"), 0);
		ec2.insert(new NoteBook("����", "�׷�", 2000000, 4), 1);
		ec2.insert(new Tablet("����", "�����е�", 500000, false), 2);
		
		/*
		// â�� ��� ���ǵ��� �ϳ��� �̾� ����
		Desktop d = (Desktop)(ec2.select(0)); // �θ� Ŭ������ �ڽ� Ŭ������ �Ǳ� ���ؼ��� ���� ����ȯ �ؾ� ��
		NoteBook n = (NoteBook)(ec2.select(1));
		Tablet t = (Tablet)(ec2.select(2));
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// �ݺ��� Ȱ���ؼ� ���� ��������
		Electronic[] elec = ec2.select(); // â�� ��ü�� ���� ��
		
		for(int i = 0; i < elec.length; i++) {
			System.out.println(elec[i] /* .toString() */);
			// �������̵� �߱� ������ ���� �� ��ȯ �� �ʿ� ����! �������̵� �� �ڽ� Ŭ������ �켱�� �����ϱ�
		}
		
		/*
		 * *�������� ����ϴ� ����
		 * 1. �θ� Ÿ���� ��ü �迭�� �پ��� �ڽ� ��ü���� ��Ƽ� ��Ƶ� �� ����
		 * 2. �޼ҵ忡 �Ű� ������ ��ȯ���� �������� �����ϰ� �Ǹ�
		 * 	    �޼ҵ� ������ �پ��
		 */
		
		
		
	}
}

package com.kh.chap04.date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

// ��¥ ���� Ŭ������
public class DateRun {

	public static void main(String[] args) {
		
		// java.util.Date Ŭ����
		// : ��¥�� �ð��� ���� ������ ���� �� �ִ� Ŭ����
		// �ڹ� ���� ��â�⿡ ������� Ŭ����
		
		// �⺻ �����ڸ� ���� Date ��ü ����
		Date today = new Date(); // ���� ��¥ �� �ð��� ������ ��
		System.out.println("�⺻ ������: " + today);
		
		// ���� ���ϴ� ��¥(2020�� 6�� 19��)
		// 1. �Ű����� �����ڸ� �̿��ϴ� ���
		// Date date2 = new Date(2020, 6, 19); // deprecated: ���������� ����
		
		// ctrl Date Ȯ�� ���: �⵵ + 1900, �� + 1
		Date date2 = new Date(2020 -1900, 6 -1, 19);
		System.out.println("�Ű����� ������: " + date2); // �Ű����� ������: Fri Jun 19 00:00:00 KST 2020
		
		// 2. �⺻ �����ڷ� ���� �� setter �޼ҵ带 �̿��ϴ� ���
		Date date3 = new Date(); // ���� �ð� �� ��¥
		date3.setYear(2021 -1900);
		date3.setMonth(7 - 1);
		date3.setDate(30);
		// �⵵ + 1900, �� +1
		System.out.println("setter�޼ҵ�: " + date3); // setter�޼ҵ�: Fri Jul 30 15:44:17 KST 2021
		
		// java.text.SimpleDateFormat Ŭ����
		// : �� �Ը���� ��¥ ������ ������ ���ڿ��� ����
		
		// ��� ���
		// 1. ������ �����ϸ鼭 SimpleDateFormat ��ü ���� => �Ű�����������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
		
		/*
		 * *SimpleDateFormat ����
		 * �⵵: yyyy
		 * ��: MM
		 * ��: dd
		 * ��: hh
		 * ��: mm
		 * ��: ss
		 */
		
		// 2. sdf ��ü���� �����ϴ� format() �޼ҵ� ȣ�� �� Date ��ü ����
		// => ������ ������ ��¥�� String������ ��ȯ
		// sdf.format(Date��ü): ��ȯ�� String��
		String formatDate = sdf.format(today);
		
		System.out.println(formatDate); // 2022-08-11-03:54:45

	}
	
	

}

package com.kh.chap03.wrapper.run;

public class WrapperRun {

	// ���� Ŭ����
	public static void main(String[] args) {
		
		/*
		 * Wrapper Ŭ����
		 * => �⺻ �ڷ����� ��ü Ÿ������ ������ �ִ� Ŭ�������� ���� Ŭ������� ��
		 * 
		 * 		�⺻ �ڷ���		<--->		Wrapper Ŭ����
		 * 		boolean						Boolean
		 * 		char						Character
		 * 		byte						Byte
		 * 		short						Short
		 * 		int							Integer
		 * 		long						Long
		 * 		float						Float
		 * 		double						Double
		 * 
		 * => �⺻ �ڷ����� ��ü�� ����ؾ� �ϴ� ���
		 * - �޼ҵ� ȣ���ؾ� �� ��
		 * - �޼ҵ��� �Ű������� �⺻ �ڷ��� ���� �ƴ� ��ü Ÿ�Ը� �䱸�� ��
		 * - �������� �����ϰ��� �� ��
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		// ����񱳸� �ϰ��� �� ��
		// System.out.println(num1 == num2);
		// System.out.println(num1.equals(num2)); // int�� �����̱� ������ ����� ���� �����
		
		// �Ϲ� �⺻ �ڷ������� ��ü �ڷ����� �޼ҵ带 ȣ���ϰ��� �� �� Wrapper Ŭ������ ��ȯ�ؼ� �ַ� ���
		
		// �⺻ �ڷ��� => Wrapper�ڷ���(Boxing)
		
		// 1. ��ü ���� ������ �̿��� ���(������ ȣ��)
		Integer i1 = new Integer(num1); // num1 => i1
		Integer i2 = new Integer(num2); // num2 => i2
		
		System.out.println(i1 /* .toString() */); // 10
		System.out.println(i2); // 15
		
		System.out.println(i1 == i2); // �ּҰ� �� false
		System.out.println(i1.equals(i2)); // (���ڷν���) ���� �� false
		System.out.println(i1.hashCode()); // 10
		System.out.println(i1.compareTo(i2)); // -1
		// a.compareTo(b): a�� b���� ũ�� 1, b�� �� ũ�� -1, �����ϸ� 0 ����
		// => ��ü�� �ٲٰ� �Ǹ� �޼ҵ带 �����Ӱ� �̿� ������
		
		
		// 2. ��ü�� �������� �ʰ� ��ٷ� �����ϴ� ���(AutoBoxing)
		Integer i3 = 10;
		System.out.println(i3); // 10
		
		// Ư�����̽�. ��ü ���������� ���ؼ� �ݵ�� ��ȯ�ؾ� �ϴ� ��� => ���ڿ��� Integer�� �ٲٴ� ���
		// Integer i4 = "123";
		Integer i4 = new Integer("123"); // "123" => 123
		System.out.println(i4);
		
		// Wrapper �ڷ��� => �⺻ �ڷ���(UnBoxing)
		
		// 1. �ش� �� Wrapper Ŭ�������� �����ϴ� xxxValue() �޼ҵ带 Ȱ���ϴ� ��
		int num3 = i3.intValue(); // i3 => num3 10
		int num4 = i4.intValue(); // i4 => num4 123
		
		System.out.println(num3 > num4); // false
		
		// 2. �޼ҵ� ������ ������� �ʰ� �ٷ� �����ϴ� ��� (Auto UnBoxing)
		int num5 = i1; // 10
		int num6 = i2; // 15
		
		System.out.println(i1 == i2); // false
		
		System.out.println("=====================");
		
		// �⺻�ڷ����� <---> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // "1015.3" => ���ڰ� �ƴ� ���ڿ��� ��µ�
		
		// 1. String(== ���ڿ�) --> �⺻�ڷ���: �Ľ��Ѵ�
		// 						    	        �ش�WrapperŬ������.parseXXX(��ȯ�ҹ�����);
		int i = Integer.parseInt(str1); // "10" => 10
		double d = Double.parseDouble(str2); // "15.3" => 15.3
		
		System.out.println(i + d); // 25.3
		
		// 2. �⺻�ڷ��� --> String(== ���ڿ�)
		// String.valueOf(��ȯ�ұ⺻�ڷ�����): String��
		String strI = String.valueOf(i); // 10 => "10"
		String strD = String.valueOf(d); // 15.3 => "15.3"
		
		System.out.println(strI + strD); // 1015.3
		
	}

}

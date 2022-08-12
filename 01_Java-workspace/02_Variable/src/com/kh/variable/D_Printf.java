package com.kh.variable;

// printf ������ ���ؼ� ����
public class D_Printf {
	
	public void printTest() {
		
		/*
		 * *��¹��� ����
		 * System.out.println(����ϰ����ϴ°�); => �� ��� �Ŀ� �ٹٲ�(����) �־� ��
		 * System.out.print(����ϰ����ϴ°�); => �� ��¸� �� ��
		 * => ���ڿ��� �ƴϴ��� ��� ������
		 * 
		 * System.out.printf("����ϰ����ϴ�����(����/�Ǽ�/����/���ڿ�)", ����ϰ����ϴ°�);
		 * => f�� format (����)�� �ǹ�
		 * => ���Ŀ� ���缭 ������ ���� ��µǴ� ����, �ٹٲ��� �Ͼ�� ����
		 * => ��, ���ڿ� �ȿ� �� ���� �� �ڸ��� ������ ���� �������� ��� ��� ��
		 * 
		 * ����
		 * %d: ������ �� �� �ִ� ���� // d�� 10����(decimal)
		 * %f: �Ǽ��� �� �� �ִ� ����
		 * %c: ���ڰ� �� �� �ִ� ����
		 * %s: ���ڿ��� �� �� �ִ� ����
		 * 
		 */
		
		// ���� �׽�Ʈ
		int iNum1 = 10;
		int iNum2 = 20;
		
		// iNum1: xx, iNum2: xx �������� ����� ����
		
		// 1. println ���
		System.out.println("iNum1: " + iNum1 + ", iNum2: " + iNum2);
		
		// 2. printf ��� => �������̹Ƿ� %d �������� �ڸ��� ��� ��
		//					�ٹٲ� ����� �����Ƿ� �ٹٲ��� �Ͼ �� �ֵ��� ����
		
		System.out.printf("iNum1: %d, iNum2: %d \n", iNum1, iNum2);
		
		// ������ ��: ������ ������ ������ ���缭 ������ ��� ��!
		
		// 10 + 20 = 30�� ����� ����
		// 1. println ���
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		// 2. printf ���
		System.out.printf("%d + %d = %d \n", iNum1, iNum2, iNum1 + iNum2);
		
		// ���� ���İ� ���� �� �� �ִ� �ɼ�
		System.out.printf("%5d \n", iNum1); // %5d: 5ĭ�� ���� �� ������ ����
		System.out.printf("%-5d \n", iNum1); // %-5d: 5ĭ�� ���� �� ���� ����
		
		// �Ǽ� �׽�Ʈ
		double dNum = 4.27546789;
		
		// dNum: xx.xxx �������� ���
		System.out.println("dNum: " + dNum); // 4.27546789
		System.out.printf("dNum: %f \n", dNum); // 4.275468 �Ҽ��� 7��° �ڸ����� �ݿø�
		// %f: �Ҽ��� �Ʒ� 7��° �ڸ����� �ݿø��Ǿ� �Ҽ��� �Ʒ� 6��° �ڸ������� ��µ�
		
		// �Ǽ� ���İ� ���� �� �� �ִ� �ɼ�
		System.out.printf("dNum: %.1f \n", dNum); // 4.3
		// %.1f: �Ҽ��� �Ʒ� 2��° �ڸ����� �ݿø��Ǿ� �Ҽ��� �Ʒ� 1��° �ڸ������� ��µ�
		
		// ���ڿ� ���ڿ� �׽�Ʈ
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s \n", ch, str); // a Hello
		
		// ���� �Ǵ� ���ڿ��� ���� �� �� �ִ� �ɼ�
		System.out.printf("%C %S \n", ch, str); // A HELLO, ��� �빮�ڷ� ���
		// %C, %S: ���� ���ĺ��� ��� �빮�ڷ� �����ؼ� ���
		
		
	}

}

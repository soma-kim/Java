package com.kh.operator;

// �� ���� ������
public class D_LogicalNegation {
	
	/*
	 * �� ���� ������: ���� �����ڷν� ����(true / false) �� �ݴ�� �ٲ� �ִ� ������
	 * 
	 * [ ǥ���� ]
	 * !����
	 */
	
	public void method() {
		
		System.out.println("true�� ����: " + !true);
		System.out.println("false�� ����: " + !false);
		
		boolean b = true;
		boolean b2 = !b;
		
		// b2���� false�� ��� ���� ����
		// b���� ���� true�� ������, false�� �ٲ�� ���ԵǾ� ������ �ñ���
		
		System.out.println("b: " + b);
		System.out.println("b2 = " + b2);
		
		// �� ���� �����ڴ� ���� ����� �ٽ� �ڱ��ڽſ��� �������� ����
		
		System.out.println(!(3 + 5 < 1));
	}

}

package com.kh.array;

public class B_ArrayCopy {

	/*
	 * �迭 ����
	 * - ���� ����: �����ϴ� �ô��� ���� �� -> �ּҰ��� �����
	 * - ���� ����: ������ ���ο� �迭�� �ϳ� ������ �����ؼ� ���� ���ΰ����� ����
	 */
	
	// ���� ����
	public void method1() {
		
		// ����: ������ ������ ����ڴ�
		// => �� �׽�Ʈ�� ���� �迭�� �־������ ������!
		
		// ���� �迭
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== ���� �迭 ��� ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
	}
}

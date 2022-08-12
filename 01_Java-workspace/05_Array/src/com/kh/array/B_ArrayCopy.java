package com.kh.array;

import java.util.Arrays;

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
		
		// ���翭 �迭: �������κ��� ���縦 ���� ���� ����
		int[] copy = origin;
		
		System.out.println("\n== ���纻 �迭 ��� ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// ���纻 �迭 ���
		copy[2] = 99;
		
		System.out.println("\n== ���纻 �迭 ��� ���� �� ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// ���� �迭 ��� -> ī�Ǻ��� �ٲ�µ� ������ �� ���� �ִ����� Ȯ��
		
		System.out.println("\n== ���纻 �迭�� ���� ���� ���� ==");
		for(int i =0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		// ���纻 �迭���� ������ ������ �ߴµ� ���� �迭�� ���뵵 ���� ������ �� �� ����.
		// => ���� �迭�� �Բ� ���� ����� ���� �� �� �ִ�.
		// ���� ����: �迭�� �ּҰ��� ����Ǿ� ������ ���纻�� ���� ����
		
		System.out.println("\n���� �迭�� �ؽ��ڵ尪: " + origin.hashCode()); // ���� �迭�� �ؽ��ڵ尪��
		System.out.println("���纻 �迭�� �ؽ��ڵ尪: " + copy.hashCode()); // ���纻 �迭�� �ؽ��ڵ尪�� ����
		
	}
	
	// ���� ���� 4���� ���
	public void method2() {
		// 1. for���� �̿��ϴ� ���
		// ���ο� �迭�� ���� �� �Ҵ���� ���� ������
		// ���� �迭�κ��� ������ �� for���� �̿��ؼ� �Ű� �����ϴ� ���
		
		// ���� �迭
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭
		int[] copy = new int[origin.length]; // �� ���� �⺻���� 0���� �ʱ�ȭ�� ����
		
		/*
		 * copy[0] = origin[0];
		 * copy[1] = origin[1];
		 * ...
		 */
		for (int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("== ���纻 �迭 ��� ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n==���纻 �迭 ���� �� ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n== ���纻 �迭 ���� ���� ���� ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n���� �迭�� �ؽ��ڵ尪: " + origin.hashCode());
		System.out.println("���纻 �迭�� �ؽ��ڵ尪: " + copy.hashCode());
		
	}
	
	public void method3() {
		
		// 2. ���ο� �迭�� ���� (���� �� �Ҵ�) ��
		//	  system Ŭ�������� �����ϴ� arraycopy �޼ҵ带 ȣ���Ͽ� ����
		
		// ���� �迭
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭
		int[] copy = new int[10]; // origin�� ������ �״�ΰ� �ƴ� �˳��ϰ�~ 0 0 0 0 0 0 0 0 0 0 
		
		// System Ŭ������ arraycopy �޼ҵ� ����
		// [ ǥ���� ]
		// System.arraycopy(�����迭��, �����迭�Ǻ��縦�������ε���, ���纻�迭��, ���纻�迭�Ǻ���������ε���, �����Ұ���);
		// System.arraycopy(src(�����迭��), srcPos(pos:position, ���� ��𼭺���?, ���� ������ �ε���), dest(destination:������, ���纻 �迭��), destPos(���纻 ��𼭺���?, ���纻 ������ �ε���), length(�� �� ���� ����? �����Ұ���);
		
		System.arraycopy(origin, 0, copy, 0, 5); // 1 2 3 4 5 0 0 0 0 0
		// System.arraycopy(origin, 0, copy, 2, 5); // 0 0 1 2 3 4 5 0 0 0
		// System.arraycopy(origin, 0, copy, 1, 3); // 0 1 2 3 0 0 0 0 0 0
		// System.arraycopy(origin, 2, copy, 1, 3); // 0 3 4 5 0 0 0 0 0 0
		// System.arraycopy(origin, 2, copy, 9, 2); // 0 0 0 0 0 0 0 0 0 3 (4) ???
		// ArrayIndexOutOfBoundsException => �����ϴ� �������� �ε��� ������ ����� �߻�
				
		System.out.println("== ���纻 �迭 ��� ==");
		for(int i = 0; i < copy.length; i++) { 
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n���� �迭�� �ؽ��ڵ尪: " + origin.hashCode());
		System.out.println("���纻 �迭�� �ؽ��ڵ尪: " + copy.hashCode());
		// �ٸ� �ּҰ��� ������ ���� == �ٸ� ���� �����ϰ� ����
		// => ���� ���簡 ����� �̷���� �迭�� ������ �� ���� ������ ���� �ʴ´ٴ� ���� ���� ����
		
	}
	
	public void method4() {
		
		// 3. Arrays Ŭ������ copyOf �޼ҵ带 ȣ���ϴ� ���
		
		// ���� �迭
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭
		// Arrays Ŭ������ copyOf �޼ҵ� ��� ���
		// [ ǥ���� ] ���纻�迭 = Arrays.copyOf(�����迭��, �����Ұ���);
		int[] copy = Arrays.copyOf(origin, 10); // �̶�, copy�迭�� ũ�� == ������ ����
		// ���� �迭���� �۰ų� ���Ƶ� �ش� �޼ҵ��� �����Ұ����� �켱��!
		
		System.out.println("== ���纻 �迭 ��� ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n���� �迭�� �ؽ��ڵ尪: " + origin.hashCode());
		System.out.println("���纻 �迭�� �ؽ��ڵ尪: " + copy.hashCode());
		// => ���� ���簡 �ߵǾ���
		
	}
	
	public void method5() {
		
		// 4. Clone �޼ҵ带 ȣ���Ͽ� ����
		
		// ���� �迭
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭
		// clone �޼ҵ� ����
		// [ ǥ���� ] ���纻�迭�� = �����迭��.clone();
		int[] copy = origin.clone(); // ������ �ɼ� �������� ����
		
		// ���纻 ����� ����
		// [1, 2, 3, 4, 5] ���·� ����ϰ� ����!
		
		/*
		System.out.print("[");
		for(int i = 0; i < copy.length; i++) {
			
			// ���빰 ���
			
			if(i < copy.length - 1) { // ������ �ε����� �ƴ� ���
				
				System.out.print(copy[i] + ", ");
			}
			
			else { // ������ �ε����� ���
				System.out.println(copy[i]);
			}
			
		}
		
		System.out.print("]");
		*/
		
		System.out.println(Arrays.toString(copy));
		// Arrays.toString(����ϰ����ϴ¹迭��);
		// => �հ� �ڿ� ���� '['�� ']'�� ���̰�, ���빰 ���̿��� ��ǥ(,)�� ���̾����� �� ���� ���ڿ��� ������ �ִ� �޼ҵ�
		
		System.out.println("���� �迭�� �ؽ��ڵ尪: " + origin.hashCode());
		System.out.println("���纻 �迭�� �ؽ��ڵ尪: " + copy.hashCode());
		// ���� ���簡 �� �̷������.
	}

}
	
	

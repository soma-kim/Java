package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * *while��
	 * ���� �ݺ��ϰ��� �ϴ� Ƚ���� �˰� ���� �� �ᵵ �ǰ�, �� ���� �� �� �ִ� �ݺ���
	 * => ������ ǥ������ �ʱ�İ� �������� ���ԵǾ� ���� �ʱ� ����
	 * 
	 * [ ǥ���� ]
	 * �ʱ��; // 1. while���� ���� �ݺ��� �Ͼ�� ���� �� �� �� ����Ǵ� ����(�ʼ��� �ƴ�)
	 * while(���ǽ�) { // 2. ���ǽĿ� ���� ���� �˻�: ������ true��� �߰�ȣ ���� �ڵ尡 ���� (�ʼ�)
	 * 		���ǽ� ����� true�� ��� �ݺ������� ������ �ڵ�; // 3. ������ true�� ��� ������ �Ʒ��� ���� (�ʼ�)
	 * 		������; // 4. �ʱ�Ŀ��� ������ ������ ������ ���� �Ǵ� ���Ұ� �̷���� (������ �ʼ��� �ƴ�)
	 * }
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		
		// for������ "�ȳ��ϼ���" �� 5�� ����ϱ�
		
		/*
		for(int i = 0; i < 5; i++) { // 0, 1, 2, 3, 4
			
			System.out.println("�ȳ��ϼ���");
		}
		*/
		
		// while������ "�ȳ��ϼ���"�� 5�� ����ϱ�
		
		int i = 0; // �ʱ��
		while(i < 5) { // ���ǽ�
			
				System.out.println("�ȳ��ϼ���"); // ������ �ڵ�
				
				i++; // ������
		}
		
		System.out.println("i: " + i); // i: 5
		
		while(i >= 1) {
			
			System.out.print(i-- + " "); // --i�� ���� 4, 3, 2, 1, 0���� ��� 
			
			//i--;
		}
	}
	
	public void method2() {
		
		// 1�������� 10������ �� �հ�
		
		
		int sum = 0;
		
		
		// for�� ����
		/*
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
			
		}
		
		System.out.println("sum: " + sum);
		*/
		
		// while�� ����
		int i = 1; // �ʱ��
		while(i <= 10) { // ���ǽ�
			
			sum += i; // ������ �ڵ�
		
			i++;
		}
		
		System.out.println("sum: " + sum);		
		
	}
	
	public void method3() {
		
		// 1���� ������ (1 ~ 100 ������ ������) ������ �� �հ�
		
		int random = (int)(Math.random() * 100) + 1;
		
		System.out.println("random: " + random);
		
		int sum = 0;
		
		// for�� ����
		
		/*
		for(int i = 1; i <= random; i++) {
			
			sum += i;
		
		}
		
		System.out.println("sum: " + sum);
		*/
		
		// while�� ����
		
		/*
		int i = 1; // �ʱ��
		while(i <= random) { // ���ǽ�
			sum += i;
			
			i++;
		}
		System.out.println("sum: " + sum);
		*/
		
		// while�� ���� (�ʱ�İ� �������� ���� ����)
		while (random > 0) {
			
			sum += random--;
			
		}
		
		System.out.println("sum: " + sum);

	}
	
	public void method4() {
		
		// ���Ѵ�� �ƹ� ���ڿ��̳� �Ź� �Է¹ް�
		// "exit" ���ڿ��� �ԷµǴ� ���� ���α׷��� �ƿ� �����Ű��
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(i == 0) { // i�� ���ٸ� ������ �Ͼ�� �ʴ� �� ��� true
			
			System.out.print("�ƹ� ���ڿ��̳� �Է��ϼ���: ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) { // ���ڿ� ���빰�� "exit"�� ��쿡��
				
				return;
			}
			

		}

		
	}
	
	/*
	 * do-while��
	 * ������ true�� �ƴϴ��� �ϴ��� �� �� �����ϰ� ���� ������ ���� ����
	 * 
	 * [ ǥ���� ]
	 * do {
	 * 
	 * 		������ �ڵ�;
	 * } while(���ǽ�);
	 * 
	 * => ������ ���� �˻� ���� ������ �� �� ����
	 * => �� �� ���� �� �������� ���ǽĿ� ���� ���� �˻簡 �̷����
	 * => ���ǽ��� ����� true�� ��� �ٽ� �� ������ �ڵ尡 ����
	 * => ���ǽ��� ����� false�� ��� �ݺ����� ��������
	 * 
	 */
	
	public void method5() {
		int num = 1;
		
		while(num == 0) {
			
			System.out.println("�ȳ�!");
			
		} // ����� 0�� �̷����
		
		do {
			
			System.out.println("�� ��!");
		} while(num == 0);
	}
}

package com.hw6.controller;

import java.util.Scanner;

public class NumberOk {
	
	// �ʵ��
	private int ran;
	
	// �����ں�
	public NumberOk() {
		
	}
	
	// �޼ҵ��
	
	public void numGame() {
		Scanner sc = new Scanner(System.in);
		
		int randomNum = (int)(Math.random() * 100) + 1;
		int count = 1;
		
		while (true) {
			
			System.out.print("1���� 100 ������ ������ �ϳ� �Է��ϼ���: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num > randomNum) {
				System.out.println(num + "���� �۽��ϴ�. " + count + "��° ����!!");
				count++;
				
			}
			
			else if (num < randomNum) {
				System.out.println(num + "���� Ů�ϴ�. " + count + "��° ����!!");
				count++;
				
			} else {
				System.out.println(count + "�� ���� ������ϴ�!");
				break;
			}
		}
			while (true) {
				System.out.print("��� �Ͻðڽ��ϱ�?(y/n): ");
				char answer = sc.nextLine().toLowerCase().charAt(0);
				
				if(answer == 'y') {
					System.out.println("���ο� ������ �����մϴ�!!");
					numGame();
					return;
				}
				
				else if (answer == 'n') {
					System.out.println("������ �����մϴ�.");
					return;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
			}
						
	}

}

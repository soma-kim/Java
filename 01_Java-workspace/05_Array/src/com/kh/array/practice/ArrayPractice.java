package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			count += i;
			
			System.out.print(arr[i] + " ");
		}
	
	}
	
	// 10 9 8 7 6 5 4 3 2 1
	
	public void practice2() {
		
		int[] arr = new int[10];
		
		int count = 10;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = count;
			count--;
			
			System.out.print(arr[i] + " ");
			
		}
	}
	
	public void practice3() {
		
		System.out.print("���� ����: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] numArr = new int[num];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
			
			System.out.print(numArr[i] + " ");
		}		
		
	}
	
//	���̰� 5�� String�迭�� �����ϰ� �������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� ��
//	�迭 �ε����� Ȱ���ؼ� ���� ����ϼ���.
//	ex.
//	��
	
	public void practice4() {
		String[] fruitArr = new String[5];
		
		fruitArr[0] = "���";
		fruitArr[1] = "��";
		fruitArr[2] = "����";
		fruitArr[3] = "������";
		fruitArr[4] = "����";
		
		System.out.print(fruitArr[1]);
		
	}
	
//	���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
//	������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.
//	ex.
//	���ڿ� : application
//	���� : i
//	application�� i�� �����ϴ� ��ġ(�ε���) : 4 8 
//	i ���� : 2
	
	public void practice5() {
		
		System.out.print("���ڿ�: ");
		String sen = sc.nextLine();
		
		// �Է¹��� ���ڿ��� ���̸�ŭ �迭 �����
		char[] senArr = new char[sen.length()];
		
		// �迭 1ĭ�� ���� 1���� �ֱ�
		for(int i = 0; i < sen.length(); i++) {
			
			// chatAt���� ���� ������ �ϴ� �ڲ� ���� ���� �迭 �ڷ����� String -> char�� �ٲ���
			// (�迭 �ڷ��� String���� �ϰ� ������ **(1) ����)
			senArr[i] = sen.charAt(i);
			
		}
		
		// ���ڴ� char�ϱ� string���� nextLine���� 0��° ���ڸ� �����Ͽ� char������ ��ȯ
		System.out.print("����: ");
		char alp = sc.nextLine().charAt(0);
		
		
		// ���� ������ �̱� ���� ���� ���� �� �ʱ�ȭ
		int count = 0;
		
		// index�� ���� ���� ���� �� �ʱ�ȭ
		String sIndex = "";
		
		// �Է¹��� ���ڿ��� ���̸�ŭ �ݺ� �����鼭 ã���� �ϴ� ���ڿ� ���ٸ�
		// �� �ε����� sIndex ������ �����ϰ�, ������ ���� ���� count�� �ø�
		for(int i = 0; i < senArr.length; i++) {
			if(senArr[i] == alp) {
				sIndex += i + ", ";
				count++;

			}

		}
		// application���� ���� a�� ã���� �� ���� 0, 6, ���� ������ �ܾ �޸��� ���ԵǾ� ��µ�
		// ������ �޸��� �����ϴ� �۾�( == ���ڿ��� 0��°���� ������ ���ڿ� -2��ŭ �߶� sIndex�� �־��) 
		sIndex = sIndex.substring(0, sIndex.length() - 2);
		
		System.out.println(sen + "�� " + alp + "�� �����ϴ� ��ġ(�ε���): " + sIndex);
		System.out.println(alp + " ����: " + count);

	}
	
	/* **(1) �迭 �ڷ����� String���� �ϰ� �ʹٸ� chatAt ��� subString ���� ��!
	* senArr[i] = sen.substring(i, i+1); 
	* subString(i��°����, i+1����ŭ �̾ƶ�); �ٵ� �� i+1�̾�� ��¡? 
	*i ���� (i+1) -1 ���̱�����ŭ ����϶�� ���̱� ������ �ᱹ 1���� ����ϴ� ���� ��
	*/
	
//	������ ~ ���ϡ� (����)���� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
//	�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
//	������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
//	ex.
//	0 ~ 6 ���� ���� �Է� : 4          0 ~ 6 ���� ���� �Է� : 7
//	�ݿ���                          �߸� �Է��ϼ̽��ϴ�.
	
	public void practice6() {
		
		String day = "������,ȭ����,������,�����,�ݿ���,�����,�Ͽ���";
		String[] dayArr = day.split(",");
		
		
		System.out.print("0 ~ 6 ���� ���� �Է�: ");
		int num = sc.nextInt();
		sc.nextLine();
		 
		if(num >= 0 && num <= 6) {
			System.out.println(dayArr[num]);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return; 
		}

	}
	
//	����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
//	�迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
//	�׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.
//	ex.
//	���� : 5
//	�迭 0��° �ε����� ���� �� : 4
//	�迭 1��° �ε����� ���� �� : -4
//	�迭 2��° �ε����� ���� �� : 3
//	�迭 3��° �ε����� ���� �� : -3
//	�迭 4��° �ε����� ���� �� : 2
//	4 -4 3 -3 2 
//	�� �� : 2
	
	public void practice7() {
		System.out.print("����: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] numArr = new int[num];
		int sum = 0;
		String outputFormat = "";
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.printf("�迭 %d��° �ε����� ���� ��: ", i);
			numArr[i] = sc.nextInt();
			sc.nextLine();
			
			sum += numArr[i];
			
			// inputFormat = numArr[i] + " ";
			// ��� ����� �ڲٸ� ������ ���� ��µǴ� ���̾��� ;;
			// for�� ���鼭 �ڲ� ���� ��������ϱ� �翬��
			// += ���� �Ἥ for���� �� ������ �ش��ϴ� ���� �߰��� �� inpuFormat�� ��� ��!

			outputFormat += numArr[i] + " ";
		}
		
		// ����� �� �� ���� �״�� �ļ� ��Ƶ� ������ ������ ���� ������ ���������� �����ؼ� ��� ���� ��
		// ��¹��� �����ϰ� ������ �� �������̶� ���ٴ� �ڵ� õ�� ������� �� ��
		outputFormat = outputFormat.substring(0, outputFormat.length()-1);

		System.out.println(outputFormat);
		System.out.println("�� ��: " + sum);
		
	}
	
//	3�̻��� Ȧ�� ������ �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
//	�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
//	��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
//	�ٽ� ������ �޵��� �ϼ���.
//	ex.
//	���� : 4
//	�ٽ� �Է��ϼ���.
//	���� : -6
//	�ٽ� �Է��ϼ���.
//	���� : 5
//	1, 2, 3, 2, 1
	
	public void practice8() {
		
		System.out.print("����: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int count = 1;
		
		if(num < 3 || num % 2 == 0) {
			System.out.println("�ٽ� �Է��ϼ���.");
			practice8();
			return;
		} else {
			int[] arr = new int[num];
			
			for(int i = 0; i < arr.length; i++) {
				if (i < Math.ceil(num / 2)) {
				arr[i] = count;
				count++;
				} 
				
				else {
					arr[i] = count;
					count--;
				}
			
				System.out.print(arr[i] + " ");
			}
		}
		
	}
	
//	����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
//	������ ��OOO ġŲ ��� ���ɡ�, ������ ��OOO ġŲ�� ���� �޴��Դϴ١��� ����ϼ���.
//	��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.
//	ex.
//	ġŲ �̸��� �Է��ϼ��� : ��� 			ġŲ �̸��� �Է��ϼ��� : �Ҵ�
//	���ġŲ ��� ����             		�Ҵ�ġŲ�� ���� �޴��Դϴ�.
//	
	public void practice9() {
		
		System.out.print("ġŲ �̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		String menu = "�Ķ��̵�,���,����,���������";
		String[] menuArr = menu.split(",");
		
		
		for(int i = 0; i < menuArr.length; i++) {
			
			switch(name) {
			case "�Ķ��̵�" : System.out.print("�Ķ��̵�ġŲ ��� ����");
							return;
			case "���" : System.out.println("���ġŲ ��� ����");
							return;
			case "����" : System.out.println("����ġŲ ��� ����");
							return;
			case "���������" : System.out.println("���������ġŲ ��� ����");
							return;
			default : System.out.printf("%sġŲ�� ���� �޴��Դϴ�.", name);
							return;
			}
		}
		
		// õ�� �� �ڵ� ;; flag�� ������ �̿��ϴ� ��!!
		
//		boolean flag = false;
//	
//		for( int i = 0 ; i < menuArr.length; i++ ) {
//			if( menuArr[i].equals(name) ) {
//				System.out.println(name + "ġŲ ��� ����");
//				
//				flag = true;
//			} 
//		}
//		
//		if( !flag ) {
//			System.out.println(name + "ġŲ�� ���� �޴��Դϴ�.");
//		}
//		
	}
	
//	10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
//	1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
//	ex.
//	9 7 6 2 5 10 7 2 9 6
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		// ó���� ���� ���� ���� num�� �����ߴ��� �̹� ���� ���� ������ for������ ���Ƽ� ���� �� 10���� ��µǾ��⿡
		// num ������ for�� �ȿ��� 
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*10) + 1;
			arr[i] = num;
			
			System.out.print(arr[i]  + " ");
		}
		
	}
	
//	10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
//	1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ ��
//	�迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
//	ex.
//	5 3 2 7 4 8 6 10 9 10 
//	�ִ밪 : 10
//	�ּҰ� : 2
	
	// max, min �� �� ����
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*10) + 1;
			arr[i] = num;
			
			System.out.print(arr[i]  + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println();
		
		System.out.println("�ִ밪 " + max);
		System.out.println("�ּҰ�: " + min);
		
	}
	
	public void practice11_1() {
		
		int[] arr = new int[10];

		int max = 0;
		int min = 10;
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*10) + 1;
			arr[i] = num;
			
			System.out.print(arr[i]  + " ");
			
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
			
			}
		
		System.out.println();
		
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		
	}
	
//	10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
//	1~10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.
//	ex.
//	4 1 3 6 9 5 8 10 7 2
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		String outputFormat = "";
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 10) + 1;
			arr[i] = num;
			
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						i--;
					}
			}
			
			} else {
				continue;
			}
		}
		outputFormat = Arrays.toString(arr);
		outputFormat = outputFormat.substring(1, outputFormat.length()-1).replace(",", "");
		System.out.println(outputFormat);
	}
	
//	�ֹε�Ϲ�ȣ�� String ���ڿ��� �Է� �ް� �Է� ���� �� ���ڿ��� �� �ε��� �� ���ڸ�
//	char[]�� �Ű� ��� (��, ���� �ڸ� ���ĺ��ʹ� *�� ���)
//	ex.
//	�ֹε�Ϲ�ȣ(-����) : 123456-1234567
//	123456-1******
	
	public void practice13() {
		
		System.out.print("�ֹε�Ϲ�ȣ (-����): ");
		String personId = sc.nextLine();
		
		char[] idArr = new char[14];
		
		for(int i = 0; i < idArr.length; i++) {
		
			if(i <= 7) {
				idArr[i] = personId.charAt(i);
			} else {
				idArr[i] = '*';
			}
			
			System.out.print(idArr[i]);
		}
	}
	
//	�ζ� ��ȣ �ڵ� ������ ���α׷��� �ۼ��ϴµ� �ߺ� �� ���� ������������ �����Ͽ� ����ϼ���.
//	ex.
//	3 4 15 17 28 40
	
	public void practice14() {
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 45) + 1;
			arr[i] = num;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--; 
					break;
				}
 
			}
			
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}

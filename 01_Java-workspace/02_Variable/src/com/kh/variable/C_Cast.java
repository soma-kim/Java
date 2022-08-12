package com.kh.variable;

// ����ȯ�� ���õ� ����
public class C_Cast {
	
	/*
	 * *����ȯ: ���� �ڷ����� �ٲٴ� ����
	 * 1. ���� ������(=) �� �������� ���ʰ� �������� ���� �ڷ����̾�� ��
	 * 	  => ��, ���� �ڷ����� �ش�Ǵ� ���� ������ ����
	 *	  => �ٸ� �ڷ����� ���� �����ϰ��� �Ѵٸ� "����ȯ"�� ���� �̷������ �� (�ʼ�)
	 *        ����                  =     ������
	 *     ���� �� ����             ������ �ְ� ���� ��(�긦 �����ϱ� �� �� ��ȯ ���� �� ��!)
	 * [ ǥ���� ] �ڷ��� ������ = (�ٲ��ڷ���)��;
	 * 
	 * 2. ���� �ڷ��������� ������ ������
	 * 	  => ��, �ٸ� �ڷ������� ������ �����ϰ� ������ ��� �� �߿� �ϳ��� "����ȯ"�� ���� �� �� �ڷ����� ���� ��� ��(�ʼ�)
	 * [ ǥ���� ] �� + (�ٲ��ڷ���)��;
	 * 
	 * 3. 1, 2�� ��Ģ�� ���ļ�
	 *	   ���� �ڷ������� ������ �̷���� ��� �� ���� ����� ������ �ڷ������� ����
	 *	  => ��, ���� �ڷ������� ������ �̷���� ����� �� ������ �������� ���� ����
	 *		ex) int result = int������ + int������;
	 * 
	 * *����ȯ�� ����
	 * 1. �ڵ� ����ȯ: ��ǻ�Ϳ��� �ڵ����� ����ȯ�� ����Ǳ� ������ ���� ���� ����ȯ�� �� �ʿ䰡 ����
	 * 			      ���� ����Ʈ�� �ڷ��� => ū ����Ʈ�� �ڷ���
	 * 2. ���� ����ȯ(������ ����ȯ-�̸��� �ٿ� �ָ� ����ȯ�� �ϰڴ�): (�ٲ��ڷ���)��ó�� �ٲ� �ڷ��� �̸��� �ٿ� ��
	 * 			 : �ڵ� ����ȯ�� ���� �ʾ� ���� ������ ����ȯ �ؾ� �ϴ� ���
	 * 			      ū ����Ʈ�� �ڷ��� => ���� ����Ʈ�� �ڷ���
	 * [ ǥ���� ] (�ٲ��ڷ���)��; 
	 * ex) �޴��� ���ڿ� ������, ���ÿ�ġ? ���� �� ���� = �ڵ� ����ȯ
	 *	      �޴������ڿ� �е�, ��Ʈ��? ���� �� ���� = ���� ����ȯ
	 * 
	 * *(�ٲ��ڷ���): ����ȯ "������" == Cast ������
	 */
	
	// �ڵ� ����ȯ: ���� ����Ʈ => ū ����Ʈ�� �ڵ� ����ȯ�Ǵ� ���
	public void autoCasting() {
		
		// 1. int (4byte ����) -> double (8byte �Ǽ�)
		int i1 = 10;
		double d1 = i1; // �ڵ����� ����ȯ�� �Ǿ���
						// 10 -> 10.0
		// double d1 = (double)i1; // ��� �ᵵ(���� ����ȯ �ص�) �����ϳ� �ڵ����� �� �ִϱ� ����! 
		
		System.out.println("d1: " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result2 = i2 + d2; // 12.0(�ڵ� ����ȯ) + 3.3 = 15.3
		// double result2 = (double)i2 + d2; // �� ����
		
		System.out.println("result2: " + result2); // 15.3
		
		// 2. int (4byte) -> long (8byte)
		int i3 = 1000;
		long l3 = i3;
		// long l3 = (long)i3; //�� ����
		
		System.out.println("l3: " + l3);
		
		long l4 = 2000; // L�� �� �ٿ����Ƿ� int �ڷ����� 2000���� �ν��ϳ� long Ÿ���� ���ڸ� ����鼭 �ڵ�����ȯ �� ��
		// long l4 = (long)2000; // �̰͵��
		// long l4 = 2000L;      // ����
		
		// Ư�� ���̽� 3. long (8byte) -> float (4byte)
		// ������ �Ǽ��� ��� ������ ū �������� ������ ���� �������� �Ǽ��� ���� ����
		// 4byte float�� ��� long ������ ���� �� �ִ� ������ �� ũ�� ����
		// +���� �߰� �亯: �Ǽ��� �Ҽ��� �Ʒ��� �� ���� ����� �ֱ� ������ ��� ������ ������ �� ũ�ٰ� �� �� �ִ�...?! �� ��ó�� �亯�� �ֽ� �Ҽ����� ��� ü��� �ٸ��ٰ�...!! 
		
		long l5 = 1000;
		float f5 = l5; // 1000.0
		// float f5 = (float)l5; // �� ����
		
		System.out.println("f5: " + f5);
		
		// Ư�����̽� 4. char (2byte) <-> int (4byte) ����� ����ȯ ����
		// char�� ����: 0 ~ 65535
		//		           �� ���ڸ��� ������ �������� ������ ����
		// => �ش� ���������� �� ���ڷ� ��Ī���� �ִ� �ƽ�Ű�ڵ�ǥ(0 ~ 127, 128������ ���ڸ� ��Ÿ�� �� ���� - ������ ��ҹ��� ���ĺ�, ����, Ư������)
		// => �ƽ�Ű�ڵ�ǥ�� Ȯ��� �������� �����ڵ�ǥ(0 ~ 65535, 65536������ ���ڸ� ��Ÿ�� �� ���� - ����, ����, Ư������, �ѱ�, �� �̿��� ���)
		
		char ch = 65;
		// char ch = (char)65; // �� ����
		System.out.println("ch: " + ch); // A => �ƽ�Ű�ڵ�ǥ ���� 65�� �빮�� A
		
		int num = 'A';
		// int num = (int)'A'; // �� ����
		System.out.println("num: " + num); // 65
		
		System.out.println('��'); // ��
		System.out.println((int)'��'); // 44608
		
		int sum = 'A' + 10; // ����: (1) ������� ���� ����δ� 75
							// 		(2) ���ڷν� ���� ����δ� 'K'
		

		System.out.println("sum: " + sum); // 75
		System.out.println("sum: " + (char)sum); // K
		
		System.out.println("A�� a���� Ů�ϱ�?: " + ('A' > 'a')); // false, �ƽ�Ű�ڵ�ǥ ���� A = 65, a = 97
		//���ڳ��� ���ڸ� ������ ���굵 �����ϴ�!
		
		// Ư�� ���̽� 5. byte������ ����, short������ ����
		byte b1 = 1;
		byte b2 = 10;
		
		// byte result = b1 + b2;
		// Type mismatch: cannot convert from int to byte: �ڷ����� ���� �ʾ�! int�� byte�� �ٲ� �� ����
		
		byte result = (byte)(b1 + b2); // �������� �⺻���� int�̱� ������ ��Ÿ���� �����̹Ƿ� ����� int�� byte�� ��ȯ
		// byte�� short�� ���� �� ������ ���� ����� int�� ��޵�
		// => ������ ����ȯ�� �ϸ� ���� ����
		
	}

	// ���� ����ȯ(������ ����ȯ): ū ũ���� �ڷ����� ���� ũ���� �ڷ������� ����ȯ �� ���
	public void forceCasting() {
		
		// 1. double (8byte) -> float (4byte)
		//float f1 = 4.0;
		float f1 = 4.0f; // �Ǽ����� �⺻ double������ �����ϹǷ� �ݵ�� f�� �ٿ� ��� ��!
		// float f1 = (float)4.0; // Ȥ�� �̷��� 
		
		double d2 = 8.0;
		// float f2 = d2;
		float f2 = (float)d2;
		
		// 2. double (8byte) -> int (4byte)
		double d3 = 10.89;
		int i3 = (int)d3; // 10.89 -> 10
		
		System.out.println("i3: " + i3);
		// 10 �Ҽ��� �Ʒ� ������ �����(��, �Ҽ��� �Ʒ� �����Ͱ� �սǵǹǷ� ������ �����ؾ� ��)
		
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum;
		// int�� 4byte, double�� 8byte�̹Ƿ� int�� double�� �ڵ� ����ȯ(������ ��)������ int ����(���� ����)�� ��� �; ������ �ߴ� ��!
		// iNum�� double ������ �ڵ� ����ȯ�ǰ�(10 -> 10.0)
		// iNum�� dNum�� �������鼭 15.89�� ��
		// => double ���� ����� 15.89 ���� int�� ������ iSum�� ������ �ؼ� ����
		
		// �ذ� ��� 1. �������� int���� ���缭 ���� ����ȯ
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum: " + iSum); // 15
		
		// �ذ� ��� 2. ���� ���� ���� dNum�� int������ ���� ����ȯ �Ŀ� ���� ����
		
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2: " + iSum2); // 15
		
		// �ذ� ��� 1�� �ذ� ��� 2�� ���� ����
		// �ذ� ��� 1
		// 1�ܰ�: iNum�� double�� �ڵ�����ȯ
		// 2�ܰ�: �ٲ� iNum�� dNum�� ��������
		// 3�ܰ�: ������ ����� int������ ��������ȯ
		
		// �ذ� ��� 2
		// 1�ܰ�: dNum�� int�� ��������ȯ
		// 2�ܰ�: iNum�� dNum�� ������
		
		// �ذ� ��� 3. ���ʿ� ������� ���� ������ double������ ����
		
		double dSum = iNum + dNum; // iSum�� �ڵ�����ȯ���� double�� ����ȯ �Ǹ�, ������ �ս� ���� ��Ȯ�� ���� ���
		System.out.println("dSum: " + dSum);
		
	}
	
	/* 
	 * (�ٲٰ����ϴ��ڷ���)��;
	 * 
	 * ���������� -> ū������
	 * ū������ -> ����������
	 * 
	 */
	
}
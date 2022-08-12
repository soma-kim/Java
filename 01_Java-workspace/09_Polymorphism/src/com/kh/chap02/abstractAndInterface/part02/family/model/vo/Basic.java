package com.kh.chap02.abstractAndInterface.part02.family.model.vo;

// interface: �߻� Ŭ�����ε� ��Ư�� ��
public interface Basic {
	
	/*
	 * *�������̽�
	 * ��� �ʵ尡 ��� �ʵ��̰�, ��� �޼ҵ尡 �߻� �޼ҵ��� ������ �߻� Ŭ����
	 * 
	 * [ ǥ���� ] 
	 * public interface �������̽��� {
	 * 
	 * }
	 * 
	 * 		// �ʵ��: ��� �ʵ常 ���ǵǾ�� ��
	 * 		
	 * 		// �����ں�: �߻� Ŭ������ ������ ��ü ������ �Ұ��ϹǷ� �����ں� ���� 
	 * 		
	 * 		// �޼ҵ��: �߻� �޼ҵ�鸸 �־�� ��
	 * 
	 * - �������̽����� ��� �ʵ�� ������ ��� �ʵ�
	 * - �������̽����� ��� �޼ҵ�� ������ �߻� �޼ҵ�
	 * - ������ �����ؾ� �� �͵��� ���� �� �������̽��� ���� ����ϰ� ��
	 * - �߻� Ŭ������ �ٸ��� �� �� ���� ��Ģ��, �������� �����ϴ� �� �������̽�
	 * 
	 *  *�߻� Ŭ������ �������̽��� ��
	 *  1. ������
	 *  - ��ü ������ �� �ǳ� �������� ���� ������
	 *  - ���(����) �ϴ� Ŭ������ �߻� �޼ҵ带 �������̵� �ϵ��� ������
	 *  
	 *  2. ������
	 *  - �߻�Ŭ������ Ŭ���� ���� �����Ӱ� �ʵ�, �޼ҵ带 ���� �����ϰ�
	 *    �߻� �޼ҵ尡 ���ԵǾ��ų� ���Ե��� �ʴ��� abstract class�� �����ϸ� �߻� Ŭ������ ���ǵ�
	 *    �������̽��� �������̽� ���� ��� �ʵ�, �߻� �޼ҵ�θ� �����Ǿ�� ��
	 *  - �����ϴ� ������ �ٸ�
	 *    �߻� Ŭ����: �������� �ڵ带 ��Ƶΰ� �� �����ٰ� ����� "Ȯ��"���Ѽ� ���ڴ� (Ŭ������ extends �θ�Ŭ������)
	 *    �������̽�: Ŭ������ ��� ������ �����ϱ� ���ؼ� ������ ���ڴ� == ��� �ش� �޼ҵ���� �� ������ �־�� ��
	 *    													(Ŭ������ implements �������̽���)
	 *    => ��, ������ ���������ν� ���� ��ü���� ���� ������ ������ �� ����
	 *    
	 * 3. extends �� implements
	 * - Ŭ���� ���� ��Ӱ����� ���: �ڽ�Ŭ������ extends �θ�Ŭ������ (���߻�� �Ұ�)
	 * - Ŭ������ �������̽� ���� ���������� ���: Ŭ������ implements �������̽���, �������̽���2, ... (���߱��� ����)
	 * - �������̽��� �������̽� ���� ��Ӱ����� ���: �ڽ��������̽��� extends �θ��������̽���, �θ��������̽���2, ... (���߱��� ����)
	 */
	
	// �ʵ��: ��� �ʵ常 ���� ����
	/* public static */ final int NUM = 10;
	// �������̽����� ��� �ʵ常 ������ �� �ֱ� ������
	// public static final�� ���� ������ (���������� ���� ����)
	// private int a; // �Ϲ� �ʵ� ������ �Ұ�
	
	// �޼ҵ��: �߻� �޼ҵ常 ���� ����
	/* public static */ void sleep();
	/* public static */ void eat();
	// �������̽����� �߻� �޼ҵ常 ������ �� �ֱ� ������
	// ���� public abstract �� ���� ������ (���������� ���� ����)

}
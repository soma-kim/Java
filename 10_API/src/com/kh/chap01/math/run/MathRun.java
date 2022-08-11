package com.kh.chap01.math.run;

// import java.lang.Math
// �� �긦 import �� �ص� Math.PI�� ����Ǵ� �ɱ�?
// => import java.lang.*;
// => ���� ����! ������ ������ �׻� import�� �Ǿ� ����

// java.lang.Math Ŭ���� �׽�Ʈ
public class MathRun {

	public static void main(String[] args) {
		
		// Math Ŭ���� (���а� ����) ���� �����ϰ� �ִ� ������ ��ɵ鿡 ���ؼ� ���캸��!
		
		// Math math = new Math();
		// Math Ŭ������ ��� �ʵ尡 ��� �ʵ��̰�, ��� �޼ҵ尡 static �޼ҵ��̱� ������
		// ��ü�� �����ؼ� �ҷ��� �ʿ䰡 ���� => �����ڵ� private�̶� ���� ���� ��ü�� ������� ����!
		
		// 1. ����: ������(3.14...)
		// 			Math Ŭ���� ���� ��� �ʵ�� ���ǵǾ� ����
		System.out.println("����: " + Math.PI); // ��Ʈ�� ������ Ŭ���� ���� Ŭ������ Ȯ���� �� �� ����, ����: 3.141592653589793
		
		// ���� ���̴� �޼ҵ��
		// �޼ҵ��(�Ű�����): ��ȯ��
		// 1. �ø� => Math.ceil(double): ��ȯ�� double��
		double num1 = 4.349;
		System.out.println("�ø�: " + Math.ceil(num1)); // �ø�: 5.0
		
		// 2. �ݿø� => Math.round(double): ��ȯ�� long��
		System.out.println("�ݿø�: " + Math.round(num1)); // �ݿø�: 4
		
		// 3. ���� => Math.floor(double): ��ȯ�� double��
		System.out.println("����: " + Math.floor(num1)); // ����: 4.0
		
		// 4. ���밪 => Math.abs(int/double/long/float): ��ȯ�� int/double/long/float �״��
		int num2 = -10;
		System.out.println("���밪: " + Math.abs(num2)); // ���밪: 10
		
		// 5. �ּҰ� = > Math.min(int, int): ��ȯ�� int��
		System.out.println("�ּҰ�: " + Math.min(5, 10)); // �ּҰ�: 5
		
		// 6. �ִ밪 => Math.max(int, int): ��ȯ�� int��
		System.out.println("�ִ밪: " + Math.max(5, 10)); // �ִ밪: 10
		
		// 7. ������(��Ʈ) => Math.sqrt(double): ��ȯ�� double��
		System.out.println("������: " + Math.sqrt(4)); // ������: 2.0
		
		// 8. ���� => Math.pow(double, double): ��ȯ�� double��
		System.out.println("2�� 10����: " + Math.pow(2,  10)); // 2�� 10����: 1024.0
		
		// 9. ���� => Math.random(): ��ȯ�� double��
		//							0.0 ~ 0.999999...
		System.out.println("������: " + Math.random());
		
		/*
		 * java.lang.Math Ŭ������ Ư¡
		 * - ��� �ʵ�: ��� �ʵ�
		 * - ��� �޼ҵ�: static �޼ҵ�
		 * 
		 * ��� �� �� static�̱� ������ Math.���� ���� ���� (��ü ������ �ʿ� ������)
		 * Math Ŭ������ �����ڰ� private�̴� (���ʿ� ���� �Ұ�)
		 * 
		 * static: ���α׷� ���۰� ���ÿ� �޸� ������ �÷��ΰ� �����ϸ� �����ϴ� ����
		 * => �̱��� ����
		 */
		
		// �ڹ� ������ ���� ����!
		// https://docs.oracle.com/javase/8/docs/api/index.html
 
	}

}

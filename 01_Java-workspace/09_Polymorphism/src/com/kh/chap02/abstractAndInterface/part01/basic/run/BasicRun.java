package com.kh.chap02.abstractAndInterface.part01.basic.run;

import com.kh.chap02.abstractAndInterface.part01.basic.model.vo.Basketball;
import com.kh.chap02.abstractAndInterface.part01.basic.model.vo.Football;
import com.kh.chap02.abstractAndInterface.part01.basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {
		
		/*
		// Sports s = new Sports();
		// �߻� Ŭ������ ����� ���� ��ü ���� �Ұ�
		// => �̿ϼ��� Ŭ�����̱� ����
		
		Sports s; // ������ ������ ���̱� ������ ����(�����ڷ��� �����δ� Ȱ�� ����)
		
		s = new Football();
		// �ƹ��� �߻�Ŭ���� Ÿ���̾ "������"�� ���� �ڽ� Ÿ���� ��ü�� ���� �� ���� �� ����
		*/
		
		// ����� ���ÿ� �����ϰ� �ʹٸ�?
		
		Sports s = /* (Sports) */ new Football();
		
		// ��ü �迭
		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].rule();
		}
		
		/*
		 * �߻� Ŭ����(�̿ϼ��� Ŭ����) => abstract calss
		 * - �ش� Ŭ���� ���ο� �߻� �޼ҵ尡 �ϳ��� �����ϴ� ���� �ݵ�� �߻� Ŭ������ �����ؾ� ��
		 * - ��, �߻� �޼ҵ尡 ���� ��� abstract class�� �����ϸ� �߻� Ŭ������ ������
		 * 	 (�Ϲ� �ʵ� + �Ϲ� �޼ҵ� + �߻� �޼ҵ�(���� ����))
		 * 	 => ������ ����: Ŭ������ ���� ��ü������ ���� �� �м��� ������ �� ���� ��
		 * 	 => ����� ����: �� Ŭ������ ��ü �Ұ����ϰ� ���� ���� �� 
		 * - ��ü ������ �Ұ��ϳ� ���������� �����Ͽ� ���������δ� Ȱ�� ����!
		 * 
		 * *�߻� �޼ҵ�(�̿ϼ��� �޼ҵ�) => abstract ��ȯ��
		 * - �̿ϼ��� �޼ҵ�� ����� { }�� �����Ǿ� ���� ���� �޼ҵ�
		 * - �ڽ� Ŭ�������� �������̵��� ���� �ϼ��� (��, ������ �������̵��� �ؾ� ��)
		 * 
		 */ 
		

	}

}

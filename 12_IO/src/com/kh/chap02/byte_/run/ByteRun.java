package com.kh.chap02.byte_.run;

import com.kh.chap02.byte_.model.dao.FileByteDao;

public class ByteRun {
	
	
	/*
	 * *����Ʈ ��� ��Ʈ��
	 * ����Ʈ ��Ʈ��: 1byte �����θ� ������� �� �ִ� ���� ���(XXXInputStream / XXXOutputStream)
	 * ��� ��Ʈ��: �ܺ� ��ü�� ���������� ����Ǵ� ���� ���
	 * 
	 * => �ܺ� ��ü�� �����ϰ� �� �ܺθ�ü�� ���������� ����Ǵ� 1byte ������ ��θ� �������
	 * XXXInputStream: XXX ��ü�κ��� �����͸� �Է¹޴� ���
	 * 					(�ܺ� ��ü�κ��� �����͸� ������ ���ڴ�. == �о���̰ڴ�)
	 * XXXOutputStream: XXX ��ü�κ��� �����͸� ����ϴ� ���
	 * 					(�ܺ� ��ü�� �����͸� �������ڴ� == ���ڴ�)
	 * 
	 */
	
	public static void main(String[] args) {
		
		FileByteDao fb = new FileByteDao();
		
		// fb.fileSave();
		
		fb.fileRead();

		
		
		
	}

}

package com.kh.chap03.char_.run;

import com.kh.chap03.char_.model.dao.FileCharDao;

public class CharRun {
	
	/*
	 * *���� ��� ��Ʈ��
	 * ���� ��Ʈ��: �� ���� 2byte ¥���� �����Ͱ� �̵��� �� �ִ� ���� ��� (XXXReader / XXXwriter)
	 * ��� ��Ʈ��: �ܺ� ��ü�� ���������� ����Ǵ� main ���
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		FileCharDao fc = new FileCharDao();
		
		fc.fileSave();

	}

}

package com.kh.chap01.poly.part02.electronic.controller;

import com.kh.chap01.poly.part02.electronic.mode.vo.Electronic;

// �������� ��������� ��
public class ElectronicController2 {
	
	// ������ڻ󰡿� �ٽ� ���Ӱ� ���� ����
	
	// �ʵ��
	//��� �����̵��� ���� �� �ִ� 3ĭ¥�� â��
	private Electronic[] elec = new Electronic[3];
	
	// �޼ҵ��
	// â�� ������ �ִ� �޼ҵ�: ���� ��� ���� ����?
	public void insert(Electronic any, int index) { // ��� ������ǰ�� ��������, â�� ���� �ǵ�
		elec[index] = any;                          // �� ������ ������ǰ�� â�� ������� ���� �ž�
	}
	
	// â��κ��� ������ �ϳ� �������� �޼ҵ�
	public Electronic select(int index) { // ������ǰ�� ������ ��ȸ�� �ǵ�
		return elec[index];               // ���� ���ϴ� â�� ������ �ִ� �ָ� ���� �� ��
	}
	
	// â�� �ִ� ���� ��θ� �� ���� �ִ� �޼ҵ�
	public Electronic[] select() { // ������ǰ ��ȸ�� �ž�
		return elec;              // ������ǰ �� ����~
	}
	

}

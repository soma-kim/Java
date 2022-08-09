package com.kh.chap01.poly.part02.electronic.controller;

import com.kh.chap01.poly.part02.electronic.mode.vo.Desktop;
import com.kh.chap01.poly.part02.electronic.mode.vo.NoteBook;
import com.kh.chap01.poly.part02.electronic.mode.vo.Tablet;

// �������� �����Ű�� ��
public class ElectronicController1 {
	
	// ������ڻ󰡿� ���� ���� ����
	
	// �ʵ��: ������ǰ�� ������ �� �ִ� �� ���� �������� �� ���� ����
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// �޼ҵ��: �ش� ���ڿ� ������ �ִ� �뵵�� �޼ҵ��, ���ڿ� ��� ������ ������ ���� �ִ� �޼ҵ��
	// ������ �ִ�(�ʵ忡 ���� �����ϴ�) �뵵�� �޼ҵ��
	// setter �޼ҵ��� ���� ����
	
	// Desktop�� �ִ� �޼ҵ�
	public void insert(Desktop d) { // insert: �Է��ϴ�, �ִ�
		// Desktop d = new Desktop("�Ｚ", "����ũž", 1200000, "Geforce 1070");
		desk = d;
	}
	
	// NoteBook�� �ִ� �޼ҵ�
	public void insert(NoteBook n) { // �����ε� ���� ����
		note = n;
	}
	
	// Tablet�� �ִ� �޼ҵ�
	public void insert(Tablet t) {
		tab = t;
	}
	
	// ���ڿ� ��� ������ ������ ���� �ִ� (�ʵ忡 ��� ���� ����) �뵵�� �޼ҵ�
	// getter �޼ҵ��� ���� ����
	
	// Desktop ��ü�� ������ ���� �ִ� �޼ҵ�
	public Desktop selectDesktop() { // select: ��ȸ�ϴ�
		return desk;
	}
	
	// NoteBook ��ü�� ������ ���� �ִ� �޼ҵ�: �̹� ��쿡�� �����ε� ���� �Ұ�
	public NoteBook selectNoteBook() { // select: ��ȸ�ϴ�
		return note;
	}
		
	// Tablet ��ü�� ������ ���� �ִ� �޼ҵ�
	public Tablet selectTablet() { // select: ��ȸ�ϴ�
		return tab;
	}
	

}

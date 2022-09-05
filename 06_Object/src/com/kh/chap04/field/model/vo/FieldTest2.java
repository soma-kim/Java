package com.kh.chap04.field.model.vo;

// �ʵ忡�� ��� ������ ���������� ���� 4����
public class FieldTest2 {
	
	/*
	 * (+)public: ��𼭵�(���� ��Ű��/Ŭ����, �ٸ� ��Ű��/Ŭ���� ���) ���� ����
	 * (#)protected: ���� ��Ű�� ���ο����� ������ ���� ����,
	 * 				  �ٸ� ��Ű���� �ִ� Ŭ�������� �����ϰ� �ʹٸ�
	 * 				  ��� �� Ŭ������ ������ ���� ���� Ŭ������ ��� ������ �̷��� ��
	 * 				 (����� ���� �ð��� ���!)
	 * (~)default: ���� ���� ��Ű�� �������� ���� ����
	 * (-)private: ���� �ش� Ŭ���� �������� ���� ����
	 * 
	 * => ���������� �Ʒ��� ���������� ������ �� �ִ� ���� ������ ������
	 * => +, #, ~, -: Ŭ���� ���̾�׷������� ��ȣ
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String df = "default"; // default�� ���� ���� ��! ���� �� �⺻��...!
	private String pri = "private";
	
	public static String sta = "FieldTest2�� static";
	
	

}

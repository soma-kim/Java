package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// User Ŭ������ �⺻ �����ڸ� �̿��ؼ� ��ü ����
		
		User u1 = new User();
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("�踻��");
		u1.setAge(20);
		u1.setGender('��');
		
		System.out.println(u1.information()); // �⺻���� ���
		
		// User Ŭ������ String userId�� �ʱ�ȭ�� �� �� �ִ� �Ű����� �����ڸ� �̿��ؼ� ��ü ����
		
		User u2 = new User("user02");
		
		System.out.println(u2.information()); // userId�� ���� ���ϴ� ������ �ʱ�ȭ
		
		// User Ŭ������ String userId, String userPwd, String userName��
		// �ʱ�ȭ���� �� �ִ� �Ű����� �����ڸ� �̿��ؼ� ��ü ����
		
		User u3 = new User("user03", "pass03", "ȫ�浿");
		
		System.out.println(u3.information());
		
		// User Ŭ������ ��� �ʵ忡 ���ؼ� ��ü ������ ���ÿ� ���� ���ϴ� ������
		// �ʱ�ȭ�� ���ִ� �Ű����� �����ڸ� �̿��ؼ� ��ü ����
		
		User u4 = new User("user04", "pass04", "�ڰ���", 21, '��');
		
		// ���࿡ �� �������� ��й�ȣ�� �ٲٰ� ����
		// -> setter �޼ҵ带 ��߸� ��!
		
		u4.setUserPwd("password04!");
		// �Ű����� �����ڰ� �ִ� �ϴ��� setter �޼ҵ�� �ݵ�� �ʿ���!
		
		System.out.println(u4.information());

	}

}

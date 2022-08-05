package com.kh.chap05.constructor.model.vo;

public class User {
	
	// �ʵ��
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	// �����ں�
	
	/*
	 * *������
	 * �޼ҵ���� Ŭ������� �����ϰ� ���� �ڷ����� ���� public �޼ҵ�
	 * ��ü�� ������ �� (new���� �� ��) ȣ��Ǵ� �޼ҵ�
	 * 
	 * [ ǥ���� ]
	 * public Ŭ������(�Ű����� => ���� ����) {
	 * 
	 * 		��ü�� ������ �� ���� �����ϰ��� �ϴ� �ڵ�;
	 * 		(���� ���ϴ� ������ �ʵ带 �ʱ�ȭ�ϴ� �ڵ带 �ַ� ��)
	 * }
	 * 
	 * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� ������ �ֱ� ���� ����(new���� ���� �Բ� ����) // Product p1 = new Product(); �������� new ���� Product()�� ��������!
	 * 2. ��ü ������ �ƴ϶� �Ű������� ������ ���� ��ٷ� �ʵ忡 �ʱ�ȭ�� ����
	 * 
	 * ������ �ۼ� �� ���ǻ���
	 * 1. �ݵ�� Ŭ������� �̸��� �����ؾ� �� (��ҹ��� ����)
	 * 2. ��ȯ���� �������� ���� (�޼ҵ�� �����ϰ� ���ܼ� �򰥸� �� �����Ƿ�) // ��ȯ�� ���ٰ� ���� void ���� �� ��!
	 * 3. ���� �� �ۼ��� ���������� �Ű������� �ߺ��Ǹ� �� ��(�̸��� �ߺ� �����ϳ�, �Ű������� �ٸ��� ���� ��) => �����ε�
	 * 4. �Ű������� ���� �⺻ �����ڴ� �ۼ����� �ʴ´ٸ� JVM�� ���� �ڵ����� �������
	 * 	    ��, �ٸ� �����ڵ�� ���� �ۼ��� ��쿡�� �Ű������� ���� �⺻ �����ڸ� �� ����� ��� ��!
	 * 
	 */
	
	// ���� �⺻���� ������ ������: �⺻ ������
	// => �Ű������� ���� ����
	// => �ۼ����� �ʴ´ٸ� JVM�� ���� �ڵ����� ������
	

	public User() { // user01�� ����, �ʼ��� �ƴ����� ��а��� ������ ����� ���� ��!
		
		// �⺻ ������ == �Ű������� ���� ������
		// ���� ��ü�� ����(������ Ȯ��)���� �������� �� �� ���
		// => �׷��� ������ ���� �ƹ� �ڵ嵵 �ۼ������� ����
		
		// �⺻ �����ڸ� �����ϴ� ��� => ������ ���� �ʰ�, ��ü�� �����ϴ� �� ������ ������
		//						    �׵��� �˰� �𸣰� JVM�� �ڵ����� ����� ��� ������ ����
		
		// �� JVM�� �Ź� �⺻ �����ڸ� ����� �ִ� ���� �ƴϰ�
		// �Ű������� �ִ� �ٸ� �����ڸ� ���� ���������� �ۼ����� ������ JVM�� �⺻ �����ڸ� ����� ���� ����
		// => ��, ����Ǿ��� ���� �⺻ �����ڴ� �׻� �ۼ��ϴ� ������ ������!
		
		// System.out.println("�� ����� �ǳ�...?");
	}

	
	// �Ű������� �ִ� ������: �ʵ尪�� "���� ���ϴ� ������" �ʱ�ȭ�ϰ��� �� �� �ַ� ����
	public User(String userId) { // ��ü ������ ���ÿ� userId �ʵ忡�� ���� ���� ���ϴ� ���·� �ʱ�ȭ�� ����
		
		this.userId = userId; // user02�� ����
		
	}
	
	// ��ü ������ ���ÿ� userId, userPwd, userName �ʵ常 �ʱ�ȭ�� �ִ� ������
	public User(String userId, String userPwd, String userName) {
		
		// ���ʻ� �Ű����� �������� �Ű������� �ʵ��� ��ġ�ǰԲ� �ۼ���
		
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; // user03�� ����
		
	}
	
	// ��ü ������ ���ÿ� ��� �ʵ忡 ���ؼ� ���� ���ϴ� ������ �� ���� �ʱ�ȭ���� �� �� �� �ִ� ������, �ʼ��� �ƴ����� ������ ���ϹǷ� ��а� ����� ���� �� ���� ��!
	public User(String userId, String userPwd, String userName, int age, char gender) {
		
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		// ���� ���� �ߺ��Ǵ� ������ �ʱ�ȭ�ϴ� ������ ���� ���
		// �ش� �ڵ带 ��ü�� �� �ִ� �����ڸ� ȣ�� ������
		// => this(== ���� �ּҰ�) ������ ȣ���ϸ� ��
		// ���ǻ���: this ������ ȣ�� �ÿ��� �ݵ�� ������ ���� ù �ٿ� ����ؾ� ��
		this(userId, userPwd, userName);
		
		this.age = age;
		this.gender = gender; // user04�� ����
		
		// this(userId, userPwd, userName);
		// Constructor call must be the first statement in a constructor: this �����ڴ� ù �ٿ� ����ؾ� ��
	}
	
	
	// �޼ҵ��
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return "userId: " + userId + ", userPwd: " + userPwd + ", userName: " + userName +
				", age: " + age + ", gender: " + gender;
	}

}

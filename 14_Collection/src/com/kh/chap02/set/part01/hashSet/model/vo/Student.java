package com.kh.chap02.set.part01.hashSet.model.vo;

public class Student {
	
	// �ʵ��
	private String name;
	private int age;
	private int score;
	
	// �����ں�
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	// �޼ҵ��
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	// ������ ��ü�� �Ǻ��� ���� �ʰԲ� equals �޼ҵ�, hashCode �޼ҵ� �������̵�
	// hashCode �޼ҵ� �������̵�: �ʵ尪�� ������� �������� �߻����Ѽ� ��ȯ�ϵ��� ������
	@Override
	public int hashCode() {
		// "����43100" => ��� �ʵ��� ������ �ϳ��� ���ڿ��� ���̾ �ؽ��ڵ� �߻�
		String str = name + age + score;
		return str.hashCode();
	}
	
	// equals �޼ҵ� �������̵�: ��� �ʵ��� ������ ��� ��ġ�ؾ߸� true ��ȯ��Ű���� ������
	@Override
	public boolean equals(Object obj) {
		
		// �ڵ� �ϼ� ver.
		if (this == obj) // �ּҰ��� ��ġ�ϸ� ������ true ��ȯ
			return true;
		if(obj == null) // �� ����� �ּҰ� null�̶�� ���ʿ� �˻��� ��ġ�� ��� false ��ȯ
			return false; 
		if(getClass() != obj.getClass()) // ���� Ÿ�԰� �� ����� Ÿ���� ���ʿ� �ٸ��ٸ� �˻��� ��ġ�� ��� false ��ȯ
			return false;
		
		// Student��ü.equals(����Student��ü);
		
		// Student ��ü          vs          Object ��ü
		//    this                        obj
		
		// �켱������ �Ű������� ���� obj�� Student Ÿ������ �ٿ�ĳ����
		Student other = (Student)obj;
		
		// ���� ����� ver.
		// name, age, score �ʵ尪 ��� ��ġ�ϴ��� ��
		// this.name = equals(other.name)
		// this.age == other.age
		// this.score == other.score
		if((this.name.equals(other.name)) && (this.age == other.age) && (this.score == other.score)) {
			return true;
		} else {
			return false;
		}
		
	}
	
}

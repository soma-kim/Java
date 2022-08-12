package kh.hw1.model.vo;

public class Student extends Person {
	
	// �ʵ��
	private int grade; // �г�
	private String major; // ����
	
	// �����ں�
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	// �޼ҵ��
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String major() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + ", grade: " + grade + ", major: " + major;
	}

}

package kh.hw1.model.vo;

public class Student extends Person {
	
	// 필드부
	private int grade; // 학년
	private String major; // 전공
	
	// 생성자부
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	// 메소드부
	
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

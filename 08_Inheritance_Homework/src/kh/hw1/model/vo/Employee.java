package kh.hw1.model.vo;

public class Employee extends Person {
	
	// 필드부
	private int salary; // 급여
	private String dept; // 부서
	
	// 생성자부
	public Employee() {
		
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	// 메소드부
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + ", salary: " + salary + ", dept: " + dept; 
	}

}

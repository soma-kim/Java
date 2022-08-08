package kh.hw1.run;

import java.util.Scanner;

import kh.hw1.model.vo.Employee;
import kh.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		
		// name, age, height, weight, grade, major
		
		Student[] arr1 = new Student[3];
		
		arr1[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		arr1[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		arr1[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(int i = 0; i < arr1.length; i++) {
			
			System.out.println(arr1[i].toString());
			
		}
		
		System.out.println("-----------------");
		
		// name, age, height, weight, salary, dept
		
		Employee[] arr2 = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			
				System.out.print("사원 이름: ");
				String name = sc.nextLine();
				
				System.out.print("사원 나이: ");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.print("사원 키: ");
				double height = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("사원 몸무게: ");
				double weight = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("사원 급여: ");
				int salary = sc.nextInt();
				sc.nextLine();
				
				System.out.print("사원 부서: ");
				String dept = sc.nextLine();
				
				arr2[count] = new Employee(name, age, height, weight, salary, dept);
				
				System.out.print("계속 추가하시겠습니까?(Y/N): ");
				
				count++;
				
				char answer = sc.nextLine().charAt(0);

				if (answer == 'Y' || answer == 'y') {
					
					continue;
				}

				else if (answer == 'N' || answer == 'n'){
					for(int j = 0; j < count; j++) {
						System.out.println(arr2[j].toString());
												
					}
					return;

				}
				else {
					System.out.println("다시 입력하세요");
					
					continue;
				}
				
				
				
				
			
			
		}
		
		
		
	}
	

}

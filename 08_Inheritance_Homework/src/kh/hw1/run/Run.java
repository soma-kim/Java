package kh.hw1.run;

import java.util.Scanner;

import kh.hw1.model.vo.Employee;
import kh.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		
		// name, age, height, weight, grade, major
		
		Student[] arr1 = new Student[3];
		
		arr1[0] = new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��۰��а�");
		arr1[1] = new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�");
		arr1[2] = new Student("������", 23, 167.0, 45.0, 4, "������Ű��а�");
		
		for(int i = 0; i < arr1.length; i++) {
			
			System.out.println(arr1[i].toString());
			
		}
		
		System.out.println("-----------------");
		
		// name, age, height, weight, salary, dept
		
		Employee[] arr2 = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			
				System.out.print("��� �̸�: ");
				String name = sc.nextLine();
				
				System.out.print("��� ����: ");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.print("��� Ű: ");
				double height = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("��� ������: ");
				double weight = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("��� �޿�: ");
				int salary = sc.nextInt();
				sc.nextLine();
				
				System.out.print("��� �μ�: ");
				String dept = sc.nextLine();
				
				arr2[count] = new Employee(name, age, height, weight, salary, dept);
				
				System.out.print("��� �߰��Ͻðڽ��ϱ�?(Y/N): ");
				
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
					System.out.println("�ٽ� �Է��ϼ���");
					
					continue;
				}
				
				
				
				
			
			
		}
		
		
		
	}
	

}

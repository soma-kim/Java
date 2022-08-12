package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Student;

// �����ؾ� �� ��: ��ü�� ��ư� �������� ����! ���� ������ "����"�� ���̴�!
public class Run {


		
		/*
		 * 1. ��ü������: "��ü"�� "����(�߱�)"�ϴ� ���� "��ü�߽�"���� ���ư���.
		 * 
		 * 2. ��ü��?: ������ �ǹ̷δ� ���Ǽ��迡 ���������� �����ϴ� (������ �ְ� �ǹ̰� �ִ�) ��� �͵��� �ǹ�(����, ����, �繰, ����, ...)
		 * 
		 * 3. ��ü���� ���α׷���: ���Ǽ����� �������� �����(��ü)���� ��ȣ�ۿ�(����)
		 * 					  => ���Ǽ����� �͵��� ���α׷����� ���� ���󼼰�(�ڵ�)�� �����ϴ� �� 
		 * 						  ��) ���ͳ� ���θ� ����
		 * 
		 * 4. ���� �����ϰ��� �ϴ� ���α׷����� ��ü�� ����� ���ؼ���(�����ϱ� ���ؼ���)
		 * 	  => "Ŭ����"��� Ʋ�� ���� ������ ��
		 * 		(�� ��ü���� �Ӽ�(����)���� ��Ƴ� �� �ִ� �׸����� ���� ����)
		 * 		���? => 1�ܰ�: �߻�ȭ + 1.5�ܰ�: ������ ���� ���α׷����ϱ� + 2�ܰ�: ĸ��ȭ
		 * 
		 * 5. �߻�ȭ ����
		 * 	  1) ���� �����ϰ��� �ϴ� ���α׷����� �ʿ��� ��ü���� ������ �� ��
		 * 		  ��) �л��������α׷� => "�л�"��ü: ȫ�浿�л�, �踻���л�, �ڸ����л�, ...
		 * 	  2) �� ��ü���� ������ �ִ� �������� �Ӽ�, ��ɵ��� ��� ������ ��
		 * 		  ��) �̸�, ����, ����, ����ó, �ּ�, ...
		 * 	  3) �׷��� ������ �͵��� ������ ���� ������ ���α׷��� "��������" ������ �°Բ� ���ʿ��� �Ӽ�, ��ɵ��� �����ؼ� �߷�����
		 * 		  ��) �л��� "����"�� ���ַ� �����Ѵٸ�: �̸�, ����, �⼮�ϼ�, ...
		 * 		  ��) �л��� "�ǰ�"�� ���ַ� �����Ѵٸ�: �̸�, ����, ����, Ű, ������, �Ź� ������, �޸��� �ӵ�, ���� ����Ű�� ����,... 
		 * 	  4) ���������� �߷��� �Ӽ����� ������ � �ڷ����� � �̸����� ����� ���� ������ ����
		 * 		  ��) String name; // �̸�
		 * 			char grade; // ����
		 * 			int count; // �⼮�ϼ�
		 * 
		 * -------------------------- ���� --------------------------
		 *		�л��������α׷�
		 *		1) �л� ���� ��ü(ȫ�浿�л�, �迵���л�, �谩���л�, ...)
		 *		2) �������� �Ӽ� �� ��ɵ� �̾Ƴ��� (�̸�, ����, ����, �ּ�, ��ȭ��ȣ, Ű, �޸���ӵ�,
		 *								       �г�, ��, ���� ����, ���� ����, ������, �Ź� ������, �Ӹ���,
		 *								       ���� �ܴ�, ���� ���Ŵ�, ���� ����, ���� �Դ´�, ...) - ������ ���� �� ����
		 *		3) �������� ������ �´� �Ӽ��鸸 �ԾƳ���
		 *		      �л� "��������"�� �����ϰ� �ʹٸ�: �̸�, ����, ����, �ּ�, ��ȭ��ȣ, �г�, �ݸ� �߷�����.
		 *		      �л� "����"�� �����ϰ� �ʹٸ�: �̸�, �г�, ��, ��������, ���������� �߷� ����.
		 *		      �л� "�ǰ�"�� �����ϰ� �ʹٸ�: �̸�, Ű, �г�, ��, ������, ���� �ܴ�, ���� �Դ´�, ���� ���Ŵ�, ... �� �߷�����
		 *		=> �߷����� ������ ���� �ٽ����� ����!
		 *		4) ���������� �츮�� �߷��� �� �̸�, ����, Ű��� ���� �Ͽ�
		 *		      � �ڷ����� � ������ ǥ������ ������ ����
		 *		      �̸�: String name;
		 *		      ����: int age;
		 *		      Ű: double height;
		 *
		 * 6. ������ ������ �͵��� ������ ���������� ���α׷����� �� ��
		 * 		1) "����"���� ������ ���α׷����� �ϰ� �ȴٸ�...
		 * 			����: �ϳ��� �ڷ����� �ϳ��� ���� ������ �� �ִ� ����
		 * 			"ȫ�浿"�̶�� ��ü �ϳ��� ����� ���ؼ� 
		 * 			=> String name1 = "ȫ�浿"; int age1 = 20; double height1 = 168.9;
		 * 			=> String name2 = "�迵��"; int age2 = 21; double height2 = 157.1;
		 * 			=> String name3 = "�ڸ���"; int age3 = 22; double height3 = 183.3;
		 * 			...
		 * 			=> ���� ���� �л��� �����ϴ� ���α׷��� �����ؾ� �� ���
		 * 			      ��õ ���� ������ ���ܳ� ��! �����ϱ� ������ ����...
		 * 
		 * 		2) "�迭"�� �̿��ؼ� ���α׷����� �ϰ� �ȴٸ�...
		 * 			�迭: �ϳ��� �ڷ����� ���� ���� ������ ������ �� �ִ� ����
		 * 			�л����� �̸��� ������ �� �ִ� �迭
		 * 			=> String[] names = {"ȫ�浿", "�迵��", "�ڸ���", ...};
		 * 			�л����� ���̸� ������ �� �ִ� �迭
		 * 			=> int[] ages = {20, 21, 22,...};
		 * 			�л����� Ű�� ������ �� �ִ� �迭
		 * 			=> double[] heights = {168.9, 157.1, 183.3, ...};
		 * 			=> ������ ���� �ͺ��ٴ� �ξ� ���� ����
		 * 			=> ���࿡ �л� �� ���� ������ �´ٸ�? (�迭�� ũ�⸦ �ٲ��� ���ϱ� ������ �迭�� �ٽ� �����, ������� ������ �� �� ��� ��)
		 * 			=> ���࿡ �л� �� ���� ������ ���ٸ�? (�� �л��� ������ ����� �ڿ� �ִ� ��� �������� �� ĭ�� ������ ��� ��� ��)
		 * 										   �ش� �ε����� ���� ��Ȯ�ϰ� ���� ������� ������ ��Ȯ�ϰ� ������ �� ����
		 * 		3) �׷��� ���� ������ "����ü"��� ����
		 * 		      ����ü: �� ���� ���� �ٸ� �ڷ����� ���� �� ������ �� �ִ� ������ �迭 ���� ����
		 * 				  String ���� �����ϰ�, int ���� �����ϰ�, double ���� ����
		 * 				    ������ �迭 ���� �ڷ����� �ϳ� ������! => �װ� �ٷ� "Ŭ����"
		 * 
		 * 			*Ŭ����: �� ��ü���� �Ӽ� �������� ��Ƴ��� �׸����� ���� ����(Ʋ)
		 * 					=> �޼ҵ� ���ַ� �̷���� Ŭ����: ��� ������ Ŭ����(Controller) => controller ��Ű�� ���� ����
		 * 					=> ������ ��� �뵵�� ������� Ŭ����: VO(Value Object) => model.vo ��Ű�� ���� ����
		 */
	
	public static void main(String[] args) {
		
		// 1. �߻�ȭ
		// 2. student Ŭ���� �����
		
		// �������� ������ ���α׷����� �Ѵٸ�?
		// ȫ�浿 �л��� ǥ���ϰ� �ʹ�!
		/*
		String name1 = "ȫ�浿";
		int age1 = 20;
		double height = 168.7;
		*/
		
		// 3. Student Ŭ����(�׸�, Ʋ)�� ���� ��ü ����
		// ��ü == �׵��� �츮�� "�뺯�� �̸�"���� �ҷ��� �� 
		// ��ü ���� ����
		// [ ǥ���� ]
		// Ŭ������ ��ü�� = new Ŭ������();
		
		// ȫ�浿 �л��� ��ü�� �����
		Student hong = new Student(); // "����" ����(�޸��� heap ������ ���� �Ҵ�)
		
		// ������� ȫ�浿 �л��� ��ü�� ��� �ִ�
		// �� �ʵ�鿡 ���������� �����ؼ� ���� ����
		
		hong.name = "ȫ�浿";
		hong.age = 20;
		hong.height = 168.7;
		// => �ʵ忡 ���������� ���� �� .(�������ٿ�����)�� ���
		
		// �迵�� �л��� ��ü �����
		
		Student kim = new Student();
		
		kim.name = "�迵��";
		kim.age = 21;
		kim.height = 172.4;
		
		System.out.println(hong); // ǮŬ�������� �ּҰ�
		System.out.println(kim); // ǮŬ�������� �ּҰ�
		
		// arr[0] = 1;
		// System.out.println(arr[0]);
		// �̷� ������ ��� �ּҰ��� �ƴ� ���� ���ϴ� ���� ���� ���Դ� ���� �̿�!
		// => ��ü��.�ʵ��
		
		// xxx���� ���̴� xx���̰�, Ű�� xxx.xcm�Դϴ�.
		
		System.out.printf("%s���� ���̴� %d���̰�, Ű�� %fcm�Դϴ�.\n", hong.name, hong.age, hong.height);
		System.out.printf("%s���� ���̴� %d���̰�, Ű�� %fcm�Դϴ�.", kim.name, kim.age, kim.height);
		
		// �� �ʵ忡 ���������� �����ؼ� ���� �����ϰ�, ���� ��ȸ�ϴ� ��
		// ���������� ���� �� �ʵ忡 �����ؼ� ���� �����ϰų� ��ȸ�� ��� ���� ������ ���� �� ����
		// => ��ü������ ���� ��Ģ �� �ϳ��� "��������" => ĸ��ȭ �۾��� ���ؼ� ����
		
	}

}
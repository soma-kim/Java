package com.kh.chap01.list.part01.hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap01.list.part01.hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		// �÷����� �غ�: �ش� �÷��� ��ü ����
		HashSet<String> hs1 = new HashSet<>();
		
		// 1. �� �߰�: add(�߰��� ��)
		// Set�� ���ʿ� �ε��� ������ ���� ������ ������ �ִ� ĭ�� �������� ����!
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add("�ݰ����ϴ�.");
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���"));
		hs1.add(new String("������"));
		// hs1.add(50); // int --> Integer Ÿ������ AutoBoxing �ż� �� ��
		// HashSet�� <String>���� ���׸� ���� �� ������ ��!
		
		System.out.println(hs1); // ���� ���� ���� X, �ߺ� ���� X
								 // ���Ǯ�� ���� ����ó�� �����ϸ� ��!
								 // [50, �ȳ��ϼ���, ������, �ݰ����ϴ�.]
		
		// 2. ũ�� ���ϱ�: size()
		// "Set���� index ������ �����Ƿ�" Listó�� size() -1�� index ���̸� ���� �� ����
		System.out.println(hs1.size()); // 4
		
		// ����: get(int index)
		// �ش� �ε��� ���� ���� => Set�迭������ �� �� ���� �޼ҵ�
		
		// 3. �� ����: remove(�����Ұ�)
		hs1.remove("������");
		System.out.println(hs1); // [50, �ȳ��ϼ���, �ݰ����ϴ�.]
		
		// 4. ��� �� ����: clear()
		hs1.clear();
		System.out.println(hs1); // []: ��� �ִ� ����
		
		// 5. ��� �ִ��� Ȯ��: isEmpty()
		System.out.println("�ؽü��� ��� �ֽ��ϱ�?: " + hs1.isEmpty()); // true
		System.out.println("========================================");
		
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student("����", 43, 100));
		hs2.add(new Student("�踻��", 26, 80));
		hs2.add(new Student("ȫ�浿", 24, 40));
		hs2.add(new Student("����", 43, 100));
		
		System.out.println(hs2); // ���� ���� ���� X
		// [Student [name=�踻��, age=26, score=80], Student [name=����, age=43, score=100], Student [name=����, age=43, score=100], Student [name=ȫ�浿, age=24, score=40]]
		// �ߺ��� "����"�� ���� ����  2�� ��
		System.out.println(hs2.size()); // 4
		// => ��? ���� ��ü�� �Ǵ��� ���� �ʾұ� ������ �ߺ��ؼ� �� �÷� ����
		// Set�迭 Ư¡: ���� �߰��� ������ equals() �޼ҵ�, hashCode() �޼ҵ�� �ּҰ� �� �Ŀ� ���� ��ü���� �Ǵ� �� �ƴϸ� �׋� �߰��� �Ͼ
		
		// HashSet�� ��ü�� ���� �� ���������� equals()�� ����
		// ���� hashCode()���� ��ġ�ϴ����� ����
		// => equals() �޼ҵ� ����� true�̰�, hashCode() ���� ��ġ�Ѵٸ� ���� ��ü�� �ǴܵǾ� �߰��� ���� ����(�ߺ� ���� �Ұ�)
		
		// Object Ŭ������ equals(): �� ��ü�� �ּҰ��� ������ ���ؼ� ��ġ�ϸ� true / ��ġ���� ������ false ��ȯ
		// Object Ŭ������ hashCode(): �ش� ��ü�� �ּҰ��� ������� ������ ���� �߻����� ��ȯ
		
		// String Ŭ������ equals(): �� ���ڿ��� ���빰 ��
		// String Ŭ������ hashCode(): �ش� ���ڿ��� ���빰�� ������� ������ �� �߻�
		
		// ��ü�� �� �ʵ尪�� ��ġ�ϸ� �׳� ������ ��ü�� �Ǵ��� �ż�
		// �ߺ� ������ �� �ǰԲ� �ϰ� �ʹٸ� equals() �޼ҵ�, hashCode() �޼ҵ带 �������̵� �ϸ� �� (Student Ŭ������)
		
		// Student Ŭ������ equals(): �� �ʵ� ���� ��ġ�ϸ� true / �ϳ��� ��ġ���� �ʴ´ٸ� false ��ȯ
		// Student Ŭ������ hashCode(): �� �ʵ尪 ������� ������ ���� �߻����Ѽ� ��ȯ
		
		// �ٽ� ����� ����
		// [Student [name=ȫ�浿, age=24, score=40], Student [name=�踻��, age=26, score=80], Student [name=����, age=43, score=100]]
		// 3

		// �ּҰ��� �ƴ� �ʵ尪 �������� �ߺ� �Ǻ��� �� �ְԲ� �������̵� �� ���̱⿡ ���� 3���� �ߺ� ���� ����!
		
		
		System.out.println("========================================");
		
		// Set => ������ ��ü�� ����Ǿ� ���� => index ������ ����
		// => �ݺ��� Ȱ���� �Ұ�
		
		// �׷� ��� �ִ� ��ü�� ���������� �����ϰ��� �� ��?
		
		// 1. ���� for�� ���(for each��)
		// => for(�����޾��ٺ������� : �÷��Ǹ�)
		for(Object s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("========================================");
		
		// 2. ArrayList�� Set�� ��� �ִ� ������ ��� �Ű� �� �� ArrayList �ݺ��� ����
		
		// Set�� ��� �ִ� ������ ArrayList�� �ű�� ��
		
		// ��� 1. �� ArrayList ��ü ���� �� addAll �޼ҵ�� Set�� ��� �ִ� ������ ��°�� �߰�
		/*
		ArrayList list = new ArrayList();
		list.addAll(hs2); // ����Ʈ hs2�� ��� �ִ� ������ ��°�� �߰���
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		// ��� 2. ArrayList ��ü ���� �� �Ű������� Set�� �ѱ�� ���
		
		ArrayList<Student> list = new ArrayList<>(hs2); // hs�� ��� ��ü���� ��� �߰��� ä�� ����Ʈ ������ 
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Student [name=ȫ�浿, age=24, score=40]
		// Student [name=�踻��, age=26, score=80]
		// Student [name=����, age=43, score=100]

		System.out.println("========================================");
		
		// 3. Iterator (�ݺ���)�� �̿��� ���
		// => Set�� ���� ���빰�� �ݺ������� �����Ͽ� ���� �� �� �ְԲ� �����ִ� ����
		
		// �켱������ HashSet�� ��� �ִ� ��ü���� Iterator�� �Ű� ��� ����
		Iterator<Student> it = hs2.iterator();
		
		// Iterator�� ��� �ִ� ��ü���� �ݺ����� Ȱ���Ͽ� �ϳ��� �̾Ƴ���
		while(it.hasNext()) { // it�� �� �̻� �� �� ���� ���� �ִ���? ����� �޼ҵ�
			
			// �� �̻� ���� ���� ���� �ִٸ� next() �޼ҵ�� �̾Ƴ���
			System.out.println(it.next());
		} // StringTokenizer�� ����� ����
		
		// .iterator() �޼ҵ�: List �迭�� Set �迭������ ��� ������ �޼ҵ�
		//					 (Map �迭������ ��� �Ұ����� �޼ҵ�)
		
	}

}

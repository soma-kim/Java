package com.kh.chap02.string.controller;

//String�� Ư��
public class A_StringPoolTest {
	
	// 1. �����ڸ� ���ؼ� String ������ ���ڿ� ���
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 /* .toSrtring */); // �ּҰ�
		System.out.println(str2);
		// => String Ŭ������ toString �޼ҵ尡 ���� ��� ���빰�� ����� �� �ֵ��� �������̵� �Ǿ� ����
		
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322 �� ����??
		// => String Ŭ������ hashCode �޼ҵ尡 ���� ��� ���빰�� ������� �������� �����ؼ� ������ �� �ֵ��� �������̵� �Ǿ� ����
		
		// ���� �ּҰ��� ���� �˰� �ʹٸ�
		// System.identityHashCode(��ü��);
		System.out.println(System.identityHashCode(str1)); // 1829164700
		System.out.println(System.identityHashCode(str2)); // 2018699554
		// str1�� str2�� �ּҰ��� �ٸ���
		
		// ���ڿ� ��
		System.out.println(str1 == str2); // == ���� ���� ���� �ּҰ� ��, false
		
		System.out.println(str1.equals(str2)); // true
		// => ���� Object Ŭ�������� �����ϴ� equals �޼ҵ�� �ּҰ��� ��ġ�ϴ��� ���ϴ� �޼ҵ�
		// => String Ŭ������ equals�� ���빰 ���� �񱳸� �� �� �ֵ���
		 
	}
	
	// 2. ���ڿ��� ���ͷ��� ����
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1); // hello
		System.out.println(str2); // hello
		
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		
		System.out.println(System.identityHashCode(str1)); // 1829164700
		System.out.println(System.identityHashCode(str2)); // 1829164700
		
		System.out.println(str1 == str2); // �ּҰ� ��
		// => ��¥ �ּҰ��� ����...?
		
		// ���ڿ��� ������ �� �����ڸ� ���ؼ� ����� ���
		// : �Ź� �����Ǵ� ���빰�� ������ ���� �ٸ� ������ ���� ������
		// ���ͷ��� �����ؼ� ����� ��
		// : �Ź� �����Ǵ� ���빰�� Heap ���� �ȿ� StringPool(���Ǯ)�� ������
		// => StringPool ������ Ư¡: ������ ���ڿ��� ���� �Ұ�
		
		// �Һ�Ŭ����(������ �ʴ� Ŭ����)
		
		}
		
	public void method3() {
		String str = "hello";
		System.out.println(System.identityHashCode(str)); // 1829164700
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str)); // 2018699554
		
		str += "abc"; //str = str + "abc";
		System.out.println(System.identityHashCode(str)); // 1311053135
		
		// String ��ü�� �ѹ� �����Ǹ� �޸� ������ ���빰�� ������ ����
		// => �Һ� Ŭ������� �θ�
		
		// ������ ���Ǯ�� ������ ���� ���ڿ����� ������ �ݷ��Ͱ� �˾Ƽ� ������ ��
		// �Һ�Ŭ������� �ؼ� ���빰�� �����Ǵ� �� �ƴ϶� �Ź� ���ο� �ּҰ��� ������
		
	}
}

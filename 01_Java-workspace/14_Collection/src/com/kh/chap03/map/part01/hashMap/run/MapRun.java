package com.kh.chap03.map.part01.hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03.map.part01.hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		// �÷����� ���� ������ ���� ��
		// List�� Set �迭�� Collection�� ������ Ŭ������
		// => add, get, ... �޼ҵ� Ʋ�� ������ ����
		
		// Map �迭�� Collection�� ������ Ŭ������ �ƴ�
		// => �޼ҵ� Ʋ�� ���ݾ� �ٸ� ������
		// Ű + ��� ��Ʈ��!
		
		// �÷����� �̿��� �غ�: �÷��� ��ü ����
		HashMap<String, Snack> hm = new HashMap<>(); // ��� �ִ� ����
		
		// 1. put(K key, V value): map ������ key + value ��Ʈ�� �߰��� �ִ� �޼ҵ�
		// ���׸� ���� �� �� ��� key��, value���� Object Ÿ������ ����
		
		// hm.put(key, value);
		hm.put("������", new Snack("���ڸ�", 1500));
		hm.put("ĭ��", new Snack("�ܸ�", 600));
		hm.put("�����", new Snack("§��", 500));
		hm.put("��������Ĩ", new Snack("§��", 500));
		// hm.put("����", 30); // ���׸� �����߱� ������ 30 ���� �� ���� ��
		
		System.out.println(hm); // {Ű=���, Ű=���, ...}
								// ���� ���� ���� X, �ߺ��� ������ key(value ���� �����ϴٰ� �ص� key���� �ߺ����� ������ �� �����)
		// {������=Snack [flavor=���ڸ�, calory=1500], �����=Snack [flavor=§��, calory=500], ��������Ĩ=Snack [flavor=§��, calory=500], ĭ��=Snack [flavor=�ܸ�, calory=600]}
		
		hm.put("�����", new Snack("�ſ��", 700));
		System.out.println(hm);
		// {������=Snack [flavor=���ڸ�, calory=1500], �����=Snack [flavor=�ſ��, calory=700], ��������Ĩ=Snack [flavor=§��, calory=500], ĭ��=Snack [flavor=�ܸ�, calory=600]}
		// �ߺ��� key���� �����ϸ� �ش� ���� value���� ���ο� value ������ �������
		
		// 2. get(Object key): V => �÷��ǿ��� �ش� Ű���� value���� �����ִ� �޼ҵ�
		// key���� �����ؼ� value���� ������ ��
		
		System.out.println(hm.get("������"));
		// Snack [flavor=���ڸ�, calory=1500]
		System.out.println(hm.get("������"));
		// null
		// ���� �������� �ʴ� key���� ������ ��� null�� ��ȯ��
		
		// Object snack = hm.get("ĭ��");
		Snack snack = (Snack)hm.get("ĭ��"); // ���׸� ������ ���� ������ �Ź� ����ȯ �ؾ� ��!
		System.out.println(snack);
		//Snack [flavor=�ܸ�, calory=600]
		
		// 3. size(): �÷��ǿ� ��� �ִ� ���� ���� ��ȯ
		System.out.println("size: " + hm.size());
		//size: 4
		
		// 4. replace(K key, V value): �÷��ǿ� �ش� key ���� ã�Ƽ� ���� ���޵� value�� ������� �ִ� �޼ҵ�
		hm.replace("��������Ĩ", new Snack("�̳�§��", 1000));
		System.out.println(hm);
		// {������=Snack [flavor=���ڸ�, calory=1500], �����=Snack [flavor=�ſ��, calory=700], ��������Ĩ=Snack [flavor=�̳�§��, calory=1000], ĭ��=Snack [flavor=�ܸ�, calory=600]}
		
		// ����: put �޼ҵ�� replace �޼ҵ�� ������ �ٸ�
		// => put �޼ҵ�� ���� �Ű������� ������ Ű���� �̹� ������, ������� ���� ����� ����������
		//    ���� �Ű������� ������ Ű���� ���ٸ�, ������� �߰��� �ִ� ����(�߰��� ������ ����)
		// => replace �޼ҵ�� ���ʿ� �Ű������� Ű���� ������ �� �̹� �ִ� Ű���� �����Ͽ� �ش� ������� �ٲٴ� �� ���� ���� 
		
		// 5. remove(Object key): �÷��ǿ� �ش� key���� ã�Ƽ� key + value ��Ʈ�� ���� �ִ� �޼ҵ�
		// key���� �����ؼ� ����� �ش� ������� �Բ� ������
		hm.remove("��������Ĩ");
		System.out.println(hm);
		// {������=Snack [flavor=���ڸ�, calory=1500], �����=Snack [flavor=�ſ��, calory=700], ĭ��=Snack [flavor=�ܸ�, calory=600]}
		
		System.out.println("==============================");
		
		// ���������� hashMap�� ��� �ִ� �Ϳ� �����ϰ��� �� ��
		// Map�迭�� index�� ���� ������ �Ϲ� for�� ��� �Ұ�
		// key + value �� ��Ʈ�� ��� �ִ� �����̱� ������ ���� for���� ��� �Ұ�
		/*
		for( : hm) {
			
		}
		*/
		
		// List�� Map�� �ٸ� �迭�̱� ������ ArrayList�� �Ű� ���� �Ŀ� �ݺ��� ��� �Ұ�
		// ArrayList list = new ArrayList(hm); => �Ұ�
		// ArrayList list = new ArrayList();
		// list.addAll(hm); => �Ұ�
		
		// Iterator => .iterator() �޼ҵ带 �̿��Ͽ� ���� Iterator�� �ű��
		// .iterator() �޼ҵ�� List�� Set �迭������ ����� �� �ִ� �޼ҵ�� �Ұ��� 
		// Iterator it = hm.iterator();
		
		// ----------- �׷� ��� �ؾ� ���������� ������ �� ������?  -----------
		
		// "Map�� Set���� �ٲٴ� ����"�� �켱������ �����ϸ�
		// => �츮�� �Ʊ� ����� Set �迭�� �ݺ��� ������ 3���� ����� ��� Ȱ�� ��������
		
		// Map�� Set���� �ٲ� �ִ� �޼ҵ� 2����
		// HashMap => Set �迭 => Iterator
		//						�� ���� ���� for��, ArrayList �̿��ϴ� ��� �ᵵ �����ϳ� Iterator�� ���� ������� �ϴ� .iterator�� ������ ��!
		
		// 1. keySet() �޼ҵ带 �̿��ϴ� ���
		// => Map�� ��� �ִ� Ű���� �߷����� Set���� ��ȯ���� �ִ� �޼ҵ�
		
		// 1) hm�� �ִ� key�鸸 Set�� ��� �ֱ�
		Set<String> keySet = hm.keySet();
		
		// 2) 1�� �������� �۾��� keySet�� Iterator�� ���
		Iterator<String> itKey = keySet.iterator();
		
		// 3) �ݺ��ڿ� ��� �͵��� ���������� �̱�(�ݺ��� ���)
		while(itKey.hasNext()) {
			// System.out.println(itKey.next());
			// Ű���� ��µ�
			// ������
			// �����
			// ĭ��
			
			String key = (String)itKey.next();
			Snack value = /* (Snack) */ hm.get(key);
			// ���׸� ���� �Ŀ��� ���� Snack ��ü�� ����ȯ �� ���� �ʾƵ� ��
			
			System.out.println(key + " = " + value);
			// ������ = Snack [flavor=���ڸ�, calory=1500]
			// ����� = Snack [flavor=�ſ��, calory=700]
			// ĭ�� = Snack [flavor=�ܸ�, calory=600]
			
			// ����. �� �̻� �̾Ƴ� ��Ұ� ���µ� itKey.next() �޼ҵ� ȣ�� ��
			// System.out.println(itKey.next());
			// NoSuchElementException
			
			System.out.println("==============================");
			
			// 2. entrySet() �޼ҵ带 �̿��ϴ� ���
			// => Entry��� ���� ���� �÷� Key + Value ��Ʈ�� ��� Set�� ��� ��
			
			// 1) hm�� �ִ� key + value ��� Entry ���·� Set�� ���(Entry: ��������)
			Set<Entry<String, Snack>> entrySet = hm.entrySet();
			
			// 2) entreySet�� �ִ� �͵��� Iterator�� �Ű� ���
			Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
			// Entrey �ȿ� String, Snack���� ���� ���׸� ������ �����ϰ� ��
			
			// 3) �ݺ����� �̿��ؼ� ���������� �̱�
			while(itEntry.hasNext()) {
				// System.out.println(itEntry.next());
				
				Entry<String, Snack> entry = /* (Entry)*/ itEntry.next();
				// Entry���� ������ <String, Snack>�� ����� ���̹Ƿ� ���� ����ȯ �ʿ� ������
				String key2 = /* (String) */ entry.getKey();
				Snack value2 = /* (Snack)*/ entry.getValue();
				
				System.out.println(key2 + " = " + value2);
				// ������ = Snack [flavor=���ڸ�, calory=1500]
				// ����� = Snack [flavor=�ſ��, calory=700]
				// ĭ�� = Snack [flavor=�ܸ�, calory=600]
				// => ���׸� ���� ��/�Ŀ��� ��¹��� �ٲ��� ����!
				
			}
			
		}
		
	}

}

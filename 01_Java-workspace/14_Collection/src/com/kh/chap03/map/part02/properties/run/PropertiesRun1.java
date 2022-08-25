package com.kh.chap01.list.part02.properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap01.list.part01.hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		/*
		 * Properties: Map �迭 => key, value ��Ʈ�� ������
		 * 			      ��, Properties���� Ư¡�̶�� �Ѵٸ�
		 * 			   key, value ��� String Ÿ������ ���� ���� ����
		 */
		
		Properties prop = new Properties();
		
		/*
		prop.put("������", new Snack("���ڸ�", 1500));
		// String�� �ƴ� ���� ���� ��� ������ Map �迭�� �����ϰ� put �޼ҵ�� key + value ��Ʈ�� ���� �� ����
		
		System.out.println(prop);
		System.out.println(prop.get("������"));
		// ������ Map �迭�� �����ϰ� get �޼ҵ�� value ���� �ҷ��� �� ����
		
		// ��, �ַ� Properties�� ����ϴ� ����
		// Properties�� ��� �ִ� key + value�� ��Ʈ�� ���Ϸ� ����ϰų�, ���Ͽ� ��ϵǾ� �ִ� key + value�� ������ �� ��� �ַ� ����
		// => ���� ����¿� Ưȭ�� Ÿ���̱� ������ "���ڿ�" ���·� Ű�� ����� �����ϴ� ���� �����
		
		// Properties ���� �����ϴ� ���Ϸ� ����ϴ� �޼ҵ�: store(), storeToXML()
		//					        ���Ϸκ��� �Է¹޴� �޼ҵ�: load(), loadFromXML()
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			// ���������� ���� ����� �� String Ÿ���� �ƴ� �ٸ� Ÿ������ key, value�� �־� ������
			// ClassCastException�� �߻���
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// Properties�� put �޼ҵ� �̿� ��
		// Key, Value�� ��� Object Ÿ������ ���ǵǾ� �־ String�� �ƴ� �ٸ� ������ �� �� �ִµ�
		// setProperty �޼ҵ带 �̿��ϸ� key, value ��� String Ÿ������ �Ű������� ���� �� ����!
		
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		// {Map=Properties, List=ArrayList, Set=HashSet}
		// ���� ���� ���� X, key�� �ߺ� X, �ߺ��Ǿ value�� �������
		
		// Properties�� �� �� ������ ���� �߰��ϰ��� �� ��� setProperty �޼ҵ带 �����
		
		try {
			// 2. store(OutputStream os, String comments)
			// => Properties�� ��� key - value ������ ���Ϸ� ���
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
			// } catch (FileNotFoundException e) {
			// e.printStackTrace();
			
			// 3. storeToXML()
			// => Properties�� ��� key - value ������ xml ������ ���Ϸ� ���
			prop.storeToXML(new FileOutputStream("test.xml"), "properties Test");
			// xml: ��� ���α׷��� ���� ������ ���� �� Ż ���� Ȯ����
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// {Map=Properties, List=ArrayList, Set=HashSet}
		
		// 2. store ���� ���� test.properties ���Ͽ� ��ϵ� ����
		// #Properties Test
		// #Mon Aug 22 15:46:08 KST 2022
		// Map=Properties
		// List=ArrayList
		// Set=HashSet



	}

}

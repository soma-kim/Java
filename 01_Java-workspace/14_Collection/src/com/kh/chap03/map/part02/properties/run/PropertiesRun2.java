package com.kh.chap01.list.part02.properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		
		// ���Ϸκ��� �о�鿩�� Properties ��ü�� ��� �η���
		// �켱������ Properties ��ü���� �����ؾ� ��
		Properties prop = new Properties(); // ��� �ִ� ����: ()
		
		try {
		// 4. load(InputStream in)
		// => �ش� ���Ϸκ��� ���� key - value ��Ʈ�� �о�鿩 �ش� Properties ��ü�� ���� �־� �ִ� ����
			// prop.load(new FileInputStream("test.properties"));

			// } catch (FileNotFoundException e) {
			// e.printStackTrace();
			
			// 5. loadFromXML(InputStream in)
			// => �ش� xml ���Ϸκ��� ���� key - value ��Ʈ�� �о�鿩 �ش� Properties ��ü�� ���� �־� �ִ� ����
			prop.loadFromXML(new FileInputStream("test.xml"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// System.out.println(prop);
		// {List=ArrayList, Map=Properties, Set=HashSet}
		
		// 6. getProperty(String key): String value�� ������ ��
		// => String Ÿ���� Ű���� �����ϸ� String Ÿ���� ������� ����
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("Map"));
		System.out.println(prop.getProperty("Collection"));
		
		// ArrayList
		// HashSet
		// Properties
		// null
		// ���� Ű���� ������ ��� null�� ��ȯ��!
		
		/*
		 * .properties ������ ����ϴ� ���
		 * �츮�� ���� ���� �� �ش� ���α׷��� �⺻������ ������ �� ȯ�漳���� ���� ��������
		 * ������ .properties Ȯ���ڸ� ���� ���Ͽ� ��Ƶ�
		 * key - value ������ ���ڿ��� �ܺ� ���Ͽ� �����Ǹ鼭
		 * ���߿� �����Ǿ��� �� �����ڰ� �ƴ� �Ϲ� �����ڰ� �ս��� ȯ�漳���� ���õ� ������ �ٷ� �� �ְ� ��
		 * => JDBC ���� ����� ����
		 * => value�� 1�ٷ� ������ ��
		 * 
		 * .xml ������ ����ϴ� ���
		 * xml Ȯ���� ������ �پ��� ���α׷��� ���� ȣȯ�� ���ٴ� ������ �ְ�,
		 * value ������ ���� ���̾ ���� ���� ���Ͽ� ��� �� �ִ� ������ �ֱ� ������
		 * ���α׷����� ������ ����� �ܺ� ��ɹ����� ��� �� �� �ַ� ����
		 * => JDBC ���� ����� ����
		 * 
		 */

	}

}

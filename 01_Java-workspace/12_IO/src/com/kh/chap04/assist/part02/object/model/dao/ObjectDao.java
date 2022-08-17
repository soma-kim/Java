package com.kh.chap04.assist.part02.object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04.assist.part02.object.model.vo.Phone;

public class ObjectDao {
	
	// ���α׷� ---> �ܺ� ��ü(����)
	// ���
	
	public void fileSave() {
		
		// (���) FileOutputStream: ���Ͽ� �����͸� 1byte ������ ����� �� �ִ� ��� ��Ʈ��
		// + 
		// (����) ObjectOutputStream : ��ü ������ ����� �� �ִ� ���� ��Ʈ��
		// => "1bye" ¥�� ���� "���" ��Ʈ������ "1bye" ¥�� ��� "���" ��Ʈ���� ��� ��
		
		// �׽�Ʈ�� ��ü ����
		Phone ph = new Phone("������", 1300000);
		
		// 0. ��Ʈ�� ���� ���� �� null�� �ʱ�ȭ
		
		ObjectOutputStream oos = null;
		
		// 1. ��Ʈ�� ��ü ����(== ���� ��θ� ����ڴ�)
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phone.txt"));
			
			// 2. ���: ObjectOutputStram ��ü���� �����ϴ� writeObject() �޼ҵ� ���
			oos.writeObject(ph);
			
			// 3. �ڿ� �ݳ�(== ������θ� ���ڴ�) => �ݵ�� finally �� �ȿ� �ۼ�
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. �ڿ� �ݳ� (�ݵ��)
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	// ���α׷� <--- �ܺ� ��ü(����)
	// �Է�
	public void fileRead() {
		/*
		// FileInputStream: ���Ϸκ��� �����͸� 1byte ������ �о���̱� ���� ���Ǵ� ��� ��Ʈ��
		// +
		// ObjectInputStream: ��ü ������ �Է¹ޱ� ���� ���Ǵ� ���� ��Ʈ��
		
		// 0. ��Ʈ�� ���� ���� �� null�� �ʱ�ȭ
		ObjectInputStream ois = null;
		
		// 1. ��Ʈ�� ��ü ����(== ���� ��θ� �������)
		
		try {
			ois = new ObjectInputStream(new FileInputStream("phone.txt"));
			
			// 2. �Է�: ObjectInputStream ��ü���� �����ϴ� readObject() �޼ҵ� ���

				Phone ph = (Phone)ois.readObject(); // �������� ���� DownCasting
				System.out.println(ph);
			
			// 3. ���� ��� ����(�ݵ��) => finally ����
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try ~ with ~ resource ���� ����
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))) {
			
			Phone ph = (Phone)ois.readObject();
			System.out.println(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


}

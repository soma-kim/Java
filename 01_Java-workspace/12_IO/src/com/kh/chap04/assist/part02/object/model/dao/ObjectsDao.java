package com.kh.chap04.assist.part02.object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.chap04.assist.part02.object.model.vo.Phone;

public class ObjectsDao {
	
	// ���α׷� ---> �ܺ� ��ü(����)
	// ���
	
	public void fileSave() {
		
		// FileOutputStram + ObjectOutputStream (1byte¥�� ���� ���)
		
		// �׽�Ʈ�� ��ü �迭
		/*
		Phone[] arr = new Phone[3]; // [0] [1] [2]
		
		// �׽�Ʈ�� ������ ���
		arr[0] = new Phone("������", 1300000);
		arr[1] = new Phone("������", 1500000);
		arr[2] = new Phone("�ø���", 2000000);
		*/
		
		ArrayList<Phone> phoneList = new ArrayList<>();
		
		phoneList.add(new Phone("������", 1300000)); // 0�� �ε���
		phoneList.add(new Phone("������", 1500000)); // 1�� �ε���
		phoneList.add(new Phone("�ø���", 2000000)); // 2�� �ε���
		
		
		// try ~ with ~ resource �������� �� ť�� ����
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phones.txt"))){
			
			
			// ���: ObjectOutputStream ��ü���� �����ϴ� writeObject() �޼ҵ� ���
			// oos.writeObject(arr[0]);
			// oos.writeObject(arr[1]);
			// oos.writeObject(arr[2]);
			
			// �ݺ��� �̿��ؼ� ��������
			/*
			for(int i =0; i < arr.length; i++) {
				oos.writeObject(arr[i]);
				System.out.println(arr[i]);
			}
			*/
			
			// ArrayList�� ���� ����
			for(int i = 0; i < phoneList.size(); i++) {
				
				oos.writeObject(phoneList.get(i));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ���α׷� <--- �ܺ� ��ü(����)
	// �Է�
	
	public void fileRead() {
		
		// FileInputStream + ObjectInputStream
		
		Phone[] ph = new Phone[3];
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))) {
			
			// toString() �޼ҵ带 �������̵� �߱� ������ ���� ����ȯ ���� �ʰ� �ٷ� ����� ����
			// System.out.println(ois.readObject() /* .toString() */);
			// System.out.println(ois.readObject());
			// System.out.println(ois.readObject());
			// EOFExeption(End of file): ���� ������ ���������� �ڲ� ����ϰ��� �� �� �߻��ϴ� ����
			// => IOException�� �ڽ���
			// System.out.println(ois.readObject());
			
			// EOFException�� �߻��� �������� �ݺ��� ������
			// ���� �Ұ����� �����̱� ������ ��Ȯ�� ������ ���� �� ����
			
			while (true) { // �׷��� �ϴ��� ���� �ݺ�
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { // while�� ���ѹݺ� �ϴٰ� ������ EOFException�� �߻��ϴ� ���� �������� ����
			System.out.println("������ �� �о����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		// catch���� �� ������ ��µ� �� try ~ catch���� ���������� ������ �Ŀ��� ���α׷� ���ᰡ ��µ�
		System.out.println("���α׷� ����");
	}
	

}

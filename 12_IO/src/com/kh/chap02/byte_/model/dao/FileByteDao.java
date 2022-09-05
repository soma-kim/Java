package com.kh.chap02.byte_.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// �����Ͱ� �����Ǿ� �ִ� ����(�ܺ� ��ü)�� ���� �����ؼ� �����͸� ������ϴ� �뵵�� Ŭ���� 
// ��ɿ��� ����� ��Ű��: controller
// �����Ϳ� ���õ� ��Ű��: model
// �ܺ� �����Ϳ� ���� ������ ��Ű��: dao
public class FileByteDao {
	
	// ���α׷� ---> �ܺθ�ü(����)
	// ���: ���α׷� ���� �����͸� ���Ϸ� �������� (��, ���Ͽ� ����ϰڴ�. ���Ϸ� �����ϰڴ�.)
	public void fileSave() {
		
		// FileOutputStream: "����"�� �����͸� 1byte ������ ����ϴ� ��Ʈ��
		
		FileOutputStream fout = null; // 0�ܰ�! ���� ���� �� null �ʱ�ȭ
		
		try {	
			
			// 1. FileOutputStream ��ü ���� (== ���� ��� �����)
			// => �ش� ���ϰ� ���� ����Ǵ� ��θ� �������(���ϸ��� �Ű������� ������ ȣ��)
			// 	    �ش� ������ �������� �ʴ´ٸ� �ش� ������ �����Ǹ鼭 ���� ��ΰ� ������
			// 	    �����ϴ� �����̶�� ���� ��θ� �ٷ� ������ 

			fout = new FileOutputStream("a_byte.txt"/*, false */); // a_byte.txt�� �����ϱ� ���� �߻��� �� �ִٸ� ��� ������ ��
			// => ������ �ش� ������ ���� ��� �������
			// => �̾�� ���� ��쿡��? �Ű������� true�� ���� �Ѱ� �ָ� �� (��, �⺻���� false��)
			
			// 2. ���� ��η� �����͸� ���: write() �޼ҵ� ���
			// => 1byte ������ ���� ����: -128 ~ 127������ ����, ������ �Ұ�!(�ƽ�Ű�ڵ� ���� ���� �������� ����)
			//		(��, ���Ͽ� ��ϵǴ� �� �ش� ������ ������ ������: �ƽ�Ű�ڵ�)
			fout.write(97); // 'a'�� ���
			fout.write('b'); // 'b'�� ���
			// fout.write('��'); // 1byte¥�� ��ο� 2byte¥���� �ѱ��� ���� @��� ���·� ������ ��µ�!
							 // (����Ʈ ��Ʈ�����δ� ������)
			
			byte[] bArr = {99, 100, 101}; // 'c', 'd', 'e'�� ���
			fout.write(bArr);
			
			fout.write(bArr, 1, 2); // 'd', 'e'�� ���
			
			// 3. ��Ʈ���� �� �̿������� �ڿ� �ݳ��ϱ� (�ݵ��)
			// => ��, ������θ� ������
			// fout.close(); // ������ Ȥ�� ���ܰ� �߻����� ��� �� �ڸ��� ������ �� �� ���� ����! => finally ������� ��ġ �ٲ� ��
		
		
			} catch(FileNotFoundException e) { // try ~ catch ������ ó���� �ֱ�, �������� �ʴ� ��θ� �������� ��
				
			} catch (IOException e) { // ����� ��Ȳ���� ��� �������� �߻����� ��
				e.printStackTrace();
			} finally { // � ���ܰ� �߻��ϵ��� ���� �ݵ�� ������ ������ �ۼ��ϴ� ��
				
				// 3. ��Ʈ���� �� �̿������� �ڿ� �ݳ��ϱ� (�ݵ��)
				try {
					fout.close();
				} catch(IOException e) {
					e.printStackTrace();
				}

			}
	}
	
	// ���α׷� <--- �ܺθ�ü(����)
	// �Է�: ���Ϸκ��� �����͸� ������ ���ڴ� (��, �о���̰ڴ�)
	public void fileRead() {
		
		// FileInputStream: ���Ϸκ��� �����͸� 1byte ������ �Է¹޴� ��Ʈ��
		
		// 0. ���� ���� �� null�� �ʱ�ȭ
		FileInputStream fin = null;
		
		try {
			// 1. ��Ʈ�� ��ü �����ϱ� == ���� ��� �����
			fin = new FileInputStream("a_byte.txt"); // try ~ catch ��Ͽ� �ֱ� 
			// ���� ��� ����, �Է¹��� ������ �ݵ�� �����ϴ� ���ϸ����� �����ؾ� ��!
			
			// 2. �о���̱� == �Է¹ޱ�: read() �޼ҵ� ���
			// => ��, 1byte ������ �ϳ��� �о� ��
			/*
			System.out.println(fin.read()); // IOEcepton catch �� �߰��ϱ�
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			// ���� ���� ������ ���� fin.read() => -1 ��ȯ
			System.out.println(fin.read());
			System.out.println(fin.read());
			// ����� ���� ���ڷ�, �Է¹��� ���� ���ڷ� �޾���
			// �Է� �� (char)�� ���� ����ȯ �Ͽ� ���ڷ� �Է¹��� �� ����
			// println�� �ƴ� print�� ���̾ ��µ� ����
			*/
			
			// �ݺ�������  Ȱ���ϱ�
			
				// �������� ��µ�
				/* �޼ҵ带 �� �� ���� ������ �� �� ȣ��Ǵ� ������ ���� ���ϴ� ���� ���� �� ����
				while(fin.read() != -1) { // fin.read()�� ������� -1�� �ƴ� ��쿡�� �ݺ� ��������
					System.out.println(fin.read());
				}
				*/
				
				// �ذ��� 1. ���� �ݺ����� �Ź� ���� �˻� �ϱ�
				/*
				while (true) {
					
					int value = fin.read();
					
					if(value == -1) {
						break;
					}
					
					System.out.println(value);
				}
				*/
			
				// �ذ��� 2. ���ǽ� ���ο� ���� ���� ������ Ȱ���ϴ� ��� (����)
				int value = 0;
				while((value = fin.read()) != -1) {
					System.out.println(value);
				}
				
			// 3. ���� ��� ���� == �ڿ� �ݳ��ϱ� (������) => finally ���� �ۼ�
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 3. �� �� ��Ʈ�� ��ü �ݳ� 
			try {
				fin.close(); // try ~ catch ������� ����
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // ���� ���� Ŭ������ fileRead(); �Ϸ� ��
		

		
		
	}

}

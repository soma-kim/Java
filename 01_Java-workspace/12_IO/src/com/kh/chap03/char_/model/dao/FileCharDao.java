package com.kh.chap03.char_.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	// ���α׷� ---> �ܺ� ��ü(����)
	// ���
	public void fileSave() {
		
		// FileWriter: ���Ϸ� �����͸� 2byte ������ ����ϴ� ��Ʈ��
		
		// 0. ���� ���� �� null�� �ʱ�ȭ
		FileWriter fw = null; // import
		
		// 1. ��Ʈ�� ��ü ���� == ���� ��θ� ������� (���ϸ� ����)
		try {
			fw = new FileWriter("b_char.txt");  // ���ϸ� ���� ����: ������ ���� ��θ� ���� ���� �˷� �ֱ� ���ؼ�!
												// ����� ���, ���� �������� �ʴ� ���ϸ��� �����ϴ��� ���� ���� �� ���� ��ΰ� ������
			
			// 2. ��� == ������ ��������: write() �޼ҵ� ���
			fw.write("��! IO ����ִ�...��"); // ���������� ���� �� ���� ��� �̵���
			fw.write('A');
			fw.write(97);
			fw.write("\n");
			
			char[] cArr = {'k', 'i', 'w', 'i'};
			fw.write(cArr);
			
			// 3. ���� ��� ���� == �ڿ� �ݳ�(�ݵ��)
			// => finally ��Ͽ� �ۼ�(finally ����� �߰��ϸ� ���� ���� �̽��� ���� 0�ܰ� ���ľ� ��)
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 3. �� �� �ڿ� �ݳ��ϱ� (�ݵ��)
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		
		// FileReader: ���Ϸκ��� �����͸� 2byte ������ �Է¹޴� ��Ʈ��
		
		// 0. ���� ���� �� �ʱ�ȭ
		FileReader fr = null; // import
		
		// 1. ��Ʈ�� ��ü ���� == ���� ��θ� ������
		try {
			fr = new FileReader("b_char.txt"); // �Է� ����� ��� ������! �����ϴ� ��η� �����ؾ� ��!
		} catch (FileNotFoundException e) {

			// 2. �Է¹ޱ�
			// 3. ���� ��� ���� == �ڿ� �ݳ� (�ݵ��)
			
			e.printStackTrace();
		}
	}

}

package com.kh.chap01.file.run;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

// �ڹ� �ڵ�� �����ϰ� ���� ����� ����(java.io.File Ŭ����)
public class FileRun {

	public static void main(String[] args) {
		
		// �򰥸��� �� ��: File ��ü�� ����ٰ� �ؼ� �ٷ� ������ ��ǻ�Ϳ� ����������� ����
		
		try {
			// 1. ������ ��� ������ ���� �ʰ� ������ ���ϸ� �����ؼ� ������ ����
			File file1 = new File("test.txt"); // test.txt ��� ������ ����ڴٶ�� ���ϸ��� ���� // ��� ���
			file1.createNewFile(); // createNewFile �޼ҵ带 ȣ���ؼ� ����Ǵ� ������ ������ �������
		
			// 2. ��� ������ �� ���ϸ��� �����ؼ� ������ ����("C:\aaa\test.txt")
			/*
			 * \n: ���๮��
			 * \t: tabŰ
			 * \: �̽������� ����(�ܵ� ��� x)
			 * \\: \�� ����
			 */
			
			// => �׻� �����ϴ� ��η� �����ؾ� ��
			// 	C:/aaa ��� ������ �̹� �����ؾ����� test.txt ������ ������ �� ����
			
			File file2 = new File("C:\\aaa\\test.txt"); // \: �̽������� ���� (�ܵ� ��� �Ұ�)
			// file2.createNewFile();
			
			// 3. ������ �����ϰ� ���� �� �ȿ� ���� �����
			
			File bbbFolder = new File("C:\\bbb"); // ���� ���
			bbbFolder.mkdir(); // mk => make�� ����, ���� ���� �޼ҵ�
			
			File file3 = new File("C:\\bbb\\test.txt"); // ���� ���
			file3.createNewFile();
			
			// 4. ������ ��� ���� ���� ���� ���� �� ������ ������ ����
			// => ������ ��� ���� ���� ������ �����ϴ��� ���� ���� �۾� ���� �� ������Ʈ ���� ���ο� �ٷ� ������
			File folder = new File("test"); // ��� ���
			folder.mkdir();
			
			File file = new File("test\\person.txt"); // ��� ���(���� �۾� ���� ������ �ֻ��� ������ ������ ������)
			file.createNewFile();
			
			/*
			 * - "��Ȯ�� �������� ���� ���"�� �������� ��
			 * 	  C����̺�, D����̺�, ... => ��Ʈ ���丮(��ǻ���� �ֻ��� ����)
			 * 
			 * - "��Ȯ�� �������� ���� ���"�� �������� �ʾ��� ��
			 * 	    ���� ���� �۾� ���� ��ġ�� ���������� ������ ��ΰ� �������
			 * 
			 */
			
			// File Ŭ�������� �����ϴ� ������ �޼ҵ��
			System.out.println(folder.isFile()); // file���� �ƴ��� �Ǻ��ϴ� �޼ҵ�, �����̹Ƿ� false ��ȯ
			System.out.println(file.isFile()); // �����̹Ƿ� true ��ȯ
			
			System.out.println("���ϸ�: " + file.getName()); // person.txt
			System.out.println("��������: " + file.getParent()); // test
			System.out.println("���Ͽ뷮: " + file.length()); // ������ �뷮, ũ�� ��ȯ! ���� ���� �ȿ� �۾��� �� ���� ������ ���� �뷮�� 0
			System.out.println("������: " + file.getAbsolutePath()); // ��� ��η� ���� �����̶� ���� ���(C: or D:)�� ��Ÿ��
			
			// ���� ���� �޼ҵ�
			file.delete();
		
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("���α׷� ����");

	}

	/*
	 * ���α׷����� �����͸� �ܺ� ��ü(�����, ����Ŀ, "����" ��) �� ����ϰų�
	 * �Է���ġ(Ű����, ���콺 ��)�� �Է¹޴� ������ �����ϰ��� �Ѵٸ�
	 * �ݵ�� ���α׷��� �ܺ� ��ü���� "���� ���"�� ������ �� => ���� ��� == "��Ʈ��"
	 * 
	 * *��Ʈ���� Ư¡
	 * - �ܹ���: �Է��̸� �Է�, ����̸� ���
	 * 			�Է�, ��¿� ��Ʈ���� ���� ���� ������
	 * 			��, ���ÿ� ������ϰ��� �Ѵٸ� ��� 2���� ��Ʈ���� �ʿ���(�ϳ��� ��Ʈ�����δ� ���� �� ��)
	 * - ���Լ��� (First In First Out, FIFO): ���� ������ ���� ���� ������ ��
	 * 										Queue��� ������ ������ ����!
	 * 										����) Stack�̶�� ����(First In Last Out, FILO)
	 * - ������ ���� �� �ð� ���� ����(timeout, delay)�� �߻��� �� ����
	 * 
	 * *��Ʈ���� ����
	 * - ����� ������
	 * 		����Ʈ��Ʈ��: �� ���� 1byte¥���� �̵��� �� �ִ� ������ ���� ��� => �Է�(XXXInputStream) / ���(XXXOutputStream) 
	 * 		���ڽ�Ʈ��: �� ���� 2byte¥���� �̵��� �� ���� ������ ���� ��� => �Է�(XXXReader) / ���(XXXWriter)
	 * 
	 * - �ܺ� ��ü���� �������� ���� ����
	 * 		��ݽ�Ʈ��: �ܺ� ��ü�� ���������� ����Ǵ� ���
	 * 		������Ʈ��: ��ݽ�Ʈ������ ������ ������ ������ �ִ� �뵵�� ��Ʈ�� (�ܺ� ��ü�� ���������� ���� X)
	 * 				   ��, �ܵ� ��� �Ұ�(�ܵ� ��ü ���� �Ұ�)
	 * 		ex) BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 * 			BufferedReader: ���� ��Ʈ��, InputStreamReader: ��ݽ�Ʈ��
	 * 		=> �ӵ� ���, �ڷ����� ���� ��ȯ, ��ü ������ ������ϰ� ���� ���� ������ ����� �� ����
	 * 		=> ��, ������Ʈ���� �ܵ����� ��� �Ұ�, �ݵ�� ��ݽ�Ʈ���� �ʼ�!
	 */
}

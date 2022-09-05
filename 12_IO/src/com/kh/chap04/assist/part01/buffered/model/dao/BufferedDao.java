package com.kh.chap04.assist.part01.buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// BufferedWriter (��¿�) / BufferedReader (�Է¿�)
	
	// ���α׷� ---> �ܺ� ��ü(����)
	public void fileSave() {
		
		// FileWriter: 2byte ������ ���Ͽ� �����͸� �������� ��� ��Ʈ��
		// +
		// BufferedWriter: ���۶�� ������ ������ �ִ� ���� ��Ʈ��(�ӵ� ���)
		
		// FileWriter fw = null;
		// BufferedWriter bw = null;
		
		// 0�ܰ� ���� ���� �� �ʱ�ȭ�� �ڵ� ���ٷ� �ٿ��� ǥ��
		BufferedWriter bw = null;
		

		try {
			
			// 1. ��ݽ�Ʈ�� ��ü ����(���� ���� ��θ� �������)
			// fw = new FileWriter("c_buffer.txt"); // import, �������� �̽��� ���� ���� �� �ʱ�ȭ �ϰ� ����! try ~ catch
			
			// 2. ���� ��Ʈ�� ��ü ���� (�Ű������� ��ݽ�Ʈ����ü�� ����)
			// bw = new BufferedWriter(fw); // import
			
			// 1, 2�ܰ� ��� ��Ʈ�� ��ü, ���� ��Ʈ�� ��ü ������ �ڵ� ���ٷ� �ٿ��� ǥ��
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// 3. ���: BufferedWriter ��ü���� �����ϴ� write() �޼ҵ� ���
			// fw.write(); // FileWriter ��ü���� �����ϴ� write() �޼ҵ带 ����ϸ� ���� ����� ����� �� ����
			bw.write("�ȳ��ϼ���.");
			bw.newLine(); // ������ �־� �ִ� �޼ҵ�
			bw.write("�ݰ����ϴ�.\n");
			bw.write("����������.");
			
			
			// 4. �ڿ� �ݳ� (�ݵ��) => finally ��� �ȿ� �ۼ�
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 4. �ڿ� �ݳ� (�ݵ��)
			// => ������ ��: �ݳ��ؾ� �� �ڿ��� 2��(fw, bw)
			// => �ݳ� ����: ��ü ���� ������ "����"���� �ݳ�!
			// 			      ��, ���� ������ fw -> bw�̹Ƿ�, �ݳ� ������ bw -> fw
			
			try {
				bw.close(); // bw cannot be resolved: �������� �̽��̹Ƿ� 0�ܰ� �Բ� ������ ��� ��!
							// ���� ���� �Ŀ��� Unhandled exception type IOException�� ���� �޽��� �ٲ�! => try ~ catch������ ó��
				// fw.close(); // �ڵ带 ���ٷ� ���̸� ��� �ʿ����� �ʰ� ��
			} catch (IOException e) {
				e.printStackTrace();
			} 
						
		}
		
	}
	
	// ���α׷� <--- �ܺ� ��ü(����)
	public void fileRead() {
		
		// FileReader: ���ϰ� ���������� �����ؼ� �ѹ��� 2byte ������ �����͸� �Է��� �� �ִ� ��� ��Ʈ��
		// +
		// BufferedReader: ���۶�� ������ ������ �ִ� ���� ��Ʈ�� (�ӵ� ���)
		
		/*
		// 0. ���� ���� �� null ������ �ʱ�ȭ
		BufferedReader br = null;
		

		try {
			
			// 1. ��ü ���� == ��θ� ����ڴ�
			
			br = new BufferedReader(new FileReader("c_buffer.txt"));
	
			// 2. �Է�: BufferedReader Ŭ�������� �����ϴ� �޼ҵ�� �о���̱�
					
					// System.out.println(br.readLine()); // �� ������ ���빰�� �о����
					// System.out.println(br.readLine());
					// System.out.println(br.readLine());
					// System.out.println(br.readLine()); // ������ ���� ������ �� null�� ��ȯ
					
			
					// �ݺ��� Ȱ��
					String value = null;
					// String value = ""; // �̷��� �ʱ�ȭ�ص� ������
					while((value = br.readLine()) != null) {
						System.out.println(value);
					}
					
					// 3. ���� ��θ� ���ڴ� == �ڿ� �ݳ�(�ݵ��) => finally ���� �ۼ�
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					
					// 3. �ڿ� �ݳ� (�ݵ��)
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			
			}
				*/
		
		// �ڵ带 �� ���̰� �;��!
		/* try ~ with ~ resource ���� (jdk7 ���� �̻���͸� ����)
		 * 
		 * [ ǥ���� ]
		 * try() {
		 * 		���ܰ��߻��ҹ��ѱ���;
		 * } catch(����Ŭ������ e) {
		 * 		�ش翹�ܹ߻��ý����ұ���;
		 * }
		 * 
		 * => ��Ʈ�� ��ü ���� ������ try(����) �� �ۼ��ϰ� �Ǹ�
		 * 	    ��Ʈ�� ��ü ���� �� �ش� try �� ������ ����� �� �˾Ƽ� �ڿ� �ݳ��� ��
		 */
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			// �ݺ��� Ȱ��
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

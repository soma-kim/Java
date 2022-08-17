package com.kh.chap02.tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 1) �����ϰ��� �ϴ� ������ IP�ּ�, port��ȣ ����
		// ��û�ϰ��� �ϴ� ������ IP�ּ�: 192.168.40.30 �Ǵ� 127.0.0.1 (������ IP) �Ǵ� localhost
		String serverIP = "192.168.40.124";
		int port = 3000;
		
		// 2) ������ ���� ��û�� ������ ����
		// => ��û�ϰ��� �ϴ� ������ IP�ּҿ� port��ȣ�� �����ϸ鼭 Socket ��ü ����
		try {
			socket = new Socket(serverIP, port);
			// => Socket ��ü ���� �� ������ ����� �Ǿ��ٸ� ��ü�� �� ������ ��
			//					    ������ ������ ��쿡�� null ���� Socket ��ü�� ���
			
			// NullPointerException�� ����� ���� ������ �����̱� ������ ���ǹ����� ��ó��
			if(socket != null) { // ������ �ߵǾ��� ��� => ��� ����
				System.out.println("������ ���� ����!");
				
			// 3) ������ ����� �� �ִ� �Է¿� ��Ʈ��, ��¿� ��Ʈ�� ����
			// 4) ���� ��Ʈ���� �߰��Ͽ� ���� ����
				
				// �Է¿� ��Ʈ��
				// socket.getInputStream() + InputStreamReader + BufferedReader
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// ��¿� ��Ʈ��
				// socket.getOutputStream() + OutputStreamWriter + PrintWriter
				pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				// �ݺ���
				while(true) {
					
			// 5) ��Ʈ���� ���� �а� ����
			// �������� �����͸� ���� (output)
					
					System.out.print("�������� ���� ����: ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					pw.flush();
					
			// �����κ��� ���޵� �޽����� �о���̱� (input)
					
					String message = br.readLine();
					System.out.println("�����κ��� ���޹��� �޽���: " + message);
					
				}
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

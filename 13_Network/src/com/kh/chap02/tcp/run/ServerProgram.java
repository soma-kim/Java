package com.kh.chap02.tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// ������ ���α׷�
public class ServerProgram {
	
	/*
	 * *TCP(Transmission Control Protocol)
	 * - ����, Ŭ���̾�Ʈ���� 1:1 ���� ��� ���
	 * - �����͸� ��ȯ�ϱ⿡ �ռ��� ����, Ŭ���̾�Ʈ�� ����Ǿ� �־�� ��
	 *   (�׻� ������ ���� ����Ǿ� Ŭ���̾�Ʈ�� ��û�� ��ٸ� ��)
	 * - �ŷڼ� �ִ� ������ ���� ����
	 * 
	 * *Socket
	 * - ���μ��� ���� ����� ���
	 * - Socket ���α׷����� ���� ��ݽ�Ʈ���� Input / OutputStream�� ������ ����
	 * - ��ݽ�Ʈ�������δ� ������ ������ ������Ʈ���� �߰����� ������ ����ų ��
	 * 
	 * *ServerSocket
	 * - ��Ʈ��ȣ�� ����(Bind: ����)�Ǿ� �ܺ��� ���� ��û�� ��ٸ��� ���� ��û�� ������ ������ �� �뵵
	 * 	  �����ϴ� ���� Socket ��ü�� ������!
	 */
	
	// 0. ���� �����
	// 1. ��Ʈ�� ����
	// 2. �� �� ����
	// 3. ��Ʈ�� ����

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 1) �� ���α׷����� ����� port��ȣ ����
		// => ���������� �� �� ��Ʈ�� ��θ� ���ڳĴ� �ǹ�
		int port = 3000;

		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 2) ServerSocket ��ü ���� �� ��Ʈ ����(Bind)
		// => ������ Ŭ���̾�Ʈ�� ���� ��û�� �޾� �� �뵵�� ����
		try {
			server = new ServerSocket(port);

		// 3) Ŭ���̾�Ʈ�κ��� ���� ��û�� ���� ������ ��� ����
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�..");
			
		// 4) ���� ��û�� ���� ��û�� ���� �� �ش� Ŭ���̾�Ʈ�� ����� �� �ִ� Socket ��ü�� ������
			Socket socket = server.accept(); // socket == Ŭ���̾�Ʈ��  ����ϱ� ���� ���� ��ü
			
			// ������ ���� ���: getInetAddress() �޼ҵ� ���
			System.out.println(socket.getInetAddress().getHostAddress() + " �� ������ ��û��..");
			
		// ----- �� �������� �����ϰڴٰ� ����� �� ����, ���� ��Ʈ���� ������ ���� -----
			
		// 5) Ŭ���̾�Ʈ�� ����� �� �ִ� �Է¿�, ��¿� ��Ʈ���� ���� => socket ��ü���� ������ ��
		// 6) ������Ʈ���� �߰��Ͽ� ���� ����
			
		// �Է¿� ��Ʈ��(Ŭ���̾�Ʈ�κ��� ���޵� ���� �� �� ������ �о���� �� �ְԲ�)
		// socket.getInputStream()
		// + 1byte �� 2byte ������ ȣȯ�� ������ ���� ��Ʈ��(InputStreamReader)
		// BufferedReader
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		// ��¿� ��Ʈ�� (Ŭ���̾�Ʈ���� ���� ������ �뵵)
		// socket.getOutputStream()
		// + 1byte �� 2byte ������ ȣȯ�� ������ ���� ��Ʈ��(OutputStreamWriter)
		// PrintWriter => 1byte ��Ʈ���� �ٷ� ȣȯ ������ �����ڰ� �����ε��Ǿ� ����!
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// => ��ݽ�Ʈ���� ���� ����� ���� ������Ʈ���� ���� 2���� �ٿ� ��
			
		// 7) Ŭ���̾�Ʈ�� ��Ʈ���� ���� �а� ����
		// => ����� �ְŴ� �ްŴ� �ݺ��� ���� �ݺ���
			while(true) {
				
				// Ŭ���̾�Ʈ�κ��� ���޵� �޽����� ���� ��� ���������� �о���̱�(input)
				String message = br.readLine();
				System.out.println("Ŭ���̾�Ʈ�κ��� ���޹��� �޽���: " + message);
				
				// �ݴ�� Ŭ���̾�Ʈ���� �����͸� �����ϱ�(output)
				System.out.print("Ŭ���̾�Ʈ���� ���� ����: ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); // Ŭ���̾�Ʈ���� 1�� ������ ���
				
				pw.flush(); // ���� ��Ʈ���� ���� �ִ� �ܿ� �����͸� ������ �������� ������ �� �ִ� �޼ҵ�
							// ���±����� ����� �� �ڿ� �ݳ� �� �־��� ������ flush �޼ҵ带 ���� �ʾ���
							// �ڿ� �ݳ� �� �ڵ����� flush()�� ����Ǳ� ����!
							// ������ �ְ�ް� �ؾ� �ϴϱ� ��Ʈ�� ������ �� flush() �޼ҵ带 �����
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 8) ��� ���Ḧ ���� �ڿ� �ݳ�(������ ������ ��������)
			
			try {
				pw.close();
				br.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
		
			}
			
		}
		
	}

}

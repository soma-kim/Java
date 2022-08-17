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
		
		// 1) 접속하고자 하는 서버의 IP주소, port번호 지정
		// 요청하고자 하는 서버의 IP주소: 192.168.40.30 또는 127.0.0.1 (루프백 IP) 또는 localhost
		String serverIP = "192.168.40.124";
		int port = 3000;
		
		// 2) 서버에 연결 요청을 보내는 구문
		// => 요청하고자 하는 서버의 IP주소와 port번호를 제시하면서 Socket 객체 생성
		try {
			socket = new Socket(serverIP, port);
			// => Socket 객체 생성 시 연결이 제대로 되었다면 객체가 잘 생성될 것
			//					    연결이 실패할 경우에는 null 값이 Socket 객체에 담김
			
			// NullPointerException은 충분히 예상 가능한 오류이기 때문에 조건문으로 선처리
			if(socket != null) { // 연결이 잘되었을 경우 => 통신 진행
				System.out.println("서버와 연결 성공!");
				
			// 3) 서버와 통신할 수 있는 입력용 스트림, 출력용 스트림 열기
			// 4) 보조 스트림을 추가하여 성능 개선
				
				// 입력용 스트림
				// socket.getInputStream() + InputStreamReader + BufferedReader
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// 출력용 스트림
				// socket.getOutputStream() + OutputStreamWriter + PrintWriter
				pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				// 반복문
				while(true) {
					
			// 5) 스트림을 통해 읽고 쓰기
			// 서버에게 데이터를 전달 (output)
					
					System.out.print("서버에게 보낼 내용: ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					pw.flush();
					
			// 서버로부터 전달된 메시지를 읽어들이기 (input)
					
					String message = br.readLine();
					System.out.println("서버로부터 전달받은 메시지: " + message);
					
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

package com.kh.chap02.tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 서버용 프로그램
public class ServerProgram {
	
	/*
	 * *TCP(Transmission Control Protocol)
	 * - 서버, 클라이언트간의 1:1 소켓 통신 방식
	 * - 데이터를 교환하기에 앞서서 서버, 클라이언트에 연결되어 있어야 함
	 *   (항상 서버가 먼저 실행되어 클라이언트의 요청을 기다릴 것)
	 * - 신뢰성 있는 데이터 전달 가능
	 * 
	 * *Socket
	 * - 프로세스 간의 통신을 담당
	 * - Socket 프로그래밍을 위한 기반스트림인 Input / OutputStream을 가지고 있음
	 * - 기반스트림만으로는 제한이 있으니 보조스트림을 추가시켜 성능을 향상시킬 것
	 * 
	 * *ServerSocket
	 * - 포트번호와 연결(Bind: 엮다)되어 외부의 연결 요청을 기다리다 연결 요청이 들어오면 수락해 줄 용도
	 * 	  수락하는 순간 Socket 객체가 생성됨!
	 */
	
	// 0. 소켓 만들기
	// 1. 스트림 열기
	// 2. 볼 일 보기
	// 3. 스트림 끊기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 1) 이 프로그램에서 사용할 port번호 지정
		// => 서버측에서 몇 번 포트로 통로를 열겠냐는 의미
		int port = 3000;

		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 2) ServerSocket 객체 생성 및 포트 결합(Bind)
		// => 앞으로 클라이언트의 연결 요청을 받아 줄 용도로 사용됨
		try {
			server = new ServerSocket(port);

		// 3) 클라이언트로부터 접속 요청이 들어올 때까지 대기 상태
			System.out.println("클라이언트의 요청을 기다리고 있습니다..");
			
		// 4) 연결 요청이 오면 요청을 수락 후 해당 클라이언트와 통신할 수 있는 Socket 객체가 생성됨
			Socket socket = server.accept(); // socket == 클라이언트와  통신하기 위한 소켓 객체
			
			// 상대방의 정보 얻기: getInetAddress() 메소드 사용
			System.out.println(socket.getInetAddress().getHostAddress() + " 가 연결을 요청함..");
			
		// ----- 이 시점까지 연결하겠다고 약속은 된 상태, 아직 스트림은 열리지 않음 -----
			
		// 5) 클라이언트와 통신할 수 있는 입력용, 출력용 스트림을 생성 => socket 객체에서 제공해 줌
		// 6) 보조스트림을 추가하여 성능 개선
			
		// 입력용 스트림(클라이언트로부터 전달된 값을 한 줄 단위로 읽어들일 수 있게끔)
		// socket.getInputStream()
		// + 1byte 와 2byte 사이의 호환이 가능한 보조 스트림(InputStreamReader)
		// BufferedReader
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		// 출력용 스트림 (클라이언트에게 값을 전달할 용도)
		// socket.getOutputStream()
		// + 1byte 와 2byte 사이의 호환이 가능한 보조 스트림(OutputStreamWriter)
		// PrintWriter => 1byte 스트림과 바론 호환 가능한 생성자가 오버로딩되어 있음!
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// => 기반스트림에 성능 향상을 위해 보조스트림을 각각 2개씩 붙여 줌
			
		// 7) 클라이언트와 스트림을 통해 읽고 쓰기
		// => 통신을 주거니 받거니 반복을 위한 반복문
			while(true) {
				
				// 클라이언트로부터 전달된 메시지가 있을 경우 서버측에서 읽어들이기(input)
				String message = br.readLine();
				System.out.println("클라이언트로부터 전달받은 메시지: " + message);
				
				// 반대로 클라이언트에게 데이터를 전달하기(output)
				System.out.print("클라이언트에게 보낼 내용: ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); // 클라이언트에게 1줄 단위로 출력
				
				pw.flush(); // 현재 스트림에 남아 있는 잔여 데이터를 강제로 내보내는 역할을 해 주는 메소드
							// 여태까지는 입출력 후 자원 반납 해 주었기 때문에 flush 메소드를 쓰지 않았음
							// 자원 반납 시 자동으로 flush()가 진행되기 때문!
							// 지금은 주고받고 해야 하니까 스트림 막힐까 봐 flush() 메소드를 사용함
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 8) 통신 종료를 위한 자원 반납(생성된 순서의 역순으로)
			
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

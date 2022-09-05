package com.kh.chap01.inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {
	
	/*
	 * *네트워크(Network)
	 * 여러 대의 컴퓨터들이 연결되어 있는 통신망을 일컫는 용어
	 * 네트워크를 통해 서로간의 데이터들을 교환 가능함
	 * 
	 * *IP주소와 port번호
	 * - IP주소: 네트워크상에 각 컴퓨터들을 식별할 수 있는 고유의 주소 번호
	 * 			(중복 불가, 컴퓨터의 주민번호)
	 * - port번호: 컴퓨터 안에 작동하는 프로그램을 찾을 때
	 * 			    각각의 프로그램을 식별해 주는 내부 주로
	 * => IP 주소와 port번호는 고정값이 아니라 변동이 가능한 유동적인 값임
	 * 	    단, 값을 바꿀 때 IP주소 같은 경우 같은 네트워크 범위 안에서
	 * 				   port번호 같은 경우 같은 컴퓨터 범위 안에서 중복이 일어나면 충돌 일어남
	 * 
	 * *서버와 클라이언트
	 * - 서버: 클라이언트(고객)에게 서비스를 제공하는 PC 또는 프로그램
	 * 			즉, 클라이언트의 요청을 처리해서 응답해 주는 역할 => 요청이 언제 들어올지 모르니 항상 켜져 있고 대기해야 하는 상태
	 * - 클라이언트: 서버에 요청하는 PC 또는 프로그램을 일컫는 단어
	 * 			즉, 서비스를 제공받는 역할
	 * => 클라이언트 입장에서는 서버에 요청을 하기 위해서는 항상 그 요청하고자 하는 서버의 IP주소, port번호를 알고 있어야 함 
	 */

	public static void main(String[] args) {
		
		// InetAddress: 네트워크 정보(IP주소 관련)를 확인할 수 있는 클래스
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			// localhost: 지역호스트 => 내 PC를 지칭
			// getLocalHost(): 내 PC에 대한 정보를 반환해 주는 메소드 (InetAddress 형태로 반환)
			
			System.out.println(localhost); // 내 PC명 + "/" + 내 IP주소
			
			System.out.println("내 PC명: " + localhost.getHostName());
			System.out.println("내 IP주소: " + localhost.getHostAddress());
			
			System.out.println("--------------------------------------");
			
			// 내가 알고 있는 "도메인 주소"를 제시해서 그 서버와 관련된 정보를 얻기
			// 도메인 주소: 사용자가 웹사이트에 접속할 때 매번 IP주소를 외우기 어렵기 때문에
			// 			  외우기 쉬운 구조로 사용자에게 제공해 주는 주소
			
			// 원래의 구조: IP주소 ----------------------------------------------> 바로 접속
			// 도메인 주소 적용: 도메인 주소 -----> DNS(Domain Name Server) -----> IP주소로 연결
			
			// 구글의 정보를 InetAddress 객체에 담기
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			// getByName(): 도메인 주소라는 고유한 주소를 통해서 해당 서버 PC의 정보를 얻어내서 반환(InetAddress 형태로 반환)
			
			System.out.println(googleHost);
			System.out.println("구글 서버명: " + googleHost.getHostName());
			System.out.println("구글 IP주소: " + googleHost.getHostAddress());
			// 대형 사이트의 서버는 여러 개로 이루어져 있음!! (분산구조)
			// => 한 곳에만 요청이 몰빵될 경우 서버에 과부화 걸림
			
			System.out.println("--------------------------------------");
			
			// 도메인 주소를 통해서 그 서버 관련한 것들을 배열로도 받아 볼 수 있음
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("네이버 서버 개수: " + naverHost.length);
			
			// 반복문 돌려가며 모든 서버의 정보 출력
			/*
			for(int i = 0; i < naverHost.length; i++) {
				System.out.println(i + "번째 서버: " + naverHost[i]);
			}
			*/
		
			// 향상된 for문
			// for(변수선언문 : 반복돌배열명)
			for(InetAddress n : naverHost) {
				System.out.println(n);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		/*
		 * 현재 구동 중인 서버가 있으면 클라이언트는 그 서버로 요청을 보낼 수 있음
		 * => 응답 결과가 항상 돌아옴!
		 * 
		 * 요청과 응답에 의해서 프로그램은 돌아감("통신"한다라고 표현)
		 * => 웹에서의 통신 방식: HTTP 프로토콜 통신(HTTPS: HTTP에 보안 절차가 추가된 버전)
		 * 
		 * *자바만을 가지고 서버와 클라이언트 간의 간단한 통신 해 보기
		 * => 이때 데이터를 입출력하고자 한다면 서버와 클라이언트 간에 스트림 (연결 통로)가 있어야 함!
		 * 
		 * *소켓: 프로세스간에 통신을 담당하는 것
		 * 		  즉, 스트림을 연결하기 위한 문
		 * 
		 * *소켓 프로그래밍(TCP 방식 / UDP 방식)
		 * - TCP방식: 데이터 전송 속도가 느리나 데이터를 정확하고 안정적으로 전달 가능함
		 *			  주로 신뢰성이 요구되는 프로그램에서 많이 사용(웹, 이메일, 파일전송, ...)
		 * - UDP방식: 데이터 전송 속도는 빠르나 신뢰성이 없는 데이터가 전송될 수 있음(중간에 데이터 손실될 가능성 있음)
		 * 			  주로 데이터를 빠른 속도로 전송하고자 하는 프로그램에서 사용(실시간 스트리밍)
		 * 
		 */

	}

}

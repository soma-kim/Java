package com.kh.chap03.char_.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	// 프로그램 ---> 외부 매체(파일)
	// 출력
	public void fileSave() {
		
		// FileWriter: 파일로 데이터를 2byte 단위로 출력하는 스트림
		
		// 0. 변수 선언 및 null로 초기화
		FileWriter fw = null; // import
		
		// 1. 스트림 객체 생성 == 연결 통로를 만들겠음 (파일명 제시)
		try {
			fw = new FileWriter("b_char.txt");  // 파일명 제시 이유: 누구랑 연결 통로를 만들 건지 알려 주기 위해서!
												// 출력일 경우, 현재 존재하지 않는 파일명을 제시하더라도 파일 생성 후 연결 통로가 지어짐
			
			// 2. 출력 == 데이터 내보내기: write() 메소드 사용
			fw.write("와! IO 재미있다...ㅎ"); // 내부적으로 문자 한 개씩 끊어서 이동함
			fw.write('A');
			fw.write(97);
			fw.write("\n");
			
			char[] cArr = {'k', 'i', 'w', 'i'};
			fw.write(cArr);
			
			// 3. 연결 통로 끊기 == 자원 반납(반드시)
			// => finally 블록에 작성(finally 블록을 추가하면 지역 변수 이슈가 생겨 0단계 거쳐야 함)
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 3. 다 쓴 자원 반납하기 (반드시)
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		
		// FileReader: 파일로부터 데이터를 2byte 단위로 입력받는 스트림
		
		// 0. 변수 선언 및 초기화
		FileReader fr = null; // import
		
		// 1. 스트림 객체 생성 == 연결 통로를 짓겠음
		try {
			fr = new FileReader("b_char.txt"); // 입력 통로의 경우 무조건! 존재하는 경로로 제시해야 됨!
	

			// 2. 입력받기: read() 메소드 사용
				/*
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				System.out.println(fr.read());
				// 파일 끝을 만나는 순간 fr.read() => -1 반환
				System.out.println(fr.read());
				*/
			// => 문자 기반 스트림도 마찬가지로 문서의 끝을 만났을 때 read 메소드의 반환값이 -1임!!
			
			// 반복문 활용
			/*
			while(fr.read() != -1) {
				System.out.println(fr.read());
			}
			// => 반복이 한 번 일어날 때마다 read() 메소드가 2번 호출되기 때문에 2, 4번째 등 퐁당퐁당으로 출력됨
			*/
			
			int value = 0;
			while((value = fr.read()) != -1) { // 소괄호로 우선순위 높이기!
				System.out.print((char)value);
			}
			
			// 3. 연결 통로 끊기 == 자원 반납 (반드시)
			
			} catch (FileNotFoundException e) {
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			
				// 3. 자원 반납 (반드시)
				try {
					fr.close();
				} catch(IOException e) {
					e.printStackTrace();
				}

			}
	}
}

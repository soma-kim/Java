package com.kh.chap04.assist.part01.buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// BufferedWriter (출력용) / BufferedReader (입력용)
	
	// 프로그램 ---> 외부 매체(파일)
	public void fileSave() {
		
		// FileWriter: 2byte 단위로 파일에 데이터를 내보내는 기반 스트림
		// +
		// BufferedWriter: 버퍼라는 공간을 제공해 주는 보조 스트림(속도 향상)
		
		// FileWriter fw = null;
		// BufferedWriter bw = null;
		
		// 0단계 변수 선언 및 초기화를 코드 한줄로 줄여서 표현
		BufferedWriter bw = null;
		

		try {
			
			// 1. 기반스트림 객체 생성(메인 연결 통로를 만들겠음)
			// fw = new FileWriter("c_buffer.txt"); // import, 지역변수 이슈로 변수 선언 및 초기화 하고 오기! try ~ catch
			
			// 2. 보조 스트림 객체 생성 (매개변수로 기반스트림객체를 제시)
			// bw = new BufferedWriter(fw); // import
			
			// 1, 2단계 기반 스트림 객체, 보조 스트림 객체 생성을 코드 한줄로 줄여서 표현
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// 3. 출력: BufferedWriter 객체에서 제공하는 write() 메소드 사용
			// fw.write(); // FileWriter 객체에서 제공하는 write() 메소드를 사용하면 성능 향상을 기대할 수 없음
			bw.write("안녕하세요.");
			bw.newLine(); // 개행을 넣어 주는 메소드
			bw.write("반갑습니다.\n");
			bw.write("저리가세요.");
			
			
			// 4. 자원 반납 (반드시) => finally 블록 안에 작성
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 4. 자원 반납 (반드시)
			// => 주의할 점: 반납해야 할 자원이 2개(fw, bw)
			// => 반납 순서: 객체 생성 순서의 "역순"으로 반납!
			// 			      즉, 생성 순서가 fw -> bw이므로, 반납 순서는 bw -> fw
			
			try {
				bw.close(); // bw cannot be resolved: 지역변수 이슈이므로 0단계 함께 진행해 줘야 함!
							// 변수 생성 후에는 Unhandled exception type IOException로 오류 메시지 바뀜! => try ~ catch문으로 처리
				// fw.close(); // 코드를 한줄로 줄이면 얘는 필요하지 않게 됨
			} catch (IOException e) {
				e.printStackTrace();
			} 
						
		}
		
	}
	
	// 프로그램 <--- 외부 매체(파일)
	public void fileRead() {
		
		// FileReader: 파일과 직접적으로 연결해서 한번에 2byte 단위로 데이터를 입력할 수 있는 기반 스트림
		// +
		// BufferedReader: 버퍼라는 공간을 제공해 주는 보조 스트림 (속도 향상)
		
		/*
		// 0. 변수 선언 및 null 값으로 초기화
		BufferedReader br = null;
		

		try {
			
			// 1. 객체 생성 == 통로를 만들겠다
			
			br = new BufferedReader(new FileReader("c_buffer.txt"));
	
			// 2. 입력: BufferedReader 클래스에서 제공하는 메소드로 읽어들이기
					
					// System.out.println(br.readLine()); // 줄 단위로 내용물을 읽어들임
					// System.out.println(br.readLine());
					// System.out.println(br.readLine());
					// System.out.println(br.readLine()); // 문서의 끝을 만났을 때 null을 반환
					
			
					// 반복문 활용
					String value = null;
					// String value = ""; // 이렇게 초기화해도 무방함
					while((value = br.readLine()) != null) {
						System.out.println(value);
					}
					
					// 3. 연결 통로를 끊겠다 == 자원 반납(반드시) => finally 블럭에 작성
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					
					// 3. 자원 반납 (반드시)
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			
			}
				*/
		
		// 코드를 더 줄이고 싶어요!
		/* try ~ with ~ resource 구문 (jdk7 버전 이상부터만 가능)
		 * 
		 * [ 표현법 ]
		 * try() {
		 * 		예외가발생할법한구문;
		 * } catch(예외클래스명 e) {
		 * 		해당예외발생시실행할구문;
		 * }
		 * 
		 * => 스트림 객체 생성 구문을 try(여기) 에 작성하게 되면
		 * 	    스트림 객체 생성 후 해당 try 블럭 내용이 실행된 후 알아서 자원 반납이 됨
		 */
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			// 반복문 활용
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

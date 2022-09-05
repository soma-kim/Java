package com.kh.chap01.file.run;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

// 자바 코드로 간단하게 파일 만드는 과정(java.io.File 클래스)
public class FileRun {

	public static void main(String[] args) {
		
		// 헷갈리지 말 것: File 객체를 만든다고 해서 바로 파일이 컴퓨터에 만들어지지는 않음
		
		try {
			// 1. 별도의 경로 지정을 하지 않고 오로지 파일명만 제시해서 생성해 보기
			File file1 = new File("test.txt"); // test.txt 라는 파일을 만들겠다라고 파일명을 제시 // 상대 경로
			file1.createNewFile(); // createNewFile 메소드를 호출해서 실행되는 시점에 파일이 만들어짐
		
			// 2. 경로 지정을 한 파일명을 제시해서 생성해 보기("C:\aaa\test.txt")
			/*
			 * \n: 개행문자
			 * \t: tab키
			 * \: 이스케이프 문자(단독 사용 x)
			 * \\: \로 간주
			 */
			
			// => 항상 존재하는 경로로 지정해야 함
			// 	C:/aaa 라는 폴더가 이미 존재해야지만 test.txt 파일이 생성될 수 있음
			
			File file2 = new File("C:\\aaa\\test.txt"); // \: 이스케이프 문자 (단독 사용 불가)
			// file2.createNewFile();
			
			// 3. 폴더를 생성하고 나서 그 안에 파일 만들기
			
			File bbbFolder = new File("C:\\bbb"); // 절대 경로
			bbbFolder.mkdir(); // mk => make의 약자, 폴더 생성 메소드
			
			File file3 = new File("C:\\bbb\\test.txt"); // 절대 경로
			file3.createNewFile();
			
			// 4. 별도의 경로 지정 없이 폴더 생성 후 파일을 생성해 보기
			// => 별도의 경로 지정 없이 폴더를 생성하더라도 현재 내가 작업 중인 이 프로젝트 폴더 내부에 바로 생성됨
			File folder = new File("test"); // 상대 경로
			folder.mkdir();
			
			File file = new File("test\\person.txt"); // 상대 경로(내가 작업 중인 폴더가 최상위 폴더로 잡히기 때문에)
			file.createNewFile();
			
			/*
			 * - "명확한 시작점을 작은 경로"를 제시했을 때
			 * 	  C드라이브, D드라이브, ... => 루트 디렉토리(컴퓨터의 최상위 폴더)
			 * 
			 * - "명확한 시작점이 없는 경로"를 제시하지 않았을 때
			 * 	    현재 내가 작업 중인 위치를 시작점으로 잡혀서 경로가 만들어짐
			 * 
			 */
			
			// File 클래스에서 제공하는 유용한 메소드들
			System.out.println(folder.isFile()); // file인지 아닌지 판별하는 메소드, 폴더이므로 false 반환
			System.out.println(file.isFile()); // 파일이므로 true 반환
			
			System.out.println("파일명: " + file.getName()); // person.txt
			System.out.println("상위폴더: " + file.getParent()); // test
			System.out.println("파일용량: " + file.length()); // 파일의 용량, 크기 반환! 아직 파일 안에 작업한 게 없기 때문에 현재 용량은 0
			System.out.println("절대경로: " + file.getAbsolutePath()); // 상대 경로로 만든 파일이라도 절대 경로(C: or D:)로 나타냄
			
			// 파일 삭제 메소드
			file.delete();
		
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("프로그램 종료");

	}

	/*
	 * 프로그램상의 데이터를 외부 매체(모니터, 스피커, "파일" 등) 로 출력하거나
	 * 입력장치(키보드, 마우스 등)로 입력받는 과정을 진행하고자 한다면
	 * 반드시 프로그램과 외부 매체와의 "연결 통로"를 만들어야 함 => 연결 통로 == "스트림"
	 * 
	 * *스트림의 특징
	 * - 단방향: 입력이면 입력, 출력이면 출력
	 * 			입력, 출력용 스트림이 각각 따로 존재함
	 * 			즉, 동시에 입출력하고자 한다면 적어도 2개의 스트림이 필요함(하나의 스트림으로는 절대 안 됨)
	 * - 선입선출 (First In First Out, FIFO): 먼저 전달한 값이 먼저 나오게 됨
	 * 										Queue라는 구조를 가지고 있음!
	 * 										참고) Stack이라는 구조(First In Last Out, FILO)
	 * - 데이터 전송 시 시간 지연 문제(timeout, delay)가 발생할 수 있음
	 * 
	 * *스트림의 구분
	 * - 통로의 사이즈
	 * 		바이트스트림: 한 번에 1byte짜리만 이동할 수 있는 정도의 좁은 통로 => 입력(XXXInputStream) / 출력(XXXOutputStream) 
	 * 		문자스트림: 한 번에 2byte짜리가 이동할 수 있을 정도의 넓은 통로 => 입력(XXXReader) / 출력(XXXWriter)
	 * 
	 * - 외부 매체와의 직접적인 연결 여부
	 * 		기반스트림: 외부 매체와 직접적으로 연결되는 통로
	 * 		보조스트림: 기반스트림으로 부족한 성능을 향상시켜 주는 용도의 스트림 (외부 매체와 직접적으로 연결 X)
	 * 				   즉, 단독 사용 불가(단독 객체 생성 불가)
	 * 		ex) BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 * 			BufferedReader: 보조 스트림, InputStreamReader: 기반스트림
	 * 		=> 속도 향상, 자료형에 맞춰 변환, 객체 단위로 입출력하게 도움 등의 성능을 기대할 수 있음
	 * 		=> 단, 보조스트림은 단독으로 사용 불가, 반드시 기반스트림이 필수!
	 */
}

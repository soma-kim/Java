package com.kh.chap02.byte_.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// 데이터가 보관되어 있는 공간(외부 매체)과 직접 접근해서 데이터를 입출력하는 용도의 클래스 
// 기능에만 충실한 패키지: controller
// 데이터와 관련된 패키지: model
// 외부 데이터와 직접 연결할 패키지: dao
public class FileByteDao {
	
	// 프로그램 ---> 외부매체(파일)
	// 출력: 프로그램 내의 데이터를 파일로 내보내기 (즉, 파일에 기록하겠다. 파일로 저장하겠다.)
	public void fileSave() {
		
		// FileOutputStream: "파일"로 데이터를 1byte 단위로 출력하는 스트림
		
		FileOutputStream fout = null; // 0단계! 변수 선언 및 null 초기화
		
		try {	
			
			// 1. FileOutputStream 객체 생성 (== 연결 통로 만들기)
			// => 해당 파일과 직접 연결되는 통로를 만들겠음(파일명을 매개변수로 생성자 호출)
			// 	    해당 파일이 존재하지 않는다면 해당 파일이 생성되면서 연결 통로가 지어짐
			// 	    존재하는 파일이라면 연결 통로만 바로 지어짐 

			fout = new FileOutputStream("a_byte.txt"/*, false */); // a_byte.txt가 없으니까 오류 발생할 수 있다며 계속 빨간줄 뜸
			// => 기존에 해당 파일이 있을 경우 덮어씌워짐
			// => 이어쓰고 싶을 경우에는? 매개변수로 true를 같이 넘겨 주면 됨 (단, 기본값은 false임)
			
			// 2. 연결 통로로 데이터를 출력: write() 메소드 사용
			// => 1byte 범위만 전송 가능: -128 ~ 127까지의 숫자, 음수는 불가!(아스키코드 값에 음수 존재하지 않음)
			//		(단, 파일에 기록되는 건 해당 숫자의 고유한 문자임: 아스키코드)
			fout.write(97); // 'a'가 기록
			fout.write('b'); // 'b'가 기록
			// fout.write('김'); // 1byte짜리 통로에 2byte짜리의 한글이 들어가서 @라는 형태로 깨져서 출력됨!
							 // (바이트 스트림으로는 제한적)
			
			byte[] bArr = {99, 100, 101}; // 'c', 'd', 'e'가 기록
			fout.write(bArr);
			
			fout.write(bArr, 1, 2); // 'd', 'e'가 기록
			
			// 3. 스트림을 다 이용했으면 자원 반납하기 (반드시)
			// => 즉, 연결통로를 끊겠음
			// fout.close(); // 위에서 혹시 예외가 발생했을 경우 이 자리는 실행이 안 될 수도 있음! => finally 블록으로 위치 바꿔 줌
		
		
			} catch(FileNotFoundException e) { // try ~ catch 블럭으로 처리해 주기, 존재하지 않는 경로를 제시했을 때
				
			} catch (IOException e) { // 입출력 상황에서 어느 오류든지 발생했을 때
				e.printStackTrace();
			} finally { // 어떤 예외가 발생하든지 간에 반드시 실행할 구문을 작성하는 블럭
				
				// 3. 스트림을 다 이용했으면 자원 반납하기 (반드시)
				try {
					fout.close();
				} catch(IOException e) {
					e.printStackTrace();
				}

			}
	}
	
	// 프로그램 <--- 외부매체(파일)
	// 입력: 파일로부터 데이터를 가지고 오겠다 (즉, 읽어들이겠다)
	public void fileRead() {
		
		// FileInputStream: 파일로부터 데이터를 1byte 단위로 입력받는 스트림
		
		// 0. 변수 선언 후 null로 초기화
		FileInputStream fin = null;
		
		try {
			// 1. 스트림 객체 생성하기 == 연결 통로 만들기
			fin = new FileInputStream("a_byte.txt"); // try ~ catch 블록에 넣기 
			// 파일 경로 제시, 입력받을 때에는 반드시 존재하는 파일명으로 제시해야 함!
			
			// 2. 읽어들이기 == 입력받기: read() 메소드 사용
			// => 단, 1byte 단위로 하나씩 읽어 옴
			/*
			System.out.println(fin.read()); // IOEcepton catch 블럭 추가하기
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			// 파일 끝을 만나는 순간 fin.read() => -1 반환
			System.out.println(fin.read());
			System.out.println(fin.read());
			// 출력할 때는 문자로, 입력받을 때는 숫자로 받아짐
			// 입력 시 (char)로 강제 형변환 하여 문자로 입력받을 수 있음
			// println이 아닌 print로 연이어서 출력도 가능
			*/
			
			// 반복문으로  활용하기
			
				// 퐁당퐁당 출력됨
				/* 메소드를 한 번 돌릴 때마다 두 번 호출되는 구조라서 내가 원하는 값을 얻을 수 없음
				while(fin.read() != -1) { // fin.read()의 결과값이 -1이 아닐 경우에만 반복 돌리겠음
					System.out.println(fin.read());
				}
				*/
				
				// 해결방법 1. 무한 반복으로 매번 조건 검사 하기
				/*
				while (true) {
					
					int value = fin.read();
					
					if(value == -1) {
						break;
					}
					
					System.out.println(value);
				}
				*/
			
				// 해결방법 2. 조건식 내부에 변수 대입 구문을 활용하는 방법 (권장)
				int value = 0;
				while((value = fin.read()) != -1) {
					System.out.println(value);
				}
				
			// 3. 연결 통로 끊기 == 자원 반납하기 (무조건) => finally 블럭에 작성
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 3. 다 쓴 스트림 객체 반납 
			try {
				fin.close(); // try ~ catch 블록으로 묶기
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // 이제 실행 클래스에 fileRead(); 하러 감
		

		
		
	}

}

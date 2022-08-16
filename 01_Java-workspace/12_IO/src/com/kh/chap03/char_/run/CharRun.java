package com.kh.chap03.char_.run;

import com.kh.chap03.char_.model.dao.FileCharDao;

public class CharRun {
	
	/*
	 * *문자 기반 스트림
	 * 문자 스트림: 한 번에 2byte 짜리의 데이터가 이동할 수 있는 넓은 통로 (XXXReader / XXXwriter)
	 * 기반 스트림: 외부 매체와 직접적으로 연결되는 main 통로
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		FileCharDao fc = new FileCharDao();
		
		fc.fileSave();

	}

}

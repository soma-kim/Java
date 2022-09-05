package com.kh.chap02.byte_.run;

import com.kh.chap02.byte_.model.dao.FileByteDao;

public class ByteRun {
	
	
	/*
	 * *바이트 기반 스트림
	 * 바이트 스트림: 1byte 단위로만 입출력할 수 있는 좁은 통로(XXXInputStream / XXXOutputStream)
	 * 기반 스트림: 외부 매체와 직접적으로 연결되는 메인 통로
	 * 
	 * => 외부 매체를 지정하고 그 외부매체와 직접적으로 연결되는 1byte 단위의 통로를 만들겠음
	 * XXXInputStream: XXX 매체로부터 데이터를 입력받는 통로
	 * 					(외부 매체로부터 데이터를 가지고 오겠다. == 읽어들이겠다)
	 * XXXOutputStream: XXX 매체로부터 데이터를 출력하는 통로
	 * 					(외부 매체에 데이터를 내보내겠다 == 쓰겠다)
	 * 
	 */
	
	public static void main(String[] args) {
		
		FileByteDao fb = new FileByteDao();
		
		// fb.fileSave();
		
		fb.fileRead();

		
		
		
	}

}

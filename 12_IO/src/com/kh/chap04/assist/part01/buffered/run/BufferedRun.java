package com.kh.chap04.assist.part01.buffered.run;

import com.kh.chap04.assist.part01.buffered.model.dao.BufferedDao;

public class BufferedRun {
	
	/*
	 * *보조 스트림
	 * 기반 스트림(외부 매체와 직접 연결되어 있는 통로)의 부족한 기능들을 확장시킬 수 있는 스트림
	 * 보조 스트림은 단독으로 사용 불가(즉, 단독으로 객체 생성이 불가)
	 * => 입력용 기반 스트림일 경우에는 입력용 보조 스트림을 써야 하고
	 * 	    출력용 기반 스트림일 경우에는 출력용 보조 스트림을 써야 함!
	 * 
	 * [ 표현법 ]
	 * // 1단계: 기반스트림 생성
	 * 기반스트림클래스명 기반스트림객체명 = new 기반스트림클래스명(파일명);
	 * // 2단계: 기반스트림객체를 매개변수 삼아서 보조스트림객체 생성
	 * 보조스트림클래스명 보조스트림객체명 = new 보조스트림클래스명(기반스트림객체);
	 * 
	 * => 속도 성능 향상 목적의 보조스트림: BufferedXXX
	 * 								(버퍼 공간을 제공해서 한 번에 내용물을 모아뒀다가 한꺼번에 입출력 진행)
	 */
	

	public static void main(String[] args) {
		
		BufferedDao bd = new BufferedDao();
		// bd.fileSave();
		bd.fileRead();

		
	}

}

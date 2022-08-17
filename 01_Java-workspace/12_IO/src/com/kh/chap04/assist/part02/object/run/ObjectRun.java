package com.kh.chap04.assist.part02.object.run;

import com.kh.chap04.assist.part02.object.model.dao.ObjectDao;
import com.kh.chap04.assist.part02.object.model.dao.ObjectsDao;

public class ObjectRun {
	
	/*
	 * 보조 스트림
	 * 기반 스트림만으로 부족한 기능을 추가해 주는 보조 역할의 스트림
	 * 절대로 단독으로 객체 생성 불가!
	 * 
	 * 객체 단위로 입출력 할 수 있는 기능을 제공하는 보조 스트림
	 * => ObjectInputStream (1byte 입력용 보조) / ObjectOutputStream (1byte 출력용 보조) 
	 */

	public static void main(String[] args) {
		
		ObjectDao od = new ObjectDao();
		
		// od.fileSave();
		
		// od.fileRead();
		
		ObjectsDao ods = new ObjectsDao();
		
		 ods.fileSave();

		// ods.fileRead();
	}

}

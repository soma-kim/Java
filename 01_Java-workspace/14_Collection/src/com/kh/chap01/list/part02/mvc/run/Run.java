package com.kh.chap01.list.part02.mvc.run;

import com.kh.chap01.list.part02.mvc.view.MusicView;

public class Run {

	// 프로그램의 시작점: 사용자가 프로그램이 시작되었을 때 가장 먼저 볼 화면을 담당할 메소드를 호출하는 역할
	public static void main(String[] args) {
		
		MusicView mv = new MusicView();
		
		mv.mainMenu();

	}

}

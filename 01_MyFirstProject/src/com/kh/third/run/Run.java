package com.kh.third.run;

import com.kh.third.MyName;

public class Run {
	
	public static void main(String[] args) {
		
		MyName mn = new MyName();
		mn.CallMyName();
		
	}

}


//실습 과제
//01_MyFirstProject 프로젝트 내에
//com.kh.third 패키지에 MyName 클래스 생성
//=> callMyName 메소드 정의
//=> 출력문을 이용해서 "안녕하세요 xxx 입니다." 출력
//com.kh.third.run 패키지에 Run 클래스 생성
//=> main 메소드 생성 후 callMyName 메소드를 호출
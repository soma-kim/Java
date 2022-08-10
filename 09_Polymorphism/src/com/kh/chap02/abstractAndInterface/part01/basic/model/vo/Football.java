package com.kh.chap02.abstractAndInterface.part01.basic.model.vo;

// Sports 상속받기
public class Football extends Sports {
	
	// 필드부
	// 따로 만들 필드 없습니다~
	
	// 생성자부
	public Football () {
		
	}
	
	public Football(int people) {
		super(people);
	}
	
	// 메소드부
	@Override
	public void rule() {
		System.out.println("손이 아닌 발로 공을 차야 함");
	}

}

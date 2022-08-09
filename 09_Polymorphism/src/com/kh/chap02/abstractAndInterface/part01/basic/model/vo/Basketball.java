package com.kh.chap02.abstractAndInterface.part01.basic.model.vo;

//Sports 상속받기
public class Basketball extends Sports{
	
	// 필드부
	// 따로 만들 필드 없습니다~
	
	// 생성자부
	public Basketball() {
		
	}
	
	public Basketball(int people) {
		super(people);
	}
	
	// 메소드부
	// rule 메소드 오버라이딩
	
	public void rule() {
		System.out.println("드리블 없이 3 발자국 이상 움직이면 안 되나...요?");
	}

}

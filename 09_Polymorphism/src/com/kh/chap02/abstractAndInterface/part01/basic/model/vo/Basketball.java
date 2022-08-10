package com.kh.chap02.abstractAndInterface.part01.basic.model.vo;

// Sports 상속받기
public class Basketball extends Sports{
	
	// 미완성된 클래스인 추상 클래스를 상속받게 되면
	// 부모 클래스에 있는 추상 메소드를 강제로 오버라이딩을 통해 완성시켜 줘야 함
	
	// 필드부
	// 따로 만들 필드 없습니다~
	
	// 생성자부
	public Basketball() {
		
	}
	
	public Basketball(int people) {
		super(people);
	}
	
	// 메소드부
	@Override
	public void rule() {
		System.out.println("손으로 공을 던져 링에 넣어야 함");
	}

}

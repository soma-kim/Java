package com.kh.chap02.abstractAndInterface.part02.family.model.vo;
				// 확장한다 		// 구현한다. 라는 뜻 
public class Baby extends Person implements Basic {
	
	// 필드부
	// 추가 필드 없음
	
	// 생성자부
	public Baby() {
		
	}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// 메소드부
	// 추가 필드 없으므로 getter, setter 필요하지 않음
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void eat() { // 아기가 밥을 먹으면?
		
		// 몸무게 3 증가
		super.setWeight(super.getWeight() + 3);
		
		// 건강도 1 증가
		super.setHealth(super.getHealth() + 1);
	}
	
	@Override
	public void sleep() { // 아기가 잠을 자면?
		
		// 건강도 3 증가
		super.setHealth(super.getHealth() + 3);
		
	}
	
	

}

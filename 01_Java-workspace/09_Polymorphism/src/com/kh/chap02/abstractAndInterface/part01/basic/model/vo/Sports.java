package com.kh.chap02.abstractAndInterface.part01.basic.model.vo;

// public class Sports {
public abstract class Sports { // 추상 클래스(abstract 키워드)
	
	// 필드부
	private int people; // 스포츠에 참여하는 선수 명 수
	
	// 생성자부
	public Sports() {
		
	}
	
	public Sports(int people) {
		this.people = people;
	}
	
	// 메소드부
	// getter/setter, toString() 오버라이딩, 규칙을 출력하는 public void rule 메소드
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	@Override
	public String toString() {
		return "people: " + people;
	}
	
	// 규칙을 출력하는 public void rule() 메소드
	/*
	public void rule() {
		System.out.println("규칙을 잘 지켜서 플레이하세요"); // Sports 라고 포괄적으로 표현했을 때 정확한 룰이 없음
	}
	*/
	
	// 아니 어차피 자식 클래스가 지 입맛대로 메소드 바꿀 것 같으면 부모 클래스에서는 그냥
	
	// public void rule(); // 이렇게 쓰면 안 되나?
	// This method requires a body instead of a semicolon 오류 뜸
	
	public abstract void rule();
	// The abstract method rule in type Sports can only be defined by an abstract class: abstract 클래스 내에서만 정의될 수 있다는 내용으로 오류 메시지 바뀜
	
	/*
	 * 몸통부가 존재하지 않는 미완성된 메소드 == 추상 메소드
	 * 단, 추상 메소드를 정의하고자 하다면 표현상 abstract 라는 예약어를 추가해 줘야 함
	 * 
	 * 미완성된 추상 메소드가 하나라도 포함되는 순간 해당 클래스 또한 미완성된 클래스 (추상 클래스)가 되어 버림
	 * 
	 * 추상 클래스 또한 예약어로 abstract를 붙이면 됨!
	 * public class Sports { => public abstract class Sports { 수정해 주면 오류 없어짐!
	 */
	


}

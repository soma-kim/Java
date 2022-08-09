package com.kh.chap02.abstractAndInterface.part01.basic.model.vo;

public class Sports {
	
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
	
	public String toString() {
		return "people: " + people;
	}
	
	public void rule() {
		System.out.println("규칙을 잘 지켜서 플레이하세요");
	}

}

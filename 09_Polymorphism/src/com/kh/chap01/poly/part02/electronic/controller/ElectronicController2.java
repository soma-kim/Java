package com.kh.chap01.poly.part02.electronic.controller;

import com.kh.chap01.poly.part02.electronic.mode.vo.Electronic;

// 다형성을 적용시켰을 때
public class ElectronicController2 {
	
	// 용산전자상가에 다시 새롭게 차린 가게
	
	// 필드부
	//어느 물건이든지 넣을 수 있는 3칸짜리 창고
	private Electronic[] elec = new Electronic[3];
	
	// 메소드부
	// 창고에 물건을 넣는 메소드: 뭐를 어디에 넣을 건지?
	public void insert(Electronic any, int index) { // 어느 전자제품이 들어오든지, 창고에 넣을 건데
		elec[index] = any;                          // 그 들어오는 전자제품은 창고에 순서대로 넣을 거야
	}
	
	// 창고로부터 물건을 하나 꺼내오는 메소드
	public Electronic select(int index) { // 전자제품의 순서를 조회할 건데
		return elec[index];               // 내가 원하는 창고 순서에 있는 애를 꺼내 와 줘
	}
	
	// 창고에 있는 물건 모두를 다 보여 주는 메소드
	public Electronic[] select() { // 전자제품 조회할 거야
		return elec;              // 전자제품 다 들고와~
	}
	

}

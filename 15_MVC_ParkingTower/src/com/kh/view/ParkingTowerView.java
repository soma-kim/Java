package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerContorller;
import com.kh.model.vo.Car;

public class ParkingTowerView {
	
	// 필드가 변수로 들어간 거라 수정하지 말라고 private 해 줌! 안 해 줘도 무방
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerContorller ptc = new ParkingTowerContorller();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("===== 메뉴 구성 =====");
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 주차된 차량 검색");
			System.out.println("4. 전체 출력");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 입력: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1 : insertCar();
					break;
			case 2 : deleteCar();
					break;
			case 3 : searchCar();
					break;
			case 4 : selectCar();
					break;
			case 0 : System.out.println("프로그램을 종료합니다.");
					return;
			default : System.out.println("없는 메뉴입니다. 메뉴를 다시 입력하세요.");
			}
		}
		
	}
	
	public void insertCar() {
		System.out.print("차량 번호를 입력하세요: ");
		String carNum = sc.nextLine();
		
		System.out.print("차량 종류를 입력하세요: ");
		int carType = sc.nextInt();
		sc.nextLine();
		
		System.out.print("차량 소유자를 입력하세요: ");
		String owner = sc.nextLine();
		
		int result = ptc.insertCar(carNum, carType, owner);
		
		if(result > 0) {
			System.out.println("성공적으로 주차되었습니다.");
		} else {
			System.out.println("주차를 실패했습니다.");
		}
	}
	
	public void deleteCar() {
		System.out.print("차량번호를 입력하세요: ");
		String carNum = sc.nextLine();
		
		int result = ptc.deleteCar(carNum);
		
		if(result == 1) {
			System.out.println("출차에 성공하였습니다.");
		} else {
			System.out.println("출차에 실패하였습니다.");
		}
	}
	
	public void searchCar() {
		System.out.print("차량 소유주를 입력하세요: ");
		String owner = sc.nextLine();
		
		ArrayList<Car> search = ptc.searchCar(owner);
		
		if(!search.isEmpty()) {
			for(int i = 0; i < search.size(); i++) {
				System.out.println(search.get(i));
			}
		} else {
			System.out.println("일치하는 차량이 없습니다.");
			
		}
	}
	
	public void selectCar() {
		System.out.println("등록된 차량 전체 출력");
		
		ArrayList<Car> list = ptc.selectCar();
		
		if(list.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			System.out.println("주차된 차량은 " + list.size() + "대입니다.");
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}

	}

}

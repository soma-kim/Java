package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerContorller {
	
	private ArrayList<Car> list = new ArrayList<>();
	
	public int insertCar(String carNum, int carType, String owner) {
		
		int result = 0;
		// int before = list.size();
		int parkingNum = 0;
		
		if(list.isEmpty()) { // 또는 list.size() == 0 로도 조건식 가능!
			parkingNum = 1;
		} else {
			parkingNum = list.get(list.size()-1).getParkingNum() + 1;
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			parkingNum = list.get(i).getParkingNum() + 1;
//		}
		
		list.add(list.size(), new Car(parkingNum, carNum, carType, owner));
		// list에 인덱스 안 적으면 알아서 제일 뒤에 생성되므로 안 적어도 상관 x
		result++;
		
		return result;
		// return list.size() - before;
	}
	
	public int deleteCar(String carNum) {
		
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getCarNum().equals(carNum)) {
				list.remove(i);
				i--;
				result++;
			}
		}
		
		return result;
	}
	
	public ArrayList<Car> searchCar(String owner){
		
		ArrayList<Car> search = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getOwner().equals(owner)) {
//				search.add(new Car(list.get(i).getParkingNum(), list.get(i).getCarNum(),
//									list.get(i).getCarType(), list.get(i).getOwner()));
				
				System.out.println(list.get(i));
				
			}
		}
		
		return search;
		
	}
	
	public ArrayList<Car> selectCar(){
		
		return list;
	}

}
package com.kh.model.vo;

public class Car {
	
	private int parkingNum;
	private String carNum;
	private int carType;
	private String owner;
	
	public Car() {
		super();
	}

	public Car(int parkingNum, String carNum, int carType, String owner) {
		super();
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}
	
	public int getParkingNum() {
		return parkingNum;
	}
	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public int getCarType() {
		return carType;
	}
	public void setCarType(int carType) {
		this.carType = carType;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		
		String c = "";
		switch(carType) {
		case 1 : c = "경차"; break;
		case 2 : c = "세단"; break;
		case 3 : c = "SUV"; break;
		case 4 : c = "트럭"; break;
		}
		return "Car [parkingNum=" + parkingNum + ", carNum=" + carNum + ", carType=" + c + ", owner=" + owner
				+ "]";
	}
}

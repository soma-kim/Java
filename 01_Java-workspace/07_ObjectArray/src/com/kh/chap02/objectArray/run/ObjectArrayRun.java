package com.kh.chap02.objectArray.run;

import java.util.ArrayList;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ObjectArrayRun {
	
	public static void main(String[] args) {
		
		// "Phone 타입의 주소값만" 담을 수 있는 배열 생성
		/*
		Phone[] arr = new Phone[3]; // JVM에 의해 모든 방이 null 값으로 초기화된 상태
		
		System.out.println(arr); // 주소값
		System.out.println(arr.length); // 배열의 사이즈: 3
		System.out.println(arr[0]); // null
		
		arr[0] = new Phone();
		arr[0].setName("아이폰");
		System.out.println(arr[0].getName());
		
		arr[0] = new Phone();
		arr[1] = new Phone("갤럭시", "10", "삼성", 1000000);
		arr[2] = new Phone("아이폰", "11pro", "애플", 800000);
			
		arr[0].setName("아이폰");
		arr[0].setSeries("8");
		arr[0].setBrand("애플");
		arr[0].setPrice(500000); // 직접 접근 하여 값을 넣는 과정
		
		System.out.println("---------------------------");
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i].information());
			sum += arr[i].getPrice();
			
		}
		System.out.println("총 가격: " + sum + "원");
		System.out.println("평균가: " + sum / arr.length + "원");
		*/
		
		
	}

}

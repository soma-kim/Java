package com.kh.chap02.string.controller;

import java.util.Scanner;

public class B_StringMethodTest {
	
	public void method1() {
		
		String str1 = "Hell world";
		
		// 메소드명(매개변수): 반환형
		
		// 1. 문자열.charAt(int indec): 반환값 char형
		// => 문자열에서 전달받은 index 위치의 문자 하나만 뽑아서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch: " + ch); // ch: l
		
		// 2. 문자열.concat(String str): 반환값 String형
		// => 문자열과 전달된 또 다른 문자열을 하나로 연이어서 리턴
		String str2 = str1.concat("!!!"); // String str2 = str1 + "!!!";
		System.out.println("str2: " + str2); // str2: Hell world!!!
		
		// 3. 문자열 .length(): 반환형 int형
		// => 문자열의 길이 반환
		System.out.println("str1의 길이: " + str1.length()); // str1의 길이: 10
		
		// 4_1. 문자열.subString(int beginIndex): 반환값 String형
		// => 문자열의 beginIndex 위치에서부터 끝까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(6)); // orld
		
		// 4_2. 문자열.subString(int beginIndex, int endIndex): 반환값 String형
		// => 문자열의 beginIndex 위치에서부터 endInex - 1 위치까지 추출해서 리턴 
		System.out.println(str1.substring(0, 6)); // 0 <= 인덱스범위 < 6, Hell w

		
		// 5. 문자열.replace(char old, char new): 반환값 String형
		// => 문자열로부터 old 문자를 new 문자로 변환한 문자열을 리턴
		String str3 = str1.replace('l', 'c');
		System.out.println("str3: " + str3); // str3: Hecc worcd
		
		// 6. 문자열.trim(): 반환할 Stirng형
		// => 문자열의 앞, 뒤 공백을 모두 제거한 문자열을 티런
		String str4 = "      JA         VA       ";
		System.out.println("trim(): " + str4.trim()); // trim(): JA         VA, 문자 사이 중간 공백은 없어지지 않음!
		
		// 참고) 중간에 있는 공백을 없애고 싶다면?
		// replace 메소드를 활용해 보자!
		System.out.println("replace를 활용해서 가운데 공백도 없애기: " + str4.replace(" ", "")); // replace를 활용해서 가운데 공백도 없애기: JAVA
		
		// 7_1. 문자열.toUpperCase(): 반환값 String형
		// => 문자열을 모두 다 대문자로 변경 후 문자열 리턴
		System.out.println("upper: " + str1.toUpperCase()); // upper: HELL WORLD
		
		// 7_2. 문자열.toLowerCase(): 반환값 String형
		// => 문자열을 모두 다 소문자로 변경 후 문자열 리턴
		System.out.println("lower: " + str1.toLowerCase()); // lower: hell world
		
		// 활용 예시
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시겠습니까? (y/n): ");
		// char answer = sc.nextLine().charAt(0); // Y, y, N, n
		char answer = sc.nextLine().toUpperCase().charAt(0); // Y, N으로 경우가 좁혀짐!
		// => 메소드를 연이어서 호출(메소드체이닝)
		
		if(answer == 'Y') {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("프로그램을 종료하지 않습니다.");
		}
	}

}

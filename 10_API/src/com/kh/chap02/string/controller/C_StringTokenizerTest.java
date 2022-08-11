package com.kh.chap02.string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		// 문자열을 분리시키는 방법
		
		String str = "Java,Oracle,JDBC,HTML,Server,Spring";
		
			// 구분자를 제시해서 해당 문자열을 분리시키는 방법
			// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 관리하고자 할 때
			//		  문자열.split(String 구분자): 반환값 String[]형
				
			String[] arr = str.split(",");
			/*
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			*/
			
			// 문자열 배열의 경우 for문을 이런 식으로도 쓸 수 있음 (향상된 for문, foreach문)
			// for(값을받아줄수있는변수선언문 : 순차적으로접근할배열또는컬렉션명)
	
			for(String s : arr) {
				System.out.println(s);
			}
			
			System.out.println("====================");
		
			// 방법2. 분리된 각각의 문자열들을 "토큰"(단어) 단위로 취급하고 싶을 때
			//		 java.util.StringTokenizer 클래스를 이용하는 방법
			//		 StringTokenizer stn = new StringTokenizer(분리시키고자하는문자열, 구분자);
			
			StringTokenizer stn = new StringTokenizer(str, ",");
			
			System.out.println("분리된 문자열의 갯수: " + stn.countTokens()); // 분리된 문자열의 갯수: 6
			
			/*
			// 출력
			System.out.println(stn.nextToken()); // Java
			// 이 시점에서 토큰의 개수는 5임
			System.out.println(stn.countTokens()); // 5
			System.out.println(stn.nextToken()); // Oracle
			System.out.println(stn.nextToken()); // JDBC
			System.out.println(stn.nextToken()); // HTML
			System.out.println(stn.nextToken()); // Server
			System.out.println(stn.nextToken()); // Spring
			
			System.out.println(stn.nextToken());
			// NoSuchElementException: 더 이상 찾을 요소가 없음
			// => 현재 남아 있는 stn 토큰 개수의 범위를 벗어났을 때 발생하는 오류
			*/
			
			// 반복문 활용
			for(int i = 0; i < stn.countTokens(); i++) {
				System.out.println(stn.nextToken());
			}
			
			/* 반복문에서 무슨 일이 있었을까?
			 *  i = 0, 토큰 개수 6개 => true => Java 출력 => i++
			 *  i = 1, 토큰 개수 5개 => true => Oracle 출력 => i++
			 *  i = 2, 토큰 개수 4개 => true => JDBC 출력 => i++
			 *  i = 3, 토큰 개수 3개 => false => 반복문 끝!
			 */
			
			
			// 해결방법1. 변수 활용
			/*
			int count = stn.countTokens(); // 처음 토큰의 개수를 변수화시켜서 고정시켜 놓음
			
			for(int i = 0; i < count; i++) {
				System.out.println(stn.nextToken());
			}
			*/
			
			// 해결방법2. while문 사용
			// stn.hasMoreTokens(): stn 객체에 더 이상 뽑아낼 토큰이 있다면 true, 아니라면 false로 반환
			while (stn.hasMoreTokens()) { // stn 공간에 남아 있는 토큰이 있을 동안에만 반복을 수행하겠다
				System.out.println(stn.nextToken());;
			}
			
			
	}

}

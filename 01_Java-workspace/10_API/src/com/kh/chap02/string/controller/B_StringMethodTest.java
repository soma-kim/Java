package com.kh.chap02.string.controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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
		// => 문자열의 앞, 뒤 공백을 모두 제거한 문자열을 리턴
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
		
		/*
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
		*/
		
		
		// 문자열 => char[]
		/*
		char[] arr = new char[str1.length()];
		
		for(int i = 0; i < arr.lengh; i++) {
			arr[i] = str1.charAt(i);
		}
		*/
		
		// 8. 문자열.toCharArray(): 결과값 char[]형
		// => 문자열의 각 문자들을 char[] 배열로 옮겨 담은 후 그 배열을 리턴
		char[] arr = str1.toCharArray();
		System.out.println(Arrays.toString(arr)); // [H, e, l, l,  , w, o, r, l, d]
		
		
		// char[] => 문자열
		char[] arr2 = {'a', 'p', 'p', 'l', 'e'};
		
		// 9. String.valueOf(char[] data): 변환값 String형
		// => 전달된 char[] 배열에 담긴 문자들을 하나의 문자열로 연이어서 리턴
		System.out.println(String.valueOf(arr2)); // apple

	}
	// 실습 문제
	public void method2() {
		
		/*
		 * 욕설 필터링 프로그램
		 * - 사용자에게 문장을 하나 입력받습니다
		 * - 다음 제시되는 단어에 해당할 경우 * 으로 대체해서 출력하도록 구현해 보세요
		 * - 신발끈, 개나리, 수박씨, 호루라기, 시베리아, 십장생, 조카, 주옥, 쌍쌍바, 십자수, 식빵
		 * 
		 * ex) 이런 신발끈 같은 개나리 호루라기야!!!
		 * => 이런 *** 같은 *** ****야!!!
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요: ");
		String sen = sc.nextLine();
		// sc.next(); // 를 쓰면 공백 전까지만 출력됨!! "가 나다라"를 입력할 시 "가"만 출력됨!
		
		// 단어들을 배열에 담아 놓는 게 편하다?
		String abuse = "신발끈,개나리,수박씨,호루라기,시베리아,십장생,조카,주옥,쌍쌍바,십자수,식빵"; // 11개
		String[] arr = abuse.split(","); // 현재 arr[10] 배열에 11개의 욕이 담겨 있음
		// System.out.println(arr.length); // 11
		
		// 문자열 배열의 경우 for문을 이런 식으로도 쓸 수 있음 (향상된 for문, foreach문)
		// for(값을받아줄수있는변수선언문 : 순차적으로접근할배열또는컬렉션명)
		// <향상된 for문>
		
		// arr 배열에 담긴 욕의 수만큼 for문을 돌 거 
		for( String sAbuse : arr ) {	//sAbuse 처음에는 신발끈이, 두번째는 개나리가,세번째는 수박씨가 담길 거
			int abuseLth = sAbuse.length();	// 욕의 글자 수를 뽑는다 (ex 신발끈: 3)
			
			String trans = "";
			
			// 욕의 글자 수만큼 *이 만들어져야 한다 (ex 신발끈 -> ***, 시베리아 -> ****)
			for( int i = 0 ; i < abuseLth ; i ++ ) {
				trans += "*";
			}
			
			// 내가 입력한 문장에서 욕이 있다면 별로 바꿀게!
			sen = sen.replace(sAbuse, trans);
		}
		
		System.out.println(sen);
		
		
//		<일반 for문>
//		for(int i = 0; i < arr.length; i++) {
//		
//		int abuseLth = arr[i].length();		
//		String trans = "";
//		
//		for( int j = 0 ; j < abuseLth ; j ++ ) {
//			trans += "*";
//		}
//				
//		sen = sen.replace(arr[i], trans);
//		
//		========================================================
//		
//		<강사님 풀이>
//		// 필터링 배열
//		String[] filter = {"신발끈", "개나리", "수박씨", "호루라기", "시베리아", "십장생", "조카", "주옥", "쌍쌍바", "십자수", "식빵"};
// 		// 필터링 작업
//		for(int i = 0; i < filter.length; i++) {
//			
//			// 각 인덱스에 들은 필터링할 문자열 기준으로 치환할 문자열을 새로 생성
//			int size = filter[i].length(); // 해당 글자의 글자 수를 추출
//			String star = "";
//			for(int j = 0, j < size; j++) {
//				star += "*";
//			}
//			
//			// filter[i] 글자를 star로 대체 => replace 메소드
//			str = str.replace(filter[i], star);
//		}
		
		// 출력
//		System.out.println(str);
//		
//	}
		/*
		 * 욕설의 앞자리만 살려서 출력하고 싶다면?
		 * ex: 이런 신** 같은 개** 호***야!!!
		 * 
		 * String[] filter = {"신발끈", "개나리", "수박씨", "호루라기", "시베리아", "십장생", "조카", "주옥", "쌍쌍바", "십자수", "식빵"};
		 * 
		 * for(int i = 0; i < filter.length; i++) {
		 * 		int size = filter[i].length(); 
		 *		String star ="" + filter[i].charAt(0); // 욕설의 첫 글자를 가지고 있게 함
		 *
		 *		for(int j = 0, j < size -1; j++) { // size - 1 해서 욕설의 글자보다 한 글자 적을 때까지!
		 *			star += "*";
		 *
		 *			str = str.replace(filter[i], star);
		 *	}
		
		 *	// 출력
		 *	System.out.println(str);
		 * 
		 */
		
		
	}
}

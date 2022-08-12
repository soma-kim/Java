package com.kh.chap03.wrapper.run;

public class WrapperRun {

	// 래퍼 클래스
	public static void main(String[] args) {
		
		/*
		 * Wrapper 클래스
		 * => 기본 자료형을 객체 타입으로 포장해 주는 클래스들을 래퍼 클래스라고 함
		 * 
		 * 		기본 자료형		<--->		Wrapper 클래스
		 * 		boolean						Boolean
		 * 		char						Character
		 * 		byte						Byte
		 * 		short						Short
		 * 		int							Integer
		 * 		long						Long
		 * 		float						Float
		 * 		double						Double
		 * 
		 * => 기본 자료형을 객체로 취급해야 하는 경우
		 * - 메소드 호출해야 할 때
		 * - 메소드의 매개변수로 기본 자료형 값이 아닌 객체 타입만 요구될 때
		 * - 다형성을 적용하고자 할 때
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		// 동등비교를 하고자 할 때
		// System.out.println(num1 == num2);
		// System.out.println(num1.equals(num2)); // int형 변수이기 때문에 사용할 수가 없어요
		
		// 일반 기본 자료형에서 객체 자료형의 메소드를 호출하고자 할 때 Wrapper 클래스로 변환해서 주로 사용
		
		// 기본 자료형 => Wrapper자료형(Boxing)
		
		// 1. 객체 생성 구문을 이용한 방법(생성자 호출)
		Integer i1 = new Integer(num1); // num1 => i1
		Integer i2 = new Integer(num2); // num2 => i2
		
		System.out.println(i1 /* .toString() */); // 10
		System.out.println(i2); // 15
		
		System.out.println(i1 == i2); // 주소값 비교 false
		System.out.println(i1.equals(i2)); // (숫자로써의) 내용 비교 false
		System.out.println(i1.hashCode()); // 10
		System.out.println(i1.compareTo(i2)); // -1
		// a.compareTo(b): a가 b보다 크면 1, b가 더 크면 -1, 동일하면 0 리턴
		// => 객체로 바꾸게 되면 메소드를 자유롭게 이용 가능함
		
		
		// 2. 객체를 생성하지 않고 곧바로 대입하는 방법(AutoBoxing)
		Integer i3 = 10;
		System.out.println(i3); // 10
		
		// 특이케이스. 객체 생성구문을 통해서 반드시 변환해야 하는 경우 => 문자열을 Integer로 바꾸는 경우
		// Integer i4 = "123";
		Integer i4 = new Integer("123"); // "123" => 123
		System.out.println(i4);
		
		// Wrapper 자료형 => 기본 자료형(UnBoxing)
		
		// 1. 해당 그 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 활용하는 법
		int num3 = i3.intValue(); // i3 => num3 10
		int num4 = i4.intValue(); // i4 => num4 123
		
		System.out.println(num3 > num4); // false
		
		// 2. 메소드 따위를 사용하지 않고 바로 대입하는 방법 (Auto UnBoxing)
		int num5 = i1; // 10
		int num6 = i2; // 15
		
		System.out.println(i1 == i2); // false
		
		System.out.println("=====================");
		
		// 기본자료형값 <---> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // "1015.3" => 숫자가 아닌 문자열로 출력됨
		
		// 1. String(== 문자열) --> 기본자료형: 파싱한다
		// 						    	        해당Wrapper클래스명.parseXXX(변환할문자형);
		int i = Integer.parseInt(str1); // "10" => 10
		double d = Double.parseDouble(str2); // "15.3" => 15.3
		
		System.out.println(i + d); // 25.3
		
		// 2. 기본자료형 --> String(== 문자열)
		// String.valueOf(변환할기본자료형값): String형
		String strI = String.valueOf(i); // 10 => "10"
		String strD = String.valueOf(d); // 15.3 => "15.3"
		
		System.out.println(strI + strD); // 1015.3
		
	}

}

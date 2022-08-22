package com.kh.chap01.list.part02.properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap01.list.part01.hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		/*
		 * Properties: Map 계열 => key, value 세트로 저장함
		 * 			      단, Properties만의 특징이라고 한다면
		 * 			   key, value 모두 String 타입으로 쓰는 것을 권장
		 */
		
		Properties prop = new Properties();
		
		/*
		prop.put("다이제", new Snack("초코맛", 1500));
		// String이 아닌 값을 넣을 경우 기존의 Map 계열과 동일하게 put 메소드로 key + value 세트로 넣을 수 있음
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		// 기존의 Map 계열과 동일하게 get 메소드로 value 값을 불러올 수 있음
		
		// 단, 주로 Properties를 사용하는 경우는
		// Properties에 담겨 있는 key + value를 세트로 파일로 기록하거나, 파일에 기록되어 있는 key + value를 가지고 올 경우 주로 사용됨
		// => 파일 입출력에 특화된 타입이기 때문에 "문자열" 형태로 키와 밸류를 지정하는 것이 권장됨
		
		// Properties 에서 제공하는 파일로 출력하는 메소드: store(), storeToXML()
		//					        파일로부터 입력받는 메소드: load(), loadFromXML()
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			// 내부적으로 파일 입출력 시 String 타입이 아닌 다른 타입으로 key, value를 넣어 버리면
			// ClassCastException이 발생함
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// Properties의 put 메소드 이용 시
		// Key, Value가 모두 Object 타입으로 정의되어 있어서 String이 아닌 다른 값들이 들어갈 수 있는데
		// setProperty 메소드를 이용하면 key, value 모두 String 타입으로 매개변수를 넣을 수 있음!
		
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		// {Map=Properties, List=ArrayList, Set=HashSet}
		// 저장 순서 유지 X, key값 중복 X, 중복되어도 value가 덮어씌워짐
		
		// Properties를 쓸 때 보통은 값을 추가하고자 할 경우 setProperty 메소드를 사용함
		
		try {
			// 2. store(OutputStream os, String comments)
			// => Properties에 담긴 key - value 값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
			// } catch (FileNotFoundException e) {
			// e.printStackTrace();
			
			// 3. storeToXML()
			// => Properties에 담긴 key - value 값들을 xml 형식의 파일로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "properties Test");
			// xml: 어느 프로그래밍 언어와 쓰든지 간에 별 탈 없는 확장자
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// {Map=Properties, List=ArrayList, Set=HashSet}
		
		// 2. store 과정 이후 test.properties 파일에 기록된 내용
		// #Properties Test
		// #Mon Aug 22 15:46:08 KST 2022
		// Map=Properties
		// List=ArrayList
		// Set=HashSet



	}

}

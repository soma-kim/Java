package com.kh.chap01.list.part02.properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		
		// 파일로부터 읽어들여서 Properties 객체에 담아 두려면
		// 우선적으로 Properties 객체부터 생성해야 함
		Properties prop = new Properties(); // 비어 있는 상태: ()
		
		try {
		// 4. load(InputStream in)
		// => 해당 파일로부터 값을 key - value 세트로 읽어들여 해당 Properties 객체에 값을 넣어 주는 역할
			// prop.load(new FileInputStream("test.properties"));

			// } catch (FileNotFoundException e) {
			// e.printStackTrace();
			
			// 5. loadFromXML(InputStream in)
			// => 해당 xml 파일로부터 값을 key - value 세트로 읽어들여 해당 Properties 객체에 값을 넣어 주는 역할
			prop.loadFromXML(new FileInputStream("test.xml"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// System.out.println(prop);
		// {List=ArrayList, Map=Properties, Set=HashSet}
		
		// 6. getProperty(String key): String value를 리턴해 줌
		// => String 타입의 키값을 제시하면 String 타입의 밸류값을 리턴
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("Map"));
		System.out.println(prop.getProperty("Collection"));
		
		// ArrayList
		// HashSet
		// Properties
		// null
		// 없는 키값을 제시할 경우 null이 반환됨!
		
		/*
		 * .properties 파일을 사용하는 경우
		 * 우리가 보통 개발 시 해당 프로그램이 기본적으로 가져야 할 환경설정과 같은 정보들을
		 * 보통은 .properties 확장자를 가진 파일에 담아둠
		 * key - value 값들이 문자열로 외부 파일에 보관되면서
		 * 나중에 배포되었을 때 개발자가 아닌 일반 관리자가 손쉽게 환경설정과 관련된 세팅을 다룰 수 있게 됨
		 * => JDBC 가서 사용할 예정
		 * => value가 1줄로 끝나야 함
		 * 
		 * .xml 파일을 사용하는 경우
		 * xml 확장자 문서는 다양한 프로그래밍 언어간의 호환이 쉽다는 장점이 있고,
		 * value 값들이 여러 줄이어도 문제 없이 파일에 담길 수 있는 장점이 있기 때문에
		 * 프로그램에서 앞으로 사용할 외부 명령문들을 담아 둘 때 주로 사용됨
		 * => JDBC 가서 사용할 예정
		 * 
		 */

	}

}

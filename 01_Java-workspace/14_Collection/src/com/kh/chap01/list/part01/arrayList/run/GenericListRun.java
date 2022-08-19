package com.kh.chap01.list.part01.arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01.list.part01.arrayList.model.vo.Music;

public class GenericListRun {
	
	/*
	 * * 제네릭 (Generic)
	 * <> 안에 어떤 타입을 선언해주어 해당 컬렉션이 사용할 객체의 타입을 고정시켜주는 개념
	 * 내가 다룰 객체의 타입을 미리 명시하여 내가 사용하고 싶은 데이터 타입만 사용할 수 있게 해주는 효과
	 * => 마치 배열처럼 같은 자료형의 값들만 담겠다.
	 * 
	 * 별도의 제네릭 제시 없이 컬렉션 객체를 생성하면 (E == Object)
	 * ArrayList list = new ArrayList();
	 * 내부적으로 
	 * ArrayList<Object> list = new ArrayList<>();
	 * 
	 * 별도의 제네릭 제시를 해서 컬렉션 객체를 생성하면 (E == Music)
	 * ArrayList<Music> list = new ArrayList<>();
	 */
	
	public static void main(String[] args) {
		
		// 컬렉션명<자료형> 객체명 = new 컬렉션명<>();
		// => new 구문에 있는 제네릭 설정 부분에는 자료형 생략 가능 (JDK 8버전부터 가능한 문법)
		ArrayList<Music> list = new ArrayList<>(3);
		System.out.println(list); // 비어있는 상태
		
		// E --> Element : 제네릭 (E == Music)
		// 1. add(E e)
		list.add(new Music("넥스트레벨", "에스파"));
		list.add(new Music("필마이리듬", "레드벨벳")); 
		// list.add("끝");
		System.out.println(list);
		// 순서가 유지되면서 값 추가 (각 index 에 들어있는 꼴)
		// 크기에 제약 없음
		// 다양한 타입의 값을 넣을 수 없음 => 제네릭 설정을 했기 때문
		
		// 2. add(int index, E e)
		// list.add(1, "끝");
		list.add(1, new Music("던던댄스", "오마이걸"));
		System.out.println(list);
		
		// 3. set(int index, E e)
		// list.set(0,  "사계");
		list.set(0, new Music("사계", "태연"));
		System.out.println(list);
		
		// 4. remove(int index)
		list.remove(1);
		System.out.println(list);
		
		// 5. size()
		System.out.println("리스트에 담긴 데이터 수 : " + list.size());
		System.out.println("리스트의 마지막 인덱스 : " + (list.size() - 1));
		
		// 6. get(int index) : Music 타입 반환
		// Object obj = list.get(0); // 다형성에 의해서 UpCasting
		Music m = list.get(0);
		System.out.println(m);
		System.out.println(list.get(0));
		System.out.println(list.get(0).getTitle());
		
		System.out.println("=====================================");
		
		// 0번 ~ 마지막 인덱스까지의 데이터를 출력
		// for문
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("=====================================");

		// 향상된 for문
		// for(값을받아줄선언문 : 배열명또는컬렉션명)
		for(Music music : list)
			System.out.println(music);
		
		System.out.println("=====================================");
		
		// 7. subList(int beginIndex, int endIndex)
		List<Music> sub = list.subList(0, 1);
		System.out.println(sub);
		
		System.out.println("=====================================");
		
		// 8. addAll(Collection c)
		list.addAll(sub);
		System.out.println(list);
		
		System.out.println("=====================================");
		
		// 9. isEmpty()
		System.out.println("해당 리스트가 비어있습니까? : " + list.isEmpty());
		
		// 10. clear()
		list.clear();
		System.out.println(list);
		System.out.println("해당 리스트가 비어있습니까? : " + list.isEmpty());
	}
	
	/*
	 * * 제네릭을 설정하는 이유
	 * 1. 명시한 타입의 객체만 저장 가능하도록 타입의 제한을 두기 위해
	 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변황하는 절차를 없애기 위해
	 * 
	 * * 제네릭 설정 시 주의할 점
	 * 컬렉션에는 객체 타입만 들어갈 수 있기 때문에 기본자료형으로 설정은 불가!!
	 * 예) ArrayList<int> list = new ArrayList<>(); // 불가
	 * 		ArrayList<Integer> list = new ArrayList<>(); // 가능 => E == Integer
	 * 
	 */
	
	
	

}

























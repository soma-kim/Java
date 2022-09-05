package com.kh.chap03.map.part01.hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03.map.part01.hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		// 컬렉션의 계층 구조를 봤을 때
		// List나 Set 계열은 Collection을 구현한 클래스들
		// => add, get, ... 메소드 틀이 유사한 형태
		
		// Map 계열은 Collection을 구현한 클래스가 아님
		// => 메소드 틀이 조금씩 다를 예정임
		// 키 + 밸류 세트로!
		
		// 컬렉션을 이용할 준비: 컬렉션 객체 생성
		HashMap<String, Snack> hm = new HashMap<>(); // 비어 있는 상태
		
		// 1. put(K key, V value): map 공간에 key + value 세트로 추가해 주는 메소드
		// 제네릭 설정 안 할 경우 key값, value값은 Object 타입으로 잡힘
		
		// hm.put(key, value);
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸쵸", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		// hm.put("ㅁㅁ", 30); // 제네릭 설정했기 때문에 30 넣을 시 오류 남
		
		System.out.println(hm); // {키=밸류, 키=밸류, ...}
								// 저장 순서 유지 X, 중복의 기준은 key(value 값이 동일하다고 해도 key값이 중복되지 않으면 잘 저장됨)
		// {다이제=Snack [flavor=초코맛, calory=1500], 새우깡=Snack [flavor=짠맛, calory=500], 포테이토칩=Snack [flavor=짠맛, calory=500], 칸쵸=Snack [flavor=단맛, calory=600]}
		
		hm.put("새우깡", new Snack("매운맛", 700));
		System.out.println(hm);
		// {다이제=Snack [flavor=초코맛, calory=1500], 새우깡=Snack [flavor=매운맛, calory=700], 포테이토칩=Snack [flavor=짠맛, calory=500], 칸쵸=Snack [flavor=단맛, calory=600]}
		// 중복된 key값을 제시하면 해당 기존 value값이 새로운 value 값으로 덮어씌워짐
		
		// 2. get(Object key): V => 컬렉션에서 해당 키값의 value값을 돌려주는 메소드
		// key값을 제시해서 value값을 가지고 옴
		
		System.out.println(hm.get("다이제"));
		// Snack [flavor=초코맛, calory=1500]
		System.out.println(hm.get("빼빼로"));
		// null
		// 현재 존재하지 않는 key값을 제시한 경우 null이 반환됨
		
		// Object snack = hm.get("칸쵸");
		Snack snack = (Snack)hm.get("칸쵸"); // 제네릭 설정을 하지 않으면 매번 형변환 해야 함!
		System.out.println(snack);
		//Snack [flavor=단맛, calory=600]
		
		// 3. size(): 컬렉션에 담겨 있는 값의 개수 반환
		System.out.println("size: " + hm.size());
		//size: 4
		
		// 4. replace(K key, V value): 컬렉션에 해당 key 값을 찾아서 새로 전달된 value로 변경시켜 주는 메소드
		hm.replace("포테이토칩", new Snack("겁나짠맛", 1000));
		System.out.println(hm);
		// {다이제=Snack [flavor=초코맛, calory=1500], 새우깡=Snack [flavor=매운맛, calory=700], 포테이토칩=Snack [flavor=겁나짠맛, calory=1000], 칸쵸=Snack [flavor=단맛, calory=600]}
		
		// 참고: put 메소드랑 replace 메소드는 엄연히 다름
		// => put 메소드는 내가 매개변수로 제시한 키값이 이미 있으면, 밸류값을 덮어 띄워서 수정하지만
		//    원래 매개변수가 제시한 키값이 없다면, 밸류값을 추가해 주는 역할(추가의 역할이 메인)
		// => replace 메소드는 애초에 매개변수로 키값을 제시할 때 이미 있는 키값을 제시하여 해당 밸류값을 바꾸는 게 메인 역할 
		
		// 5. remove(Object key): 컬렉션에 해당 key값을 찾아서 key + value 세트로 지워 주는 메소드
		// key값을 제시해서 지우면 해당 밸류값이 함께 삭제됨
		hm.remove("포테이토칩");
		System.out.println(hm);
		// {다이제=Snack [flavor=초코맛, calory=1500], 새우깡=Snack [flavor=매운맛, calory=700], 칸쵸=Snack [flavor=단맛, calory=600]}
		
		System.out.println("==============================");
		
		// 순차적으로 hashMap에 담겨 있는 것에 접근하고자 할 때
		// Map계열도 index가 없기 때문에 일반 for문 사용 불가
		// key + value 가 세트로 담겨 있는 구조이기 때문에 향상된 for문도 사용 불가
		/*
		for( : hm) {
			
		}
		*/
		
		// List와 Map은 다른 계열이기 때문에 ArrayList로 옮겨 담은 후에 반복문 사용 불가
		// ArrayList list = new ArrayList(hm); => 불가
		// ArrayList list = new ArrayList();
		// list.addAll(hm); => 불가
		
		// Iterator => .iterator() 메소드를 이용하여 값을 Iterator로 옮기기
		// .iterator() 메소드는 List나 Set 계열에서만 사용할 수 있는 메소드라 불가능 
		// Iterator it = hm.iterator();
		
		// ----------- 그럼 어떻게 해야 순차적으로 접근할 수 있을까?  -----------
		
		// "Map을 Set으로 바꾸는 과정"을 우선적으로 진행하면
		// => 우리가 아까 배웠던 Set 계열에 반복을 돌리는 3가지 방법을 모두 활용 가능해짐
		
		// Map을 Set으로 바꿔 주는 메소드 2가지
		// HashMap => Set 계열 => Iterator
		//						이 과정 향상된 for문, ArrayList 이용하는 방법 써도 무관하나 Iterator를 오늘 배웠으니 일단 .iterator로 진행해 봄!
		
		// 1. keySet() 메소드를 이용하는 방법
		// => Map에 들어 있는 키값만 추려내서 Set으로 반환시켜 주는 메소드
		
		// 1) hm에 있는 key들만 Set에 담아 주기
		Set<String> keySet = hm.keySet();
		
		// 2) 1번 과정에서 작업된 keySet을 Iterator에 담기
		Iterator<String> itKey = keySet.iterator();
		
		// 3) 반복자에 담긴 것들을 순차적으로 뽑기(반복문 사용)
		while(itKey.hasNext()) {
			// System.out.println(itKey.next());
			// 키값만 출력됨
			// 다이제
			// 새우깡
			// 칸쵸
			
			String key = (String)itKey.next();
			Snack value = /* (Snack) */ hm.get(key);
			// 제네릭 설정 후에는 따로 Snack 객체로 형변환 해 주지 않아도 됨
			
			System.out.println(key + " = " + value);
			// 다이제 = Snack [flavor=초코맛, calory=1500]
			// 새우깡 = Snack [flavor=매운맛, calory=700]
			// 칸쵸 = Snack [flavor=단맛, calory=600]
			
			// 참고. 더 이상 뽑아낼 요소가 없는데 itKey.next() 메소드 호출 시
			// System.out.println(itKey.next());
			// NoSuchElementException
			
			System.out.println("==============================");
			
			// 2. entrySet() 메소드를 이용하는 방법
			// => Entry라는 집합 형태 꼴로 Key + Value 세트로 묶어서 Set에 담아 줌
			
			// 1) hm에 있는 key + value 모두 Entry 형태로 Set에 담기(Entry: 집합형태)
			Set<Entry<String, Snack>> entrySet = hm.entrySet();
			
			// 2) entreySet에 있는 것들을 Iterator에 옮겨 담기
			Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
			// Entrey 안에 String, Snack으로 이중 제네릭 설정이 가능하게 됨
			
			// 3) 반복문을 이용해서 순차적으로 뽑기
			while(itEntry.hasNext()) {
				// System.out.println(itEntry.next());
				
				Entry<String, Snack> entry = /* (Entry)*/ itEntry.next();
				// Entry에는 어차피 <String, Snack>만 적용될 것이므로 강제 형변환 필요 없어짐
				String key2 = /* (String) */ entry.getKey();
				Snack value2 = /* (Snack)*/ entry.getValue();
				
				System.out.println(key2 + " = " + value2);
				// 다이제 = Snack [flavor=초코맛, calory=1500]
				// 새우깡 = Snack [flavor=매운맛, calory=700]
				// 칸쵸 = Snack [flavor=단맛, calory=600]
				// => 제네릭 설정 전/후에도 출력문은 바뀌지 않음!
				
			}
			
		}
		
	}

}

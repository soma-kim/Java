package com.kh.chap01.list.part01.hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap01.list.part01.hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		// 컬렉션을 준비: 해당 컬렉션 객체 생성
		HashSet<String> hs1 = new HashSet<>();
		
		// 1. 값 추가: add(추가할 값)
		// Set은 애초에 인덱스 개념이 없기 때문에 순서를 넣는 칸은 존재하지 않음!
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("반갑습니다."));
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		// hs1.add(50); // int --> Integer 타입으로 AutoBoxing 돼서 들어간 꼴
		// HashSet을 <String>으로 제네릭 했을 때 오류가 남!
		
		System.out.println(hs1); // 저장 순서 유지 X, 중복 저장 X
								 // 상수풀과 같은 개념처럼 생각하면 됨!
								 // [50, 안녕하세요, 여러분, 반갑습니다.]
		
		// 2. 크기 구하기: size()
		// "Set에는 index 개념이 없으므로" List처럼 size() -1로 index 길이를 구할 수 없음
		System.out.println(hs1.size()); // 4
		
		// 참고: get(int index)
		// 해당 인덱스 값을 리턴 => Set계열에서는 쓸 수 없는 메소드
		
		// 3. 값 삭제: remove(삭제할값)
		hs1.remove("여러분");
		System.out.println(hs1); // [50, 안녕하세요, 반갑습니다.]
		
		// 4. 모든 값 삭제: clear()
		hs1.clear();
		System.out.println(hs1); // []: 비어 있는 상태
		
		// 5. 비어 있는지 확인: isEmpty()
		System.out.println("해시셋이 비어 있습니까?: " + hs1.isEmpty()); // true
		System.out.println("========================================");
		
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("김말똥", 26, 80));
		hs2.add(new Student("홍길동", 24, 40));
		hs2.add(new Student("공유", 43, 100));
		
		System.out.println(hs2); // 저장 순서 유지 X
		// [Student [name=김말똥, age=26, score=80], Student [name=공유, age=43, score=100], Student [name=공유, age=43, score=100], Student [name=홍길동, age=24, score=40]]
		// 중복된 "공유"에 대한 값이  2번 들어감
		System.out.println(hs2.size()); // 4
		// => 왜? 동일 객체로 판단이 되지 않았기 때문에 중복해서 들어간 꼴로 보임
		// Set계열 특징: 값이 추가될 때마다 equals() 메소드, hashCode() 메소드로 주소값 비교 후에 동일 객체인지 판단 후 아니면 그떄 추가가 일어남
		
		// HashSet에 객체를 담을 때 내부적으로 equals()로 비교함
		// 또한 hashCode()값이 일치하는지도 비교함
		// => equals() 메소드 결과가 true이고, hashCode() 값도 일치한다면 동일 객체로 판단되어 추가가 되지 않음(중복 저장 불가)
		
		// Object 클래스의 equals(): 두 객체의 주소값을 가지고 비교해서 일치하면 true / 일치하지 않으면 false 반환
		// Object 클래스의 hashCode(): 해당 객체의 주소값을 기반으로 십진수 값을 발생시켜 반환
		
		// String 클래스의 equals(): 두 문자열의 내용물 비교
		// String 클래스의 hashCode(): 해당 문자열의 내용물을 기반으로 십진수 값 발생
		
		// 객체의 각 필드값이 일치하면 그냥 동일한 객체로 판단이 돼서
		// 중복 저장이 안 되게끔 하고 싶다면 equals() 메소드, hashCode() 메소드를 오버라이딩 하면 됨 (Student 클래스에)
		
		// Student 클래스의 equals(): 세 필드 값이 일치하면 true / 하나라도 일치하지 않는다면 false 반환
		// Student 클래스의 hashCode(): 세 필드값 기반으로 십진수 값을 발생시켜서 반환
		
		// 다시 출력해 보면
		// [Student [name=홍길동, age=24, score=40], Student [name=김말똥, age=26, score=80], Student [name=공유, age=43, score=100]]
		// 3

		// 주소값이 아닌 필드값 기준으로 중복 판별할 수 있게끔 오버라이딩 한 후이기에 이제 3개로 중복 없이 나옴!
		
		
		System.out.println("========================================");
		
		// Set => 무작위 객체가 저장되어 있음 => index 개념이 없음
		// => 반복문 활용이 불가
		
		// 그럼 담겨 있는 객체에 순차적으로 접근하고자 할 때?
		
		// 1. 향상된 for문 사용(for each문)
		// => for(값을받아줄변수선언문 : 컬렉션명)
		for(Object s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("========================================");
		
		// 2. ArrayList에 Set에 들어 있던 값들을 모두 옮겨 준 후 ArrayList 반복문 수행
		
		// Set에 들어 있는 값들을 ArrayList로 옮기는 법
		
		// 방법 1. 빈 ArrayList 객체 생성 후 addAll 메소드로 Set에 들어 있던 값들을 통째로 추가
		/*
		ArrayList list = new ArrayList();
		list.addAll(hs2); // 리스트 hs2에 담겨 있던 값들이 통째로 추가됨
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		// 방법 2. ArrayList 객체 생성 시 매개변수로 Set을 넘기는 방법
		
		ArrayList<Student> list = new ArrayList<>(hs2); // hs에 담긴 객체들이 모두 추가된 채로 리스트 생성됨 
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Student [name=홍길동, age=24, score=40]
		// Student [name=김말똥, age=26, score=80]
		// Student [name=공유, age=43, score=100]

		System.out.println("========================================");
		
		// 3. Iterator (반복자)를 이용한 방법
		// => Set에 들은 내용물을 반복적으로 접근하여 꺼내 올 수 있게끔 도와주는 역할
		
		// 우선적으로 HashSet에 담겨 있는 객체들을 Iterator로 옮겨 담는 과정
		Iterator<Student> it = hs2.iterator();
		
		// Iterator에 들어 있던 객체들을 반복문을 활용하여 하나씩 뽑아내기
		while(it.hasNext()) { // it에 더 이상 빼 올 값이 남아 있는지? 물어보는 메소드
			
			// 더 이상 뽑을 값이 남아 있다면 next() 메소드로 뽑아내기
			System.out.println(it.next());
		} // StringTokenizer와 비슷한 원리
		
		// .iterator() 메소드: List 계열과 Set 계열에서만 사용 가능한 메소드
		//					 (Map 계열에서는 사용 불가능한 메소드)
		
	}

}

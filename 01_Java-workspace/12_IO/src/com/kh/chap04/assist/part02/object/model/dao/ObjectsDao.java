package com.kh.chap04.assist.part02.object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.chap04.assist.part02.object.model.vo.Phone;

public class ObjectsDao {
	
	// 프로그램 ---> 외부 매체(파일)
	// 출력
	
	public void fileSave() {
		
		// FileOutputStram + ObjectOutputStream (1byte짜리 좁은 통로)
		
		// 테스트용 객체 배열
		/*
		Phone[] arr = new Phone[3]; // [0] [1] [2]
		
		// 테스트용 데이터 담기
		arr[0] = new Phone("아이폰", 1300000);
		arr[1] = new Phone("갤럭시", 1500000);
		arr[2] = new Phone("플립폰", 2000000);
		*/
		
		ArrayList<Phone> phoneList = new ArrayList<>();
		
		phoneList.add(new Phone("아이폰", 1300000)); // 0번 인덱스
		phoneList.add(new Phone("갤럭시", 1500000)); // 1번 인덱스
		phoneList.add(new Phone("플립폰", 2000000)); // 2번 인덱스
		
		
		// try ~ with ~ resource 구문으로 한 큐에 생성
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phones.txt"))){
			
			
			// 출력: ObjectOutputStream 객체에서 제공하는 writeObject() 메소드 사용
			// oos.writeObject(arr[0]);
			// oos.writeObject(arr[1]);
			// oos.writeObject(arr[2]);
			
			// 반복문 이용해서 내보내기
			/*
			for(int i =0; i < arr.length; i++) {
				oos.writeObject(arr[i]);
				System.out.println(arr[i]);
			}
			*/
			
			// ArrayList일 때의 구문
			for(int i = 0; i < phoneList.size(); i++) {
				
				oos.writeObject(phoneList.get(i));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 프로그램 <--- 외부 매체(파일)
	// 입력
	
	public void fileRead() {
		
		// FileInputStream + ObjectInputStream
		
		Phone[] ph = new Phone[3];
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))) {
			
			// toString() 메소드를 오버라이딩 했기 때문에 굳이 형변환 하지 않고 바로 출력해 보기
			// System.out.println(ois.readObject() /* .toString() */);
			// System.out.println(ois.readObject());
			// System.out.println(ois.readObject());
			// EOFExeption(End of file): 파일 내용이 끝났음에도 자꾸 출력하고자 할 때 발생하는 오류
			// => IOException의 자식임
			// System.out.println(ois.readObject());
			
			// EOFException이 발생할 때까지만 반복을 돌리기
			// 예측 불가능한 오류이기 때문에 정확한 조건을 세울 수 없음
			
			while (true) { // 그래서 일단은 무한 반복
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { // while문 무한반복 하다가 언젠가 EOFException이 발생하는 순간 이쪽으로 들어옴
			System.out.println("파일을 다 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		// catch문은 한 구문이 출력된 후 try ~ catch문을 빠져나오기 때문에 후에는 프로그램 종료가 출력됨
		System.out.println("프로그램 종료");
	}
	

}

package com.kh.chap01.oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsmany.model.vo.Book;

public class ObjectRun {
	
	public static void main(String[] args) {
		
		/*
		// 1. 기본 생성자로 객체 생성 후 setter 메소드를 통해 각 필드 값 대입
		Book bk1 = new Book(); // JVM에 의해서 기본값이 세팅
		
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("김자바");
		bk1.setPrice(20000);
		bk1.setPublisher("KH출판사");
		
		// 2. 매개변수 생성자를 이용해서 객체 생성과 동시에 각 필드에 값 대입
		Book bk2 = new Book("수학익힘책", "홍길동", 15000, "수학출판사");
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		*/
		
		/*
		// 3. 사용자가 입력한 값들로 객채 생성
		Scanner sc = new Scanner(System.in);
		
		
		// 제목, 저자명, 가격 정보, 출판사명을 입력받아 각각 변수에 담기
		System.out.print("제목: ");
		String title = sc.nextLine();
		
		System.out.print("저자: ");
		String author = sc.nextLine();
		
		System.out.print("가격: ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사: ");
		String publisher = sc.nextLine();
		
		// Book 객체 만들기
		Book bk3 = new Book(title, author, price, publisher);
		
		System.out.println(bk3.information());
		*/
		
		// 세 개의 Book 개체가 필요하다라는 가정 하에
		// 각 Book 개체를 따로따로 관리
		// 단, 사용자에게 입력받은 정보를 기준으로 객체를 만들 것
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null; // 주소값 들어갈 공간을 세팅해 놓는 과정
		
		for(int i = 0; i < 3; i++) { // i: 0, 1, 2
			Scanner sc = new Scanner(System.in);
			
			System.out.print("제목: ");
			String title = sc.nextLine();
			
			System.out.print("저자명: ");
			String author = sc.nextLine();
			
			System.out.print("가격: ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사: ");
			String publisher = sc.nextLine();
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}
			else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}
			else {
				bk3 = new Book(title, author, price, publisher);
			}

		}
		
		// 전체 도서 정보를 출력하기 (전체 조회 기능)
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 사용자에게 검색할 도서 제목을 입력받아
		// 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려 주는 기능
		// => 가격 조회 기능
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 책 제목: ");
		String searchTitle = sc.nextLine();
		
		if(bk1.getTitle().equals(searchTitle)) {
			
			System.out.println(bk1.getPrice());
			
		}
		
		if(bk2.getTitle().equals(searchTitle)) {
			
			System.out.println(bk2.getPrice());
		}
		
		if(bk3.getTitle().equals(searchTitle)) {
			
			System.out.println(bk3.getPrice());
				
		}
		
	}

}

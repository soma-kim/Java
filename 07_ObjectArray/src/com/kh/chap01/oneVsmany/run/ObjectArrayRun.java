package com.kh.chap01.oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		// 배열: 한 번에 같은 자료형의 여러 개의 값들을 동시에 보관
		// 배열의 선언과 동시에 할당
		// 자료형[] 배열명 = new 자료형[사이즈];
		
		// "Book 타입의 주소값만" 담을 수 있는 상태
		// 다른 타입의 주소값은 담을 수 없음!!!!!!!!!!!!!!!!!
		Book[] arr = new Book[3]; // arr[0], arr[1], arr[2]
								  //  null,   null,   null
		
		Scanner sc = new Scanner(System.in);
		
		// 3개의 전체 도서 정보를 입력받은 후 각 인덱스에 해당 객체를 생성
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print("제목: ");
			String title = sc.nextLine();
			
			System.out.print("저자명: ");
			String author = sc.nextLine();
			
			System.out.print("가격: ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사: ");
			String publisher = sc.nextLine();
			
			arr[i] = new Book(title, author, price, publisher); // 객체가 heap 영역에 생성됨
		}
		
			// 전체 도서 정보 출력하기
			for(int i = 0; i < arr.length; i++) {
				// System.out.println(arr[i]); // Book 타입의 주소값을 출력
				System.out.println(arr[i].information());
			}
			
			// 검색 기능
			// 사용자에게 검색할 도서 제목을 입력받아 
			// 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려 주기
			
			System.out.print("검색할 책 제목: ");
			String searchTitle = sc.nextLine();
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].getTitle().equals(searchTitle)) {
					System.out.println(arr[i].getPrice());
				}
				else { 
					System.out.println("검색된 도서가 없습니다"); // 이거 아님!
				}

			}
			
		
		// 도전 문제
		// 검색 기능: 만약에 일치하는 도서를 찾지 못할 경우: "검색된 도서가 없습니다"를 출력
		// 힌트) 변수를 활용!! 횟수를 세는 변수인 int count = 0; 를 만들어서 활용해 보기
		
		

	}

}

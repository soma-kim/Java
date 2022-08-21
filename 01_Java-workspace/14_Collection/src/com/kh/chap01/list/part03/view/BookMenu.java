package com.kh.chap01.list.part03.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01.list.part03.controller.BookManager;
import com.kh.chap01.list.part03.model.vo.Book;

// view
public class BookMenu {
	
	Scanner sc = new Scanner(System.in);
	BookManager bm = new BookManager();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.print("메뉴 번호 선택 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
					insertBook();
					break;
			case 2 : 
					deleteBook();
					break;
			case 3 : 
					searchBook();
					break;
			case 4 :
					selectList();
					break;
			case 0 : System.out.println("프로그램을 종료");
					return; // 이때 return을 써야 나를 호출했던 main으로 돌아가기 때문에 종료됨
			default : System.out.println("잘못된 메뉴입니다. 다시 입력해 주세요.");
			}
			
		}
		
	}
	
	// 도서 추가 화면
	public void insertBook() {
		
		System.out.println("== 도서 추가 ==");
		System.out.print("도서 제목: ");
		String title = sc.nextLine();
		System.out.print("도서 장르(1:인문 / 2:자연과학 / 3:의료 / 4기타): ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 저자: ");
		String author = sc.nextLine();
		
		Book book = new Book(title, category, author);
		
		int result = bm.insertBook(book);
		
		if(result > 0) {
			System.out.println("성공적으로 추가되었습니다.");
		} else {
			System.out.println("추가 실패");
		}

	}
		// 추가해 주세요 요청 => Controller 클래스와 메소드를 호출
		// 클래스대변할이름.메소드명(넘겨줄값);

	
	// 도서 삭제 화면
	public void deleteBook() {
		
		System.out.print("도서 번호: ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		int result = bm.deleteBook(bNo);
		
		if(result > 0) {
			System.out.println("성공적으로 삭제");
		} else {
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}

	}
	
	// 도서 검색 화면
	public void searchBook() {
		
		System.out.print("도서 제목: ");
		String title = sc.nextLine();
		
		ArrayList<Book> bookList = bm.searchBook(title);
		
		if(bookList.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
		
	}
	
	// 전체 조회 화면
	public void selectList() {
		
		System.out.println("=== 전체 도서 목록 출력 ===");
		
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("도서 목록이 존재하지 않습니다.");
		} else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
		
	}
	
}	
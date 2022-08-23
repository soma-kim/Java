package com.kh.chap01.list.part02.mvcModelHomework.controller;

import java.util.ArrayList;

import com.kh.chap01.list.part02.mvcModelHomework.model.vo.Book;

// controller
public class BookManager {
	
	ArrayList<Book> bookList = new ArrayList<>();
	
	public BookManager() {
		
	}
	
	// 도서 추가 요청 시 실행할 메소드
	public void insertBook(Book book) {
		
		int lastNo = 0;
		
		try {
			lastNo = bookList.get(bookList.size()-1).getbNo() + 1; //  마지막 도서 번호 + 1
		} catch (ArrayIndexOutOfBoundsException e) {
			lastNo = 1;
		}
		
		book.setbNo(lastNo);
		bookList.add(book);

//		반환형 int 버전
//		int lastNo = 0;
//		int result = 0;
//		
//		try {
//			lastNo = bookList.get(bookList.size()-1).getbNo() + 1;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			lastNo = 1;
//		} finally {
//			result++;
//		}
//		
//		book.setbNo(lastNo);
//		bookList.add(book);
//		
//		return result;
		
	}
	
	// 도서 삭제 요청 시 실행할 메소드
	public int deleteBook(int bNO) {
		
		int result = 0;
		
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getbNo() == bNO) {
				bookList.remove(i--);
				result++;
			}
		}
		
		return result;

	}
	
	// 도서 검색 요청 시 실행할 메소드
	public ArrayList<Book> searchBook(String title) {
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList;
	}
	
	// 전체 조회 요청 시 실행할 메소드
	public ArrayList<Book> selectList() {
		
		return bookList;
	}

}
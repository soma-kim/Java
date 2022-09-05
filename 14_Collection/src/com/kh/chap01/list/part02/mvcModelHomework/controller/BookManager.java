package com.kh.chap01.list.part02.mvcModelHomework.controller;

import java.util.ArrayList;

import com.kh.chap01.list.part02.mvcModelHomework.model.vo.Book;

// controller
public class BookManager {
	
	ArrayList<Book> bookList = new ArrayList<>();
	
	public BookManager() {
		
	}
	
	// ���� �߰� ��û �� ������ �޼ҵ�
	public void insertBook(Book book) {
		
		int lastNo = 0;
		
		try {
			lastNo = bookList.get(bookList.size()-1).getbNo() + 1; //  ������ ���� ��ȣ + 1
		} catch (ArrayIndexOutOfBoundsException e) {
			lastNo = 1;
		}
		
		book.setbNo(lastNo);
		bookList.add(book);

//		��ȯ�� int ����
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
	
	// ���� ���� ��û �� ������ �޼ҵ�
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
	
	// ���� �˻� ��û �� ������ �޼ҵ�
	public ArrayList<Book> searchBook(String title) {
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList;
	}
	
	// ��ü ��ȸ ��û �� ������ �޼ҵ�
	public ArrayList<Book> selectList() {
		
		return bookList;
	}

}
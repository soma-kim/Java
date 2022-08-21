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
			
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� �˻� ���");
			System.out.println("4. ��ü ���");
			System.out.println("0. ������");
			System.out.print("�޴� ��ȣ ���� : ");
			
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
			case 0 : System.out.println("���α׷��� ����");
					return; // �̶� return�� ��� ���� ȣ���ߴ� main���� ���ư��� ������ �����
			default : System.out.println("�߸��� �޴��Դϴ�. �ٽ� �Է��� �ּ���.");
			}
			
		}
		
	}
	
	// ���� �߰� ȭ��
	public void insertBook() {
		
		System.out.println("== ���� �߰� ==");
		System.out.print("���� ����: ");
		String title = sc.nextLine();
		System.out.print("���� �帣(1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4��Ÿ): ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("���� ����: ");
		String author = sc.nextLine();
		
		Book book = new Book(title, category, author);
		
		int result = bm.insertBook(book);
		
		if(result > 0) {
			System.out.println("���������� �߰��Ǿ����ϴ�.");
		} else {
			System.out.println("�߰� ����");
		}

	}
		// �߰��� �ּ��� ��û => Controller Ŭ������ �޼ҵ带 ȣ��
		// Ŭ�����뺯���̸�.�޼ҵ��(�Ѱ��ٰ�);

	
	// ���� ���� ȭ��
	public void deleteBook() {
		
		System.out.print("���� ��ȣ: ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		int result = bm.deleteBook(bNo);
		
		if(result > 0) {
			System.out.println("���������� ����");
		} else {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		}

	}
	
	// ���� �˻� ȭ��
	public void searchBook() {
		
		System.out.print("���� ����: ");
		String title = sc.nextLine();
		
		ArrayList<Book> bookList = bm.searchBook(title);
		
		if(bookList.isEmpty()) {
			System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
		} else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
		
	}
	
	// ��ü ��ȸ ȭ��
	public void selectList() {
		
		System.out.println("=== ��ü ���� ��� ��� ===");
		
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("���� ����� �������� �ʽ��ϴ�.");
		} else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
		
	}
	
}	
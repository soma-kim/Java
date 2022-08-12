package com.kh.chap03.override.model.vo;
				   // ��� Ŭ������ Object Ŭ������ �ļ���
public class Book /* extends Object */ {
	
	// �ʵ��
	private String title; // ����
	private String author; // ���ڸ�
	private int price; // ����
	
	// �����ں�
	public Book() {
		super();
	}
		
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// �޼ҵ��
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}

	/*
	 * *�������̵�
	 * - ��ӹް� �ִ� �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� ������(���ۼ�) �ϴ� ��
	 * - �θ� �����ϰ� �ִ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٶ�� �ǹ�
	 * - �������̵� �� �ش� �޼ҵ带 ȣ���ϸ� �ڽ� �޼ҵ尡 �켱���� ����
	 * 
	 * *�������̵� ���� ����
	 * - �θ� �޼ҵ��� �޼ҵ���� �����ؾ� ��
	 * - �Ű������� �ڷ���, ����, ������ �����ؾ� ��(��, �Ű���������� �����ϳ� �򰥸��� �ʰ� ���� �ִ� �� ���� ��!)
	 * - ��ȯ�� �����ؾ� ��
	 * - �θ� �޼ҵ��� ���� �����ڿ� ���ų� ���� ������ �� Ŀ�� ��
	 * => �Ծ��� ������ �� ����(������ �Ϸ��� �� ������ ��Ģ�� ���Ѿ� ��)
	 * 
	 * @Override ������̼�
	 * - ���� ����(��ø� �� �ص� �θ� �޼ҵ�� ���°� ���ٸ� �������̵��� �ߵ� ��)
	 * - ������̼��� ���̴� ����? (���� ���������� ���̴� �� ����)
	 * 	 > �߸� ������� ��� ������ �˷� �ֱ� ������ �ٽ� ������ �� �ְ� ������
	 * 	 > Ȥ�ö� �θ� �޼ҵ尡 �Ŀ� �����Ǿ��� �� ������ �˷� �ֱ� ������ ������ �� �ְ� ������
	 * 	 > �� �޼ҵ尡 �������̵� �� �޼ҵ��� ���� �˸��� ���� �������� ��� (�ּ��� ����)
	 */
	
	/*
	@Override // ������̼�(���� ����)
	public String toString() {
		return "title: " + title + ", author: " + author + ", price: " + price;
	}
	*/
	
	// �����ڵ�, getter / setter �޼ҵ� �ڵ� �ϼ�
	// toString�� ���������� �ڵ��ϼ��� ����
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	

}

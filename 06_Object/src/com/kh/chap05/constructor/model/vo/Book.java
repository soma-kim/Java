package com.kh.chap05.constructor.model.vo;

public class Book {
	
	// 鞘靛何
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 积己磊何
	
	public Book() {
		
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	
	// 皋家靛何
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public String information() {
		return "title: " + title + ", pulisher: " + publisher + ", author: " + author
				+ ", price: " + price + ", discountRate: " + discountRate;
	}

}

package com.kh.chap03.override.model.vo;
				   // 모든 클래스는 Object 클래스의 후손임
public class Book /* extends Object */ {
	
	// 필드부
	private String title; // 제목
	private String author; // 저자명
	private int price; // 가격
	
	// 생성자부
	public Book() {
		super();
	}
		
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// 메소드부
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
	 * *오버라이딩
	 * - 상속받고 있는 부모 클래스의 메소드를 자식 클래스에서 재정의(재작성) 하는 것
	 * - 부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다라는 의미
	 * - 오버라이딩 시 해당 메소드를 호출하면 자식 메소드가 우선권을 가짐
	 * 
	 * *오버라이딩 성립 조건
	 * - 부모 메소드명과 메소드명이 동일해야 함
	 * - 매개변수의 자료형, 개수, 순서가 동일해야 함(단, 매개변수명과는 무관하나 헷갈리지 않게 맞춰 주는 게 좋긴 함!)
	 * - 반환형 동일해야 함
	 * - 부모 메소드의 접근 제한자와 같거나 공유 범위가 더 커야 함
	 * => 규약의 개념이 들어가 있음(재정의 하려면 이 정도의 규칙은 지켜야 함)
	 * 
	 * @Override 어노테이션
	 * - 생략 가능(명시를 안 해도 부모 메소드와 형태가 같다면 오버라이딩이 잘된 것)
	 * - 어노테이션을 붙이는 이유? (생략 가능하지만 붙이는 걸 권장)
	 * 	 > 잘못 기술했을 경우 오류를 알려 주기 때문에 다시 검토할 수 있게 유도함
	 * 	 > 혹시라도 부모 메소드가 후에 수정되었을 때 오류로 알려 주기 때문에 검토할 수 있게 유도함
	 * 	 > 이 메소드가 오버라이딩 된 메소드라는 것을 알리기 위한 목적으로 사용 (주석의 역할)
	 */
	
	/*
	@Override // 어노테이션(생략 가능)
	public String toString() {
		return "title: " + title + ", author: " + author + ", price: " + price;
	}
	*/
	
	// 생성자들, getter / setter 메소드 자동 완성
	// toString도 마찬가지로 자동완성을 제공
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	

}

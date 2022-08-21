package com.kh.chap01.list.part03.model.vo;

public class Book {
	
	// 필드부
	private int bNo;
	private String title;
	private int category;
	private String author;
	
	// 생성자부
	public Book() {
		super();
	}
	
	public Book(String title, int category, String autor) {
		super();
		this.title = title;
		this.category = category;
		this.author = autor;
	}
	
	// 메소드부
	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String autor) {
		this.author = autor;
	}

	@Override
	public String toString() {
		
		String[] transcategory = new String[4];
		transcategory[0] = "인문";
		transcategory[1] = "자연과학";
		transcategory[2] = "의료";
		transcategory[3] = "기타";
		
		String tcategory = "";
		
		for(int i = 0; i < transcategory.length; i++) {
			if(this.category == i) {
				tcategory = transcategory[i-1];
			}
		}

		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + tcategory + ", author=" + author + "]";
	}
	
}

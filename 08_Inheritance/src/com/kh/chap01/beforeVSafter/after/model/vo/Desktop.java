package com.kh.chap01.beforeVSafter.after.model.vo;

// 자식 클래스: 부모 클래스로부터 중복된 코(필드, 메소드)를 물려받아 사용하는 클래스 - 생성자는 물려받지 않음
// => 자식 클래스에서 우선적으로 해야 할 것: 누구로부터 코드를 물려받을 것인지 언급하기!!

			// 자식     ------->  부모
			// 후손                         조상
			// 하위                         상위
			// 서브                         슈퍼
public class Desktop extends Product {
	
	// 필드부
	private boolean allInOne; // Product에서 4개의 필드를 상속받았으므로 Desktop의 필드는 5개가 됨
	
	// 생성자부
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// 객체 생성과 동시에 내가 원하는 값으로 초기화하는 용도로 씀
		
		// 상속 관계에서 내 부모 클래스의 필드값에 접근하고자 할 경우 super.부모필드명
		// => super. 은 해당 부모의 주소값을 담고 있음(즉, super. 으로 부모에 접근 가능) - this. 은 나의 주소값을 담고 있음
		// 	    단, 접근하고자 하는 게 private일 경우에는 뭐가 됐든 외부에서 직접 접근이 불가능함
		
		// 해결 방법 1: 부모 클래스의 필드를 자식까지는 접근 가능하도록
		//			 private -> protected로 접근 제한자를 수정하는 방법
		//		  	 "정보은닉"을 할 수 없음
		
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		this.allInOne = allInOne;
		*/
		
		// 해결 방법2: 부모 클래스에 있는 public 접근 제한자인 setter 메소드를 호출해서 필드값을 채워 넣는 방법
		// 상속 관계에서 부모 클래스에 있는 메소드에 직접 접근 하고자 할 경우 super.메소드명()으로 호출
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결 방법3: 부모 클래스에 있는 매개변수 생성자를 호출하기
		// 상속관계에서 부모 클래스에 있는 생성자를 호출하고자 할 경우 super 생성자를 호출
		// => 내 안에 있던 생성자를 호출할 경우 this 생성자를 호출했었음! (반드시 생성자의 가장 윗줄에 호출 구문 작성)
		
		// super(); // 부모의 기본 생성자가 호출이 됨
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
		
	}
	
	// 메소드부
	public boolean isallInOne() {
		return allInOne;
	}
	
	public void setallInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

}

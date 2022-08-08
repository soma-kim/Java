package com.kh.chap01.beforeVSafter.after.run;

import com.kh.chap01.beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01.beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01.beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		// 기본 생성자를 통해 객체 생성 후 setter 메소드로 필드값 대입
		
		/*
		Desktop d = new Desktop();
		d.setBrand("삼성");
		d.setpCode("d-01");
		d.setpName("짱짱데스크탑");
		d.setPrice(2000000);
		d.setallInOne(true);
		*/
		
		// 매개변수 생성자 이용
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 2000000, true);
		
		// brand, pCode, pName, price, mobileAgency
		
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "SKT");
		
		// brand, pCode, pName, price, inch
		
		Tv t = new Tv("엘지", "t-01", "고오급벽걸이티비", 4000000, 100);
		
		// 출력
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		// 실행하고자 하는 메소드가 부모 클래스에만 있고 자식 클래스에는 없음
		// 자식 클래스에서는 부모 클래스의 내용을 가져다 쓸 수 있지만
		// 부모 클래스에서는 자식 클래스의 내용을 가져다 쓸 수가 없다!! => 상속 구조의 가장 핵심적인 특징
		// 자식 클래스 입장에서 물려받은 부모 클래스의 메소드를 내 입맛대로 재정의해서 쓸 수 있음 (오버라이딩)

	}

}

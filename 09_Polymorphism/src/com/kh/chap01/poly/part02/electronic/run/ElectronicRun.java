package com.kh.chap01.poly.part02.electronic.run;

import com.kh.chap01.poly.part02.electronic.controller.ElectronicController2;
import com.kh.chap01.poly.part02.electronic.mode.vo.Desktop;
import com.kh.chap01.poly.part02.electronic.mode.vo.Electronic;
import com.kh.chap01.poly.part02.electronic.mode.vo.NoteBook;
import com.kh.chap01.poly.part02.electronic.mode.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		
		/*
		// 1. 다형성을 적용하기 전(ElectronicController1)
		ElectronicController1 ec = new ElectronicController1();
		
		// 이 시점 기준에서 ec.desk == null, ec.note == null, ec.tab == null
		// => 우리 가게에 빈 상자가 세 개 생긴 꼴
		
		// ec.desk = new Desktop("삼성", "데탑", 1200000, "Geforce 1070");
		// => is not visible: private 접근 제한자이므로 직접 접근 불가함
		// => desk라는 상자는 private이라 직접 접근 불가하므로 우회해서 간접 접근 해야 함 
		
		// 이렇게 담아도 되고
		// Desktop d = new Desktop("삼성", "데탑", 1200000, "Geforce 1070");
		// ec.insert(d);
		//
		
		// 이렇게 담아도 됨!
		ec.insert(new Desktop("삼성", "데탑", 1200000, "Geforce 1070"));
		
		ec.insert(new NoteBook("엘지", "그램", 2000000, 4));
		
		ec.insert(new Tablet("애플", "아이패드", 500000, false));
		
		// => 여기까지 물걸을 각각 납품받아서 상자에 담아 준 꼴
		
		// 손님에게 제품등을 상자로부터 꺼내서 보여 주기
		Desktop d = ec.selectDesktop(); // 안에서 바깥으로 꺼냄
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		System.out.println(d); // 꺼내 온 상자 보여 주기
		System.out.println(n); // 원래는 toString이 주소값을 호출하는 메소드이지만 
		System.out.println(t); // 우리는 오버라이딩을 통해 toString을 내용 표출로 바꿨으므로 그렇게 나옴
		
	
		// 만들 상자가 아주 많아요...
	 
		 */
		
		// 2.다형성을 적용했을 경우 (ElectonicController2)
		ElectronicController2 ec2 = new ElectronicController2();
		
		ec2.insert(new Desktop("삼성", "데탑", 1200000, "Geforce 1070"), 0);
		ec2.insert(new NoteBook("엘지", "그램", 2000000, 4), 1);
		ec2.insert(new Tablet("애플", "아이패드", 500000, false), 2);
		
		/*
		// 창고에 담긴 물건들을 하나씩 뽑아 보기
		Desktop d = (Desktop)(ec2.select(0)); // 부모 클래스가 자식 클래스로 되기 위해서는 강제 형변환 해야 함
		NoteBook n = (NoteBook)(ec2.select(1));
		Tablet t = (Tablet)(ec2.select(2));
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// 반복문 활용해서 물건 꺼내오기
		Electronic[] elec = ec2.select(); // 창고 전체를 꺼내 옴
		
		for(int i = 0; i < elec.length; i++) {
			System.out.println(elec[i] /* .toString() */);
			// 오버라이딩 했기 때문에 굳이 형 변환 할 필요 없음! 오버라이딩 한 자식 클래스가 우선권 가지니까
		}
		
		/*
		 * *다형성을 사용하는 이유
		 * 1. 부모 타입의 객체 배열로 다양한 자식 객체들을 모아서 담아둘 수 있음
		 * 2. 메소드에 매개 변수나 반환형에 다형성을 적용하게 되면
		 * 	    메소드 개수가 줄어듦
		 */
		
		
		
	}
}

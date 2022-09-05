package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;
 
public class ConstructorRun {

	public static void main(String[] args) {
		
		// User 클래스의 기본 생성자를 이용해서 객체 생성
		
		User u1 = new User();
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("김말똥");
		u1.setAge(20);
		u1.setGender('남');
		
		System.out.println(u1.information()); // 기본값만 출력
		
		// User 클래스의 String userId를 초기화해 줄 수 있는 매개변수 생성자를 이용해서 객체 생성
		
		User u2 = new User("user02");
		
		System.out.println(u2.information()); // userId만 내가 원하는 값으로 초기화
		
		// User 클래스의 String userId, String userPwd, String userName을
		// 초기화해줄 수 있는 매개변수 생성자를 이용해서 객체 생성
		
		User u3 = new User("user03", "pass03", "홍길동");
		
		System.out.println(u3.information());
		
		// User 클래스의 모든 필드에 대해서 객체 생성과 동시에 내가 원하는 값으로
		// 초기화할 수있는 매개변수 생성자를 이용해서 객체 생성
		
		User u4 = new User("user04", "pass04", "박개순", 21, '여');
		
<<<<<<< HEAD
		// 만약에 이 시점에서 비밀번호를 바꾸고 싶음 
=======
		// 만약에 이 시점에서 비밀번호를 바꾸고 싶음
>>>>>>> e309944912c1ce608e28f1ff90093fa28e5b1d7b
		// -> setter 메소드를 써야만 함!
		
		u4.setUserPwd("password04!");
		// 매개변수 생성자가 있다 하더라도 setter 메소드는 반드시 필요함!
		
		System.out.println(u4.information());

	}

}
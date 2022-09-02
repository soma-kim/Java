package com.kh.model.vo;

public class Member {
	
	// 鞘靛何
	private int userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	private String email;
	private String phone;
	
	// 积己磊何
	public Member() {
		
	}

	public Member(int userNo, String userId, String userPwd, String userName,
				  int age, char gender, String email, String phone) {

		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	
	// 皋家靛何

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", age=" + age + ", gender=" + gender + ", email=" + email + ", phone=" + phone + "]";
	}

}
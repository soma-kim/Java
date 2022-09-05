package com.kh.controller;

import java.util.ArrayList;
import com.kh.model.vo.Member;

public class MemberController {
	
	private ArrayList<Member> list = new ArrayList<>();
	
	{
		// 초기화 블록
		list.add(new Member(1, "user01", "pass01", "김유저", 28, 'F', "user01@naver.com", "010-1234-5678"));
		list.add(new Member(2, "user02", "pass02", "이사람", 20, 'M', "user02@gmail.co.kr", "010-2222-9999"));
		list.add(new Member(3, "user03", "pass03", "최고당", 25, 'F', "user03@daum.net", "010-4812-4212"));
		list.add(new Member(4, "user04", "pass04", "최저당", 21, 'M', "user04@facebook.co.kr", "010-8412-4105"));
		
	}
	
	// 아이디 중복 체크 처리, 사용 중인 아이디가 있을 시 1 반환
	public int idCheck(String userId) {
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getUserId().equals(userId)) {
				result++;
			}
					
		}

		return result;
		
	}
	
	// 회원 추가
	public int insertMember(String userId, String userPwd, String userName, int age, char gender, String email, String phone) {
		
		int before = list.size();
		
		// userNo = 마지막 userNo + 1
		
		int userNo = 0;

		for (int i = 0; i < list.size(); i++) {
		    userNo = list.get(i).getuserNo() + 1
		}
		
		// int userNo = list.size();
		// userNo = list.size() + 1;
		
		// 문제점1 => 삭제 메소드에서 해결! 했긴 한데 userNo가 Oracle에서 프라이머리키로 쓸 예정이라 삭제되었을 때도 바뀌면 안 된다고 함 ㅠ
		// 현재 중간 번호의 유저를 삭제했을 때 기존에 설정해 준 userNo가 그대로 유지됨
		// => 1~4까지 존재할 때 3번째를 지우면 남은 유저의 번호는 1, 2, 4
		//    이 상태에서 유저를 한 번 더 추가할 경우 userNo 4가 2명이 됨
		
		list.add(new Member(userNo, userId, userPwd, userName, age, gender, email, phone));
		
		return list.size() - before;
	}
	
	// 회원 전체 조회
	public ArrayList<Member> selectMemberList() {
		return list;
	}
	
	// 회원 아이디 검색
	public ArrayList<Member> searchMemberById(String searchedId) {
		
		ArrayList<Member> searchedIdList = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getUserId().equals(searchedId)) {
				searchedIdList.add(list.get(i));
			}
		}
		
		return searchedIdList;
		
	}
	
	// 회원 이름 키워드 검색
	public ArrayList<Member> searchMemberByName(String searchedName) {
		
		ArrayList<Member> searchedNameList = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getUserName().contains(searchedName)) {
				searchedNameList.add(list.get(i));
			}
		}
		
		return searchedNameList;
	}
	
	// 회원 비밀번호 초기화
	public int initMemberPwd(String userId) {
		
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getUserId().equals(userId)) {
				list.set(i, new Member(list.get(i).getUserNo(), userId, "P@s$W0rd!", list.get(i).getUserName(),
									   list.get(i).getAge(), list.get(i).getGender(), list.get(i).getEmail(), list.get(i).getPhone()));
			result++;
			
			}
		}
		
		return result;
	}
	
	// 회원 삭제
	public int deleteMember(String userId) {
		
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getUserId().equals(userId)) {
			
				list.remove(i--);
				result++;
				
			}
			
			// 삭제했을 때 지워진 데이터보다 큰 인덱스의 UserNo를 result만큼 빼 주면 되지 않을까?
			//  했긴 한데 userNo가 Oracle에서 프라이머리키로 쓸 예정이라 삭제되었을 때도 바뀌면 안 된다고 함 ㅠ
			// int userNo = list.get(i).getUserNo();
			
			// 삭제되었을 때 userNo를 result의 수만큼 당겨 줘야 됨
			// if(result != 0 && userNo > i+1) {
						
			//	list.set(i, new Member(userNo - result, list.get(i).getUserId(), list.get(i).getUserPwd(), list.get(i).getUserName(),
			//						  list.get(i).getAge(), list.get(i).getGender(), list.get(i).getEmail(), list.get(i).getPhone()));
			// } // => 진행했을 때 잘됨!!
			
		}
		
		return result;
	}

}

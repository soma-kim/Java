package com.kh.controller;

import java.util.ArrayList;
import com.kh.model.vo.Member;

public class MemberController {
	
	private ArrayList<Member> list = new ArrayList<>();
	
	{
		// �ʱ�ȭ ���
		list.add(new Member(1, "user01", "pass01", "������", 28, 'F', "user01@naver.com", "010-1234-5678"));
		list.add(new Member(2, "user02", "pass02", "�̻��", 20, 'M', "user02@gmail.co.kr", "010-2222-9999"));
		list.add(new Member(3, "user03", "pass03", "�ְ��", 25, 'F', "user03@daum.net", "010-4812-4212"));
		list.add(new Member(4, "user04", "pass04", "������", 21, 'M', "user04@facebook.co.kr", "010-8412-4105"));
		
	}
	
	// ���̵� �ߺ� üũ ó��, ��� ���� ���̵� ���� �� 1 ��ȯ
	public int idCheck(String userId) {
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getUserId().equals(userId)) {
				result++;
			}
					
		}

		return result;
		
	}
	
	// ȸ�� �߰�
	public int insertMember(String userId, String userPwd, String userName, int age, char gender, String email, String phone) {
		
		int before = list.size();
		
		// �ʱ�ȭ ��� �����ؼ� ���� ���� 3���� �� ��� ��
		int userNo = list.size();
		userNo = list.size() + 1;
		
		// ������1 => ���� �޼ҵ忡�� �ذ�!
		// ���� �߰� ��ȣ�� ������ �������� �� ������ ������ �� userNo�� �״�� ������
		// => 1~4���� ������ �� 3��°�� ����� ���� ������ ��ȣ�� 1, 2, 4
		//    �� ���¿��� ������ �� �� �� �߰��� ��� userNo 4�� 2���� ��
		
		list.add(new Member(userNo, userId, userPwd, userName, age, gender, email, phone));
		
		return list.size() - before;
	}
	
	// ȸ�� ��ü ��ȸ
	public ArrayList<Member> selectMemberList() {
		return list;
	}
	
	// ȸ�� ���̵� �˻�
	public ArrayList<Member> searchMemberById(String searchedId) {
		
		ArrayList<Member> searchedIdList = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getUserId().equals(searchedId)) {
				searchedIdList.add(list.get(i));
			}
		}
		
		return searchedIdList;
		
	}
	
	// ȸ�� �̸� Ű���� �˻�
	public ArrayList<Member> searchMemberByName(String searchedName) {
		
		ArrayList<Member> searchedNameList = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getUserName().contains(searchedName)) {
				searchedNameList.add(list.get(i));
			}
		}
		
		return searchedNameList;
	}
	
	// ȸ�� ��й�ȣ �ʱ�ȭ
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
	
	// ȸ�� ����
	public int deleteMember(String userId) {
		
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getUserId().equals(userId)) {
			
				list.remove(i--);
				result++;
				
			}
			
			// �������� �� ������ �����ͺ��� ū �ε����� UserNo�� result��ŭ �� �ָ� ���� ������?
			int userNo = list.get(i).getUserNo();
			
			// �����Ǿ��� �� userNo�� result�� ����ŭ ��� ��� ��
			if(result != 0 && userNo > i+1) {
						
				list.set(i, new Member(userNo - result, list.get(i).getUserId(), list.get(i).getUserPwd(), list.get(i).getUserName(),
									  list.get(i).getAge(), list.get(i).getGender(), list.get(i).getEmail(), list.get(i).getPhone()));
			} // => �������� �� �ߵ�!!
			
		}
		
		return result;
	}

}

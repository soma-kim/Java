package com.kh.chap01.list.part02.mvc.controller;

import java.util.ArrayList;
import com.kh.chap01.list.part02.mvc.model.vo.Music;

public class MusicController {
	
	// 음악을 보관할 수 있는 저장소를 전역변수로 빼 두고 두고두고 사용할 목적
	// => 얘를 insertMusic 메소드 안에서 호출하면 메소드가 끝날 때 함께 사라져 버림!
	ArrayList<Music> list = new ArrayList<>();
	{
		// 초기화 블록
		list.add(new Music("강남스타일", "싸이"));
		list.add(new Music("테스형!", "나훈아"));
	}
	
	// 1. 새로운 곡 추가 요청 시 실행할 메소드
	// public void insertMusic(String title, String artist) {
	// (+) 반환형 void -> int로 수정
	public int insertMusic(String title, String artist) {
	
		// (+) before 구하기
		int before = list.size();

		list.add(new Music(title, artist)); // 내가 원하는 값으로 생성된 객체가 list에 들어감
		// 여기까지 실행되고 나면 나를 호출했던 view의 mc.insertMusic(title, artist);로 돌아감
		
		// (+) 추가, 삭제, 수정처럼 성공 여부로 판단하고 싶다면?
		// (+) 추가된 데이터의 개수를 리턴
		// (+) 필요한 항목
		// (+) 추가된 후 ArrayList의 크기 - 추가되기 전 ArrayList의 크기,
		
		// (+) add 후의 사이즈 - before
		return list.size() - before; // 0이라면 추가가 안 된 것
	}
	
	// 2. 전체 곡 조회 요청 시 실행할 메소드
	public ArrayList<Music> selectMusicList() {
		return list;
	}
	
	// 3. 특정 곡 검색 요청 시 실행할 메소드
	public ArrayList<Music> searchMusic(String keyword) {
		
		// 검색 기능: 해당 키워드가 포함된 것들은 모두 조회
		
		// (1) 검색된 결과물을 담을 변수 셋팅(0개일 수도 있고, 1개일 수도 있고, 여러 개일수도 있음)
		ArrayList<Music> searched = new ArrayList<>(); // 현재 빈 상태
		
		// (2) 반복문을 돌려가며 "포함"된 것이 있나 검사해야 함
		// => 포함된 내용물이라면 검색된 결과물을 담을 수 있는 변수에 담아 두기
		for(int i = 0; i < list.size(); i++) {
			
			// 문자열의 일치관계를 검사할 수 있는 메소드: 문자열.equals(비교할문자열) => true/false
			// 문자열의 포함관계를 검사할 수 있는 메소드: 문자열.contains(검사할문자열)
			// => 문자열 안에 검사할 문자열이 포함되어 있다면 true / 포함되지 않았다면 false
			
			if(list.get(i).getTitle().contains(keyword)) { // 포함되어 있을 경우
				searched.add(list.get(i));
			}
		}
		
		// (3) 검색된 결과를 View단으로 리턴하기
		return searched;

	}
	
	// 4. 특정 곡 삭제 요청 시 실행될 메소드
	public int deleteMusic(String title) {
		
		int result = 0;// 삭제가 진행된 개수를 나타내는 변수
		
		// 반복문을 통해 곡 제목이 일치하는지 검사
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) { // 곡 제목이 일치한다면
				
				// list.remove(i);
				// remove는 해당 목록을 없앤 후 뒤에 있는 값들을 당겨 주는 역할까지 겸함
				// 1번째 값을 없애면 2번째 값이 1번째 값에 올 테고, 그대로 증감식으로 올라가 버리면 2 -> 1번째로 옮겨진 값은 for문에 걸리지 않음 
				list.remove(i--); // 후위연산을 추가해 주면 일단 i 그대로 계산하고, 있을 때 -1 한 값부터 다시 확인하기 때문에 해결 가능!
				result++;
			}
		}
		
		// result 리턴
		return result; // 0일 수도 있고(삭제된 게 없을 경우), 양수값일 수도 있음(삭제된 게 있을 경우)
		
	}
	
	// 5. 특정 곡 수정 요청 시 실행될 메소드
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		// (1) 수정된 곡 개수를 받을 변수 세팅
		int result = 0;
				
		// (2) 반복문을 통해 제목이 일치하는지 검사 후 일치한다면 곡 정보를 수정
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) { // 제목이 일치한다면
				
				// 수정하는 방법 2가지
				// 1. 비교적 효율적인 방법
				/*
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				*/
				
				// 2. 비교적 효율적인 방법은 아니지만 오늘 배운 내용을 활용할 수 있는 방법
				// => 메모리 영역에 할당이 한 번 더 이루어지긴 함
				list.set(i, new Music(upTitle, upArtist));
				
				result++;
			}
		}
		
		// (3) 결과 반환
		return result; // 0일 수도 있고(수정한 곡이 없음), 양수일 수도 있음(수정한 곡의 수)
	}
	
}

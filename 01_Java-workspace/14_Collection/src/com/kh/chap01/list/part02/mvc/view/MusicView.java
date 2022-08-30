package com.kh.chap01.list.part02.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01.list.part02.mvc.controller.MusicController;
import com.kh.chap01.list.part02.mvc.model.vo.Music;

// View: 시각적인 요소 (사용자가 보게 될 화면)
//		  출력문과 입력문을 사용
public class MusicView {
	
	// 전역변수
	private Scanner sc = new Scanner(System.in);
	// => 얘를 insertMusic 메소드 안에서 호출하면 메소드가 끝날 때 함께 사라져 버림!
	private MusicController mc = new MusicController();
	
	// 사용자가 프로그램 시작 시 가장 처음 보여지는 화면: 메인화면
	// 메인화면을 담당할 메소드
	public void mainMenu() {
		
		while(true) {
		
			System.out.println("*** Welcome 별밤 ***");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("---------------------");
			System.out.print("메뉴 입력: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
					insertMusic();
					break;
			case 2 : 
					selectMusicList();
					break;
			case 3 : 
					searchMusic();
					break;
			case 4 :
					deleteMusic();
					break;
			case 5 :
					updateMusic();
					break;
			case 0 : System.out.println("프로그램을 종료합니다.");
					return; // 이때 return을 써야 나를 호출했던 main으로 돌아가기 때문에 종료됨
			default : System.out.println("잘못된 메뉴입니다. 다시 입력해 주세요.");
			}
			
		}
		
	}
	
	// 1. 새로운 곡을 추가시킬 수 있는 화면
	public void insertMusic() {
		
		System.out.println("== 새로운 곡 추가 ==");
		System.out.print("곡명 입력: ");
		String title = sc.nextLine();
		System.out.print("가수명: ");
		String artist = sc.nextLine();
		
		// 추가해 주세요 요청 => Controller 클래스와 메소드를 호출
		// 클래스대변할이름.메소드명(넘겨줄값);
		// mc.insertMusic(title, artist);
		
		// System.out.println("성공적으로 추가되었습니다.");
		
		// (+) 추가, 삭제, 수정처럼 성공 여부로 판단하고 싶다면?
		int result = mc.insertMusic(title, artist);
		
		// (+) 추가 성공 판별
		if(result > 0) {
			System.out.println("성공적으로 추가되었습니다.");
		} else {
			System.out.println("곡 추가에 실패했습니다.");
		}

	}
	
	// 2. 전체 곡을 조회할 수 있는 화면
	public void selectMusicList() {
		
		System.out.println("== 곡 전체 조회 ==");
		
		// 전체 리스트를 조회해 주세요 요청 => Controller 클래스의 메소드 호출
		ArrayList<Music> list = mc.selectMusicList();
		

		if(list.isEmpty()) { // 리스트가 비어 있을 경우
			System.out.println("현재 존재하는 곡이 없습니다.");
		} else {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}

		
	}
	
	// 3. 특정 곡을 검색할 수 있는 화면
	public void searchMusic() {
		
		System.out.println("== 특정 곡 검색 ==");
		System.out.print("검색할 곡명 키워드: ");
		String keyword = sc.nextLine();
		
		// 검색해 주세요 요청 => Controller 클래스의 메소드 호출
		ArrayList<Music> searched = mc.searchMusic(keyword);
		
		System.out.println("검색 결과");
		
		if(searched.isEmpty()) { // 검색 결과가 없다면
		} else { // 검색 결과가 있다면
			
			for(Music m : searched) {
				System.out.println(m);
			}
		}
	}
	
	// 4. 특정 곡을 삭제할 수 있는 화면
	public void deleteMusic() {
		
		System.out.println("== 특정 곡 삭제 ==");
		System.out.print("삭제할 곡명: ");
		String title = sc.nextLine();
		
		// 삭제해 주세요 요청 => Controller 클래스의 메소드 호출
		// 삭제 진행 여부도 리턴받을 것
		// 리턴받을자료형 리턴받을값 = 클래스대변할이름.메소드명(넘겨줄값);
		int result = mc.deleteMusic(title);
		
		// 삭제 진행 여부 검사
		if(result > 0) { // 양수값 == 삭제 진행됨
			System.out.println("성공적으로 삭제되었습니다.");
		} else { // 삭제할 곡을 찾지 못함
			System.out.println("삭제할 곡을 찾지 못했습니다.");
			
		}
	}
	
	// 5. 특정 곡을 수정할 수 있는 화면
	public void updateMusic() {
		
		System.out.println("== 특정 곡 수정 ==");
		
		// 뭐를 어떻게 수정해야 하는지 언급
		// => 기존 곡명, 수정할 곡명, 수정할 가수명 입력받기
		
		System.out.print("기존 곡명: ");
		String title = sc.nextLine();
		System.out.print("수정 내용(곡명): ");
		String upTitle = sc.nextLine();
		System.out.print("수정 내용(가수명): ");
		String upArtist = sc.nextLine();
		
		// 수정해 주세요 요청 => Controller 클래스의 메소드 호출
		// 수정 여부 리턴받기 (int)
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		// 수정 여부 판별
		if(result > 0) { // 수정이 진행됨
			System.out.println("성공적으로 수정되었습니다.");
		} else { // 수정할 곡을 찾지 못함
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
		
	}

}

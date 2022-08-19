package com.kh.chap01.list.part02.mvc.controller;

import java.util.ArrayList;
import com.kh.chap01.list.part02.mvc.model.vo.Music;

public class MusicController {
	
	// ������ ������ �� �ִ� ����Ҹ� ���������� �� �ΰ� �ΰ�ΰ� ����� ����
	// => �긦 insertMusic �޼ҵ� �ȿ��� ȣ���ϸ� �޼ҵ尡 ���� �� �Բ� ����� ����!
	ArrayList<Music> list = new ArrayList<>();
	{
		// �ʱ�ȭ ���
		list.add(new Music("������Ÿ��", "����"));
		list.add(new Music("�׽���!", "���ƾ�"));
	}
	
	// 1. ���ο� �� �߰� ��û �� ������ �޼ҵ�
	// public void insertMusic(String title, String artist) {
	// (+) ��ȯ�� void -> int�� ����
	public int insertMusic(String title, String artist) {
	
		// (+) before ���ϱ�
		int before = list.size();

		list.add(new Music(title, artist)); // ���� ���ϴ� ������ ������ ��ü�� list�� ��
		// ������� ����ǰ� ���� ���� ȣ���ߴ� view�� mc.insertMusic(title, artist);�� ���ư�
		
		// (+) �߰�, ����, ����ó�� ���� ���η� �Ǵ��ϰ� �ʹٸ�?
		// (+) �߰��� �������� ������ ����
		// (+) �ʿ��� �׸�
		// (+) �߰��� �� ArrayList�� ũ�� - �߰��Ǳ� �� ArrayList�� ũ��,
		
		// (+) add ���� ������ - before
		return list.size() - before; // 0�̶�� �߰��� �� �� ��
	}
	
	// 2. ��ü �� ��ȸ ��û �� ������ �޼ҵ�
	public ArrayList<Music> selectMusicList() {
		return list;
	}
	
	// 3. Ư�� �� �˻� ��û �� ������ �޼ҵ�
	public ArrayList<Music> searchMusic(String keyword) {
		
		// �˻� ���: �ش� Ű���尡 ���Ե� �͵��� ��� ��ȸ
		
		// (1) �˻��� ������� ���� ���� ����(0���� ���� �ְ�, 1���� ���� �ְ�, ���� ���ϼ��� ����)
		ArrayList<Music> searched = new ArrayList<>(); // ���� �� ����
		
		// (2) �ݺ����� �������� "����"�� ���� �ֳ� �˻��ؾ� ��
		// => ���Ե� ���빰�̶�� �˻��� ������� ���� �� �ִ� ������ ��� �α�
		for(int i = 0; i < list.size(); i++) {
			
			// ���ڿ��� ��ġ���踦 �˻��� �� �ִ� �޼ҵ�: ���ڿ�.equals(���ҹ��ڿ�) => true/false
			// ���ڿ��� ���԰��踦 �˻��� �� �ִ� �޼ҵ�: ���ڿ�.contains(�˻��ҹ��ڿ�)
			// => ���ڿ� �ȿ� �˻��� ���ڿ��� ���ԵǾ� �ִٸ� true / ���Ե��� �ʾҴٸ� false
			
			if(list.get(i).getTitle().contains(keyword)) { // ���ԵǾ� ���� ���
				searched.add(list.get(i));
			}
		}
		
		// (3) �˻��� ����� View������ �����ϱ�
		return searched;

	}
	
	// 4. Ư�� �� ���� ��û �� ����� �޼ҵ�
	public int deleteMusic(String title) {
		
		int result = 0;// ������ ����� ������ ��Ÿ���� ����
		
		// �ݺ����� ���� �� ������ ��ġ�ϴ��� �˻�
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) { // �� ������ ��ġ�Ѵٸ�
				
				// list.remove(i);
				// remove�� �ش� ����� ���� �� �ڿ� �ִ� ������ ��� �ִ� ���ұ��� ����
				// 1��° ���� ���ָ� 2��° ���� 1��° ���� �� �װ�, �״�� ���������� �ö� ������ 2 -> 1��°�� �Ű��� ���� for���� �ɸ��� ���� 
				list.remove(i--); // ���������� �߰��� �ָ� �ϴ� i �״�� ����ϰ�, ���� �� -1 �� ������ �ٽ� Ȯ���ϱ� ������ �ذ� ����!
				result++;
			}
		}
		
		// result ����
		return result; // 0�� ���� �ְ�(������ �� ���� ���), ������� ���� ����(������ �� ���� ���)
		
	}
	
	// 5. Ư�� �� ���� ��û �� ����� �޼ҵ�
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		// (1) ������ �� ������ ���� ���� ����
		int result = 0;
				
		// (2) �ݺ����� ���� ������ ��ġ�ϴ��� �˻� �� ��ġ�Ѵٸ� �� ������ ����
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) { // ������ ��ġ�Ѵٸ�
				
				// �����ϴ� ��� 2����
				// 1. ���� ȿ������ ���
				/*
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				*/
				
				// 2. ���� ȿ������ ����� �ƴ����� ���� ��� ������ Ȱ���� �� �ִ� ���
				// => �޸� ������ �Ҵ��� �� �� �� �̷������ ��
				list.set(i, new Music(upTitle, upArtist));
				
				result++;
			}
		}
		
		// (3) ��� ��ȯ
		return result; // 0�� ���� �ְ�(������ ���� ����), ����� ���� ����(������ ���� ��)
	}
	
}

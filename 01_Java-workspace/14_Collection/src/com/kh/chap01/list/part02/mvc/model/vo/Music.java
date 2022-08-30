package com.kh.chap01.list.part02.mvc.model.vo;

public class Music {
	
	// 鞘靛何
	private String title;
	private String artist;
	
	// 积己磊何
	public Music() {
		super();
	}
	
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	// 皋家靛何
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
}

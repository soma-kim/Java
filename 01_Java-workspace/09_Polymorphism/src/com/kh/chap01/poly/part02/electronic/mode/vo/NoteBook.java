package com.kh.chap01.poly.part02.electronic.mode.vo;

public class NoteBook extends Electronic {
	
	// 鞘靛何
	private int usbPort;
	
	// 积己磊何
	public NoteBook() {
		
	}

	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}
	
	// 皋家靛何
	public int getUsbPort() {
		return usbPort;
	}

	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}

	@Override
	public String toString() {
		return super.toString() + ", usbPort: " + usbPort;
	}
	
	

}

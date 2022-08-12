package com.kh.chap01.poly.part02.electronic.mode.vo;

public class NoteBook extends Electronic {
	
	// �ʵ��
	private int usbPort;
	
	// �����ں�
	public NoteBook() {
		
	}

	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}
	
	// �޼ҵ��
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

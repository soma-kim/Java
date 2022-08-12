package practice1.model.vo;

public class Cat extends Animal {
	
	// �ʵ��
	private String location;
	private String color;

	// �����ں�
	public Cat() {
		
	}
	
	public Cat(String name, String kind, String location, String color) {
		super(name, kind);
		this.location = location;
		this.color = color;
	}

	// �޼ҵ��
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void speak() {
		System.out.println(super.toString() + location + "�� �����ϸ�, ������ "
							+ color + "�Դϴ�.");
	}
	 

}

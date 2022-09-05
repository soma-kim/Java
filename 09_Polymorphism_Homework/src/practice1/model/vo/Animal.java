package practice1.model.vo;

public abstract class Animal {
	
	// �ʵ��
	private String name;
	private String kind;
	
	// �����ں�
	protected Animal() {
		
	}
	
	protected Animal(String name, String kind) {
		this.name = name;
		this.kind = kind;
	}

	// �޼ҵ�
	public String toString() {
		return "���� �̸��� " + name + "�̰�, ������ " + kind + "�Դϴ�.";
		
	}
	
	public abstract void speak();

}

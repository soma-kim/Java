package practice1.model.vo;

public class Dog extends Animal {
	
	// �ʵ��
	public final static String PLACE = "�ְ�ī��";
	private int weight;
	
	// �����ں�
	public Dog() {
		
	}

	public Dog(String name, String kind, int weight) {
		super(name, kind);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	
	// �޼ҵ��

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println(super.toString() + "�����Դ� " + weight + "kg�Դϴ�.");
	}

}

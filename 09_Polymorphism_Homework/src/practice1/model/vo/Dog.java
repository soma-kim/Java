package practice1.model.vo;

public class Dog extends Animal {
	
	// 필드부
	public final static String PLACE = "애견카페";
	private int weight;
	
	// 생성자부
	public Dog() {
		
	}

	public Dog(String name, String kind, int weight) {
		super(name, kind);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	
	// 메소드부

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg입니다.");
	}

}

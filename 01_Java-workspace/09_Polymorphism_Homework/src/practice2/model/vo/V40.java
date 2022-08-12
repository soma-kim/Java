package practice2.model.vo;

public class V40 extends SmartPhone {
	
	// 필드부
	
	// 생성자부
	public V40() {
		
	}
	
	// 메소드부
	@Override
	public void printMaker() {
		System.out.println("LG에서 만들어 졌다.");
	}
	
	@Override
	public void makeaCall() {
		System.out.println("번호를 누르고 통화버튼을 누름");
	}
	
	@Override
	public void takeaCall() {
		System.out.println("전화받기 버튼을 누름");
	}
	
	@Override
	public void touch() {
		System.out.println("정전식");
	}
	@Override
	public void charge() {
		System.out.println("고속 충전");
	}
	
	@Override
	public void picture() {
		System.out.println("1200, 1600만 화소 트리플 카메라");
	}
}

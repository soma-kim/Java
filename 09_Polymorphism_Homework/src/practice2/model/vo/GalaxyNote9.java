package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
	// �ʵ��
	
	// �����ں�
	public GalaxyNote9() {
		
	}
	
	// �޼ҵ��
	@Override
	public void printMaker() {
		System.out.println("�Ｚ���� ����� ����.");
	}
	
	@Override
	public void makeaCall() {
		System.out.println("��ȣ�� ������ ��ȭ��ư�� ����");
	}
	
	@Override
	public void takeaCall() {
		System.out.println("��ȭ�ޱ� ��ư�� ����");
	}
	
	@Override
	public void touch() {
		System.out.println("������, ������ ����");
	}
	
	@Override
	public void charge() {
		System.out.println("��� ����, ��� ���� ����");
	}
	
	@Override
	public void picture() {
		System.out.println("1300�� ���ī�޶�");
	}
	
	
	
	
	
}

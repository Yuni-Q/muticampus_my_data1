package tset06;

public class Car {
	private int startCount;

	public Car(int startCount) {
		this.startCount = startCount;
	}

	////////////////////////////////////////////////////////////////
	public void start() throws InterruptedException {
		System.out.println(startCount + "�� �Ŀ� ���� ����մϴ�.");

		for (int i = startCount; i > 0; i--) {
			System.out.println("ī��Ʈ�ٿ�" + i);
				Thread.sleep(1000);
	
		}
		System.out.println("��~��~!!");
	}
}

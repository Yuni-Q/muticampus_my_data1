package test05;

public class Car {
	private double speed;
	private String color;

	/////////////////////////////////////////
	public void speedUp(int s) {
		System.out.println("���� ���� speedUp�� ���� ��");
		speed += s;
		System.out.println(speed);

	}

	public void speedUp(double s) {
		System.out.println("�Ǽ� ���� speedUp�� �����");

		speed += s;
		System.out.println(speed);

	}

}

package test02;

public class Test {

	public static void main(String[] args) {
		Car myCar = new Car();

		// myCar.speed=100;

		myCar.setColor("RED");

		// System.out.println("���� myCar�� ���� ����: " + myCar.color);
		System.out.println("���� myCar�� ���� ����: " + myCar.getColor());

		myCar.speedUp();

	}

}

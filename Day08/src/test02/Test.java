package test02;

public class Test {

	public static void main(String[] args) {
		Car myCar = new Car();

		// myCar.speed=100;

		myCar.setColor("RED");

		// System.out.println("현재 myCar의 색상 정보: " + myCar.color);
		System.out.println("현재 myCar의 색상 정보: " + myCar.getColor());

		myCar.speedUp();

	}

}

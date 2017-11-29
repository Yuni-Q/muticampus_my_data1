package test05;

public class Car {
	private double speed;
	private String color;

	/////////////////////////////////////////
	public void speedUp(int s) {
		System.out.println("정수 버전 speedUp이 실행 됨");
		speed += s;
		System.out.println(speed);

	}

	public void speedUp(double s) {
		System.out.println("실수 버전 speedUp이 실행됨");

		speed += s;
		System.out.println(speed);

	}

}

package test01;

public class Test {
	public static void main(String[] args) {
		System.out.println("프로그램이 시작됩니다.");
		Car myCar = new Car();

		myCar.speed = 0;
		myCar.milleage = 10000;
		myCar.color = "red";
		myCar.model = "sonata";
		myCar.speedUp();
		myCar.speedUp();
		///////////////////////////////////////////////////////

		System.out.println("현재 myCar의 속도는 = " + myCar.speed);

		//////////////////////////////////////////////////////
		Car secondCar = new Car();

		secondCar.speed = 100;
		secondCar.speedUp();

		System.out.println("현재 secondCar의 속도는 = " + secondCar.speed);
		System.out.println("프로그램이 끝납니다.");

	}

}

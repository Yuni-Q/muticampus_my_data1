package test03;

public class Test {
	public static void main(String[] args) {
		Car myCar = new Car();// °´Ã¼ »ý¼º

		myCar.speed += 10;
		myCar.color = "red";

		myCar.speedUp(10);
		myCar.speedUp(5);

		// System.out.println(myCar.speed);
		// String myCarStatus = myCar.toString();
		// System.out.println(myCarStatus);
		System.out.println(myCar.toString());
	}
}

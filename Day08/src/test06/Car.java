package test06;

public class Car {
	private int speed;
	private String color;
	private String model;
	///////////////////////////////////////////////////////

	public Car() {
		this(0, "red", "SONATA");

		System.out.println("�⺻ �����ڰ� ȣ���!");
		// speed = 0;
		// color = "red";
		// model = "SONATA";

	}

	public Car(int s) {
		System.out.println("int �����ڰ� ȣ���!");
		speed = s;
		color = "red";
		model = "SONATA";
	}

	public Car(int s, String c) {
		System.out.println("int, String �����ڰ� ȣ���!");
		speed = s;
		color = "red";
		model = "SONATA";
	}

	public Car(int s, String c, String m) {
		System.out.println("int, String �����ڰ� ȣ���!");
		speed = s;
		color = c;
		model = m;
	}
}

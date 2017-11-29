package test05;

public class Test {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.turnOn();

		Aircon air = new Aircon();
		air.turnOn();

		Remote remocon = new Television();
		remocon.turnOn();

		remocon = new Aircon();
		remocon.turnOn();

	}
}

package test03;

public class Car {

	int speed;
	String color;
	///////////////////////////////////////////////////////////////

	void speedUp(int s) {
		speed += s;
	}

	void speedDown(int s) {
		speed -= s;
	}
	public String toString(){
		String status="속도: "+speed+", 색상: "+color;
		return status;
	}

}
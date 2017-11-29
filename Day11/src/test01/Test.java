package test01;

public class Test {

	public static void main(String[] args) {

		Shape s = new Ractangle(0, 0, 10, 20);

		System.out.println("≥–¿Ã" + s.calcArea());

		s = new Circle(0, 0, 5);
		System.out.println("≥–¿Ã" + s.calcArea());

		System.out.println("π›¡ˆ∏ß" + ((Circle) s).getRadius());

	}

}

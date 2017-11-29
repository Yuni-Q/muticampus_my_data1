package test03;

public class Test {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		s[0] = new Circle(0, 0, 5);
		s[1] = new Circle(0, 0, 10);
		s[2] = new Ractangle(0, 0, 10, 30);

		for (int i = 0; i < s.length; i++) {
			System.out.println("³ÐÀÌ" + s[i].calcArea());
		}

	}

}

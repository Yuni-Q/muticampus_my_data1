package test02;

public class Test {

	public static void main(String[] args) {
		System.out.println("넓이" + calcArea(new Ractangle(0, 0, 10, 20)));
		System.out.println("넓이" + calcArea(new Circle(0, 0, 10)));
	}

	public static double calcArea(Shape s) {
		if (s instanceof Circle) {
			return ((Circle) s).getRadius() * ((Circle) s).getRadius() * 3.14;
		} else if (s instanceof Ractangle) {
			return ((Ractangle) s).getWidth() * ((Ractangle) s).getHeight();
		} else {
			System.out.println("잘못된 도형 ! 넓이 계산 불가 !");
			return 0;
		}

	}

}

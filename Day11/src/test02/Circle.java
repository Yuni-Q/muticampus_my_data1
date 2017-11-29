package test02;

public class Circle extends Shape {
	private int radius;

	public Circle() {
		super();
		radius = 0;

	}

	public Circle(int x, int y, int r) {
		super(x, y);
		radius = r;

	}

	///////////////////////////////////////////////////////////
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//////////////////////////////////////////////////////


}

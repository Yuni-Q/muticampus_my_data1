package test04;

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
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}

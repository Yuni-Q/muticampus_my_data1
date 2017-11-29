package move;

public class Circle extends Shape{
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
	
	public interface movable{
		void move (int dx, int dy);
	}
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		super.move(dx, dy);
	}
}

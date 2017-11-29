package point;

public class Point {
	int x = 0, y = 0;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(x + ", " + y);
	}

}

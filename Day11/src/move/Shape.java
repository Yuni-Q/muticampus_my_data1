package move;

public class Shape implements Movable{

	private int x, y;

	public Shape() {
		x = y = 0;
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	///////////////////////////////////////////////////////////////
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void move(int dx, int dy) {
		this.x=x+dx;
		this.y=y+dy;
	}

	////////////////////////////////////////////////////////////////
	
}


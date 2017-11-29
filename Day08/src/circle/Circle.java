package circle;

public class Circle {

	private int r = 4;
	private int cx = 0;
	private int cy = 0;
	private double area = 0;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double area() {
		area = r * r * 3.14;
		return area;
	}

}

package average;

public class Average {
	double area = 0;

	public Double getAverage(int a, int b) {
		area = (a + b) / 2.0;
		return area;
	}

	public Double getAverage(int a, int b, int c) {
		area = (a + b + c) / 3.0;
		return area;
	}

}

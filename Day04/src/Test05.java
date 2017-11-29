
public class Test05 {
	public static void main(String[] args) {
		int x = 132, y = 84, r;
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;

		}
		System.out.println(x);
	}
}
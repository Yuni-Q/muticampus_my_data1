
public class T19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0;
		for (i = 1; sum < 100; i++) {
			if (0 == i % 2) {
				sum -= i;
			} else {
				sum += i;
			}
		}
		System.out.println(i - 1 + "번까지 더하면" + sum);
	}

}

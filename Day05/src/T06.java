
public class T06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0, x = 0, y = 0;
		for (i = 2; i <= 100; i++) {
			for (j = 2; j <= 99; j++) {
				x = i % j;
				if ((x == 0) && i != j) {
					break;
				}
				if (j == 99) {
					y = i;
					System.out.println(y);
				}

			}

		}

	}
}

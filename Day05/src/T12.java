
public class T12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if ((0 == i % 3) && (0 == i % 5)) {
				System.out.print(i);
				count++;
				if (0 == count % 10) {
					System.out.println("");

				}

			} else if (0 == i % 3) {
				System.out.print("*");
				count++;
				if (0 == count % 10) {
					System.out.println("");

				}
			} else if (0 == i % 5) {
				System.out.print("#");
				count++;
				if (0 == count % 10) {
					System.out.println("");

				}
			}

		}
	}

}


public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 98;
		for (int i = 1; i < 10; i++) {
			int x = 97;

			for (int j = 9; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 10; k > (10 - i); k--) {

				int z = y - (11 - k);

				System.out.print((char) z);

			}
			for (int k = 2; k <= i; k++) {
				x = x + 1;
				System.out.print((char) x);

			}
			System.out.println("");
			y = y + 1;
		}
	}

}
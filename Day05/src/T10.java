import java.util.Scanner;

public class T10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		long a = 0, b = 1, c;
		int i, j;
		System.out.println("몇번째 항까지 출력하시겠습니까?");
		j = scan.nextInt();
		if (j != 0) {

			System.out.print(a + " ");
			if (j != 1) {

				System.out.print(b + " ");
				if (j != 2) {

					for (i = 3; i <= j; i++) {
						c = a + b;
						a = b;
						b = c;
						System.out.print(c + " ");
					}
				}
			}
		}
	}
}

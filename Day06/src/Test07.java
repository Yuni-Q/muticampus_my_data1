import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] su = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "번째 숫자를 입력하시오.");
			su[i] = scan.nextInt();
		}

		for (int k = 1; k < 100; k += 10) {
			System.out.print(k + " - " + (k + 9) + ": ");
			for (int i = 0; i <= 9; i++) {
				for (int j = 0; j < 10; j++) {
					if (su[j] == (k + i)) {
						System.out.print("*");
					}
				}

			}
			System.out.println("");
		}

	}
}

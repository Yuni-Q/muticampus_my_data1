import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int i = 1;

		System.out.println("숫자를 입력하시오.: ");
		n = scan.nextInt();

		for (i = 1; i <= 9; i++) {

			System.out.println(n + "*" + i + "=" + n * i);
		}

	}
}

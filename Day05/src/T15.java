import java.util.Scanner;

public class T15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x, sum = 0;
		while (true) {
			System.out.println("숫자를 입력하시오");
			x = scan.nextInt();
			if (x == 0) {
				break;
			}
			if (x >= 0) {
				sum += x;

			}

		}
		System.out.println(sum);
	}

}

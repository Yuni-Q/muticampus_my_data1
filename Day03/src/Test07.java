import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		final int RATE = 10000;
		int pay;
		int hours;
		Scanner input = new Scanner(System.in);

		System.out.println("시간을 입력하시오: ");
		hours = input.nextInt();

		if (hours > 7) {
			pay = RATE * 8 + (int) (1.5 * RATE * (hours - 8));

		} else {
			pay = RATE * hours;
		}
		System.out.println("임금은 " + pay + "입니다.");
	}
}

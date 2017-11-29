import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x, y;
		System.out.print("마일을 입력하시오: ");
		x = input.nextDouble();
		y = x * 1.609;

		System.out.println(x + "마일은" + y + "킬로미터입니다.");

	}
}

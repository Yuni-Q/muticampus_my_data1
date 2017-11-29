import java.util.Scanner;

public class T09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x, y, v = 0;
		char z;
		System.out.println("문자를 입력하시오.");
		z = scan.next().charAt(0);
		System.out.println("숫자를 입력하시오.");
		x = scan.nextDouble();
		System.out.println("숫자를 하나 더 입력하시오.");
		y = scan.nextDouble();
		if (z == '+') {
			v = x + y;
			System.out.println(v);
		} else if (z == '-') {
			v = x - y;
			System.out.println(v);

		} else if (z == '*') {
			v = x * y;
			System.out.println(v);
		} else if (z == '/') {
			if (y == 0) {
				System.out.println("분모가 0 입니다.");
			} else {
				v = x / y;

			}
		}

	}

}

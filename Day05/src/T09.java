import java.util.Scanner;

public class T09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x, y, v = 0;
		char z;
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		z = scan.next().charAt(0);
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		x = scan.nextDouble();
		System.out.println("���ڸ� �ϳ� �� �Է��Ͻÿ�.");
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
				System.out.println("�и� 0 �Դϴ�.");
			} else {
				v = x / y;

			}
		}

	}

}

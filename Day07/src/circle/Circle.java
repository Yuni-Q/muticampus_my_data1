package circle;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice = new String();
		while (true) {
			System.out.println("���� �������� �Է��Ͻÿ�.");
			int radius = scan.nextInt();
			double area = radius * radius * 3.14;
			System.out.println(area);
			System.out.println("����Ͻðڽ��ϱ�?");

			choice = scan.next();

			if (choice.toUpperCase() == "N") {
				break;

			}

		}

	}

}

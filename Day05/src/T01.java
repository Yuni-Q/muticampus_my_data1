import java.util.Scanner;

public class T01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.: ");
		int[] x = new int[3];
		x[0] = scan.nextInt();
		System.out.println("������ �Է��Ͻÿ�.: ");
		x[1] = scan.nextInt();
		System.out.println("������ �Է��Ͻÿ�.: ");
		x[2] = scan.nextInt();
		int y = 0;
		for (int i = 0; i <= 1; i++) {
			for (int j = i + 1; j <= 2; j++) {
				if (x[i] < x[j]) {
					y = x[i];
					x[i] = x[j];
					x[j] = y;

				} else {
					break;

				}

			}

		}
		for (int i = 0; i <= 2; i++) {
			System.out.print(x[i] + " ");
		}
	}
}

import java.util.Scanner;

public class T15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x, sum = 0;
		while (true) {
			System.out.println("���ڸ� �Է��Ͻÿ�");
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

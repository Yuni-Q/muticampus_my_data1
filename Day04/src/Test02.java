import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("���ڸ� �Է��Ͻÿ�.:");
		number = scan.nextInt();
		switch (number) {
		case 0:
			System.out.println("����");
			break;

		case 1:
			System.out.println("�ϳ�");
			break;

		case 2:
			System.out.println("��");
			break;

		default:
			System.out.println("����");
			break;
		}
	}
}

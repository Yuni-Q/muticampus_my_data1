import java.util.Scanner;

public class T02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ĺ��� �Է��Ͻÿ�.: ");
		char english = scan.next(".").charAt(0);

		switch (english) {
		case 'e':
			System.out.println("����");
			break;
		case 'u':
			System.out.println("����");
			break;
		case 'o':
			System.out.println("����");
			break;
		case 'a':
			System.out.println("����");
			break;
		case 'i':
			System.out.println("����");
			break;
		default:
			System.out.println("����");
			break;
		}
	}
}
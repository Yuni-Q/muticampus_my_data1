import java.util.Scanner;

public class T02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳을 입력하시오.: ");
		char english = scan.next(".").charAt(0);

		switch (english) {
		case 'e':
			System.out.println("모음");
			break;
		case 'u':
			System.out.println("모음");
			break;
		case 'o':
			System.out.println("모음");
			break;
		case 'a':
			System.out.println("모음");
			break;
		case 'i':
			System.out.println("모음");
			break;
		default:
			System.out.println("자음");
			break;
		}
	}
}
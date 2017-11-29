import java.util.Scanner;

public class T14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String x;
		System.out.println("¼ýÀÚ");
		x = scan.nextLine();
		for (int i = x.length() - 1; i >= 0; i--) {
			System.out.print(x.charAt(i));
		}
	}
}

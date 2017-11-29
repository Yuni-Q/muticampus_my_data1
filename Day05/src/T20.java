import java.util.Scanner;

public class T20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("¼ýÀÚ");
		String x = scan.nextLine();
		int sum = 0;
		for (int i = x.length() - 1; i >= 0; i--) {
			sum += x.charAt(i) - 48;

		}
		System.out.println(sum);
	}

}

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class T05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오: ");
		double x = scan.nextDouble();
		double fx = 0;
		if (x <= 0) {
			fx = x * x * x - 9 * x + 2;

		} else {
			fx = 7 * x + 2;

		}
		System.out.println(fx);
	}

}

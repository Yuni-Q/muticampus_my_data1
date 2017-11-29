import java.util.Scanner;

public class T13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int x;

		System.out.println("숫자를 입력하시오");
		x = scan.nextInt();
		int length = (int)(Math.log10(x)+1);
					System.out.println("입력하신 정수는 "+length+"자리수 입니다.");
		}
}

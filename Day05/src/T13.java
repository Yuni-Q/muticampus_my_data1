import java.util.Scanner;

public class T13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int x;

		System.out.println("���ڸ� �Է��Ͻÿ�");
		x = scan.nextInt();
		int length = (int)(Math.log10(x)+1);
					System.out.println("�Է��Ͻ� ������ "+length+"�ڸ��� �Դϴ�.");
		}
}

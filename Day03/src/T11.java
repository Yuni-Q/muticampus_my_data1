import java.util.Scanner;

public class T11 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int x;
		String y;
		System.out.print("������ �Է��Ͻÿ�:  ");
		x=input.nextInt();
		y = (x>=50)? "A" : "B";
		System.out.println("����� ������ "+y+"�Դϴ�.");
		
	}
}

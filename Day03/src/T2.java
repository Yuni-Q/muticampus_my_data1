import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		x=input.nextInt();
		System.out.print("������ �Է��Ͻÿ�:");
		y=input.nextInt();
		System.out.println(y+"�� "+x+"�� ���� ���� "+y/x+"�̰� �������� "+y%x+"�Դϴ�.");
		
	}
}

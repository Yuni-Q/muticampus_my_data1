import java.util.Scanner;

public class T6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v,w,x,y,z;
		
		System.out.print("500��: ");
		v=input.nextInt();
		System.out.print("100��: ");
		w=input.nextInt();
		System.out.print("50��: ");
		x=input.nextInt();
		System.out.print("10��: ");
		y=input.nextInt();
		z=v*500+w*100+x*50+y*10;
		System.out.println("�����뿡 ����ִ� ���� "+z+"�Դϴ�.");
		
	}
}

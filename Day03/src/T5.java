import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x,y,z,w;
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		x=input.nextInt();
		System.out.print("�ʺ� �Է��Ͻÿ�: ");
		y=input.nextInt();
		System.out.print("���̸� �Է��Ͻÿ�: ");
		z=input.nextInt();
		w=x*y*z;
		if((x<=100)&&(y<=100)&&(z<=100))
		System.out.print("������ ü���� "+w+"�Դϴ�.");
		else System.out.print("���� 100�� �ʰ��Ͽ����ϴ�.");
		
		
	}
}

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w,h,area,perimeter;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		h=input.nextInt();
		System.out.print("���̸� �Է��Ͻÿ�: ");
		w=input.nextInt();
		
		area=w*h;
		perimeter=2*(w+h);
		
		System.out.println("�簢���� ����: " + area+ "\n"+"�簢���� �ѷ�: "+perimeter);
	}

}
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int x, z;
		double y;
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		x=input.nextInt();
		y=x/2.54;
		z=(int)y/12;		
		System.out.print(x+"cm�� "+z+"��Ʈ "+y+"��ġ�Դϴ�.");
	}

}

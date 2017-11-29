import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x,y,z;
		
		System.out.print("힘: ");
		x=input.nextDouble();
		System.out.print("넓이: ");
		y=input.nextDouble();
		z=x/y;
		System.out.println("압력의 세기는 "+z+"입니다.");
		
	}
}

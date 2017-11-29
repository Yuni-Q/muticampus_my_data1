import java.util.Scanner;

public class T10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double v,w,x,y;
		System.out.print("AC: ");
		v=input.nextInt();
		System.out.print("AE: ");
		w=input.nextInt();
		System.out.print("BC: ");
		x=input.nextInt();
		y=(w*x)/v;
		System.out.println("DE는 "+y+"입니다.");
	}

}

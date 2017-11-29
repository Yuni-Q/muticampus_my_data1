import java.util.Scanner;

public class T6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v,w,x,y,z;
		
		System.out.print("500원: ");
		v=input.nextInt();
		System.out.print("100원: ");
		w=input.nextInt();
		System.out.print("50원: ");
		x=input.nextInt();
		System.out.print("10원: ");
		y=input.nextInt();
		z=v*500+w*100+x*50+y*10;
		System.out.println("저금통에 들어있는 돈은 "+z+"입니다.");
		
	}
}

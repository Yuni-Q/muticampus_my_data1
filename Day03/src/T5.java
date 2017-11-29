import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x,y,z,w;
		
		System.out.print("길이를 입력하시오: ");
		x=input.nextInt();
		System.out.print("너비를 입력하시오: ");
		y=input.nextInt();
		System.out.print("높이를 입력하시오: ");
		z=input.nextInt();
		w=x*y*z;
		if((x<=100)&&(y<=100)&&(z<=100))
		System.out.print("상자의 체적은 "+w+"입니다.");
		else System.out.print("값이 100을 초과하였습니다.");
		
		
	}
}

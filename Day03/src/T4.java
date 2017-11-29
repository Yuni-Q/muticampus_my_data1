import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		double z;
		System.out.print("원기둥 밑면의 반지름을 구하시오: ");
		x=input.nextInt();
		System.out.print("원기둥의 높이를 입력하시오: ");
		y=input.nextInt();
		z=(3.14*x*x)*y;
		System.out.print("원기둥의 부피는 "+z+"입니다.");
	
	
	
	
	}
}

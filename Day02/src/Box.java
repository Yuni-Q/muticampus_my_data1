import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w,h,area,perimeter;
		Scanner input = new Scanner(System.in);
		
		System.out.print("높이를 입력하시오: ");
		h=input.nextInt();
		System.out.print("길이를 입력하시오: ");
		w=input.nextInt();
		
		area=w*h;
		perimeter=2*(w+h);
		
		System.out.println("사각형의 넓이: " + area+ "\n"+"사각형의 둘레: "+perimeter);
	}

}
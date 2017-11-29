import java.util.Scanner;

public class T12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		String y;
		System.out.print("점수를 입력하시오: ");
		x=input.nextInt();
		y= (x>=70)? "A" : (x>=40)? "B" : "C";
		System.out.println("당신의 성적은 "+y+"입니다.");
	}
}

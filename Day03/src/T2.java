import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.print("정수를 입력하시오: ");
		x=input.nextInt();
		System.out.print("정수를 입력하시오:");
		y=input.nextInt();
		System.out.println(y+"을 "+x+"로 나눈 몫은 "+y/x+"이고 나머지는 "+y%x+"입니다.");
		
	}
}

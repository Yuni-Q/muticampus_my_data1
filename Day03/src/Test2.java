import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		
		System.out.println("숫자를 입력해 주세요: ");
		x=scan.nextInt();
		
		if(x%2==0){
			System.out.println("2의 배수");
		
		}else if(x%3==0){
			System.out.println("3의 배수");
			
		}else if(x%5==0){
			System.out.println("5의 배수");
			
		}else
			System.out.println("그외의 수");
			
	}
}

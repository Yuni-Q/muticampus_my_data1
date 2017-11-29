import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		
		System.out.println("숫자를 입력해 주세요: ");
		x=scan.nextInt();
		System.out.println("숫자를 입력해 주세요: ");
		y=scan.nextInt();
		
		if(y==0){
			System.out.println("0");
			
		}else{
			System.out.println("몫은 "+x/y+"나머지는 "+x%y+"입니다.");
		}
		
		
		
	}
}

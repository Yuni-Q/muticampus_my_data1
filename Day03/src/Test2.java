import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		
		System.out.println("���ڸ� �Է��� �ּ���: ");
		x=scan.nextInt();
		
		if(x%2==0){
			System.out.println("2�� ���");
		
		}else if(x%3==0){
			System.out.println("3�� ���");
			
		}else if(x%5==0){
			System.out.println("5�� ���");
			
		}else
			System.out.println("�׿��� ��");
			
	}
}

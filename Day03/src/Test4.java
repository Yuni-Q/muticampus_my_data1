import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		
		System.out.println("���ڸ� �Է��� �ּ���: ");
		x=scan.nextInt();
		System.out.println("���ڸ� �Է��� �ּ���: ");
		y=scan.nextInt();
		
		if(y==0){
			System.out.println("0");
			
		}else{
			System.out.println("���� "+x/y+"�������� "+x%y+"�Դϴ�.");
		}
		
		
		
	}
}

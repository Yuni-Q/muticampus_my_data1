import java.util.Scanner;

public class T16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int x; 
		for(int i=0;i<=4;i++){
			System.out.println(i+1+"��° ���ڸ� �Է��Ͻÿ�.");
			 x = scan.nextInt();
			 sum+=x;	
		} 
		System.out.println(sum);
		

	}

}

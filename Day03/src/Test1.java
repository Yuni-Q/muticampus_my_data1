import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w=0,x,y,z;
		
		System.out.println("������ ������ ���ÿ�.");
		System.out.println("1:����, 2:����, 3:����, 4:������, 5:������");
		x=scan.nextInt();
		System.out.println("���ڸ� �Է��Ͻʽÿ�: ");
		y=scan.nextInt();
		System.out.println("���ڸ� �ϳ� �� �Է��Ͻʽÿ�: ");
		z=scan.nextInt();
		
		
		if(x==1){
			w=y+z;
			
		}else if (x==2){
			w=y-z;
			
		}else if(x==3){
			w=y*z;
			
		}else if(x==4){
			if(z==0){
				System.out.println("incorrect!!");
				
			}else{
			w=y/z;
			}
		}else if(x==5){
			w=y%z;
			
		}else {
			System.out.println("incorrect!!");
		}
		
	
	
	
	System.out.println(w);
	}
}

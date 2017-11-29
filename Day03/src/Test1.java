import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w=0,x,y,z;
		
		System.out.println("수행할 연산을 고르시오.");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
		x=scan.nextInt();
		System.out.println("숫자를 입력하십시오: ");
		y=scan.nextInt();
		System.out.println("숫자를 하나 더 입력하십시오: ");
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

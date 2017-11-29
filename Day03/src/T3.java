import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int x, z;
		double y;
		System.out.print("키를 입력하시오: ");
		x=input.nextInt();
		y=x/2.54;
		z=(int)y/12;		
		System.out.print(x+"cm는 "+z+"피트 "+y+"인치입니다.");
	}

}

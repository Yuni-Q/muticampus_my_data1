import java.util.Scanner;

public class T11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("���ڸ��Է��Ͻÿ�");
int x=scan.nextInt();

for (int i=1;i<=x;i++){
	if (0==x%i){
		System.out.print(i+" ");
	}
}
	}

}

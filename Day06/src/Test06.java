import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y;
		int[] space = new int[10];
		for (int i = 0; i < 10; i++) {
			space[i] = 0;

		}

		while (true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
			y=scan.nextInt();
			if(y==1){
				
			
			System.out.println("������ ���� ���´� ������ �����ϴ�.");
			System.out.println("----------------------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(space[i] + " ");
			}
			System.out.println("");
			System.out.println("----------------------------------------");
			System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?");
			x = scan.nextInt();
			
			if(space[x-1]==1){
				System.out.println("�̹� ����� �¼� �Դϴ�.");
			}
			
			else{
				System.out.println("����Ǿ����ϴ�.");
			}
			space[x-1]=1;
			}
		}

	}
}

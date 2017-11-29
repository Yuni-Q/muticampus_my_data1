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
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
			y=scan.nextInt();
			if(y==1){
				
			
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("----------------------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(space[i] + " ");
			}
			System.out.println("");
			System.out.println("----------------------------------------");
			System.out.print("몇번째 좌석을 예약하시겠습니까?");
			x = scan.nextInt();
			
			if(space[x-1]==1){
				System.out.println("이미 예약된 좌석 입니다.");
			}
			
			else{
				System.out.println("예약되었습니다.");
			}
			space[x-1]=1;
			}
		}

	}
}

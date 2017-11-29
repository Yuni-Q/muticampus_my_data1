import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0, ave = 0;
		System.out.print("학생의 수를 입력하시오.:");
		num = scan.nextInt();
		int[] student = new int[num];
		System.out.println("");

		for (int i = 0; i < num; i++) {
			while (true) {
				System.out.print("학생 " + (i + 1) + "의 성적을 입력하시오.:");
				student[i] = scan.nextInt();
				if (student[i] > 100) {
					System.out.println("잘못된 성적입니다. 다시입력하시오.");
				} else {
					break;
				}
			}

		}

		for (int i = 0; i < num; i++) {
			sum += student[i];
		}
		ave = (sum / num);
		System.out.println("성적 평군은 " + ave + "입니다.");
	}

}

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하시오:");
		int score = scan.nextInt();

		if (100 > score && score >= 90) {
			System.out.println("당신의 성적은 A입니다.");
		}
		if (90 > score && score >= 80) {
			System.out.println("당신의 성적은 B입니다.");
		}
		if (80 > score && score >= 70) {
			System.out.println("당신의 성적은 C입니다.");
		}
		if (70 > score && score >= 60) {
			System.out.println("당신의 성적은 D입니다.");
		}
		if (60 > score) {
			System.out.println("당신의 성적은 F입니다.");
		}

	}

}

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;
		char grade='F';
		
		System.out.println("당신의 점수는 몇점 입니까? : ");
		score=scan.nextInt();
		
		if (score>=50){
			grade='A';
		}else{
			grade='F';
			
		}
		System.out.println("당신의 성적은"+grade+"입니다.");
	}
}


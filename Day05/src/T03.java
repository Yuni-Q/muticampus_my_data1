import java.util.Scanner;

public class T03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력하시오: ");
		double height = scan.nextDouble();
		System.out.println("몸무게를 입력하시오");
		double weight = scan.nextDouble();
		double averageWeight = (height - 100) * 0.9;
		if (weight > averageWeight + 10) {
			System.out.println("과체중");
		} else if (weight <= averageWeight - 10) {
			System.out.println("저체중");
		} else {
			System.out.println("정상");
		}
	}
}

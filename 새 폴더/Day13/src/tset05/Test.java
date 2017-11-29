package tset05;

import java.util.Scanner;

public class Test {
	// // ArithmeticException, InputMismatchException 예외
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("숫자 입력 : ");
		int n2 = sc.nextInt();

		try {
			int result = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + result);
		} catch (ArithmeticException ex) {
			System.out.println("0으로 나누기는 불가능 합니다.");
		} finally{
			System.out.println("하늘이 무너져도 이문장은 실행하고 죽겠다.");
		}
		System.out.println("프로그램 종료");
	}

}
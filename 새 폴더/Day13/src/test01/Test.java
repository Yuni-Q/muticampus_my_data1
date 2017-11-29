package test01;

import java.util.Scanner;

public class Test {
//예외 처리 안함
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("숫자 입력 : ");
		int n2 = sc.nextInt();

		int result = n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" + result);
	}

}

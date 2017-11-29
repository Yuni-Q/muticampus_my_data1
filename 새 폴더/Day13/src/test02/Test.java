package test02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	// ArithmeticException 예외
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("숫자 입력 : ");
		int n2 = sc.nextInt();
		
			int result = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + result);
		} catch (ArithmeticException ex) {
			System.out.println("0으로 나누기는 불가능 합니다.");
		}catch(InputMismatchException ex){
		System.out.println("숫자!!");}
		System.out.println("프로그램 종료");
	}

}

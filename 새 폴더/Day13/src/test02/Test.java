package test02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	// ArithmeticException ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println("���� �Է� : ");
		int n1 = sc.nextInt();
		System.out.println("���� �Է� : ");
		int n2 = sc.nextInt();
		
			int result = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + result);
		} catch (ArithmeticException ex) {
			System.out.println("0���� ������� �Ұ��� �մϴ�.");
		}catch(InputMismatchException ex){
		System.out.println("����!!");}
		System.out.println("���α׷� ����");
	}

}

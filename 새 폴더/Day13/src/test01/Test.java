package test01;

import java.util.Scanner;

public class Test {
//���� ó�� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է� : ");
		int n1 = sc.nextInt();
		System.out.println("���� �Է� : ");
		int n2 = sc.nextInt();

		int result = n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" + result);
	}

}

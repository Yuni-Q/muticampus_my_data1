import java.util.Scanner;

public class T22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�:");
		int year = scan.nextInt();
		System.out.println("���� �Է��Ͻÿ�.:");
		int month = scan.nextInt();
		System.out.println("���� �Է��Ͻÿ�.:");
		int day = scan.nextInt();
		int total_days = day;
		total_days += ((year - 1900) * 365);
		total_days += (year - 1900) / 4;
		if (((year % 4 == 0) || (year % 100 == 0) || (year % 400 == 0)) && ((month == 2) || (month == 1))) {
			total_days -= 1;

		}
		for (int i = 1; i < month; i++) {
			total_days += 31;
			if (i == 2) {
				total_days -= 3;
			}
			if (i == 4) {
				total_days -= 1;
			}
			if (i == 6) {
				total_days -= 1;
			}
			if (i == 9) {
				total_days -= 1;
			}
			if (i == 11) {
				total_days -= 1;
			}

		}
		int x = total_days % 7;
		if (x == 0) {
			System.out.println("�Ͽ���");
		} else if (x == 1) {
			System.out.println("������");
		} else if (x == 2) {
			System.out.println("ȭ����");
		} else if (x == 3) {
			System.out.println("������");
		} else if (x == 4) {
			System.out.println("�����");
		} else if (x == 5) {
			System.out.println("�ݿ���");
		} else {

			System.out.println("�����");
		}
	}

}

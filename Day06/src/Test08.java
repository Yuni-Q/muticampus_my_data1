import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0, ave = 0;
		System.out.print("�л��� ���� �Է��Ͻÿ�.:");
		num = scan.nextInt();
		int[] student = new int[num];
		System.out.println("");

		for (int i = 0; i < num; i++) {
			while (true) {
				System.out.print("�л� " + (i + 1) + "�� ������ �Է��Ͻÿ�.:");
				student[i] = scan.nextInt();
				if (student[i] > 100) {
					System.out.println("�߸��� �����Դϴ�. �ٽ��Է��Ͻÿ�.");
				} else {
					break;
				}
			}

		}

		for (int i = 0; i < num; i++) {
			sum += student[i];
		}
		ave = (sum / num);
		System.out.println("���� ���� " + ave + "�Դϴ�.");
	}

}

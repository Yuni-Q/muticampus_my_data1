package appraisal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, BankAccount> bankAccount = new HashMap<String, BankAccount>();
		BankAccount ba = null;
		BankAccount ba2 = null;
		String customerNumber;

		while (true) {
			System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:�۱� 5:������ȸ 6:�������� -1:���� -- ");
			System.out.print(" -- select >");
			int number = scan.nextInt();
			int money;
			String password;

			if (number == -1)
				break;

			switch (number) {
			case 1: // ����
				System.out.print("�̸�: ");
				String name = scan.next();
				System.out.print("��й�ȣ: ");
				String pw = scan.next();
				System.out.print("�ܾ�: ");
				int balance = scan.nextInt();
				ba = new BankAccount(name, pw, balance);
				ba.printAccount();
				bankAccount.put(ba.getnumber(), ba);
				break;

			case 2: // �Ա�
				System.out.println("���¹�ȣ�� �Է��Ͻÿ�: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					System.out.println("�Ա��Ͻ� �ݾ��� �Է��Ͻÿ�: ");
					money = scan.nextInt();
					if (money < 0) {
						System.out.println("�ݾ��� �̻��մϴ�.");
					} else {

						ba.deposit(money);

					}
				} else {
					System.out.println("���°� �������� �ʽ��ϴ�.");
				}
				break;
			case 3: // ���
				System.out.println("���¹�ȣ�� �Է��Ͻÿ�: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					System.out.println("��й�ȣ�� �Է��Ͻÿ�: ");
					password = scan.next();
					if (ba.passwordCheck(password) != true) {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					} else {
						System.out.println("����Ͻ� �ݾ��� �Է��Ͻÿ�: ");
						money = scan.nextInt();
						ba.withdraw(password, money);
					}

				} else {
					System.out.println("���°� �������� �ʽ��ϴ�.");
				}
				break;
			case 4: // �۱�
				System.out.println("���¹�ȣ�� �Է��Ͻÿ�: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					System.out.println("��й�ȣ�� �Է��Ͻÿ�: ");
					password = scan.next();
					if (ba.passwordCheck(password) != true) {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					} else {
						System.out.println("�۱��Ͻ� ���¹�ȣ�� �Է��Ͻÿ�: ");
						customerNumber = scan.next();
						ba2 = bankAccount.get(customerNumber);
						if (ba2 != null) {
							System.out.println("�۱��Ͻ� �ݾ��� �Է��Ͻÿ�: ");
							money = scan.nextInt();

							ba.withdraw(password, money);
							ba2.deposit(money);
						} else {
							System.out.println("���°� �������� �ʽ��ϴ�.");
						}

					}
				} else {
					System.out.println("���°� �������� �ʽ��ϴ�.");
				}
				break;

			case 5: // ���� ��ȸ
				System.out.println("���¹�ȣ�� �Է��Ͻÿ�: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					ba.printAccount();

				} else {
					System.out.println("���°� �������� �ʽ��ϴ�.");
				}
				break;
			case 6: // ���� ����
				System.out.println("���¹�ȣ�� �Է��Ͻÿ�: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					System.out.println("��й�ȣ�� �Է��Ͻÿ�: ");
					password = scan.next();
					if (ba.passwordCheck(password) != true) {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					} else {
						bankAccount.remove(customerNumber);
						System.out.println("���¸� ���� �Ǿ����ϴ�. ");

					}
				} else {
					System.out.println("���°� �������� �ʽ��ϴ�.");
				}
				break;
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");

			}

		}

	}
}

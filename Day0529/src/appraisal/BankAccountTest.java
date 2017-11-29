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
			System.out.println("\n -- 1:가입 2:입금 3:출금 4:송금 5:계좌조회 6:계좌해지 -1:종료 -- ");
			System.out.print(" -- select >");
			int number = scan.nextInt();
			int money;
			String password;

			if (number == -1)
				break;

			switch (number) {
			case 1: // 가입
				System.out.print("이름: ");
				String name = scan.next();
				System.out.print("비밀번호: ");
				String pw = scan.next();
				System.out.print("잔액: ");
				int balance = scan.nextInt();
				ba = new BankAccount(name, pw, balance);
				ba.printAccount();
				bankAccount.put(ba.getnumber(), ba);
				break;

			case 2: // 입금
				System.out.println("계좌번호를 입력하시오: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					System.out.println("입금하실 금액을 입력하시오: ");
					money = scan.nextInt();
					if (money < 0) {
						System.out.println("금액이 이상합니다.");
					} else {

						ba.deposit(money);

					}
				} else {
					System.out.println("계좌가 존재하지 않습니다.");
				}
				break;
			case 3: // 출금
				System.out.println("계좌번호를 입력하시오: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					System.out.println("비밀번호를 입력하시오: ");
					password = scan.next();
					if (ba.passwordCheck(password) != true) {
						System.out.println("비밀번호가 일치하지 않습니다.");
					} else {
						System.out.println("출금하실 금액을 입력하시오: ");
						money = scan.nextInt();
						ba.withdraw(password, money);
					}

				} else {
					System.out.println("계좌가 존재하지 않습니다.");
				}
				break;
			case 4: // 송금
				System.out.println("계좌번호를 입력하시오: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					System.out.println("비밀번호를 입력하시오: ");
					password = scan.next();
					if (ba.passwordCheck(password) != true) {
						System.out.println("비밀번호가 일치하지 않습니다.");
					} else {
						System.out.println("송금하실 계좌번호를 입력하시오: ");
						customerNumber = scan.next();
						ba2 = bankAccount.get(customerNumber);
						if (ba2 != null) {
							System.out.println("송금하실 금액을 입력하시오: ");
							money = scan.nextInt();

							ba.withdraw(password, money);
							ba2.deposit(money);
						} else {
							System.out.println("계좌가 존재하지 않습니다.");
						}

					}
				} else {
					System.out.println("계좌가 존재하지 않습니다.");
				}
				break;

			case 5: // 계좌 조회
				System.out.println("계좌번호를 입력하시오: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					ba.printAccount();

				} else {
					System.out.println("계좌가 존재하지 않습니다.");
				}
				break;
			case 6: // 계좌 해지
				System.out.println("계좌번호를 입력하시오: ");
				customerNumber = scan.next();
				ba = bankAccount.get(customerNumber);
				if (ba != null) {
					System.out.println("비밀번호를 입력하시오: ");
					password = scan.next();
					if (ba.passwordCheck(password) != true) {
						System.out.println("비밀번호가 일치하지 않습니다.");
					} else {
						bankAccount.remove(customerNumber);
						System.out.println("계좌를 해지 되었습니다. ");

					}
				} else {
					System.out.println("계좌가 존재하지 않습니다.");
				}
				break;
			default:
				System.out.println("입력이 잘못되었습니다.");

			}

		}

	}
}

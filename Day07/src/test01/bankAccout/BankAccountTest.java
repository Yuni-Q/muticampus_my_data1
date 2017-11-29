package bankAccout;

public class BankAccountTest {
	public static void main(String[] args) {

		BankAccount b = new BankAccount();
		b.balacne = 100;
		b.withdraw(60);
		b.getbalance();
		b.addInterrest();
		b.getbalance();
	}
}


package bankAccout;

class BankAccount {
	double balacne;

	void deposit(int amount) {
		balacne += amount;
	}

	void withdraw(int amount) {

		balacne -= amount;

	}

	void getbalance() {
		if (balacne < 0) {

		} else {
			System.out.println("ÀÜ¾×Àº " + balacne);
		}
	}

	void addInterrest() {
		balacne = balacne + (balacne * 0.075);
	}

}

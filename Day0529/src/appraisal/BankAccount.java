package appraisal;

public class BankAccount {
	private String name;
	private String number;
	private String password;
	private int balance;

	private static final int seed = 00001;
	private static int customerCount = 0;

	public static int getCustomerCount() {
		return customerCount;
	}

	/////////////////////////////////////////////////////////
	public BankAccount(String name, String pw, int init_money) {
		this.name = name;
		this.password = pw;
		this.balance = init_money;
		this.number = (seed + customerCount) + "";
		System.out.println("constructor:" + customerCount);
		customerCount++;
	}// ���»���

	public boolean deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.println(money + "�� �Ա� �Ǿ����ϴ�.");
			System.out.println("�� �ܾ��� " + balance + "�Դϴ�.");
			return true;
		} else {
			System.out.println("�Աݾ� ������ �̻��մϴ�.");
			return false;
		}
	}// �Ա�

	public boolean withdraw(String password, int money) {
		if (balance < money) {
			System.out.println("�ܾ׺���");
			return false;
		} else if (!passwordCheck(password)) {
			System.out.println("��й�ȣ ����");
			return false;
		} else {
			this.balance -= money;
			return true;
		}
	}// ���

	public boolean passwordCheck(String password) {
		return (this.password.equals(password));
	}// ��й�ȣ Ȯ��

	public void transferTo(BankAccount other, String password, int money) {
		if (this.withdraw(password, money)) {
			other.deposit(money);
		}
	}// �۱�

	////// getter/setter/////////////////////////////////////////////////////////////
	public String getname() {
		return name;
	}

	public String getnumber() {
		return number;
	}

	public int getBalance() {
		return balance;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	////////////////////////////////////////////////////////////////////////////////
	public void printAccount() {
		System.out.println("***********���� ����**************");
		System.out.println("* ������ : " + name);
		System.out.println("* ���¹�ȣ : " + number);
		System.out.println("* �ܾ� : " + balance);
		System.out.println("**********************************");
	}// ��� ����

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
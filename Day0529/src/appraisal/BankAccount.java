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
	}// 계좌생성

	public boolean deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.println(money + "가 입금 되었습니다.");
			System.out.println("총 잔액은 " + balance + "입니다.");
			return true;
		} else {
			System.out.println("입금액 정보가 이상합니다.");
			return false;
		}
	}// 입금

	public boolean withdraw(String password, int money) {
		if (balance < money) {
			System.out.println("잔액부족");
			return false;
		} else if (!passwordCheck(password)) {
			System.out.println("비밀번호 오류");
			return false;
		} else {
			this.balance -= money;
			return true;
		}
	}// 출금

	public boolean passwordCheck(String password) {
		return (this.password.equals(password));
	}// 비밀번호 확인

	public void transferTo(BankAccount other, String password, int money) {
		if (this.withdraw(password, money)) {
			other.deposit(money);
		}
	}// 송금

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
		System.out.println("***********계좌 정보**************");
		System.out.println("* 소유주 : " + name);
		System.out.println("* 계좌번호 : " + number);
		System.out.println("* 잔액 : " + balance);
		System.out.println("**********************************");
	}// 출력 정보

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
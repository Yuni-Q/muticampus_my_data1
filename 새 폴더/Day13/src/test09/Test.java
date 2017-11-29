package test09;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoneyBox box = new MoneyBox();
		
		MoneyThread t1 = new MoneyThread(box);
		MoneyThread t2 = new MoneyThread(box);
		
		t1.start();
		t2.start();

	}

}

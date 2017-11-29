package test09;

public class MoneyBox {
	private int money;
	
	synchronized public void in(int money){
		this.money += money;
	}
	synchronized public void out(int money){
		this.money -= money;
		System.out.println(this.money);
		if(this.money<0)
			System.out.println("µ·???À½¼ö??!");
		
	}
}

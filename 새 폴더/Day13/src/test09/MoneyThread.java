package test09;

public class MoneyThread extends Thread{
	private MoneyBox box;
	
	public MoneyThread(MoneyBox b){
		box=b;
		
	}
	@Override
	public void run() {
		for(int i=0; i<1000000;i++){
			box.in(1000);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			box.out(1000);
		}
	
	
	}
	
}

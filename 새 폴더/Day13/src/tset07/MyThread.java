package tset07;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;true;i++){
			System.out.println("MyThread i: "+i);
		}
	}
}

package tset08;
	
public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10000000;i++){
			System.out.println("MyThread i: "+i);
		}
		
	}

}

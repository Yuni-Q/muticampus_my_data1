package tset07;

public class Test {
	public static void main(String[] args) {
		MyThread t= new MyThread();
		
		t.start();
		
		for(int i=0;i<10000000;i++){
			System.out.println("main i: "+i);
		}
	}
}

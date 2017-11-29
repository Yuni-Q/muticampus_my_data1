package tset06;

public class Car {
	private int startCount;

	public Car(int startCount) {
		this.startCount = startCount;
	}

	////////////////////////////////////////////////////////////////
	public void start() throws InterruptedException {
		System.out.println(startCount + "초 후에 차가 출발합니다.");

		for (int i = startCount; i > 0; i--) {
			System.out.println("카운트다운" + i);
				Thread.sleep(1000);
	
		}
		System.out.println("출~발~!!");
	}
}

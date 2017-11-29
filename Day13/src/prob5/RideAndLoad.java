package prob5;

public class RideAndLoad {
	public static void main(String[] args) {
		AAA ref1 = new CCC();
		BBB ref2 = new CCC();
		CCC ref3 = new CCC();
		
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.2);
	}
}

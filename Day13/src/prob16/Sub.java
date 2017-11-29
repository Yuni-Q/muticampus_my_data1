package prob16;

public class Sub extends Super{
	public Long GetLenght(){return new Long(5);}
	
 public static void main(String[] args) {
	Super sooper = new Super();
	Sub sub = new Sub();
	System.out.println(sooper.getLenght().toString()+sub.getLenght().toString());
}
}

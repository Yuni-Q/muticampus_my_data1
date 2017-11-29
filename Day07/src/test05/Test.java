package test05;

public class Test {
	public static void main(String[] args) {
		

	String s1 = new String("apple");
	String s2 = new String("apple");
	
	String s3 = "apple";
	String s4 = "apple";
	

	System.out.println(s1==s2);
	System.out.println(s3==s4);
	
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s1));
	System.out.println(s3.equals(s4));

	}
}
